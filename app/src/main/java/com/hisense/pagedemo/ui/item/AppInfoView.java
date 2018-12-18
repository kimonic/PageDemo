package com.hisense.pagedemo.ui.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
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
 * name:            AppInfoView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description： 设置应用相关信息view
 * notice:    控件宽高比例必须为9:7,dpi=320,否则UI效果无法保证
 * <p>
 * UI设计控件宽高:320-228,横向间距48,最终设计空间尺寸为宽高368--228
 * 内部图片宽高,320-180
 * introduce:
 * setName(String name)  设置应用名称
 * setPosition(String position)  设置当前位置
 * setReview(String review)      设置评论内容
 * setInstall(String install)   设置是否已安装
 * setInstallFlag(boolean installFlag)   设置安装标志
 * loadBitmap(String url)   设置图片URL地址
 * history：
 * ===================================================
 */
public class AppInfoView extends View {
    private int width = 0;
    private int height = 0;
    private Bitmap bitmap;
    private String name = "";
    private String position = "";
    private String review = "";
    private boolean borderFlag = false;
    private Paint borderPaint, textPaint, reviewBacPaint, positionTextPaint, installPathPaint;
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

    //--------------install----------------------
    private Path installPath;
    private Path installTextPath;
    private float installTextSize = 0;
    private float installTextHOffset = 0;
    private float installTextVOffset = 0;
    private String install = "";
    private float installTextMaxLength = 0;
    private boolean installFlag = false;
    //--------------install----------------------
    private boolean isShow = true;


    //-------------------------应用绘制参数----------------------------------------------------
    /**
     * 遮罩画笔,下载量与类型画笔
     */
    private Paint shaderPaint, downLoadPaint;
    /**
     * 遮罩矩形
     */
    private RectF rectFshader;
    /**
     * 左边文字起始计算位置,右边文字起始计算位置
     */
    private float downLoadStartX, downLoadStartY, typeStartX, typeStartY;


    //-------------------------应用绘制参数----------------------------------------------------

    public AppInfoView(Context context) {
        this(context, null, 0);
    }

    public AppInfoView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AppInfoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public AppInfoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
        if (isShow) {
            setVisibility(VISIBLE);
        } else {
            setVisibility(INVISIBLE);
        }
        invalidate();
    }

    /**
     * 设置应用名称
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
     * 设置install内容
     */
    public void setInstall(String install) {
        this.install = install;
    }

    /**
     * 设置install标志
     */
    public void setInstallFlag(boolean installFlag) {
        this.installFlag = installFlag;
    }

    /**
     * 当前view在适配器数中的位置
     */
    private int positionInAdapter = -1;

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
        installPath = new Path();
        installTextPath = new Path();
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
        installPathPaint = new PaintBuilder().setColor("#579507")
                .setStyle(Paint.Style.FILL)
                .build();

        //-------------------------应用绘制参数----------------------------------------------------
        rectFshader = new RectF();
        shaderPaint = new PaintBuilder().build();
        downLoadPaint = new PaintBuilder().setColor("#ffffff").build();

        internalRectf = new RectF();
        //-------------------------应用绘制参数----------------------------------------------------


    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (width == 0 || height == 0) {
            initCalculation();
        }
        drawBitmap(canvas);
        if (installFlag) {
            drawInstall(canvas);
        }
        if (borderFlag) {
            canvas.drawRect(bitmapRectF, borderPaint);
        }
        drawName(canvas);
        drawReview(canvas);
        if (!"".equals(position)) {
            drawPosition(canvas);
        }

        drawApp(canvas);


    }

    //-------------------------应用绘制参数----------------------------------------------------

    private String downLoadCount = "300W+ 下载";
    private String appType = "休闲益智";
    private float downLoadTextSize = 0;

    public String getDownLoadCount() {
        return downLoadCount;
    }

    public void setDownLoadCount(String downLoadCount) {
        this.downLoadCount = downLoadCount;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    private void drawApp(Canvas canvas) {
        canvas.drawRect(rectFshader, shaderPaint);
        downLoadPaint.setTextSize(downLoadTextSize);
        canvas.drawText(downLoadCount, downLoadStartX, downLoadStartY, downLoadPaint);
        canvas.drawText(appType, typeStartX - downLoadPaint.measureText(appType), typeStartY, downLoadPaint);

    }

    //-------------------------应用绘制参数----------------------------------------------------
    private RectF internalRectf;

    /**
     * 绘制应用海报
     */
    private void drawBitmap(Canvas canvas) {
        if (bitmap != null){
//            if ((bitmap.getWidth() > bitmapRectF.right - bitmapRectF.left)
//                    || (bitmap.getHeight() > bitmapRectF.bottom - bitmapRectF.top)) {
//
//                //保持原图片的宽高比例----------
//                float ratioHeight = bitmap.getHeight() / (bitmapRectF.bottom - bitmapRectF.top);
//                float ratioWidth = bitmap.getWidth() / (bitmapRectF.right - bitmapRectF.left);
//                if (ratioHeight>ratioWidth) {//横向压缩
//                    internalRectf.left = (bitmapRectF.right + bitmapRectF.left) / 2 - bitmap.getWidth() / 2 / ratioHeight;
//                    internalRectf.right = (bitmapRectF.right + bitmapRectF.left) / 2 + bitmap.getWidth() / 2 / ratioHeight;
//                    internalRectf.top = (bitmapRectF.top + bitmapRectF.bottom) / 2 - bitmap.getHeight() / 2 / ratioHeight;
//                    internalRectf.bottom = (bitmapRectF.top + bitmapRectF.bottom) / 2+bitmap.getHeight() / 2 / ratioHeight;
//                } else {//纵向压缩
//                    internalRectf.left = (bitmapRectF.right + bitmapRectF.left) / 2 - bitmap.getWidth() / 2 / ratioWidth;
//                    internalRectf.right = (bitmapRectF.right + bitmapRectF.left) / 2+ bitmap.getWidth() / 2 / ratioWidth;
//                    internalRectf.top = (bitmapRectF.top + bitmapRectF.bottom) / 2 - bitmap.getHeight() / 2 / ratioWidth;
//                    internalRectf.bottom = (bitmapRectF.top + bitmapRectF.bottom) / 2 + bitmap.getHeight() / 2 / ratioWidth;
//                }
//                canvas.drawBitmap(bitmap, null, internalRectf, null);
//            }else {
                canvas.drawBitmap(bitmap, null, bitmapRectF, null);

            }
    }

    /**
     * 绘制install区域
     */
    private void drawInstall(Canvas canvas) {
        canvas.drawPath(installPath, installPathPaint);
        textPaint.setTextSize(installTextSize);
        float actual = textPaint.measureText(install);
        float tempSize = installTextSize;
        while (actual > installTextMaxLength) {
            tempSize = tempSize - 1;
            textPaint.setTextSize(tempSize);
            actual = textPaint.measureText(install);
        }
        textPaint.setTextSize(tempSize);
        canvas.drawTextOnPath(install, installTextPath, installTextHOffset, installTextVOffset, textPaint);

    }

    /**
     * 绘制应用名称
     */
    private void drawName(Canvas canvas) {
        textPaint.setTextSize(nameTextSize);
        float textWidth = textPaint.measureText(name);
        float startTextX = (width - textWidth) / 2;
        canvas.drawText(name, startTextX, startTextY, textPaint);
    }

    /**
     * 绘制应用所在位置
     */
    private void drawPosition(Canvas canvas) {
        positionTextPaint.setTextSize(positionTextSize);
        float positionTextStartX = positionCircleX - positionTextPaint.measureText(position) / 2;
        canvas.drawCircle(positionCircleX, positionCircleY, positionCircleRadious, textPaint);
        canvas.drawPath(positionPath, textPaint);
        canvas.drawText(position, positionTextStartX, positionTextStartY, positionTextPaint);
    }


    /**
     * 绘制应用评论
     */
    private void drawReview(Canvas canvas) {
        textPaint.setTextSize(reviewTextSizeR);
        canvas.drawRect(rectFReview, reviewBacPaint);
        float startX = (rectFReview.left + rectFReview.right) / 2 - textPaint.measureText(review) / 2;
        canvas.drawText(review, startX, reviewStartYR, textPaint);

    }


    /**
     * 初始化计算
     */
    private void initCalculation() {
        width = getWidth();//368已加间距48
        height = getHeight();//228

        //---------------bitmap--------------320-180-------
        bitmapRectF.left = width * 0.06521f;//24
        bitmapRectF.top = width * 0.05434f;//20
        bitmapRectF.right = width * 0.9347f;//344
        bitmapRectF.bottom = width * 0.5494f;//200
        //---------------bitmap---------------------

        //---------------name---------------------
        nameTextSize = width * 0.08152f;//30
        startTextY = width * 0.6657f;//245
        //---------------name---------------------

        //---------------review---------------------
        reviewTextSizeR = width * 0.06521f;//24,评论文字大小
        rectFReview.left = width * 0.7802f;//评论背景框--284
        rectFReview.right = width * 0.9120f;//332
        rectFReview.top = width * 0.08695f;//32
        rectFReview.bottom = width * 0.1739f;//64
        reviewStartYR = width * 0.1576f;//58
        //---------------review---------------------

        //--------------position----------------------
        positionCircleX = bitmapRectF.right;//图片的右边
        positionCircleY = width * 0.2989f;//110
        positionCircleRadious = width * 0.06521f;//24
        positionTextSize = width * 0.05434f;//20
        positionTextStartY = positionCircleY + positionTextSize / 2;

        positionPath.moveTo(positionCircleX, positionCircleY - positionCircleRadious);
        positionPath.lineTo(positionCircleX - positionCircleRadious, positionCircleY - positionCircleRadious);
        positionPath.lineTo(positionCircleX - positionCircleRadious, positionCircleY);
        positionPath.close();


        //--------------install----------------------268--195
        installPath.moveTo(bitmapRectF.left, width * 0.1739f);//24-64
        installPath.lineTo(bitmapRectF.left, width * 0.2798f);//24-103
        installPath.lineTo(width * 0.2907f, bitmapRectF.top);//107-20
        installPath.lineTo(width * 0.1847f, bitmapRectF.top);//68-20
        installPath.close();
        installTextPath.moveTo(bitmapRectF.left, width * 0.2798f);//背景底边
        installTextPath.lineTo(width * 0.2907f, bitmapRectF.top);//背景底边
        installTextSize = width * 0.08152f;//26
        installTextHOffset = width * 0.07608f;//28
        installTextVOffset = -width * 0.01902f;//7
        installTextMaxLength = width * 0.1630f;//60
        //--------------install----------------------


        //-------------------------应用绘制参数-----------------------368---228--------------------------
//        private RectF rectFshader;
//        /**左边文字起始计算位置,右边文字起始计算位置*/
//        private float downLoadStartX,downLoadStartY,typeStartX,typeStartY;
        rectFshader.top = bitmapRectF.top + width * 0.3260f;//120+?
        rectFshader.left = bitmapRectF.left;
        rectFshader.right = bitmapRectF.right;
        rectFshader.bottom = bitmapRectF.bottom;

        LinearGradient linearGradient = new LinearGradient(rectFshader.left, rectFshader.top,
                rectFshader.left, rectFshader.bottom, Color.TRANSPARENT, Color.BLACK, Shader.TileMode.REPEAT);
        shaderPaint.setShader(linearGradient);

        downLoadStartX = bitmapRectF.left + width * 0.03260f;
        typeStartX = bitmapRectF.right - width * 0.03260f;
        downLoadStartY = typeStartY = bitmapRectF.bottom - width * 0.03260f;

        downLoadTextSize = width * 0.04891f;//18
        //-------------------------应用绘制参数----------------------------------------------------

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
     * 设置应用海报图片
     */
    public void loadBitmap(String url) {
        Glide.with(getContext()).asBitmap().load(url)
                .apply(RequestOptions.bitmapTransform(new CenterInside()))
                .into(new CustomViewTarget<AppInfoView, Bitmap>(this) {
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
