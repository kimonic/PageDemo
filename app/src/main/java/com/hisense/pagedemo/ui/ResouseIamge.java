package com.hisense.pagedemo.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.hisense.pagedemo.R;

import java.util.HashMap;
import java.util.Map;


/**
 * * ================================================
 * name:            ResouseIamge
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description：   用于获取资源图片R.id.image1的单例临时类
 * notice:   测试使用的类
 * introduce:
 * history：
 * ===================================================
 */
public class ResouseIamge {
    private static ResouseIamge resouseIamge;
    private static Bitmap bitmap;
    private Map<String,Bitmap>  bitmapPool;

    public ResouseIamge() {
        bitmapPool=new HashMap<>();
    }

    public static ResouseIamge getInstance() {
        if (resouseIamge == null) {
            resouseIamge = new ResouseIamge();
        }
        return resouseIamge;
    }

    public Bitmap getBitmap(Context context) {
        if (bitmap == null&&bitmapPool.get("temp")==null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.pic_card_joke);
        }else {
            bitmap=bitmapPool.get("temp");
        }
        return bitmap;
    }

    public Bitmap getBitmapDataFrom(Context context, int type) {
        Bitmap dataFromBitmap = null;
        switch (type) {
            case 0:
                if (bitmapPool.get("damai")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_damai);
                    bitmapPool.put("damai",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("damai");
                }
                break;
            case 1:
                if (bitmapPool.get("douguo")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_douguo);
                    bitmapPool.put("douguo",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("douguo");
                }
                break;
            case 2:
                if (bitmapPool.get("gaode")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_gaode);
                    bitmapPool.put("gaode",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("gaode");
                }
                break;
            case 3:
                if (bitmapPool.get("meituan")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_meituan);
                    bitmapPool.put("meituan",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("meituan");
                }
                break;
            case 4:
                if (bitmapPool.get("miaodongbaike")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_miaodongbaike);
                    bitmapPool.put("miaodongbaike",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("miaodongbaike");
                }
                break;
            case 5:
                if (bitmapPool.get("moji")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_moji);
                    bitmapPool.put("moji",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("moji");
                }
                break;
            case 6:
                if (bitmapPool.get("taobao")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_taobao);
                    bitmapPool.put("taobao",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("taobao");
                }
                break;
            case 7:
                if (bitmapPool.get("taopiaopiao")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_taopiaopiao);
                    bitmapPool.put("taopiaopiao",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("taopiaopiao");
                }
                break;
            case 8:
                if (bitmapPool.get("tonghuashun")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_tonghuashun);
                    bitmapPool.put("tonghuashun",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("tonghuashun");
                }
                break;
            case 9:
                if (bitmapPool.get("wangyi")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_wangyi);
                    bitmapPool.put("wangyi",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("wangyi");
                }
                break;
            case 10:
                if (bitmapPool.get("ximalaya")==null){
                    dataFromBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.label_ximalaya);
                    bitmapPool.put("ximalaya",dataFromBitmap);
                }else {
                    dataFromBitmap=bitmapPool.get("ximalaya");
                }
                break;
        }
        return dataFromBitmap;

    }
}
