package com.hisense.pagedemo.utils;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/**
 * * ================================================
 * name:            PaintBuilder
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description：  画笔辅助类
 * notice:
 * introduce:
 * history：
 * ===================================================
 */

public class PaintBuilder {
    private Paint paint;

    public PaintBuilder() {
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    public Paint build() {
        return paint;
    }

    public PaintBuilder setColor(String color) {
        paint.setColor(Color.parseColor(color));
        return this;
    }

    public PaintBuilder setColor(int color) {
        paint.setColor(color);
        return this;
    }

    public PaintBuilder setAntiAlias(boolean antiAlias) {
        paint.setAntiAlias(antiAlias);
        return this;
    }

    public PaintBuilder setAlpha(int alpha) {
        paint.setAlpha(alpha);
        return this;
    }

    public PaintBuilder setStyle(Paint.Style style) {
        paint.setStyle(style);
        return this;
    }

    public PaintBuilder setColorFilter(ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter);
        return this;
    }

    public PaintBuilder setTextSize(float textSize) {
        paint.setTextSize(textSize);
        return this;
    }

    public PaintBuilder setStrokeWidth(float width) {
        paint.setStrokeWidth(width);
        return this;
    }

    public PaintBuilder setFakeBoldText(boolean fakeBoldText) {
        paint.setFakeBoldText(fakeBoldText);
        return this;

    }
}
