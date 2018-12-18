package com.hisense.pagedemo.handlefocus;

import android.view.View;

import com.hisense.pagedemo.R;
import com.hisense.pagedemo.adapter.RVAdapter12;
import com.hisense.pagedemo.bean.RVBean12;
import com.hisense.pagedemo.ui.PageRecyclerView;
import com.hisense.pagedemo.ui.SelectConstraintLayout;

import java.util.List;

/**
 * * ================================================
 * name:            HandleFocus12
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2012/12/4
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class HandleFocus12 {

    private PageRecyclerView recyclerView;
    private RVAdapter12 rvAdapter12;
    private List<RVBean12> bean12List;

    public HandleFocus12(PageRecyclerView recyclerView, RVAdapter12 rvAdapter12,
                         List<RVBean12> bean12List) {
        this.recyclerView = recyclerView;
        this.rvAdapter12 = rvAdapter12;
        this.bean12List = bean12List;
    }

    public void handleFocus() {
        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {
                if (focused instanceof SelectConstraintLayout) {
                    int position=recyclerView.getChildAdapterPosition(focused);
                    switch (direction) {
                        case View.FOCUS_DOWN:
                            if (position+5<rvAdapter12.getItemCount()-1){
                                View view=rvAdapter12.getViewByPosition(recyclerView,position+5,R.id.scl_rvitem_1201_group);
                                if (view==null){
                                    recyclerView.mFocusSearch(focused,View.FOCUS_DOWN);
                                    return rvAdapter12.getViewByPosition(recyclerView,position+5,R.id.scl_rvitem_1201_group);
                                }else {
                                    return view;
                                }
                            }
                            break;
                        case View.FOCUS_UP:

                            if (position-5>0){
                                View view=rvAdapter12.getViewByPosition(recyclerView,position-5,R.id.scl_rvitem_1201_group);
                                if (view==null){
                                    recyclerView.mFocusSearch(focused,View.FOCUS_UP);
                                    return rvAdapter12.getViewByPosition(recyclerView,position-5,R.id.scl_rvitem_1201_group);
                                }else {
                                    return view;
                                }
                            }
                            break;
                        case View.FOCUS_LEFT:
                            if (position-1>0){
                                View view=rvAdapter12.getViewByPosition(recyclerView,position-1,R.id.scl_rvitem_1201_group);
                                if (view==null){
                                    recyclerView.mFocusSearch(focused,View.FOCUS_UP);
                                    return rvAdapter12.getViewByPosition(recyclerView,position-1,R.id.scl_rvitem_1201_group);
                                }else {
                                    return view;
                                }
                            }
                            break;
                        case View.FOCUS_RIGHT:
                            if (position+1<rvAdapter12.getItemCount()-1){
                                View view=rvAdapter12.getViewByPosition(recyclerView,position+1,R.id.scl_rvitem_1201_group);
                                if (view==null){
                                    recyclerView.mFocusSearch(focused,View.FOCUS_DOWN);
                                    return rvAdapter12.getViewByPosition(recyclerView,position+1,R.id.scl_rvitem_1201_group);
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
