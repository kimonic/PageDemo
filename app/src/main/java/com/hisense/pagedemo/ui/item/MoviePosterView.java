package com.hisense.pagedemo.ui.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.hisense.pagedemo.utils.PaintBuilder;

/**
 * * ================================================
 * name:            MoviePosterView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/5
 * description：  竖长条电影海报,第10页,宽高比2:3
 * introduce:
 * history：
 * ===================================================
 */
public class MoviePosterView extends View {
    public MoviePosterView(Context context) {
        this(context, null, 0);
    }

    public MoviePosterView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MoviePosterView(Context context, @Nullable AttributeSet attrs,
                           int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MoviePosterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
                           int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    /**
     * 海报位置
     */
    private RectF rectFPoster;
    /**
     * 评论位置
     */
    private RectF rectFReview;
    /**
     * 当前显示位置
     */
    private RectF rectFPosition;

    /**
     * 海报图片地址,评论,位置,名称
     */
    private String posterUrl = "";
    private String review = "";
    private String position = "";
    private String name = "";


    /**当前view在适配器数中的位置*/
    private int positionInAdapter=-1;

    public int getPositionInAdapter() {
        return positionInAdapter;
    }

    public void setPositionInAdapter(int positionInAdapter) {
        this.positionInAdapter = positionInAdapter;
    }

    /**
     * 海报图片
     */
    private Bitmap bitmapPoster;

    private boolean borderFlag = false;


    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        Glide.with(this).asBitmap().load(posterUrl)
                .apply(RequestOptions.bitmapTransform(new FitCenter()))
                .into(new CustomViewTarget<MoviePosterView, Bitmap>(this) {
                    @Override
                    public void onLoadFailed(@Nullable Drawable errorDrawable) {

                    }

                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        bitmapPoster = resource;
                        invalidate();
                    }

                    @Override
                    protected void onResourceCleared(@Nullable Drawable placeholder) {

                    }
                });
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 评论背景画笔,位置画笔
     */
    private Paint reviewBacPaint, positionPaint, namePaint, reviewPaint, positionTextPaint, borderPaint;

    private void init() {
        rectFPoster = new RectF();
        rectFReview = new RectF();
        rectFPosition = new RectF();
        reviewBacPaint = new PaintBuilder().setColor("#000000").setStyle(Paint.Style.FILL).build();
        positionPaint = new PaintBuilder().setColor("#ffffff").setStyle(Paint.Style.FILL).build();
        namePaint = new PaintBuilder().setColor("#ffffff").setStyle(Paint.Style.FILL).build();
        reviewPaint = new PaintBuilder().setColor("#ffffff").setStyle(Paint.Style.FILL).build();
        positionTextPaint = new PaintBuilder().setColor("#055c66").setStyle(Paint.Style.FILL).build();
        borderPaint = new PaintBuilder().setColor("#ffffff").setStyle(Paint.Style.STROKE).setStrokeWidth(5f).build();

        setFocusable(true);
        setFocusableInTouchMode(true);

    }

    private int width = 0, height = 0;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (width == 0) {
            initCalculation();
        }

        if (bitmapPoster != null) {
            canvas.drawBitmap(bitmapPoster, null, rectFPoster, null);//海报
        }

        canvas.drawRect(rectFReview, reviewBacPaint);//评论


        namePaint.setTextSize(nameTextSize);
        float  textLength=namePaint.measureText(name);
        if (textLength>(rectFPoster.right-rectFPoster.left)){
            float  oneText=namePaint.measureText("好");
            int   max= (int) ((rectFPoster.right-rectFPoster.left)/oneText);
            String temp=name.substring(0,max)+"...";
            canvas.drawText(temp, nameCenterX - namePaint.measureText(temp) / 2, nameStartY, namePaint);//绘制名称
        }else {
            canvas.drawText(name, nameCenterX - namePaint.measureText(name) / 2, nameStartY, namePaint);//绘制名称
        }

        reviewPaint.setTextSize(reviewTextSize);
        canvas.drawText(review, reviewCenterX - reviewPaint.measureText(review) / 2, reviewStartY, reviewPaint);//绘制评论


        //------------------------绘制边框--------------------------------
        if (borderFlag) {
            canvas.drawRect(rectFPoster, borderPaint);
        }

        if (!checkNull(position)) {
            canvas.drawRect(rectFPosition, positionPaint);//位置
            canvas.drawCircle(positionCenterX, positionCenterY, positionRadius, positionPaint);//位置
            positionTextPaint.setTextSize(positionTextSize);
            canvas.drawText(position,
                    positionCenterX - positionTextPaint.measureText(position) / 2,
                    positionCenterY + positionTextSize / 2, positionTextPaint);//绘制位置
        }

    }

    private boolean checkNull(String s) {
        return s == null || "".equals(s);
    }

    private float positionRadius = 0;
    private float nameCenterX = 0;
    private float reviewCenterX = 0;
    private float positionCenterX = 0;
    private float positionCenterY = 0;
    private float nameStartY = 0;
    private float reviewStartY = 0;
    private float nameTextSize = 0;
    private float reviewTextSize = 0;
    private float positionTextSize = 0;


    private void initCalculation() {


        width = getWidth();//263---参照标准
        height = getHeight();//396--参照标准


        //---------------------------海报图片-------------------------------------------------------
        rectFPoster.left = width * 0.09125f;
        rectFPoster.top = width * 0.09125f;
        rectFPoster.right = width * 0.9087f;
        rectFPoster.bottom = width * 1.2319f;
        //---------------------------海报图片-------------------------------------------------------

        //----------------------评论----48*32,边距24------------------------------------------------

        rectFReview.right = rectFPoster.right - width * 0.04562f;
        rectFReview.left = rectFReview.right - width * 0.2033f;
        rectFReview.top = rectFPoster.top + width * 0.04562f;
        rectFReview.bottom = rectFReview.top + width * 0.1216f;

        reviewStartY = rectFReview.bottom - width * 0.03042f;
        reviewTextSize = width * 0.09125f;
        reviewCenterX = (rectFReview.right + rectFReview.left) / 2;
        //----------------------评论----48*32,边距24------------------------------------------------


        //------------------------位置----------------46*46------------------------
        positionRadius = width * 0.08745f;
        positionCenterY = (rectFPoster.top + rectFPoster.bottom) / 2;
        positionCenterX = rectFPoster.right;

        rectFPosition.left = rectFPoster.right - positionRadius;
        rectFPosition.right = rectFPoster.right;
        rectFPosition.top = (rectFPoster.top + rectFPoster.bottom) / 2 - positionRadius;
        rectFPosition.bottom = positionCenterY;

        positionTextSize = width * 0.07604f;
        //------------------------位置----------------46*46------------------------

        //--------------------------名称------------------------------------------------------------
        nameCenterX = (rectFPoster.right + rectFPoster.left) / 2;
        nameStartY = width * 1.4144f;
        nameTextSize = width * 0.1368f;
        //--------------------------名称------------------------------------------------------------

    }


    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus) {
            borderFlag = true;
        } else {
            borderFlag = false;
        }
        invalidate();

    }
}
