package com.hisense.mylibrary;

import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * * ================================================
 * name:            Test
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/27
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class Test {
    public static void main(String[] args) {

        mergeMethod1();
//        mergeMethod2();


    }

    private static void mergeMethod2() {
        //需要合并的词
        List<String> list = new ArrayList<>();
        list.add("客厅电脑");
        list.add("客厅电视");
        list.add("客厅空调");
        list.add("把一楼");

        //目标语句
        String temp = "把,一楼,客厅,电视,阳台的,客厅,空调,打开";
        int  position=temp.lastIndexOf(",");
        System.out.print("当前的位置是----??"+position);
        System.out.print("当前的位置是----??"+temp.substring(0,position));

        String result;//

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(temp.substring(position))){
                result=temp.substring(position);

            }
        }

    }

    private static void mergeMethod1() {
        //需要合并的词
        List<String> list = new ArrayList<>();
        list.add("客厅电脑");
        list.add("客厅电视");
        list.add("客厅空调");
        list.add("把一楼");

        //目标语句
        String temp = "把,一楼,客厅"  +
                ",电视,阳台的,客,厅,空,调,打开";

        //拆分成数组
        String[] fenci = temp.split(",");

        //记录需要匹配的词
        List<FindResult> subList = new ArrayList<>();


        //需要分词的结果集
        for (int i = 0; i < fenci.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if ((list.get(j).indexOf(fenci[i].charAt(0)) == 0) && list.get(j).contains(fenci[i])){
                    FindResult findResult = new FindResult();
                    findResult.setPosition(i);
                    findResult.setResult(fenci[i]);
                    findResult.setPiPeiCi(list.get(j));
                    subList.add(findResult);
                }
            }
        }

        StringBuilder builder;
        Set<Integer> positionList = new HashSet<>();

        if (subList.size() > 0) {
            for (int i = 0; i < subList.size(); i++) {
                int piPeiLength = subList.get(i).getPiPeiCi().length();
                builder = new StringBuilder();
                builder.append(fenci[subList.get(i).getPosition()]);//预先拼接开始位置词
                for (int j = subList.get(i).getPosition()+1; j < fenci.length; j++) {
                    builder.append(fenci[j]);
                    if (builder.toString().length() == piPeiLength //长度相等
                            && subList.get(i).getPiPeiCi().equals(builder.toString())) {//内容相等
                        for (int l = subList.get(i).getPosition(); l < j; l++) {
                            positionList.add(l);
                        }
                    }else if (builder.toString().length() > piPeiLength){
                        break;
                    }
                }
            }
        }


        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fenci.length; i++) {
            result.append(fenci[i]);
            if (positionList.contains(i)) {
                continue;
            }
            if (i == fenci.length - 1) {
                break;
            }
            result.append(",");
        }
        System.out.println("最后结果----------" + result.toString());
    }
}
