package com.hisense.pagedemo.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * * ================================================
 * name:            DeleteLineTextView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/3
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class DeleteLineTextView extends AppCompatTextView {
    public DeleteLineTextView(Context context) {
        this(context, null, 0);
    }

    public DeleteLineTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DeleteLineTextView(Context context, @Nullable AttributeSet attrs,
                              int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);
        super.onDraw(canvas);
    }
}
