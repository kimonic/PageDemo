package com.hisense.pagedemo.utils;

import android.util.Log;

/**
 * * ================================================
 * name:            LogUtils
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description：  日志辅助类
 * notice:
 * introduce:
 * history：
 * ===================================================
 */
public class LogUtils {
    public static void outMethodInfo(){
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElements.length; i++) {
            Log.e("Tag","方法调用顺序"+i+"--类名---"+stackTraceElements[i].getClassName()
                    +"\n方法名--"+stackTraceElements[i].getMethodName()+"\n\n");
        }
    }
}
