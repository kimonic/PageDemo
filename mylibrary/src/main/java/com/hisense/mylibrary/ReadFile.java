package com.hisense.mylibrary;

/**
 * * ================================================
 * name:            ReadFile
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2019/1/15
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class ReadFile {
    public static void main(String[] args){
        String string=FileUtils.readFileContent(null,"D:\\TestGridLayoutManager.java");
        System.out.println(string);
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if ("{".equals(String.valueOf(string.charAt(i)))){
                builder.append(string.charAt(i));
                builder.append( "\nLUtils.e(getClass(),\"\");");

            }else {
                builder.append(string.charAt(i));
            }
        }
        FileUtils.saveJsonToSDCard(null,null,builder.toString());

        System.out.println(builder.toString());


    }
}
