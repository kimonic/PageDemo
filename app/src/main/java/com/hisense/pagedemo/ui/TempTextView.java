package com.hisense.pagedemo.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * * ================================================
 * name:            TempTextView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class TempTextView extends android.support.v7.widget.AppCompatTextView {
    public TempTextView(Context context) {
        this(context, null, 0);
    }

    public TempTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TempTextView(Context context, @Nullable AttributeSet attrs,
                        int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

    }

    @Override
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (focused){
            setTextColor(Color.BLUE);
        }else {
            setTextColor(Color.WHITE);
        }
    }
}
