package com.hisense.pagedemo.handlefocus;

import android.support.constraint.ConstraintLayout;
import android.view.View;

import com.hisense.pagedemo.R;
import com.hisense.pagedemo.adapter.RVAdapter10Single;
import com.hisense.pagedemo.bean.RVBean10Single;
import com.hisense.pagedemo.ui.item.MoviePosterView;
import com.hisense.pagedemo.ui.PageRecyclerView;

import java.util.List;

/**
 * * ================================================
 * name:            HandleFocus18
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/4
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class HandleFocus10Single {
    private PageRecyclerView recyclerView;
    private RVAdapter10Single rvAdapter10;
    private List<RVBean10Single> bean10List;

    public HandleFocus10Single(PageRecyclerView recyclerView, RVAdapter10Single rvAdapter10,
                               List<RVBean10Single> bean10List) {
        this.recyclerView = recyclerView;
        this.rvAdapter10 = rvAdapter10;
        this.bean10List = bean10List;
    }


    public void handleFocus() {
        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {
                if (focused instanceof MoviePosterView) {
                    int position = recyclerView.getChildAdapterPosition((View) focused.getParent());
                    switch (direction) {
                        case View.FOCUS_UP:
                            if (position - 7 > 0) {
                                ConstraintLayout constraintLayout= (ConstraintLayout) rvAdapter10.getViewByPosition(recyclerView,
                                        position - 7, R.id.scl_rvitem_1001);
                                return  (constraintLayout!=null)?constraintLayout.getChildAt(0):nextFocused;
                            }
                            break;
                        case View.FOCUS_DOWN:
                            if (position + 7 < rvAdapter10.getItemCount()) {
                                ConstraintLayout constraintLayout= (ConstraintLayout) rvAdapter10.getViewByPosition(recyclerView,
                                        position + 7, R.id.scl_rvitem_1001);
                                return  (constraintLayout!=null)?constraintLayout.getChildAt(0):nextFocused;
                            }
                            break;
                        case View.FOCUS_LEFT:
                            if (position - 1>0) {
                                recyclerView.mFocusSearch(focused,View.FOCUS_UP);
                                ConstraintLayout constraintLayout= (ConstraintLayout) rvAdapter10.getViewByPosition(recyclerView,
                                        position - 1, R.id.scl_rvitem_1001);
                                return  (constraintLayout!=null)?constraintLayout.getChildAt(0):nextFocused;
                            }
                            break;
                        case View.FOCUS_RIGHT:
                            if (position + 1 < rvAdapter10.getItemCount()) {
                                recyclerView.mFocusSearch(focused,View.FOCUS_DOWN);
                                ConstraintLayout constraintLayout= (ConstraintLayout) rvAdapter10.getViewByPosition(recyclerView,
                                        position +1, R.id.scl_rvitem_1001);
                                return  (constraintLayout!=null)?constraintLayout.getChildAt(0):nextFocused;
                            }else {
                                return null;
                            }
                    }
                }
                return nextFocused;
            }
        });

    }
}
