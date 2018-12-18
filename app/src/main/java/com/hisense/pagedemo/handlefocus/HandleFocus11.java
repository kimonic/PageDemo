package com.hisense.pagedemo.handlefocus;

import android.view.View;

import com.hisense.pagedemo.R;
import com.hisense.pagedemo.adapter.RVAdapter11;
import com.hisense.pagedemo.bean.RVBean11;
import com.hisense.pagedemo.ui.PageRecyclerView;
import com.hisense.pagedemo.ui.SelectConstraintLayout;

import java.util.List;

/**
 * * ================================================
 * name:            HandleFocus18
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/4
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class HandleFocus11 {
    private PageRecyclerView recyclerView;
    private RVAdapter11 rvAdapter11;
    private List<RVBean11> bean11List;

    public HandleFocus11(PageRecyclerView recyclerView, RVAdapter11 rvAdapter11,
                         List<RVBean11> bean11List) {
        this.recyclerView = recyclerView;
        this.rvAdapter11 = rvAdapter11;
        this.bean11List = bean11List;
    }

    public void handleFocus() {
        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {
                if (focused instanceof SelectConstraintLayout) {
                    int position=recyclerView.getChildAdapterPosition(focused);
                    switch (direction) {
                        case View.FOCUS_DOWN:
                            if (position+3<rvAdapter11.getItemCount()-1){
                                View view=rvAdapter11.getViewByPosition(recyclerView,position+3,R.id.scl_rvitem_1101_group);
                                if (view==null){
                                    recyclerView.mFocusSearch(focused,View.FOCUS_DOWN);
                                    return rvAdapter11.getViewByPosition(recyclerView,position+3,R.id.scl_rvitem_1101_group);
                                }else {
                                    return view;
                                }
                            }
                            break;
                        case View.FOCUS_UP:

                            if (position-3>0){
                                View view=rvAdapter11.getViewByPosition(recyclerView,position-3,R.id.scl_rvitem_1101_group);
                                if (view==null){
                                    recyclerView.mFocusSearch(focused,View.FOCUS_UP);
                                    return rvAdapter11.getViewByPosition(recyclerView,position-3,R.id.scl_rvitem_1101_group);
                                }else {
                                    return view;
                                }
                            }
                            break;
                        case View.FOCUS_LEFT:
                            if (position-1>0){
                                View view=rvAdapter11.getViewByPosition(recyclerView,position-1,R.id.scl_rvitem_1101_group);
                                if (view==null){
                                    recyclerView.mFocusSearch(focused,View.FOCUS_UP);
                                    return rvAdapter11.getViewByPosition(recyclerView,position-1,R.id.scl_rvitem_1101_group);
                                }else {
                                    return view;
                                }
                            }
                            break;
                        case View.FOCUS_RIGHT:
                            if (position+1<rvAdapter11.getItemCount()-1){
                                View view=rvAdapter11.getViewByPosition(recyclerView,position+1,R.id.scl_rvitem_1101_group);
                                if (view==null){
                                    recyclerView.mFocusSearch(focused,View.FOCUS_DOWN);
                                    return rvAdapter11.getViewByPosition(recyclerView,position+1,R.id.scl_rvitem_1101_group);
                                }else {
                                    return view;
                                }
                            }
                            break;
                    }
                }
                return nextFocused;
            }
        });

    }
}
