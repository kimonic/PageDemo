package com.hisense.pagedemo.ui.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.hisense.pagedemo.ui.ResouseIamge;
import com.hisense.pagedemo.utils.PaintBuilder;

import org.jetbrains.annotations.Nullable;

/**
 * * ================================================
 * name:            MovieInfoView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description： 设置电影相关信息view
 * notice:    控件宽高比例必须为18:13,dpi=320,否则UI效果无法保证
 *
 *      UI设计空间宽高:320-228,横向间距48,最终设计空间尺寸为宽高368--228
 *      内部图片宽高,320-180
 * introduce:
 * setName(String name)  设置电影名称
 * setPosition(String position)  设置当前位置
 * setReview(String review)      设置评论内容
 * setVip(String vip)   设置vip内容
 * setVipFlag(boolean vipFlag)   设置vip标志
 * loadBitmap(String url)   设置图片URL地址
 * history：
 * ===================================================
 */
public class MovieInfoView extends View {
    private int width = 0;
    private int height = 0;
    private Bitmap bitmap;
    private String name = "";
    private String position = "";
    private String review = "";
    private boolean borderFlag = false;
    private Paint borderPaint, textPaint, reviewBacPaint, positionTextPaint, vipPathPaint;
    private RectF bitmapRectF;

    //--------------position----------------------
    private float positionCircleX;
    private float positionCircleY;
    private float positionCircleRadious;
    private float positionTextSize;
    private float positionTextStartY;
    private Path positionPath;
    //--------------position----------------------
    //---------------name---------------------
    private float nameTextSize;
    private float startTextY;
    //---------------name---------------------
    //---------------review---------------------
    private RectF rectFReview;
    private float reviewTextSizeR;
    private float reviewStartYR;

    //---------------review---------------------

    //--------------vip----------------------
    private Path vipPath;
    private Path vipTextPath;
    private float vipTextSize = 0;
    private float vipTextHOffset = 0;
    private float vipTextVOffset = 0;
    private String vip = "";
    private float vipTextMaxLength = 0;
    private boolean vipFlag = false;
    //--------------vip----------------------
    private boolean isShow=true;

    public MovieInfoView(Context context) {
        this(context, null, 0);
    }

    public MovieInfoView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MovieInfoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MovieInfoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
        if (isShow){
            setVisibility(VISIBLE);
        }else {
            setVisibility(INVISIBLE);
        }
        invalidate();
    }

    /**
     * 设置电影名称
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * 设置当前位置
     */
    public void setPosition(String position) {
        this.position = position;
    }


    /**
     * 设置评论内容
     */
    public void setReview(String review) {
        this.review = review;
    }


    /**
     * 设置vip内容
     */
    public void setVip(String vip) {
        this.vip = vip;
    }

    /**
     * 设置vip标志
     */
    public void setVipFlag(boolean vipFlag) {
        this.vipFlag = vipFlag;
    }

    /**当前view在适配器数中的位置*/
    private int positionInAdapter=-1;

    public int getPositionInAdapter() {
        return positionInAdapter;
    }

    public void setPositionInAdapter(int positionInAdapter) {
        this.positionInAdapter = positionInAdapter;
    }

    /**
     * 初始化
     */
    private void init() {
        bitmapRectF = new RectF();
        rectFReview = new RectF();
        positionPath = new Path();
        vipPath = new Path();
        vipTextPath = new Path();
        setFocusable(true);
        setFocusableInTouchMode(true);
        borderPaint = new PaintBuilder()
                .setColor(Color.WHITE)
                .setStyle(Paint.Style.STROKE)
                .setStrokeWidth(6)
                .build();
        textPaint = new PaintBuilder().setColor(Color.WHITE)
                .setStrokeWidth(3)
                .setStyle(Paint.Style.FILL)
                .build();
        reviewBacPaint = new PaintBuilder().setColor("#000000")//评论背景画笔
                .setStyle(Paint.Style.FILL)
                .build();
        positionTextPaint = new PaintBuilder().setColor("#1d5755")
                .setStyle(Paint.Style.FILL)
                .build();
        vipPathPaint = new PaintBuilder().setColor("#579507")
                .setStyle(Paint.Style.FILL)
                .build();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (width == 0 || height == 0) {
            initCalculation();
        }
        drawBitmap(canvas);
        if (vipFlag) {
            drawVip(canvas);
        }
        if (borderFlag) {
            canvas.drawRect(bitmapRectF, borderPaint);
        }
        drawName(canvas);
        drawReview(canvas);
        if (!"".equals(position)){
            drawPosition(canvas);
        }


    }

    /**
     * 绘制电影海报
     */
    private void drawBitmap(Canvas canvas) {
        if (bitmap != null)
            canvas.drawBitmap(bitmap, null, bitmapRectF, null);
    }

    /**
     * 绘制vip区域
     */
    private void drawVip(Canvas canvas) {
        canvas.drawPath(vipPath, vipPathPaint);
        textPaint.setTextSize(vipTextSize);
        float actual = textPaint.measureText(vip);
        float tempSize=vipTextSize;
        while (actual > vipTextMaxLength) {
            tempSize = tempSize - 1;
            textPaint.setTextSize(tempSize);
            actual = textPaint.measureText(vip);
        }
        textPaint.setTextSize(tempSize);
        canvas.drawTextOnPath(vip, vipTextPath, vipTextHOffset, vipTextVOffset, textPaint);

    }

    /**
     * 绘制电影名称
     */
    private void drawName(Canvas canvas) {
        textPaint.setTextSize(nameTextSize);
        float textWidth = textPaint.measureText(name);
        float startTextX = (width - textWidth) / 2;
        canvas.drawText(name, startTextX, startTextY, textPaint);
    }

    /**
     * 绘制电影所在位置
     */
    private void drawPosition(Canvas canvas) {
        positionTextPaint.setTextSize(positionTextSize);
        float positionTextStartX = positionCircleX - positionTextPaint.measureText(position) / 2;
        canvas.drawCircle(positionCircleX, positionCircleY, positionCircleRadious, textPaint);
        canvas.drawPath(positionPath, textPaint);
        canvas.drawText(position, positionTextStartX, positionTextStartY, positionTextPaint);
    }


    /**
     * 绘制电影评论
     */
    private void drawReview(Canvas canvas) {
        textPaint.setTextSize(reviewTextSizeR);
        canvas.drawRect(rectFReview, reviewBacPaint);
        float startX =  (rectFReview.left+rectFReview.right)/2- textPaint.measureText(review) / 2;
        canvas.drawText(review, startX, reviewStartYR, textPaint);

    }



    /**
     * 初始化计算
     */
    private void initCalculation() {
        width = getWidth();//368已加间距48
        height = getHeight();//228

        //---------------bitmap--------------320-180-------
        //201811281403修改-------------------------------------------
        bitmapRectF.left = width * 0.06521f;//24
        bitmapRectF.top = width * 0.05434f;//20
        bitmapRectF.right = width * 0.9347f;//344
        bitmapRectF.bottom = width * 0.5494f;//200
        //201811281403修改-------------------------------------------
//        bitmapRectF.left = width * 0.07462f;
//        bitmapRectF.top = width * 0.06127f;
//        bitmapRectF.right = width * 0.9253f;
//        bitmapRectF.bottom = width * 0.5071f;
        //---------------bitmap---------------------

        //---------------name---------------------
        //201811281403修改-------------------------------------------
        nameTextSize = width * 0.08152f;//30
        startTextY = width * 0.6657f;//245
        //201811281403修改-------------------------------------------
//        nameTextSize = width * 0.08510f;
//        startTextY = width * 0.6263f;
        //---------------name---------------------

        //---------------review---------------------
        //201811281403修改-------------------------------------------
        reviewTextSizeR = width * 0.06521f;//24,评论文字大小
        rectFReview.left = width * 0.7802f;//评论背景框--284
        rectFReview.right = width * 0.9120f;//332
        rectFReview.top = width * 0.08695f;//32
        rectFReview.bottom = width * 0.1739f;//64
        reviewStartYR = width * 0.1576f;//58
        //201811281403修改-------------------------------------------
//        reviewTextSizeR = width * 0.05446f;
//        rectFReview.left = width * 0.7649f;
//        rectFReview.right = width * 0.9067f;
//        rectFReview.top = width * 0.08165f;
//        rectFReview.bottom = width * 0.1769f;
//        reviewStartYR = width * 0.1465f;
        //---------------review---------------------

        //--------------position----------------------
        //201811281403修改-------------------------------------------
        positionCircleX = bitmapRectF.right;//图片的右边
        positionCircleY = width * 0.2989f;//110
        positionCircleRadious = width * 0.06521f;//24
        positionTextSize = width * 0.05434f;//20
        positionTextStartY = positionCircleY + positionTextSize / 2;

        positionPath.moveTo(positionCircleX, positionCircleY - positionCircleRadious);
        positionPath.lineTo(positionCircleX - positionCircleRadious, positionCircleY - positionCircleRadious);
        positionPath.lineTo(positionCircleX - positionCircleRadious, positionCircleY);
        positionPath.close();
        //201811281403修改-------------------------------------------
//        positionCircleX = width * 0.9253f;//110
//        positionCircleY = width * 0.3054f;//110
//        positionCircleRadious = width * 0.04529f;
//        positionTextSize = width * 0.05106f;
//        positionTextStartY = positionCircleY + positionTextSize / 2;
//
//        positionPath.moveTo(positionCircleX, positionCircleY - positionCircleRadious);
//        positionPath.lineTo(positionCircleX - positionCircleRadious, positionCircleY - positionCircleRadious);
//        positionPath.lineTo(positionCircleX - positionCircleRadious, positionCircleY);
//        positionPath.close();
        //--------------position----------------------


        //--------------vip----------------------268--195
        //201811281403修改-------------------------------------------
        vipPath.moveTo(bitmapRectF.left, width * 0.1739f);//24-64
        vipPath.lineTo(bitmapRectF.left, width * 0.2798f);//24-103
        vipPath.lineTo(width * 0.2907f, bitmapRectF.top);//107-20
        vipPath.lineTo(width * 0.1847f, bitmapRectF.top);//68-20
        vipPath.close();
        vipTextPath.moveTo(bitmapRectF.left, width * 0.2798f);//背景底边
        vipTextPath.lineTo(width * 0.2907f, bitmapRectF.top);//背景底边
        vipTextSize = width * 0.08152f;//26
        vipTextHOffset = width * 0.07608f;//28
        vipTextVOffset = -width * 0.01902f;//7
        vipTextMaxLength = width * 0.1630f;//60

        //201811281403修改-------------------------------------------
//        vipPath.moveTo(width * 0.1865f, width * 0.06127f);
//        vipPath.lineTo(width * 0.2984f, width * 0.06127f);
//        vipPath.lineTo(width * 0.07462f, width * 0.2723f);
//        vipPath.lineTo(width * 0.07462f, width * 0.2723f - width * 0.1119f);
//        vipPath.close();
//        vipTextPath.moveTo(width * 0.07462f, width * 0.2723f);
//        vipTextPath.lineTo(width * 0.2984f, width * 0.06127f);
//        vipTextSize = width * 0.04462f;
//        vipTextHOffset = width * 0.06835f;
//        vipTextVOffset = -width * 0.02485f;
//        vipTextMaxLength = width * 0.1753f;
        //--------------vip----------------------
    }

    /**
     * 焦点变化是的动画效果
     */
    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {

        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus) {
            borderFlag = true;
            ViewCompat.animate(this).scaleX(1.15f).scaleY(1.15f).start();
        } else {
            borderFlag = false;
            ViewCompat.animate(this).scaleX(1.0f).scaleY(1.0f).translationZ(1.0f).start();
        }
    }

    /**
     * 设置电影海报图片
     */
    public void loadBitmap(String url) {
        Glide.with(getContext()).asBitmap().load(url)
                .apply(RequestOptions.bitmapTransform(new CenterInside()))
                .into(new CustomViewTarget<MovieInfoView, Bitmap>(this) {
                    @Override
                    public void onLoadFailed(@android.support.annotation.Nullable Drawable errorDrawable) {
                        //图片加载失败时会回调该方法
                        bitmap = ResouseIamge.getInstance().getBitmap(getContext());
                        invalidate();
                    }

                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @android.support.annotation.Nullable Transition<? super Bitmap> transition) {
                        //该方法运行在主线程
                        bitmap = resource;
                        invalidate();
                    }

                    @Override
                    protected void onResourceCleared(@android.support.annotation.Nullable Drawable placeholder) {

                    }
                });
    }


}
