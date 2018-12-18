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
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.hisense.pagedemo.utils.PaintBuilder;

/**
 * * ================================================
 * name:            MoviewActorView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/6
 * description：  09页演员item
 * introduce:
 * history：
 * ===================================================
 */
public class MovieActorView extends View {
    public MovieActorView(Context context) {
        this(context, null, 0);
    }

    public MovieActorView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MovieActorView(Context context, @Nullable AttributeSet attrs,
                          int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MovieActorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
                          int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        portraitRectF=new RectF();
        positionRectF=new RectF();
        namePaint=new PaintBuilder().setColor("#ffffff").build();
        positionBacPaint=new PaintBuilder().setColor("#ffffff").build();
        borderPaint=new PaintBuilder().setColor("#ffffff").setStrokeWidth(3).setStyle(Paint.Style.STROKE).build();
        positionPaint=new PaintBuilder().setColor("#055c66").build();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private int width,height;
    private Bitmap portraitBitmap;
    private Paint namePaint,positionBacPaint,positionPaint,borderPaint;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (width==0||height==0){
            initCalculator();
        }

        //--------------------------绘制头像-----------------------------------
        if (portraitBitmap!=null){
            canvas.drawBitmap(portraitBitmap,null,portraitRectF,null);
        }

        //----------------------绘制姓名----------------------------------
        namePaint.setTextSize(nameTextSize);
        canvas.drawText(name,nameCenerX-namePaint.measureText(name)/2,nameStartY,namePaint);


        if (borderFlag){
            canvas.drawCircle(portraitCenterX,portraitCenterY,portraitRadius+1,borderPaint);
        }
        
        //-------------------绘制位置--------------------------------------
        if (!checkNull(position)){
            canvas.drawRect(positionRectF,positionBacPaint);
            canvas.drawCircle(positionCenterX,positionCenterY,positionRadius,positionBacPaint);

            positionPaint.setTextSize(positionTextSize);
            canvas.drawText(position,positionCenterX-positionPaint.measureText(position)/2,positionStartY,positionPaint);
            
            
        }
        

    }
    private boolean checkNull(String s) {
        return s == null || "".equals(s);
    }

    private float portraitCenterX=0;
    private float portraitCenterY=0;
    private float portraitRadius=0;
    private float nameStartY=0;
    private float nameCenerX=0;
    private float nameTextSize=0;
    private float positionCenterX=0;
    private float positionCenterY=0;
    private float positionStartY=0;
    private float positionRadius=0;
    private float positionTextSize=0;

    private RectF positionRectF;
    private RectF portraitRectF;

    private String  name="";
    private String  position="";
    private String  portraitUrl="";
    private boolean  borderFlag=false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
        Glide.with(this).asBitmap().load(portraitUrl)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(new CustomViewTarget<MovieActorView,Bitmap>(this) {
                    @Override
                    public void onLoadFailed(@Nullable Drawable errorDrawable) {

                    }

                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        portraitBitmap=resource;
                        invalidate();
                    }

                    @Override
                    protected void onResourceCleared(@Nullable Drawable placeholder) {

                    }
                });
    }

    private void initCalculator() {
        width=getWidth();//268
        height=getHeight();//342
        //---------------头像-------------------------
        portraitCenterX=width*0.5f;//134
        portraitCenterY=width*0.5485f;//147
        portraitRadius=width*0.3358f;//90

        portraitRectF.left=width*0.1641f;//44
        portraitRectF.right=width*0.8358f;//224
        portraitRectF.top=width*0.2126f;//57
        portraitRectF.bottom=width*0.8843f;//57
        //----------------姓名-----------------------------------
        nameStartY=width*1.0634f;//285
        nameTextSize=width*0.1343f;//36
        nameCenerX=portraitCenterX;
        //-----------------位置------------------------------
        positionCenterX=portraitCenterX+portraitRadius;
        positionCenterY=portraitCenterY;
        positionRadius=width*0.09328f;//25

        positionStartY=positionCenterY+positionRadius/2-width*0.01492f;
        positionRectF.left=positionCenterX-positionRadius;
        positionRectF.right=positionCenterX;
        positionRectF.top=positionCenterY-positionRadius;
        positionRectF.bottom=positionCenterY;

        positionTextSize=width*0.08955f;
    }


    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus){
            borderFlag=true;
        }else {
            borderFlag=false;
        }
        invalidate();
    }
}
