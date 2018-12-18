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
 * name:            Shopping11View
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/7
 * description：  第11页购物view  宽高参考数值:626,258
 * introduce:
 * history：
 * ===================================================
 */
public class Shopping11View extends View {
    public Shopping11View(Context context) {
        this(context, null, 0);
    }

    public Shopping11View(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Shopping11View(Context context, @Nullable AttributeSet attrs,
                          int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Shopping11View(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
                          int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private int width=0,height=0;
    private void init() {
        goodsRectF=new RectF();
        borderRectF=new RectF();
        freeShipppingRectF=new RectF();
        positionLeftTopRectF=new RectF();

        titlePaint=new PaintBuilder().setColor("#F1F1F1").build();
        bacPaint=new PaintBuilder().setColor("#303131").build();
        positionPaint=new PaintBuilder().setColor("#055c66").build();
        positionBacPaint=new PaintBuilder().setColor("#F1F1F1").build();
        borderPaint=new PaintBuilder().setColor("#ffffff").setStyle(Paint.Style.STROKE).setStrokeWidth(5f).build();
        freeShippingPaint=new PaintBuilder().setColor("#CCF1F1F1").build();
        paymentCountPaint=new PaintBuilder().setColor("#CCF1F1F1").build();
        pricePaint=new PaintBuilder().setColor("#F5A623").build();
        freeShippingBacPaint=new PaintBuilder().setColor("#ffffff").setStrokeWidth(1f).setStyle(Paint.Style.STROKE).build();

        setFocusable(true);
        setFocusableInTouchMode(true);
    }
    /**标题文字画笔,价格文字画笔,包邮背景画笔,包邮文字画笔,付款人数文字画笔,位置文字画笔,边框画笔,位置背景画笔,整体背景画笔*/
    private Paint titlePaint,pricePaint,freeShippingBacPaint,freeShippingPaint,
            paymentCountPaint,positionPaint,borderPaint,positionBacPaint,bacPaint;
    /**商品图片地址*/
    private String goodsImgUrl="";
    /**商品图片*/
    private Bitmap goodsBitmap;
    /**价格*/
    private String price="";
    /**包邮*/
    private String freeShipping="包邮";
    /**付款数*/
    private String paymentCount="";
    /**位置*/
    private String position="";

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl;
        Glide.with(this).asBitmap().load(goodsImgUrl)
                .apply(RequestOptions.bitmapTransform(new FitCenter()))
                .into(new CustomViewTarget<Shopping11View,Bitmap>(this) {
                    @Override
                    public void onLoadFailed(@Nullable Drawable errorDrawable) {

                    }

                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        goodsBitmap=resource;
                        invalidate();
                    }

                    @Override
                    protected void onResourceCleared(@Nullable Drawable placeholder) {

                    }
                });
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    public String getPaymentCount() {
        return paymentCount;
    }

    public void setPaymentCount(String paymentCount) {
        this.paymentCount = paymentCount;
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
        if (width==0){
            initCalculator();
        }

        canvas.drawRect(borderRectF,bacPaint);
        if (goodsBitmap!=null){
            canvas.drawBitmap(goodsBitmap,null,goodsRectF,null);
        }
        drawTitle(canvas);
        pricePaint.setTextSize(priceTextSize);
        canvas.drawText(price,priceStartX,priceStartY,pricePaint);

        freeShippingPaint.setTextSize(freeShippingTextSize);
        canvas.drawText(freeShipping,freeShippingStartCenterX-freeShippingPaint.measureText(freeShipping)/2,
                freeShippingStartY,freeShippingPaint);
        canvas.drawRoundRect(freeShipppingRectF,2,2,freeShippingBacPaint);

        paymentCountPaint.setTextSize(paymentCountTextSize);
        canvas.drawText(paymentCount,paymentCountStartX,paymentCountStartY,paymentCountPaint);

        if (borderFlag){
            canvas.drawRect(borderRectF,borderPaint);
        }
        if (!checkNull(position)){
            canvas.drawRect(positionLeftTopRectF,positionBacPaint);
            canvas.drawCircle(positionCenterX,positionCenterY,positionRadius,positionBacPaint);
            positionPaint.setTextSize(positionTextSize);
            canvas.drawText(position,positionCenterX-positionPaint.measureText(position)/2,positionTextStartY,positionPaint);
        }


    }
    private boolean borderFlag=false;


    /**商品名称*/
    private String  title="";
//    /**初始截取字符数*/
//    private int  startPositon=12;
    private void drawTitle(Canvas canvas) {
        titlePaint.setTextSize(titleTextSize);
        int subPosition= getSubPosition(title);
        if (subPosition==0){
            canvas.drawText(title,titleStartX1,titleStartY1,titlePaint);
        }else {
            String  title1=title.substring(0,subPosition);
            canvas.drawText(title1,titleStartX1,titleStartY1,titlePaint);
            String title2=title.substring(subPosition,title.length());
            int sub2=getSubPosition(title2);
            if (sub2!=0){
                if (sub2-3>0)
                title2=title2.substring(0,sub2-3)+"...";
            }
            canvas.drawText(title2,titleStartX2,titleStartY2,titlePaint);
        }
    }

    /**截取适合宽度的文字*/
    private int   getSubPosition(String  target){
        float title1Lenth;
        int  subPosition=0;
        String  temp;
        for (int i = 0; i < target.length(); i++) {
            temp=target.substring(0,i);
            title1Lenth=titlePaint.measureText(temp);
            if (title1Lenth>maxTextLength){
                subPosition=i-1;
                return subPosition;
            }
        }
        return subPosition;
    }

    /**商品图片位置,选中时的边框,包邮,位置左上角*/
    private RectF goodsRectF,borderRectF,freeShipppingRectF,positionLeftTopRectF;
    /**文字绘制的最大长度*/
    private float maxTextLength=0;
    /**标题文字的起始位置*/
    private float  titleStartX1=0,titleStartX2=0,titleStartY1=0,titleStartY2=0;
    /**价格起始位置*/
    private float priceStartX=0,priceStartY=0;
    /**包邮起始位置*/
    private float  freeShippingStartCenterX=0,freeShippingStartY=0;
    /**付款数起始位置*/
    private float  paymentCountStartX=0,paymentCountStartY=0;
    /**当前位置中心点,半径*/
    private float  positionCenterX=0,positionCenterY=0,positionRadius=0;
    /**当前位置文字起始点*/
    private float   positionTextStartY=0;
    /**标题文字大小,价格文字大小,包邮文字大小,付款人数文字大小,位置文字大小*/
    private float titleTextSize=0,priceTextSize=0,freeShippingTextSize=0,paymentCountTextSize=0,positionTextSize;

    private void initCalculator() {
        width=getWidth();//626
        height=getHeight();//258

        goodsRectF.left=width*0.05271f;//33
        goodsRectF.right=width*0.3881f;//243
        goodsRectF.top=width*0.03833f;//24
        goodsRectF.bottom=width*0.3738f;//234

        borderRectF.left=goodsRectF.left;
        borderRectF.top=goodsRectF.top;
        borderRectF.right=width*0.9472f;//593
        borderRectF.bottom=goodsRectF.bottom;
//------------------------------------width=626-----------------------------------------------------
        freeShipppingRectF.left=goodsRectF.right+width*0.01916f;
        freeShipppingRectF.right=goodsRectF.right+width*0.09584f;
        freeShipppingRectF.top=width*0.2444f;//153
        freeShipppingRectF.bottom=width*0.2923f;//183

        maxTextLength=width*0.5207f;//326
        titleStartX1=goodsRectF.right+width*0.01916f;
        titleStartX2=titleStartX1;
        titleStartX2=titleStartX1;
        titleStartY1=width*0.1054f;//66
        titleStartY2=width*0.1677f;//105

        priceStartX=titleStartX1;
        priceStartY=width*0.2300f;//144

        freeShippingStartY=width*0.2827f;//177

        paymentCountStartX=titleStartX1;
        paymentCountStartY=width*0.3482f;//218

        positionCenterX=borderRectF.right;
        positionCenterY=(borderRectF.top+borderRectF.bottom)/2;
        positionRadius=width*0.04792f;//30
        positionTextStartY=positionCenterY+0.01916f*width;


        positionLeftTopRectF.left=positionCenterX-positionRadius;
        positionLeftTopRectF.right=positionCenterX;
        positionLeftTopRectF.top=positionCenterY-positionRadius;
        positionLeftTopRectF.bottom=positionCenterY;


        titleTextSize=width*0.04792f;//30
        priceTextSize=titleTextSize;//30
        freeShippingTextSize=width*0.03514f;//22
        paymentCountTextSize=width*0.04153f;//26
        positionTextSize=width*0.03833f;//24

        freeShippingStartCenterX=(freeShipppingRectF.right+freeShipppingRectF.left)/2;

    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        borderFlag=gainFocus;
        invalidate();

    }


    private boolean checkNull(String s){
        return s==null||"".equals(s);
    }
}
