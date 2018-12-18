package com.hisense.pagedemo.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * * ================================================
 * name:            SingleThreadUtils
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description：  单例线程池
 * notice:   固定线程池的数量为cpu个数+1
 * introduce:
 * history：
 * ===================================================
 */
public class SingleThreadUtils {
    private Executor executor;
    private static final int DEVICEINFO_UNKNOWN = 2;

    private SingleThreadUtils() {
        executor = Executors.newFixedThreadPool(getNumberOfCPUCores() + 1);
    }

    public static SingleThreadUtils getInstance() {
        return SingleThread.INSTANCE;
    }


    private static class SingleThread {
        private static SingleThreadUtils INSTANCE = new SingleThreadUtils();
    }

    public void execute(Runnable runnable) {
        executor.execute(runnable);
    }

    /**
     * 获取CPU内核数
     */
    private static int getNumberOfCPUCores() {
        int cores;
        try {
            cores = new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
        } catch (SecurityException e) {
            cores = DEVICEINFO_UNKNOWN;   //这个常量得自己约定
        } catch (NullPointerException e) {
            cores = DEVICEINFO_UNKNOWN;
        }
        return cores;
    }

    private static final FileFilter CPU_FILTER = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            String path = pathname.getName();
            if (path.startsWith("cpu")) {
                for (int i = 3; i < path.length(); i++) {
                    if (path.charAt(i) < '0' || path.charAt(i) > '9') {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    };

}
