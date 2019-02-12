package com.hisense.pagedemo;

import android.util.Log;
import android.util.SparseIntArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void sparseTest() {

    }

    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("客厅电脑");
        list.add("客厅电视");
        list.add("客厅空调");

        String temp = "把,一楼,客,厅,电视,打开";


        String[] fenci = temp.split(",");

        List<String> subList = new ArrayList<>();

        //需要分词的结果集
        for (int i = 0; i < fenci.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).contains(fenci[i])
                        && (list.get(j).indexOf(fenci[i].charAt(0)) == 0)) {
                    Log.e("dingzhixin","找到的分词"+list.get(j));
                    subList.add(fenci[i]);
                }
            }
        }

        if (subList.size()>0){
            for (int i = 0; i < subList.size(); i++) {

            }
        }



    }


    @Test
    public void test2(){
    }
}