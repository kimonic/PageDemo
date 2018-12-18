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
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.hisense.pagedemo.ui.ResouseIamge;
import com.hisense.pagedemo.utils.PaintBuilder;

/**
 * * ================================================
 * name:            ActorInformationView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/28
 * description： 演员信息介绍view
 * introduce:使用宽高比例:1792:308   23:4
 * history：
 * ===================================================
 */
public class ActorInformationView extends View {
    /**
     * 演员头像URL
     */
    private String headUrl = "";
    /**
     * 演员姓名
     */
    private String actorName = "成龙";
    /**
     * 演员介绍
     */
    private String introduce = "";
    /**
     * 数据来源
     */
    private int dataType = 0;
    /**
     * 演员头像图片,数据来源图片
     */
    private Bitmap bitmapHead,dataFromBitmap,dataFromHeaderBitmap;

    /**
     * view的宽度
     */
    private int width = 0;

    /**
     * 头像矩形
     */
    private RectF rectFHeader;
    /**
     * 播放图片圆心坐标点
     */
    private float bacCircleX, bacCircleY, bacCircleRadius;
    /**
     * 播放图片三角路径
     */
    private Path pathTriangle;
    /**
     * 秒懂百科矩形Encyclopedia
     */
    private RectF rectFEncyclopedia;
    /**
     * 演员名字起点坐标
     */
    private float actorNameStartX, actorNameStartY;
    /**
     * 内容起点坐标
     */
    private float contentX1, contentX2, contentX3, contentY1, contentY2, contentY3;
    /**
     * 数据来自起点坐标
     */
    private float dataFromStartX, dataFromStartY;
//    /**
//     * 数据来自图片矩形
//     */
//    private RectF rectFDataFrom;
    /**
     * 圆背景画笔,名字内容三角画笔,数据来自画笔,遮罩画笔,边框画笔
     */
    private Paint bacPaint, whitePaint, dataPaint,shadePaint,borderPaint;
    /**
     * 演员名字字体大小,内容文字字体大小,数据来自字体大小
     */
    private float actorNameTextSize, contentTextSize, dataFromTextSize;
    /**
     * 介绍内容
     */
    private String content1 = "成龙，1954年4月7日出生于香港中西区，祖籍安徽省芜湖，中国香港男演员、导演、动作指导、制作人、编剧、歌",

    content2 = "手。1971年以武师身份进入电影圈 。1976年在动作片《新精武门》中担任男主角。1978年主演的动作片《蛇形刁手",
    content3 = "》、《醉拳》标志着功夫喜剧片的开端 。1980年自编自导的动作片《师弟出马》获得香港年度票房冠军 .......";

    /**
     * 成龙，1954年4月7日出生于香港中西区，祖籍安徽省芜湖，中国香港男演员、导演、动作指导、制作人、编剧、歌
     * 手。1971年以武师身份进入电影圈 。1976年在动作片《新精武门》中担任男主角。1978年主演的动作片《蛇形刁手
     * 》、《醉拳》标志着功夫喜剧片的开端 。1980年自编自导的动作片《师弟出马》获得香港年度票房冠军 .......
     * 主演的喜剧动作片《夏日福星》打破香港地区票房纪录 [4]  。1986年自导自演的动作片《警察故事》获得第5届香港电影金像奖最佳影片奖 [5]  。1991年担任剧情片《阮玲玉》的制作人。
     * 1992年发行个人首张国语专辑《第一次》。1993年凭借警匪片《重案组》获得第30届台湾电影金马奖最佳男主角奖 [6]  。
     * @param context  ""
     */
    public ActorInformationView(Context context) {
        this(context, null, 0);
    }

    public ActorInformationView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ActorInformationView(Context context, @Nullable AttributeSet attrs,
                                int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ActorInformationView(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
                                int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        rectFHeader = new RectF();
        rectFEncyclopedia = new RectF();
//        rectFDataFrom = new RectF();
        bacPaint = new PaintBuilder().setColor("#000000").setAlpha(137).setStyle(Paint.Style.FILL).build();
        whitePaint = new PaintBuilder().setColor("#f1f1f1").setStyle(Paint.Style.FILL).build();
        dataPaint = new PaintBuilder().setColor("#757575").setStyle(Paint.Style.FILL).build();
        shadePaint = new PaintBuilder().setColor("#B3F1F1F1").setStyle(Paint.Style.FILL).build();
        borderPaint = new PaintBuilder().setColor(Color.WHITE).setStyle(Paint.Style.STROKE).setStrokeWidth(3).build();
        pathTriangle = new Path();

        setFocusable(true);
        setFocusableInTouchMode(true);

        // TODO: 2018/11/28  --------------待删除----------------------
        setHeadUrl("http://d.ifengimg.com/w600/p0.ifengimg.com/pmop/2018/1110/A969126C6B8A91F33F5C2838ADADF44F8FD601C5_size473_w1200_h897.jpeg");
        dataFromBitmap=ResouseIamge.getInstance().getBitmapDataFrom(getContext(),6);
        dataFromHeaderBitmap=ResouseIamge.getInstance().getBitmapDataFrom(getContext(),4);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (width == 0) {
            initData();
        }
        //绘制头像
        if (bitmapHead != null) {
            canvas.drawBitmap(bitmapHead, null, rectFHeader, null);
            canvas.drawBitmap(dataFromHeaderBitmap,null,rectFEncyclopedia,null);
        }

//        绘制姓名
        whitePaint.setTextSize(actorNameTextSize);
        whitePaint.setFakeBoldText(true);
        canvas.drawText(actorName, actorNameStartX, actorNameStartY, whitePaint);

        //绘制内容
        whitePaint.setTextSize(contentTextSize);
        whitePaint.setFakeBoldText(false);
        canvas.drawText(content1, contentX1, contentY1, whitePaint);
        canvas.drawText(content2, contentX2, contentY2, whitePaint);
        canvas.drawText(content3, contentX3, contentY3, whitePaint);

        //绘制数据来自
        dataPaint.setTextSize(dataFromTextSize);
        canvas.drawText("数据来自", dataFromStartX, dataFromStartY, dataPaint);
        canvas.drawBitmap(dataFromBitmap,dataFromStartX+width*0.005580f+dataPaint.measureText("数据来自"),
                dataFromStartY-dataFromTextSize/2-dataFromBitmap.getHeight()/2,null);

        //绘制背景圆,绘制白三角
        canvas.drawCircle(bacCircleX, bacCircleY, bacCircleRadius, bacPaint);
        canvas.drawPath(pathTriangle, whitePaint);

        //绘制头像底部数据来源遮罩
        canvas.drawArc(rectFHeader,45,90,false,shadePaint);
        if (mHasFocus){
            canvas.drawCircle(bacCircleX,bacCircleY,(rectFHeader.right-rectFHeader.left)/2,borderPaint);
        }

    }

    /**
     * 初始化绘制数据
     */
    private void initData() {
        width = getWidth();//宽度1792px
        //----------------演员名字-------------
        actorNameTextSize = width * 0.020089f;//36px
        contentTextSize = width * 0.01674f;//30px
        actorNameStartX = width * 0.1741f;//312px
        actorNameStartY = width * 0.04799f;//86px
        dataFromTextSize = width * 0.01339f;//24px

        rectFHeader.left=width*0.02008f;//36px
        rectFHeader.right=width*0.1540f;//276px
        rectFHeader.top=width*0.01897f;//34px
        rectFHeader.bottom=width*0.1529f;//36px

        contentX1 = actorNameStartX;
        contentX2 = actorNameStartX;
        contentX3 = actorNameStartX;

        actorNameStartY = width * 0.05022f;//90px
        contentY1 = width * 0.08147f;//146px
        contentY2 = width * 0.1071f;//192px
        contentY3 = width * 0.1372f;//246px

        dataFromStartX = width * 0.8861f;//1588px
        dataFromStartY = width * 0.1707f;//306px

        bacCircleX = width * 0.08705f;//156px
//        bacCircleX = width * 0.08370f;//150px
        bacCircleY = width * 0.08593f;//154px
        bacCircleRadius = width * 0.02906f;//25px

        pathTriangle.moveTo(bacCircleX - width * 0.008058f, bacCircleY - width * 0.01395f);//14.43px,21.65px
        pathTriangle.lineTo(bacCircleX - width * 0.008058f, bacCircleY + width * 0.01395f);//14.43px,21.65px
        pathTriangle.lineTo(bacCircleX + width * 0.016116f, bacCircleY);//14.43px,21.65px
        pathTriangle.close();

        //头像底部数据来源图片
        rectFEncyclopedia.left = bacCircleX - width * 0.02678f;//48
        rectFEncyclopedia.right = bacCircleX + width * 0.02678f;
        rectFEncyclopedia.top = bacCircleY + width * 0.04743f;//+85px
        rectFEncyclopedia.bottom = rectFEncyclopedia.top + width * 0.01674f;//30px


//        rectFDataFrom.left=0;
//        rectFDataFrom.right=0;
//        rectFDataFrom.top=0;
//        rectFDataFrom.bottom=0;

    }

    private boolean  mHasFocus;
    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        mHasFocus=gainFocus;
        if (gainFocus){
            ViewCompat.animate(this).scaleX(1.02f).scaleY(1.02f).translationZ(1.0f).start();
        }else {
            ViewCompat.animate(this).scaleX(1.0f).scaleY(1.0f).translationZ(1.0f).start();
        }
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
        Glide.with(getContext())
                .asBitmap()
                .load(headUrl)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(new CustomViewTarget<ActorInformationView, Bitmap>(this) {

                    @Override
                    public void onLoadFailed(@Nullable Drawable errorDrawable) {
                        //图片加载失败时会回调该方法
                        bitmapHead = ResouseIamge.getInstance().getBitmap(getContext());
                        invalidate();
                    }

                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        //该方法运行在主线程
                        bitmapHead = resource;
                        invalidate();
                    }

                    @Override
                    protected void onResourceCleared(@Nullable Drawable placeholder) {

                    }
                });
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }
}
