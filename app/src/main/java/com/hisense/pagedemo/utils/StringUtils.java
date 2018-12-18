package com.hisense.pagedemo.utils;
/**
 * * ================================================
 * name:            StringUtils
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/12
 * description：  String辅助类
 * notice:
 * introduce:
 * history：
 * ===================================================
 */
public class StringUtils {
    public static int parseInt(String s){
        if (s==null||"".equals(s)){
            return 0;
        }else {
            try {
                return Integer.parseInt(s);
            }catch (NumberFormatException e){
                return 0;
            }
        }
    }
}
