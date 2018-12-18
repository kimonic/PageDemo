package com.hisense.pagedemo.handlefocus.handle18;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hisense.pagedemo.R;
import com.hisense.pagedemo.adapter.RVAdapter18;
import com.hisense.pagedemo.bean.RVBean18;
import com.hisense.pagedemo.ui.PageRecyclerView;
import com.hisense.pagedemo.ui.SelectConstraintLayout;

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
public class HandleFocus18 {

    private PageRecyclerView recyclerView;
    private RVAdapter18 rvAdapter18;
    private List<RVBean18> bean18List;

    public HandleFocus18(PageRecyclerView recyclerView, RVAdapter18 rvAdapter18,
                         List<RVBean18> bean18List) {
        this.recyclerView = recyclerView;
        this.rvAdapter18 = rvAdapter18;
        this.bean18List = bean18List;
    }

    private int count = 0;
    private int direction = 1;

    public void handleFocus() {
        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {
                if (focused instanceof SelectConstraintLayout) {
                    switch (direction) {
                        case View.FOCUS_UP:
                            break;
                        case View.FOCUS_DOWN:
                            break;
                        case View.FOCUS_LEFT:
                            RecyclerView recyclerView=focused.findViewById(R.id.prv_rvitem_1801_actor);
                            if (recyclerView!=null){

                            }
                            break;
                        case View.FOCUS_RIGHT:
                            break;
                    }


                }


                return nextFocused;
            }
        });

//        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
//                Log.e("Tag","滑动监听------onScrollStateChanged------"+newState);
//                if (newState==0){
//                    count++;
//                    if (count%2==0){
//                        Log.e("Tag","滑动监听------onScrollStateChanged---????---"+newState);
//                        recyclerView.smoothScrollBy(0,200*direction);
//                    }
//
//                }
//            }
//
//            @Override
//            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
//                if (dy>0){
//                    direction=1;
//                }else {
//                    direction=-1;
//                }
//                Log.e("Tag","滑动监听------dx------???"+dx+"-----------dy------???"+dy);
//            }
//        });


    }
}
