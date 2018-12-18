package com.hisense.pagedemo.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.utils.PaintBuilder;
import com.hisense.pagedemo.utils.SingleThreadUtils;

import java.util.concurrent.CountDownLatch;

/**
 * * ================================================
 * name:            DialogXiaoJuView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description： 智能对话view
 * notice:    控件宽高比例必须为13:2,否则UI效果无法保证
 * introduce:  reciveVoice()   启动接收语音动画,默认隐藏状态时渐变显示
 * introduce:  reciveVoice(boolean isAnimate)   启动接收语音动画,true--隐藏状态时渐变显示
 * stopReciveVoice()  停止接收语音动画
 * setMasterBitmap(String url)  设置对话头像
 * setVisibilityNow(boolean isAnimate)  设置对话部分可见,true--渐变显示,false--直接显示
 * setVisibilityGone(boolean isAnimate) 设置对话部分不可见,true--渐变显示,false--直接显示
 * setTranslateFlag(boolean translateFlag)  设置提示选项部分是否左移
 * setXiaoJu(String xiaoJu)  设置小聚的说话内容
 * setSay(String say)    设置可说提示
 * setTextOne(String textOne)  设置第一个提示选项
 * setTextTwo(String textTwo)  设置第二个提示选项
 * setTextThree(String textThree)  设置第三个提示选项
 * setMaster(String master)   设置交互语音内容
 * setLanguageSet(boolean languageSet)   设置是否显示语言设置提示,当不需要显示时一定要设置为false
 * history：
 * ===================================================
 */

public class DialogXiaoJuView extends View implements ViewTreeObserver.OnGlobalLayoutListener {
    private int width = 0;
    private int height = 0;
    private Paint dialogXiaoJuBacPaint, dialogXiaoJuTextPaint, canSayBacPaint, masterTextPaint,
            circlePaint3, circlePaint2, voicePaint, languageSetPaint;
    private float rectPadding = 0;

    //-------------------------xiaoju---------------------
    private RectF xiaoJuRectF;
    private RectF textRectF1;
    private RectF textRectF2;
    private RectF textRectF3;
    private RectF dialogrectF;
    private Path trianglePath;
    private float textStartY = 0;
    private float textStartY1 = 0;
    private float textStartY2 = 0;
    private float textStartX = 0;
    private Bitmap xiaoJuBitmap;
    private float xiaoJuTextSize = 0;
    private float canSayTextSize = 0;
    private float contentTextSize = 0;
    private float contenTextStartY = 0;
    //----------------------提示部分移动控制相关-------------------
    private boolean translateFlag = false;
    private float translateOffset = 0;
    //----------------------提示部分移动控制相关-------------------
    //-------------------------xiaoju---------------------
    //-------------------------master---------------------
    private RectF masterRectF;
    private Path masterTrianglePath;
    private float masterCircleCenterX = 0;
    private float masterCircleCenterY = 0;
    private float masterRadious1 = 0;
    private float masterRadious2 = 0;
    private float masterRadious3 = 0;
    private float masterTextStartY = 0;
    private Bitmap masterBitmap;
    private RectF masterImageRect;

    //-----------------master部分可见控制------------------
    private float visibilityOffset = 0;
    private boolean visibilityFlag = false;
    private boolean firstVisibilityFlag = false;
    //-----------------master部分可见控制------------------

    //-------------------------master---------------------


    //    --------------接收语音动画相关-----------------------
    private boolean reciveVoiceFlag = false;
    private float voiceLength = 0;
    private float voiceLength1 = 0;
    private float voiceLength3 = 0;
    private float masterDialogCenterY;
    private float masterDialogCenterXOfffset;
    private int rate = 0;
    //    --------------接收语音动画相关-----------------------
//-------------------------xiaoju---------------------
    // TODO: 2018/11/12   文本默认内容待删除 ------------------------------
    private String xiaoJu = "早上好,有什么可以帮你的?";
    private String say = "你可以说";
    private String textOne = "打开第3个";
    private String textTwo = "动作的搞笑的";
    private String textThree = "下一页";
    private String master = "刘德华动作的";
    // TODO: 2018/11/12   文本默认内容待删除 ------------------------------
    private int maxLength = 15;
    private Handler handler = new Handler(Looper.getMainLooper());


    //背景圆透明度变化计数
    private int count = 0;
    //透明度变化周期
    private int cycle = 18;
    //语音接收完成后的延迟动画
    private boolean delayFlag = true;


    //-----------------------------语言设置相关-------------------------------
    private boolean languageSet = false;
    private String languageHint = "请说广东话(按菜单键改变用户语言设置)";
    private float languageHintTextSize = 0;
//    private float languageHintOffset = 0;
    //-----------------------------语言设置相关-------------------------------

    private boolean isFirst = true;

    /**
     * 设置是否显示语言设置提示
     */
    public void setLanguageSet(boolean languageSet) {
        this.languageSet = languageSet;
        postInvalidate();
    }

    /**
     * 设置小聚的说话内容
     */
    public void setXiaoJu(String xiaoJu) {
        this.xiaoJu = xiaoJu;
    }

    /**
     * 设置可说提示
     */
    public void setSay(String say) {
        this.say = say;
    }

    /**
     * 设置第一个提示选项
     */
    public void setTextOne(String textOne) {
        this.textOne = textOne;
    }

    /**
     * 设置第二个提示选项
     */
    public void setTextTwo(String textTwo) {
        this.textTwo = textTwo;
    }

    /**
     * 设置第三个提示选项
     */
    public void setTextThree(String textThree) {
        this.textThree = textThree;
    }

    /**
     * 设置交互语音内容
     */
    public void setMaster(String master) {
        this.master = master;
    }

    public DialogXiaoJuView(Context context) {
        this(context, null, 0);
    }

    public DialogXiaoJuView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DialogXiaoJuView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public DialogXiaoJuView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    /**
     * 初始化
     */
    private void init() {
        xiaoJuRectF = new RectF();
        textRectF1 = new RectF();
        textRectF2 = new RectF();
        textRectF3 = new RectF();
        dialogrectF = new RectF();
        masterRectF = new RectF();
        masterImageRect = new RectF();
        trianglePath = new Path();
        masterTrianglePath = new Path();
        //是否需要放到异步线程中加载??????6次测算加载时间为2-5毫秒
        xiaoJuBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.sc_shot_014_wave_2eyes);
        dialogXiaoJuBacPaint = new PaintBuilder().setColor("#106d77").setStyle(Paint.Style.FILL).build();
        dialogXiaoJuTextPaint = new PaintBuilder().setColor("#ffffff").setStyle(Paint.Style.FILL).build();
        canSayBacPaint = new PaintBuilder().setColor("#323232").setStyle(Paint.Style.FILL).build();
        languageSetPaint = new PaintBuilder().setColor("#559fa7").setStyle(Paint.Style.FILL).build();
        masterTextPaint = new PaintBuilder().setColor("#285e62").setStyle(Paint.Style.FILL).build();
        circlePaint3 = new PaintBuilder().setColor("#234548").setStyle(Paint.Style.FILL).setAlpha(160).build();
        circlePaint2 = new PaintBuilder().setColor("#23a9a6").setStyle(Paint.Style.FILL).build();
        voicePaint = new PaintBuilder().setColor("#265d5e").setStrokeWidth(4).setStyle(Paint.Style.FILL).build();
        setMasterBitmap("http://cj.jj20.com/d/cj0.php?p=/up/allimg/1111/09201Q33F5/1P920133F5-5.jpg&w=1440&h=900");
        // TODO: 2018/11/12   是否需要设置可获得焦点待确定
//        setFocusable(true);
//        setFocusableInTouchMode(true);
        // TODO: 2018/11/12   是否需要设置可获得焦点待确定

        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private CountDownLatch goneCountDownLatch = new CountDownLatch(1);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!visibilityFlag) {
            if (visibilityAnimateFlag) {//渐变显示代码
                canvas.save();
                canvas.translate(0, -visibilityOffset * visibilityCount / 5);
                countDownLatch.countDown();
            }
            drawMasterDialog(canvas);
            drawXiaoJu(canvas);
            drawXiaoJuDialog(canvas);
            if (visibilityAnimateFlag) {//渐变显示代码
                canvas.restore();
            }
            if (visibilityCount == 0) {//渐变显示代码
                visibilityAnimateFlag = false;
            }
        } else {
            if (!reciveVoiceFlag) {
                canvas.save();

                // TODO: 2018/11/20 ---------------------------渐变隐藏-------------start------------
                if (changeCount == 5) {
                    changeFlag = false;
                    changeCount = 0;
                }
                if (changeFlag) {
                    goneCountDownLatch.countDown();
                    //渐变隐藏代码
                    canvas.translate(0, -visibilityOffset * changeCount / 5);
                    drawMasterDialog(canvas);
                } else {
                    //直接隐藏代码
                    canvas.translate(0, -visibilityOffset);
                }
                // TODO: 2018/11/20 ---------------------------渐变隐藏-----------end--------------

            }
            drawXiaoJu(canvas);
            drawXiaoJuDialog(canvas);
            if (!reciveVoiceFlag) {
                canvas.restore();
            }
        }
    }

    // TODO: 2018/11/20 ---------------------------渐变隐藏---------------start----------
    /**
     * 渐变隐藏控制
     */
    private boolean changeFlag = false;
    /**
     * 渐变隐藏计数
     */
    private int changeCount = 0;

    private void changeHeightGone() {
        SingleThreadUtils.getInstance().execute(new Runnable() {
            @Override
            public void run() {
                while (changeFlag) {
                    try {
                        Thread.sleep(60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    changeCount++;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) getLayoutParams();
                            params.height = (int) (height - visibilityOffset * changeCount / 5);
                            params.width = width;
                            setLayoutParams(params);
                        }
                    });
                    try {
                        goneCountDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (changeCount == 5) {
                        break;
                    }
                }
            }
        });
    }
    // TODO: 2018/11/20 ---------------------------渐变隐藏---------------end----------

    /**
     * 设置接收语音部分不可见---true--渐变显示,false--直接显示
     */
    public void setVisibilityGone(boolean isAnimate) {
        if (!isFirst) {
            visibilityFlag = true;
            changeFlag = isAnimate;
            if (isAnimate) {
                //开启动画效果隐藏
                changeHeightGone();
            } else {
                //直接隐藏,无动画效果
                ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) getLayoutParams();
                params.height = (int) (height - visibilityOffset);
                params.width = width;
                setLayoutParams(params);
            }
        } else {
            firstVisibilityFlag = true;
        }

    }

    // TODO: 2018/11/20 -----------------------渐变显示----------------------start--------------
    /**
     * 渐变显示控制
     */
    private boolean visibilityAnimateFlag = false;
    /**
     * 渐变显示距离计数
     */
    private int visibilityCount = 5;
    private CountDownLatch countDownLatch = new CountDownLatch(1);

    private void changHeightVisibility() {
        SingleThreadUtils.getInstance().execute(new Runnable() {
            @Override
            public void run() {
                while (visibilityAnimateFlag) {
                    avoidance=true;
                    try {
                        Thread.sleep(60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //此处代码会出现延迟执行
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            visibilityCount--;
                            if (visibilityCount >= 0) {
                                ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) getLayoutParams();
                                params.height = (int) (height - visibilityCount * visibilityOffset / 5);
                                params.width = width;
                                setLayoutParams(params);
                            }else{
                                avoidance=false;
                            }
                        }
                    });
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (visibilityCount == 0) {
                        postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                visibilityCount = 5;
                            }
                        }, 1000);
                        break;
                    }

                }
            }
        });
    }
// TODO: 2018/11/20 -----------------------渐变显示-------------------end-----------------

    /**
     * 设置接收语音部分可见,true--渐变显示,false--直接显示
     */
    public void setVisibilityNow(boolean isAnimate) {
        visibilityFlag = false;
        visibilityAnimateFlag = isAnimate;
        if (isAnimate) {
            changHeightVisibility();
        } else {
            ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) getLayoutParams();
            params.height = height;
            params.width = width;
            setLayoutParams(params);
        }

    }

    /**
     * 绘制小聚图片
     */
    private void drawXiaoJu(Canvas canvas) {
        canvas.drawBitmap(xiaoJuBitmap, null, xiaoJuRectF, null);
    }

    /**
     * 绘制交互语音相关内容
     */
    private void drawMasterDialog(Canvas canvas) {
        if (!reciveVoiceFlag) {
            drawMasterText(canvas);
        } else {
            drawVocieAnimation(canvas);
        }
        canvas.drawPath(masterTrianglePath, dialogXiaoJuTextPaint);
        canvas.drawCircle(masterCircleCenterX, masterCircleCenterY, masterRadious3, circlePaint3);
        canvas.drawCircle(masterCircleCenterX, masterCircleCenterY, masterRadious2, circlePaint2);

        if (masterBitmap != null) {
            canvas.drawBitmap(masterBitmap, null, masterImageRect, null);
        }
    }

    /**
     * 绘制交互语音文本内容
     */
    private void drawMasterText(Canvas canvas) {
        masterTextPaint.setTextSize(xiaoJuTextSize);
        float textWidth = masterTextPaint.measureText(master);
        masterRectF.left = masterRectF.right - rectPadding * 2 - textWidth;
        canvas.drawRect(masterRectF, dialogXiaoJuTextPaint);
        canvas.drawText(master, masterRectF.left + rectPadding, masterTextStartY, masterTextPaint);
    }


    /**
     * 绘制接收语音动画
     */
    private void drawVocieAnimation(Canvas canvas) {

        count++;
        if (count % cycle < 3) {
            circlePaint3.setAlpha(220);
        } else if (count % cycle < 6) {
            circlePaint3.setAlpha(190);
        } else if (count % cycle < 9) {
            circlePaint3.setAlpha(160);
        } else if (count % cycle < 12) {
            circlePaint3.setAlpha(190);
        } else {
            circlePaint3.setAlpha(220);
        }

        if (delayFlag) {
            masterRectF.left = masterRectF.right - rectPadding * 2 - voiceLength;
            canvas.drawRect(masterRectF, dialogXiaoJuTextPaint);
            float start2 = (masterRectF.left + masterRectF.right) / 2;
            float start1 = start2 - masterDialogCenterXOfffset;
            float start3 = start2 + masterDialogCenterXOfffset;
            if (toggle) {
                voicePaint.setAlpha(255 * rate / 100);
            }
            if (rate != 0) {
                float offset1 = voiceLength1 * rate / 200;
                float offset2 = voiceLength * rate / 200;
                float offset3 = voiceLength3 * rate / 200;
                canvas.drawLine(start1, masterDialogCenterY + offset1, start1, masterDialogCenterY - offset1, voicePaint);
                canvas.drawLine(start2, masterDialogCenterY + offset2, start2, masterDialogCenterY - offset2, voicePaint);
                canvas.drawLine(start3, masterDialogCenterY + offset3, start3, masterDialogCenterY - offset3, voicePaint);

            } else {
                voicePaint.setAlpha(255);
                canvas.drawPoint(start1, masterDialogCenterY, voicePaint);
                canvas.drawPoint(start2, masterDialogCenterY, voicePaint);
                canvas.drawPoint(start3, masterDialogCenterY, voicePaint);
            }
        } else {
            drawMasterText(canvas);
        }

    }


    /**
     * 绘制小聚相关内容
     */
    private void drawXiaoJuDialog(Canvas canvas) {
        dialogXiaoJuTextPaint.setTextSize(xiaoJuTextSize);
        canvas.drawPath(trianglePath, dialogXiaoJuBacPaint);
        float textWidth;
        // TODO: 2018/11/12 绘制语言设置
        if (languageSet) {//语言设置相关
            languageSetPaint.setTextSize(languageHintTextSize);
            dialogrectF.right = dialogrectF.left + rectPadding * 2 + languageSetPaint.measureText(languageHint);
        }
        if (xiaoJu.length() > maxLength) {
            String sub = xiaoJu.substring(0, maxLength);
            textWidth = dialogXiaoJuTextPaint.measureText(sub);
            dialogrectF.right = dialogrectF.left + rectPadding * 2 + textWidth;
            canvas.drawRect(dialogrectF, dialogXiaoJuBacPaint);
            canvas.drawText(sub, textStartX, textStartY1, dialogXiaoJuTextPaint);
            canvas.drawText(xiaoJu.substring(15), textStartX, textStartY2, dialogXiaoJuTextPaint);
        } else {
            textWidth = dialogXiaoJuTextPaint.measureText(xiaoJu);

            float tempRight1 = dialogrectF.left + rectPadding * 2 + textWidth;
            if (dialogrectF.right < tempRight1) {
                dialogrectF.right = tempRight1;
            }
            canvas.drawRect(dialogrectF, dialogXiaoJuBacPaint);
            canvas.drawText(xiaoJu, textStartX, textStartY1, dialogXiaoJuTextPaint);
        }

        if (languageSet) {//语言设置相关
            canvas.drawText(languageHint, textStartX, textStartY2, languageSetPaint);
        }

        if (!translateFlag) {
            drawCanSay(canvas);
        } else {
            canvas.save();
            canvas.translate(-translateOffset, 0);
            drawCanSay(canvas);
            canvas.restore();
        }


    }


    /**
     * 设置提示选项部分是否左移
     */
    public void setTranslateFlag(boolean translateFlag) {
        this.translateFlag = translateFlag;
        postInvalidate();
    }


    private void drawCanSay(Canvas canvas) {
        dialogXiaoJuTextPaint.setTextSize(contentTextSize);
        float textWidth1 = dialogXiaoJuTextPaint.measureText(textOne);
        float textWidth2 = dialogXiaoJuTextPaint.measureText(textTwo);
        float textWidth3 = dialogXiaoJuTextPaint.measureText(textThree);
        initCanSayRect(textWidth1, textWidth2, textWidth3);
        canvas.drawRect(textRectF1, canSayBacPaint);
        canvas.drawRect(textRectF2, canSayBacPaint);
        canvas.drawRect(textRectF3, canSayBacPaint);

        canvas.drawText(textOne, (textRectF1.left + textRectF1.right - textWidth1) / 2, contenTextStartY, dialogXiaoJuTextPaint);
        canvas.drawText(textTwo, (textRectF2.left + textRectF2.right - textWidth2) / 2, contenTextStartY, dialogXiaoJuTextPaint);
        canvas.drawText(textThree, (textRectF3.left + textRectF3.right - textWidth3) / 2, contenTextStartY, dialogXiaoJuTextPaint);

        dialogXiaoJuTextPaint.setTextSize(canSayTextSize);
        float sayWidth = dialogXiaoJuTextPaint.measureText(say);
        canvas.drawText(say, textRectF3.right - sayWidth, textStartY, dialogXiaoJuTextPaint);

    }

    private float canSayRectOffect = 0;
    private float canSayRectgap = 0;

    private void initCanSayRect(float textWidth1, float textWidth2, float textWidth3) {
        textRectF3.left = textRectF3.right - canSayRectOffect * 2 - textWidth3;

        textRectF2.right = textRectF3.left - canSayRectgap;
        textRectF2.left = textRectF2.right - textWidth2 - canSayRectOffect * 2;
        textRectF1.right = textRectF2.left - canSayRectgap;
        textRectF1.left = textRectF1.right - textWidth1 - canSayRectOffect * 2;
    }

    /**
     * 初始化控件所需数据
     */
    private void initCalculation() {
        width = getWidth();
        height = getHeight();
        rectPadding = width * 0.02761f;
        //-------------------------xiaoju-------------
        xiaoJuRectF.left = -width * 0.03246f;
        xiaoJuRectF.right = width * 0.07897f;
        xiaoJuRectF.top = width * 0.05537f;
        xiaoJuRectF.bottom = width * 0.1616f;

        trianglePath.moveTo(width * 0.05895f, width * 0.09253f);
        trianglePath.lineTo(width * 0.07537f, width * 0.09253f);
        trianglePath.lineTo(width * 0.07537f, width * 0.1089f);
        trianglePath.close();

        dialogrectF.left = width * 0.07537f;
        dialogrectF.top = width * 0.07611f;
        dialogrectF.bottom = width * 0.1358f;

        xiaoJuTextSize = width * 0.01791f;
        canSayTextSize = width * 0.01343f;
        contentTextSize = width * 0.01492f;
        //0.05223
        textRectF1.top = width * 0.1119f;
        textRectF1.bottom = width * 0.1358f;
        textRectF2.top = width * 0.1119f;
        textRectF2.bottom = width * 0.1358f;
        textRectF3.top = width * 0.1119f;
        textRectF3.bottom = width * 0.1358f;
        textRectF3.right = width * 0.9940f;
        canSayRectOffect = width * 0.0037f;
        canSayRectgap = width * 0.0074f;


        textStartY = width * 0.1034f;
        textStartY1 = width * 0.103f;
        textStartY2 = width * 0.1253f;
        textStartX = dialogrectF.left + rectPadding;
//        textStartX= width * 0.0888f;
        contenTextStartY = width * 0.1305f;
        //-------------------------xiaoju---------------------
        //-------------------------master---------------------
        masterRectF.right = width * 0.3723f;
        masterRectF.top = width * 0.02388f;
        masterRectF.bottom = width * 0.06343f;

        masterTrianglePath.moveTo(masterRectF.right, width * 0.03358f);
        masterTrianglePath.lineTo(masterRectF.right, width * 0.05223f);
        masterTrianglePath.lineTo(width * 0.3895f, width * 0.03358f);
        masterTrianglePath.close();

        //30-35-45
        masterCircleCenterX = width * 0.4126f;
        masterCircleCenterY = width * 0.04328f;
        masterRadious1 = width * 0.02238f;
        masterRadious2 = width * 0.02611f;
        masterRadious3 = width * 0.03358f;
        masterTextStartY = width * 0.05074f;

        masterImageRect.left = masterCircleCenterX - masterRadious1;
        masterImageRect.right = masterCircleCenterX + masterRadious1;
        masterImageRect.top = masterCircleCenterY - masterRadious1 + 1;
        masterImageRect.bottom = masterCircleCenterY + masterRadious1 + 1;
        //-------------------------master---------------------
        //-------------------------voice---------------------
        voiceLength = width * 0.02238f;
        voiceLength1 = width * 0.01492f;//20
        voiceLength3 = width * 0.01119f;//15
        masterDialogCenterY = (masterRectF.top + masterRectF.bottom) / 2;
        masterDialogCenterXOfffset = width * 0.005970f;

        //-------------------------voice---------------------
        translateOffset = width * 0.3f;
        visibilityOffset = width * 0.05f;

        languageHintTextSize = width * 0.01343f;
//        languageHintOffset = width * 0.007462f;
    }

    /**
     * 设置头像图片
     */
    public void setMasterBitmap(String url) {
        Glide.with(getContext()).asBitmap().load(url).apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(new CustomViewTarget<DialogXiaoJuView, Bitmap>(this) {
                    @Override
                    public void onLoadFailed(@Nullable Drawable errorDrawable) {
                    }

                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        masterBitmap = resource;
                        invalidate();
                    }

                    @Override
                    protected void onResourceCleared(@Nullable Drawable placeholder) {

                    }
                });
    }

    /**
     * 变化速率控制开关
     */
    private boolean toggle = false;

    /**
     * 停止接收语音动画
     */
    public void stopReciveVoice() {
        delayFlag = false;
        postDelayed(new Runnable() {
            @Override
            public void run() {
                reciveVoiceFlag = false;
                count = 0;
                circlePaint3.setAlpha(160);
                delayFlag = true;
                invalidate();
            }
        }, 2000);
    }

    /**
     * 启动接收语音动画
     * 隐藏状态时渐变显示
     */
    public void reciveVoice() {
        reciveVoice(true);
    }

    /**避免同时多次invalidate的标识*/
    private boolean avoidance = false;

    /**
     * 启动接收语音动画,
     *
     * @param isAnimate true--隐藏状态时渐变显示,false--隐藏状态时直接显示
     */
    public void reciveVoice(boolean isAnimate) {
        reciveVoiceFlag = true;
        avoidance = false;
        if (height > getHeight()) {
            avoidance = isAnimate;
            setVisibilityNow(isAnimate);
        }
        SingleThreadUtils.getInstance().execute(new Runnable() {
            @Override
            public void run() {
                while (reciveVoiceFlag) {
                    try {
                        Thread.sleep(60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (rate > 90) {
                        toggle = true;
                    } else if (rate < 10) {
                        toggle = false;
                    }
                    if (toggle) {
                        rate = rate - 10;
                    } else {
                        rate = rate + 10;
                    }
                    if (!avoidance){
                        postInvalidate();
                    }
                }
            }
        });
    }

    /**
     * 默认解除动画
     */
    @Override
    protected void onDetachedFromWindow() {
        reciveVoiceFlag = false;
        super.onDetachedFromWindow();
    }

    @Override
    public void onGlobalLayout() {
        if (width == 0) {
            initCalculation();
        }
        if (isFirst) {
            isFirst = false;
            if (firstVisibilityFlag) {
                firstVisibilityFlag = false;
                setVisibilityGone(changeFlag);
            }
        }

    }
}
