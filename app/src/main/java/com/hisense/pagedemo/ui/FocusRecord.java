package com.hisense.pagedemo.ui;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * * ================================================
 * name:            FocusRecord
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/16
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class FocusRecord extends View {
    public FocusRecord(Context context) {
        this(context, null, 0);
    }

        public FocusRecord(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

        public FocusRecord(Context context, @Nullable AttributeSet attrs,
    int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        public FocusRecord(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
    int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    private void init() {
        bringToFront();

    }
}
