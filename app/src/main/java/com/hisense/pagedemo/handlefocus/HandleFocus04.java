package com.hisense.pagedemo.handlefocus;

import android.view.View;
import android.widget.LinearLayout;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.adapter.RVAdapter04;
import com.hisense.pagedemo.bean.RVBean04;
import com.hisense.pagedemo.ui.item.IndicatorView;
import com.hisense.pagedemo.ui.item.MovieInfoView;
import com.hisense.pagedemo.ui.PageRecyclerView;

import java.util.List;

/**
 * * ================================================
 * name:            HandleFocus04
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2004/12/4
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class HandleFocus04 {

    private PageRecyclerView recyclerView;
    private RVAdapter04 adapter04;
    private List<RVBean04> bean04List;

    public HandleFocus04(PageRecyclerView recyclerView, RVAdapter04 adapter04,
                         List<RVBean04> bean04List) {
        this.recyclerView = recyclerView;
        this.adapter04 = adapter04;
        this.bean04List = bean04List;
    }
    private IndicatorView lastIndicaorView;
    private int lastIndicaorViewPosition = -1;
    public void handleFocus() {
        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {
                if (focused instanceof MovieInfoView) {
                    View view = defineOrder(direction, focused, nextFocused, adapter04, R.id.miv_rvitem_0402);
                    if (focused != view) {
                        return view;
                    }
                }
                if (focused instanceof IndicatorView) {
                    lastIndicaorViewPosition = ((IndicatorView) focused).getPositionInParent();
                }
                if ((focused instanceof IndicatorView) && !(nextFocused instanceof IndicatorView)) {
                    lastIndicaorView = (IndicatorView) focused;
//                    lastIndicaorViewPosition = ((IndicatorView) focused).getPositionInParent();
                    lastIndicaorView.setEnableFocusInvalidate(false);
                }
                if (!(focused instanceof IndicatorView) && (nextFocused instanceof IndicatorView) && lastIndicaorViewPosition != -1) {
                    return ((LinearLayout) (nextFocused.getParent())).getChildAt(lastIndicaorViewPosition);
                } else if (lastIndicaorViewPosition == -1 && (nextFocused instanceof IndicatorView)) {
                    lastIndicaorViewPosition = 0;
                    return ((LinearLayout) (nextFocused.getParent())).getChildAt(0);
                }
                if (nextFocused instanceof LinearLayout) {
                    return ((LinearLayout) nextFocused).getChildAt(lastIndicaorViewPosition);
                }

                if ((focused instanceof IndicatorView) && (nextFocused instanceof MovieInfoView)) {
                    return adapter04.getViewByPosition(recyclerView, 2, R.id.miv_rvitem_0402);
                }
                return nextFocused;
            }
        });
    }
    /**
     * movieinfoview相关的列表焦点逻辑
     */
    public View defineOrder(int direction, View focused, View nextFocused, BaseMultiItemQuickAdapter adapter
            , int id) {
        final int position = recyclerView.getChildAdapterPosition((View) focused.getParent());
        switch (direction) {
            case View.FOCUS_LEFT:
                if (position > 2) {
                    recyclerView.mFocusSearch(focused, View.FOCUS_UP);
                    return adapter.getViewByPosition(recyclerView, position - 1, id);
                }
                break;
            case View.FOCUS_RIGHT:
                if (position + 1 < adapter.getItemCount()) {
                    recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
                    return adapter.getViewByPosition(recyclerView, position + 1, id);
                } else {
                    return null;
                }
            case View.FOCUS_DOWN:
                if (nextFocused == null) {
                    View downView = recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
                    if (position + 5 < adapter.getItemCount()) {
                        return adapter.getViewByPosition(recyclerView, position + 5, id);
                    } else {
                        return downView;
                    }
                }
                break;
            case View.FOCUS_UP:
                if (nextFocused == null) {
                    View upView = recyclerView.mFocusSearch(focused, View.FOCUS_UP);
                    if (upView instanceof MovieInfoView) {
                        return adapter.getViewByPosition(recyclerView, position - 5, id);
                    }
                } else if (nextFocused instanceof MovieInfoView) {
                    return adapter.getViewByPosition(recyclerView, position - 5, id);
                }
                break;
        }
        return focused;
    }

}
