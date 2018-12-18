package com.hisense.pagedemo.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import org.jetbrains.annotations.Nullable;

/**
 * * ================================================
 * name:            TvRecyclerViewCommon
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/22
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class TvRecyclerViewCommon extends RecyclerView {
    public TvRecyclerViewCommon(Context context) {
        this(context, null, 0);
    }

    public TvRecyclerViewCommon(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TvRecyclerViewCommon(Context context, @Nullable AttributeSet attrs,
                                int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {

    }



    @Override
    public View focusSearch(View focused, int direction) {
        if (focusSearchListener!=null){
            return focusSearchListener.focusSearch(focused,super.focusSearch(focused, direction),direction);
        }
        return super.focusSearch(focused, direction);
    }

    public View  mFocusSearch(View focused,int direction){
        return super.focusSearch(focused,direction);
    }

    private FocusSearchListener focusSearchListener;

    public void setFocusSearchListener(FocusSearchListener focusSearchListener) {
        this.focusSearchListener = focusSearchListener;
    }

    public interface FocusSearchListener{
        View focusSearch(View focused, View nextFocused, int direction);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float scaleX=1f-30f/getWidth();
        canvas.save();
        canvas.scale(scaleX,1,getWidth()/2,0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
