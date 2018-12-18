package com.hisense.pagedemo.ui.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

import com.hisense.pagedemo.utils.PaintBuilder;

/**
 * * ================================================
 * name:            IndicatorView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：  tab  指示view
 * introduce:
 * history：
 * ===================================================
 */
public class IndicatorView extends View {

    /**
     * 视图内容
     */
    private String content = "";
    /**
     * 内边距
     */
    private int padding = 20;
    /**
     * 高度
     */
    private int height = 96;
    /**
     * 文本画笔
     */
    private Paint paintText;
    /**
     * 字体大小
     */
    private float textSize = 32;
    /**
     * 在父容器中的位置
     */
    private int positionInParent = -1;
    /**
     * 焦点变化时是否允许刷新视图
     */
    private boolean enableFocusInvalidate = true;

    public boolean isEnableFocusInvalidate() {
        return enableFocusInvalidate;
    }

    public void setEnableFocusInvalidate(boolean enableFocusInvalidate) {
        this.enableFocusInvalidate = enableFocusInvalidate;
    }

    public int getPositionInParent() {
        return positionInParent;
    }

    public void setPositionInParent(int positionInParent) {
        this.positionInParent = positionInParent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public IndicatorView(Context context) {
        this(context, null, 0);
    }

    public IndicatorView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public IndicatorView(Context context, @Nullable AttributeSet attrs,
                         int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public IndicatorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
                         int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        paintText = new PaintBuilder().setColor(Color.WHITE).setTextSize(textSize)
                .setStyle(Paint.Style.FILL)
                .build();
        path = new Path();
        setFocusable(true);
        setFocusableInTouchMode(true);

    }

    private float startX = padding;
    private float startY = 55;
    private Path path;
    private boolean indicatorFlag = false;

    public boolean isIndicatorFlag() {
        return indicatorFlag;
    }

    public void setIndicatorFlag(boolean indicatorFlag) {
        this.indicatorFlag = indicatorFlag;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(content, startX, startY, paintText);
        if (indicatorFlag) {
            path.moveTo(18, 63);
            path.lineTo(getWidth() - 18, 63);
            path.lineTo(getWidth() - 18, 66);
            path.lineTo(getWidth() / 2 + 6, 66);
            path.lineTo(getWidth() / 2, 73);
            path.lineTo(getWidth() / 2 - 6, 66);
            path.lineTo(18, 66);
            path.close();
            canvas.drawPath(path, paintText);
        }


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension((int) (paintText.measureText(content) + 2 * padding), height);
    }


    @Override
    public View focusSearch(int direction) {
        if (direction == View.FOCUS_RIGHT && ((LinearLayout) getParent()).getChildCount()-1 == getPositionInParent()) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, 20, 0, 0);
            translateAnimation.setDuration(100);
            translateAnimation.setRepeatCount(3);
            translateAnimation.setRepeatMode(Animation.REVERSE);
            startAnimation(translateAnimation);
            return null;
        }

        if (direction == View.FOCUS_LEFT && 0 == getPositionInParent()) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -20, 0, 0);
            translateAnimation.setDuration(100);
            translateAnimation.setRepeatCount(3);
            translateAnimation.setRepeatMode(Animation.REVERSE);
            startAnimation(translateAnimation);
            return null;
        }
        return super.focusSearch(direction);
    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus) {
            enableFocusInvalidate = true;
            indicatorFlag = true;
            LinearLayout linearLayout = (LinearLayout) getParent();
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                IndicatorView indicatorView = (IndicatorView) linearLayout.getChildAt(i);
                if (indicatorView.isIndicatorFlag() && indicatorView != this) {
                    indicatorView.setIndicatorFlag(false);
                    invalidate();
                }
            }
            ViewCompat.animate(this).scaleX(1.1f).scaleY(1.1f).translationZ(1.0f).start();
        } else {
            if (enableFocusInvalidate) {
                indicatorFlag = false;
            }
            ViewCompat.animate(this).scaleX(1.0f).scaleY(1.0f).translationZ(1.0f).start();
        }
        invalidate();

    }


}
