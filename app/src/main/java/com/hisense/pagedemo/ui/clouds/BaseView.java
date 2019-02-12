package com.hisense.pagedemo.ui.clouds;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

import com.hisense.pagedemo.ui.clouds.date1218.BaseAdapter;

/**
 * * ================================================
 * name:            BaseView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class BaseView extends ConstraintLayout {
    public BaseView(Context context) {
        this(context, null, 0);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs,
                    int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }



    private int width = 0, height = 0;

    private void init() {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (width == 0) {
            initCalculator();
        }
    }

    private void initCalculator() {

    }

    public void  onCreate(String data){

    }
    public void  executeData(String data){

    }
    public int  pushAdapter(BaseAdapter adapter){
        return 1;
    }
    public BaseAdapter  peekAdapter(){
        return null;
    }
}
