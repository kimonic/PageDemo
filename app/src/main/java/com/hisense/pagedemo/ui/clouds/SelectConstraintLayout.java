package com.hisense.pagedemo.ui.clouds;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;

import com.hisense.pagedemo.R;

/**
 * * ================================================
 * name:            SelectConstraintLayout
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/19
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class SelectConstraintLayout extends ConstraintLayout {
    public SelectConstraintLayout(Context context) {
        this(context, null, 0);
    }

    public SelectConstraintLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SelectConstraintLayout(Context context, @Nullable AttributeSet attrs,
                                  int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init(){
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /**所在的适配器*/
    private BaseAdapter adapter;
    /**在适配器中的位置*/
    private int positionInAdapter=-1;
    /**所在的recyclerview*/
    private RecyclerView recyclerView;

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public BaseAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(BaseAdapter adapter) {
        this.adapter = adapter;
    }

    public int getPositionInAdapter() {
        return positionInAdapter;
    }

    public void setPositionInAdapter(int positionInAdapter) {
        this.positionInAdapter = positionInAdapter;
    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        View view=findViewById(R.id.tv_common_border);
        if (view!=null){
            if (gainFocus){
                view.setVisibility(VISIBLE);
            }else {
                view.setVisibility(GONE);
            }
        }

    }


}
