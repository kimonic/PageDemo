package com.hisense.pagedemo.ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;

import com.hisense.pagedemo.R;

/**
 * * ================================================
 * name:            SelectCOnstraintLayout
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/30
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

    private void init() {
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private int  position=0;

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        View view = findViewById(R.id.tv_common_border);
        if (gainFocus) {
            //--------------------------页面18,recyclerview嵌套recyclerview时处理焦点问题-----------
            RecyclerView recyclerView=findViewById(R.id.prv_rvitem_1801_actor);
            if (recyclerView!=null){
                recyclerView.getChildAt(position).requestFocus();
                return;
            }
            //--------------------------页面18,recyclerview嵌套recyclerview时处理焦点问题-----------
            if (view != null) {
                view.setVisibility(VISIBLE);
            }
        } else {
            if (view != null) {
                view.setVisibility(INVISIBLE);
            }
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public View focusSearch(int direction) {
        return getParent().focusSearch(this, direction);
//        return super.focusSearch(direction);
    }

    private int positionInAdapter=-1;

    public int getPositionInAdapter() {
        return positionInAdapter;
    }

    public void setPositionInAdapter(int positionInAdapter) {
        this.positionInAdapter = positionInAdapter;
    }
}
