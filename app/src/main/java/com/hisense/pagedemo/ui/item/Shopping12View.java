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
 * name:            Shopping12View
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/7
 * description：第12页购物view,宽高参考数值:368,276
 * introduce:
 * history：
 * ===================================================
 */
public class Shopping12View extends View {
    public Shopping12View(Context context) {
        this(context, null, 0);
    }

    public Shopping12View(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Shopping12View(Context context, @Nullable AttributeSet attrs,
                          int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Shopping12View(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
                          int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private int width = 0, height = 0;

    private void init() {
        goodsImgRectF = new RectF();
        actualRectF = new RectF();
        borderRectF = new RectF();
        positionRectF = new RectF();

        borderPaint = new PaintBuilder().setColor("#ffffff").setStyle(Paint.Style.STROKE).setStrokeWidth(5f).build();
        positionTextPaint = new PaintBuilder().setColor("#055c66").build();
        positionBacPaint = new PaintBuilder().setColor("#ffffff").build();
        deletePaint = new PaintBuilder().setColor("#000000").setStrokeWidth(3f).build();
        originalTextPaint = new PaintBuilder().setColor("#000000").build();
        pricePaint = new PaintBuilder().setColor("#f1f1f1").build();
        priceBacPaint = new PaintBuilder().setColor("#e84242").build();
        goodsNamePaint = new PaintBuilder().setColor("#f1f1f1").build();

        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /**
     * 边框画笔,位置文字画笔,位置背景画笔,删除线画笔,原始价格画笔,当前价格画笔,当前价格背景画笔,
     * 商品名称画笔
     */
    private Paint borderPaint, positionTextPaint, positionBacPaint, deletePaint, originalTextPaint,
            pricePaint, priceBacPaint, goodsNamePaint;

    /**
     * 商品图片
     */
    private Bitmap goodsImgBitmap;
    /**
     * 商品图片地址
     */
    private String goodsImgUrl = "";
    /**
     * 原始价格
     */
    private String originalPrice = "";
    /**
     * 当前价格
     */
    private String price = "";
    /**
     * 商品名称
     */
    private String goodsName = "";
    /**
     * 位置
     */
    private String position = "";
    /**
     * 是否是获取焦点状态
     */
    private boolean borderFlag = false;

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl;
        Glide.with(this).asBitmap().load(goodsImgUrl)
                .apply(RequestOptions.bitmapTransform(new FitCenter())).into(new CustomViewTarget<Shopping12View, Bitmap>(this) {
            @Override
            public void onLoadFailed(@Nullable Drawable errorDrawable) {

            }

            @Override
            public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                goodsImgBitmap = resource;
                invalidate();
            }

            @Override
            protected void onResourceCleared(@Nullable Drawable placeholder) {

            }
        });
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (width == 0) {
            initCalculator();
        }

        if (goodsImgBitmap != null) {
            canvas.drawBitmap(goodsImgBitmap, null, goodsImgRectF, null);
        }

        originalTextPaint.setTextSize(originalTextSize);
        canvas.drawText(originalPrice, originalStartX, originalStartY, originalTextPaint);//原始价格
        canvas.drawLine(deleteStartX, deleteY,
                deleteStartX + originalTextPaint.measureText(originalPrice), deleteY, deletePaint);//删除线

        pricePaint.setTextSize(priceTextSize);
        actualRectF.right = actualRectF.left + 32 + pricePaint.measureText(price);
        canvas.drawRoundRect(actualRectF, priceBacRadius, priceBacRadius, priceBacPaint);//绘制背景
        canvas.drawRect(actualRectF.left, actualRectF.top, actualRectF.left + priceBacRadius * 2, actualRectF.bottom, priceBacPaint);
        canvas.drawText(price, priceStartX, priceStartY, pricePaint);//当前价格

        drawGoodsName(canvas);

        if (borderFlag) {
            canvas.drawRect(borderRectF, borderPaint);
        }
        if (!checkNull(position)) {//绘制位置
            canvas.drawRect(positionRectF, positionBacPaint);
            canvas.drawCircle(positionCenterX, positionCenterY, positionRadius, positionBacPaint);
            positionTextPaint.setTextSize(positionTextSize);
            canvas.drawText(position, positionTextCenterX - positionTextPaint.measureText(position) / 2,
                    positionTextStartY, positionTextPaint);
        }
    }

    private void drawGoodsName(Canvas canvas){
        goodsNamePaint.setTextSize(goodsNameTextSize);//绘制商品名称
        float length = goodsNamePaint.measureText(goodsName);
        if (length > maxGoodsNameLength) {
            String temp;
            int subPosition=0;
            for (int i = 0; i < goodsName.length(); i++) {
                temp=goodsName.substring(0,i);
                length=goodsNamePaint.measureText(temp);
                if (length>maxGoodsNameLength){
                    subPosition=i;
                    break;
                }
            }
            temp=goodsName.substring(0,subPosition-3)+"...";
            canvas.drawText(temp, goodsNameCenterX - goodsNamePaint.measureText(temp) / 2,
                    goodsNameStartY, goodsNamePaint);
        } else {
            canvas.drawText(goodsName, goodsNameCenterX - length / 2, goodsNameStartY, goodsNamePaint);
        }
    }

    private boolean checkNull(String s) {
        return s == null || "".equals(s);
    }

    /**
     * 商品图片,实际价格,边框,位置
     */
    private RectF goodsImgRectF, actualRectF, borderRectF, positionRectF;
    /**
     * 位置中心点,半径
     */
    private float positionCenterX = 0, positionCenterY = 0, positionRadius = 0;
    /**
     * 位置起始中心点
     */
    private float positionTextCenterX = 0, positionTextStartY = 0, positionTextSize = 0;
    /**
     * 删除线起始点
     */
    private float deleteStartX = 0, deleteY = 0;
    /**
     * 原始价格起始位置
     */
    private float originalStartX = 0, originalStartY = 0, originalTextSize = 0;
    /**
     * 当前价格起始位置
     */
    private float priceStartX = 0, priceStartY = 0, priceTextSize = 0, priceBacRadius = 0;
    /**
     * 商品名称起始位置,商品名称文字大小
     */
    private float goodsNameCenterX = 0, goodsNameStartY = 0, goodsNameTextSize = 0;
    /**
     * 商品名称文字最大长度
     */
    private float maxGoodsNameLength = 0;

    private void initCalculator() {
//----------------------368,276---------------------------------------------------------------------
        width = getWidth();//368
        height = getHeight();//276


        goodsImgRectF.left = width * 0.06521f;//24
        goodsImgRectF.top = width * 0.06521f;//24
        goodsImgRectF.right = width * 0.9347f;//344
        goodsImgRectF.bottom = width * 0.5543f;//204

        actualRectF.left = goodsImgRectF.left;//24
        actualRectF.top = width * 0.4402f;//162
//        actualRectF.right=width*0.4402f;//动态计算
        actualRectF.bottom = width * 0.5271f;//194
        maxGoodsNameLength = goodsImgRectF.right - goodsImgRectF.left;


        borderRectF = goodsImgRectF;

        positionCenterX = goodsImgRectF.right;
        positionCenterY = (goodsImgRectF.top + goodsImgRectF.bottom) / 2;
        positionRadius = width * 0.08152f;//30

        positionRectF.left = positionCenterX - positionRadius;
        positionRectF.top = positionCenterY - positionRadius;
        positionRectF.right = positionCenterX;
        positionRectF.bottom = positionCenterY;

        positionTextCenterX = positionCenterX;
        positionTextSize = width * 0.06521f;//24
        positionTextStartY = positionCenterY + positionTextSize / 2;


        deleteStartX = goodsImgRectF.left + width * 0.03260f;//+12

        originalStartX = deleteStartX;//+12
        originalStartY = width * 0.4293f;//158
        originalTextSize = width * 0.05978f;//22
        deleteY = originalStartY-width * 0.02173f;//-8

        priceStartX = originalStartX;
        priceStartY = width * 0.5f;//184
        priceTextSize = width * 0.06521f;//24
//        priceBacRadius = width * 0.02173f;//8
        priceBacRadius = (actualRectF.bottom-actualRectF.top)/2;//一半

        goodsNameCenterX = (goodsImgRectF.left + goodsImgRectF.right) / 2;
        goodsNameStartY = width * 0.6847f;//252
        goodsNameTextSize = width * 0.08152f;//30
    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        borderFlag = gainFocus;
        invalidate();
    }
}
