package com.hisense.pagedemo.ui.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;
import com.hisense.pagedemo.ui.item.MovieInfoView;
import com.hisense.pagedemo.utils.PaintBuilder;


/**
 * * ================================================
 * name:            RecommendImageView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description： 设置电影相关信息view
 * notice:    控件宽高比例必须为10:1,否则UI效果无法保证
 * introduce:
 * history：
 * ===================================================
 */
public class RecommendImageView extends AppCompatImageView {
    private RectF rect;
    private Paint recommendPaint, recommendTextPaint, borderPaint;
    private String recommend = "推荐";
    private float startY;
    private boolean borderflag = false;

    private int width = 0;
    private int height = 0;

    private float rWidth = 0;
    private float rHeight = 0;
    private float recommendTextSize = 0;
    private Path path;



    public RecommendImageView(Context context) {
        super(context);
        init();
    }

    public RecommendImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RecommendImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        path = new Path();
        rect = new RectF(0, 0, 0, 0);
        recommendPaint = new PaintBuilder().setColor(Color.WHITE)
                .setStyle(Paint.Style.FILL)
                .build();
        borderPaint = new PaintBuilder().setColor(Color.WHITE)
                .setStyle(Paint.Style.STROKE)
                .setStrokeWidth(3)
                .build();
        recommendTextPaint = new PaintBuilder().setColor("#327275")
                .setStyle(Paint.Style.FILL)
                .build();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (width == 0 || height == 0) {
            width = getWidth();
            height = getHeight();
        }
        canvas.save();
        canvas.scale(1,0.8f,getWidth()/2,getHeight()/2);
        super.onDraw(canvas);

        if (borderflag) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(),
                    width - getPaddingRight(), height - getPaddingBottom(), borderPaint);
        }
        drawRecommend(canvas);
        canvas.restore();


    }


    /**
     * 绘制推荐文字
     */
    private void drawRecommend(Canvas canvas) {

        if (rWidth == 0 || rHeight == 0) {
            if (getHeight()*6>getWidth()){
                rWidth = getWidth() * 0.03189f*2;
                rHeight = getWidth() * 0.02477f*2;
            }else {
                rWidth = getWidth() * 0.03189f;
                rHeight = getWidth() * 0.02477f;
            }

            rect.left = (int) (width - getPaddingRight() - rWidth / 2);
            rect.right = (int) (width - getPaddingRight() + rWidth / 2);
            rect.top = (int) (height / 2 - rHeight / 2);
            rect.bottom = (int) (height / 2 + rHeight / 2);
            recommendTextSize = rHeight * 0.4882f;
            startY = rect.top + rHeight / 2 + recommendTextSize * 0.4f;
            path.moveTo(rect.left, rect.top);
            path.lineTo(rect.left + rHeight / 2, rect.top);
            path.lineTo(rect.left, rect.top + rHeight / 2);
            path.close();
        }
        canvas.drawPath(path, recommendPaint);
        canvas.drawRoundRect(rect, rHeight / 2, rHeight / 2, recommendPaint);
        recommendTextPaint.setTextSize(recommendTextSize);
        float startX = rect.left + rWidth / 2 - recommendTextPaint.measureText(recommend) / 2;
        canvas.drawText(recommend, startX, startY, recommendTextPaint);

    }

    /**
     * 焦点变化动画效果
     */
    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);

        if (gainFocus) {
            borderflag = true;
            ViewCompat.animate(this).scaleX(1.01f).scaleY(1.01f).translationZ(1.0f).start();
        } else {
            borderflag = false;
            ViewCompat.animate(this).scaleX(1.0f).scaleY(1.0f).translationZ(1.0f).start();

        }
    }

    /**
     * 指定界面才能使用,指定recyclerview的第一个item的第一个视图获得焦点
     */
    @Override
    public View focusSearch(int direction) {
        View view = super.focusSearch(direction);
        if (focusSearchListener != null) {
            return focusSearchListener.customerFocusSearch(view, direction);
        } else {
            if (view instanceof MovieInfoView) {
                return ((ViewGroup) (view.getParent())).getChildAt(0);
            }
            return super.focusSearch(direction);
        }
    }

    private FocusSearchListener focusSearchListener;

    public void setFocusSearchListener(FocusSearchListener focusSearchListener) {
        this.focusSearchListener = focusSearchListener;
    }

    /**
     * 自定义焦点查询规则
     */
    public interface FocusSearchListener {
        View customerFocusSearch(View nextFocusView, int direction);
    }

    public void setBitmapUrl(String url) {
        Glide.with(getContext())
                .load(url)
                .apply(RequestOptions.bitmapTransform(new CenterCrop()))
                .into(this);
    }
}
