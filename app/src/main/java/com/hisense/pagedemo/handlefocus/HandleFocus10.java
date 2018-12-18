package com.hisense.pagedemo.handlefocus;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.FocusFinder;
import android.view.View;

import com.hisense.pagedemo.R;
import com.hisense.pagedemo.adapter.RVAdapter10;
import com.hisense.pagedemo.bean.RVBean10;
import com.hisense.pagedemo.ui.PageRecyclerView;
import com.hisense.pagedemo.ui.SelectConstraintLayout;

import java.util.ArrayList;
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
public class HandleFocus10 {
    private PageRecyclerView recyclerView;
    private RVAdapter10 rvAdapter10;
    private List<RVBean10> bean10List;

    public HandleFocus10(PageRecyclerView recyclerView, RVAdapter10 rvAdapter10,
                         List<RVBean10> bean10List) {
        this.recyclerView = recyclerView;
        this.rvAdapter10 = rvAdapter10;
        this.bean10List = bean10List;
    }


    public void handleFocus() {
        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {

             ArrayList<View>  views;

                if (focused instanceof SelectConstraintLayout){
                    int position = recyclerView.getChildAdapterPosition(focused);
                    switch (direction) {
                        case View.FOCUS_UP:
                            views=recyclerView.getViewsFocus();
                            if (position-7>0){
                                for (int i = 0; i < views.size(); i++) {
                                    if (views.get(i) instanceof SelectConstraintLayout){
                                        if (position-7==((SelectConstraintLayout) views.get(i)).getPositionInAdapter()){
                                            return views.get(i);
                                        }
                                    }
                                }
                            }

                            break;
                        case View.FOCUS_DOWN:
                            views=recyclerView.getViewsFocus();
                            if (position+7<rvAdapter10.getItemCount()){
                                for (int i = 0; i < views.size(); i++) {
                                    if (views.get(i) instanceof SelectConstraintLayout){
                                        if (position+7==((SelectConstraintLayout) views.get(i)).getPositionInAdapter()){
                                            return views.get(i);
                                        }
                                    }
                                }

                                if (nextFocused instanceof SelectConstraintLayout){
                                    int  nPosition=((SelectConstraintLayout) nextFocused).getPositionInAdapter();
                                    if (position+7!=nPosition){
                                        return rvAdapter10.getViewByPosition(recyclerView, position + 7, R.id.scl_rvitem_1001_group);
                                    }
                                }
                            }

                            break;
                        case View.FOCUS_LEFT:
                            recyclerView.mFocusSearch(focused,View.FOCUS_UP);
                            views=recyclerView.getViewsFocus();
                            if (position-1>0){
                                for (int i = 0; i < views.size(); i++) {
                                    if (views.get(i) instanceof SelectConstraintLayout){
                                        if (position-1==((SelectConstraintLayout) views.get(i)).getPositionInAdapter()){
                                            return views.get(i);
                                        }
                                    }
                                }
                            }
                            break;
                        case View.FOCUS_RIGHT:
                            recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
                            views=recyclerView.getViewsFocus();
                            if (position+1<rvAdapter10.getItemCount()){
                                for (int i = 0; i < views.size(); i++) {
                                    if (views.get(i) instanceof SelectConstraintLayout){
                                        if (position+1==((SelectConstraintLayout) views.get(i)).getPositionInAdapter()){
                                            return views.get(i);
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }




//
//                if (focused instanceof SelectConstraintLayout) {
//                    int position = recyclerView.getChildAdapterPosition(focused);
//                    switch (direction) {
//                        case View.FOCUS_DOWN:
//                            if (position + 7 < rvAdapter10.getItemCount() - 1) {
//                                View view = rvAdapter10.getViewByPosition(recyclerView, position + 7, R.id.scl_rvitem_1001_group);
//                                Log.e("Tag","焦点处理---position---"+position+"---方向----"+direction+
//                                "-----view-----"+view);
//                                if (view == null) {
//                                            recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
//                                    return rvAdapter10.getViewByPosition(recyclerView, position + 7, R.id.scl_rvitem_1001_group);
//                                } else {
//                                    return view;
//                                }
//                            }
//                            break;
//                        case View.FOCUS_UP:
//
//                            if (position - 7 > 0) {
//                                View view = rvAdapter10.getViewByPosition(recyclerView, position - 7, R.id.scl_rvitem_1001_group);
//                                if (view == null) {
//                                    recyclerView.mFocusSearch(focused, View.FOCUS_UP);
//                                    view = rvAdapter10.getViewByPosition(recyclerView, position - 7, R.id.scl_rvitem_1001_group);
//
//                                    return view;
//                                } else {
//                                    return view;
//                                }
//                            }
//                            break;
//                        case View.FOCUS_LEFT:
//                            if (position - 1 >0) {
//                                View view = rvAdapter10.getViewByPosition(recyclerView, position - 1, R.id.scl_rvitem_1001_group);
//                                if (view == null) {
//                                    recyclerView.mFocusSearch(focused, View.FOCUS_UP);
//                                    return rvAdapter10.getViewByPosition(recyclerView, position - 1, R.id.scl_rvitem_1001_group);
//                                } else {
//                                    return view;
//                                }
//                            }
//                            break;
//                        case View.FOCUS_RIGHT:
//                            if (position + 1 < rvAdapter10.getItemCount()) {
//                                View view = rvAdapter10.getViewByPosition(recyclerView, position + 1, R.id.scl_rvitem_1001_group);
//                                Log.e("Tag","可获得焦点的视图--hsdfkldhf;dwsahf;hfhf;sdihfds------"+view);
//                                if (view == null) {
//                                    recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
//                                    return rvAdapter10.getViewByPosition(recyclerView, position + 1, R.id.scl_rvitem_1001_group);
//                                } else {
//                                    return view;
//                                }
//                            } else {
//                                return null;
//                            }
//                    }
//                }
                Log.e("Tag","当前焦点的位置-----------没有找到符合条件的-----"+nextFocused);
                return nextFocused;
            }
        });

    }
}
