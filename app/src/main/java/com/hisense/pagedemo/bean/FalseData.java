package com.hisense.pagedemo.bean;

import android.graphics.Color;

import com.hisense.pagedemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * * ================================================
 * name:            FalseData
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class FalseData {


    //------------------------04页面相关------------------------------------------------------------
    public static List<RVBean04> getData04Header() {
        List<RVBean04> list = new ArrayList<>();
        RVBean04 rvBean04 = new RVBean04();
        rvBean04.setName("成龙");
        rvBean04.setContent("成龙，1954年4月7日出生于香港中西区，祖籍安徽省芜湖，中国香港男演员、导演、动作指导、制作人、编剧、歌" +
                "手。1971年以武师身份进入电影圈 。1976年在动作片《新精武门》中担任男主角。1978年主演的动作片《蛇形刁手" +
                "》、《醉拳》标志着功夫喜剧片的开端 。1980年自编自导的动作片《师弟出马》获得香港年度票房冠军 ......." +
                "主演的喜剧动作片《夏日福星》打破香港地区票房纪录 [4]。1986年自导自演的动作片《警察" +
                "故事》获得第5届香港电影金像奖最佳影片奖 [5]。1991年担任剧情片《阮玲玉》的制作人。" +
                "1992年发行个人首张国语专辑《第一次》。1993年凭借警匪片《重案组》获得第30届台湾电影金马奖最佳男主角奖 [6]。");
        rvBean04.setPortraitUrl("http://d.ifengimg.com/w600/p0.ifengimg.com/pmop/2018/1110/A969126C6B8A91F33F5C2838ADADF44F8FD601C5_size473_w1200_h897.jpeg");
        rvBean04.setItemType(RVBean04.TYPE_ONE);
        list.add(rvBean04);
        RVBean04 rvBean0401 = new RVBean04();
        List<String> indicator = new ArrayList<>();
        indicator.add("热门(30)");
        indicator.add("电影(200)");
        indicator.add("电视剧(6)");
        indicator.add("综艺(20)");
        indicator.add("演唱会(3)");
        rvBean0401.setIndicator(indicator);
        rvBean0401.setItemType(RVBean04.TYPE_TWO);
        list.add(rvBean0401);
        return list;
    }

    /**
     * 04.png recyclerview 的模拟数据
     */
    public static List<RVBean04> getData04() {

        List<RVBean04> list = new ArrayList<>();


        for (int i = 0; i < 4; i++) {

            //------------------------------001-----------------------------------------------------
            RVBean04 rvBean0402 = new RVBean04();
            MovieInfoBean movieInfoBean = new MovieInfoBean();
            movieInfoBean.setBitmapUrl("http://pic38.nipic.com/pic/20140306/6969547_132801668382_4.jpg");
            movieInfoBean.setName("家园防线");
            movieInfoBean.setReview("4.8");
            movieInfoBean.setVip("荔枝VIP");
            movieInfoBean.setVipflag(true);
            rvBean0402.setMovieInfoBean(movieInfoBean);
            rvBean0402.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0402);


            //------------------------------002-----------------------------------------------------
            RVBean04 rvBean0403 = new RVBean04();
            MovieInfoBean movieInfoBean1 = new MovieInfoBean();
            movieInfoBean1.setBitmapUrl("http://pic38.nipic.com/pic/20140226/6969547_162437662000_4.jpg");
            movieInfoBean1.setName("甜蜜杀机");
            movieInfoBean1.setReview("4.6");
            movieInfoBean1.setVip("");
            movieInfoBean1.setVipflag(false);
            rvBean0403.setMovieInfoBean(movieInfoBean1);
            rvBean0403.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0403);


            //------------------------------003-----------------------------------------------------
            RVBean04 rvBean0404 = new RVBean04();
            MovieInfoBean movieInfoBean2 = new MovieInfoBean();
            movieInfoBean2.setBitmapUrl("http://pic38.nipic.com/pic/20140226/6969547_185422343000_4.jpg");
            movieInfoBean2.setName("火鸡总动员");
            movieInfoBean2.setReview("4.9");
            movieInfoBean2.setVip("爱奇艺VIP");
            movieInfoBean2.setVipflag(true);
            rvBean0404.setMovieInfoBean(movieInfoBean2);
            rvBean0404.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0404);


            //------------------------------004-----------------------------------------------------
            RVBean04 rvBean0405 = new RVBean04();
            MovieInfoBean movieInfoBean3 = new MovieInfoBean();
            movieInfoBean3.setBitmapUrl("http://pic38.nipic.com/pic/20140225/6969547_193308704000_4.jpg");
            movieInfoBean3.setName("脱轨时代");
            movieInfoBean3.setReview("5.0");
            movieInfoBean3.setVip("");
            movieInfoBean3.setVipflag(false);
            rvBean0405.setMovieInfoBean(movieInfoBean3);
            rvBean0405.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0405);


            //------------------------------005-----------------------------------------------------
            RVBean04 rvBean0406 = new RVBean04();
            MovieInfoBean movieInfoBean4 = new MovieInfoBean();
            movieInfoBean4.setBitmapUrl("http://pic38.nipic.com/pic/20140223/6969547_105755614399_4.jpg");
            movieInfoBean4.setName("迷你蛋");
            movieInfoBean4.setReview("3.9");
            movieInfoBean4.setVip("腾讯会员");
            movieInfoBean4.setVipflag(true);
            rvBean0406.setMovieInfoBean(movieInfoBean4);
            rvBean0406.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0406);


            //------------------------------006-----------------------------------------------------
            RVBean04 rvBean0407 = new RVBean04();
            MovieInfoBean movieInfoBean5 = new MovieInfoBean();
            movieInfoBean5.setBitmapUrl("http://icon.nipic.com/BannerPic/20181112/original/20181112100945_1.jpg");
            movieInfoBean5.setName("未来");
            movieInfoBean5.setReview("4.9");
            movieInfoBean5.setVip("");
            movieInfoBean5.setVipflag(false);
            rvBean0407.setMovieInfoBean(movieInfoBean5);
            rvBean0407.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0407);


            //------------------------------007-----------------------------------------------------
            RVBean04 rvBean0408 = new RVBean04();
            MovieInfoBean movieInfoBean6 = new MovieInfoBean();
            movieInfoBean6.setBitmapUrl("http://icon.nipic.com/BannerPic/20181112/original/20181112100958_1.jpg");
            movieInfoBean6.setName("梦想同行");
            movieInfoBean6.setReview("4.5");
            movieInfoBean6.setVip("");
            movieInfoBean6.setVipflag(false);
            rvBean0408.setMovieInfoBean(movieInfoBean6);
            rvBean0408.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0408);

            //------------------------------008-----------------------------------------------------
            RVBean04 rvBean0409 = new RVBean04();
            MovieInfoBean movieInfoBean7 = new MovieInfoBean();
            movieInfoBean7.setBitmapUrl("http://icon.nipic.com/BannerPic/20181112/original/20181112101027_1.jpg");
            movieInfoBean7.setName("印象成都");
            movieInfoBean7.setReview("4.7");
            movieInfoBean7.setVip("");
            movieInfoBean7.setVipflag(false);
            rvBean0409.setMovieInfoBean(movieInfoBean7);
            rvBean0409.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0409);

            //------------------------------009-----------------------------------------------------
            RVBean04 rvBean0410 = new RVBean04();
            MovieInfoBean movieInfoBean8 = new MovieInfoBean();
            movieInfoBean8.setBitmapUrl("http://icon.nipic.com/BannerPic/20181108/original/20181108132641_1.jpg");
            movieInfoBean8.setName("中国");
            movieInfoBean8.setReview("4.3");
            movieInfoBean8.setVip("");
            movieInfoBean8.setVipflag(false);
            rvBean0410.setMovieInfoBean(movieInfoBean8);
            rvBean0410.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0410);

            //------------------------------010-----------------------------------------------------
            RVBean04 rvBean0411 = new RVBean04();
            MovieInfoBean movieInfoBean9 = new MovieInfoBean();
            movieInfoBean9.setBitmapUrl("http://icon.nipic.com/BannerPic/20181112/original/20181112101043_1.jpg");
            movieInfoBean9.setName("青春无敌");
            movieInfoBean9.setReview("3.8");
            movieInfoBean9.setVip("");
            movieInfoBean9.setVipflag(false);
            rvBean0411.setMovieInfoBean(movieInfoBean9);
            rvBean0411.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0411);


        }

        return list;
    }

    public static List<RVBean04> getData04Movie() {
        List<RVBean04> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            //------------------------------001-----------------------------------------------------
            RVBean04 rvBean0402 = new RVBean04();
            MovieInfoBean movieInfoBean = new MovieInfoBean();
            movieInfoBean.setBitmapUrl("http://pic185.nipic.com/pic/20181013/12398452_094807532000_4.jpg");
            movieInfoBean.setName("小柿子");
            movieInfoBean.setReview("4.8");
            movieInfoBean.setVip("荔枝VIP");
            movieInfoBean.setVipflag(true);
            rvBean0402.setMovieInfoBean(movieInfoBean);
            rvBean0402.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0402);


            //------------------------------002-----------------------------------------------------
            RVBean04 rvBean0403 = new RVBean04();
            MovieInfoBean movieInfoBean1 = new MovieInfoBean();
            movieInfoBean1.setBitmapUrl("http://pic183.nipic.com/pic/20180928/15108905_140559869000_4.jpg");
            movieInfoBean1.setName("水果布景");
            movieInfoBean1.setReview("4.6");
            movieInfoBean1.setVip("");
            movieInfoBean1.setVipflag(false);
            rvBean0403.setMovieInfoBean(movieInfoBean1);
            rvBean0403.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0403);


            //------------------------------003-----------------------------------------------------
            RVBean04 rvBean0404 = new RVBean04();
            MovieInfoBean movieInfoBean2 = new MovieInfoBean();
            movieInfoBean2.setBitmapUrl("http://pic181.nipic.com/pic/20180912/25628039_153941412000_4.jpg");
            movieInfoBean2.setName("苹果背景");
            movieInfoBean2.setReview("4.9");
            movieInfoBean2.setVip("爱奇艺VIP");
            movieInfoBean2.setVipflag(true);
            rvBean0404.setMovieInfoBean(movieInfoBean2);
            rvBean0404.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0404);


            //------------------------------004-----------------------------------------------------
            RVBean04 rvBean0405 = new RVBean04();
            MovieInfoBean movieInfoBean3 = new MovieInfoBean();
            movieInfoBean3.setBitmapUrl("http://pic182.nipic.com/pic/20180920/9329485_090949092000_4.jpg");
            movieInfoBean3.setName("石榴");
            movieInfoBean3.setReview("5.0");
            movieInfoBean3.setVip("");
            movieInfoBean3.setVipflag(false);
            rvBean0405.setMovieInfoBean(movieInfoBean3);
            rvBean0405.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0405);


            //------------------------------005-----------------------------------------------------
            RVBean04 rvBean0406 = new RVBean04();
            MovieInfoBean movieInfoBean4 = new MovieInfoBean();
            movieInfoBean4.setBitmapUrl("http://pic182.nipic.com/pic/20180920/12398452_104636591000_4.jpg");
            movieInfoBean4.setName("青苹果");
            movieInfoBean4.setReview("3.9");
            movieInfoBean4.setVip("腾讯会员");
            movieInfoBean4.setVipflag(true);
            rvBean0406.setMovieInfoBean(movieInfoBean4);
            rvBean0406.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0406);


            //------------------------------006-----------------------------------------------------
            RVBean04 rvBean0407 = new RVBean04();
            MovieInfoBean movieInfoBean5 = new MovieInfoBean();
            movieInfoBean5.setBitmapUrl("http://pic188.nipic.com/pic/20181030/20020614_151903767037_4.jpg");
            movieInfoBean5.setName("柚子柠檬");
            movieInfoBean5.setReview("4.9");
            movieInfoBean5.setVip("");
            movieInfoBean5.setVipflag(false);
            rvBean0407.setMovieInfoBean(movieInfoBean5);
            rvBean0407.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0407);


            //------------------------------007-----------------------------------------------------
            RVBean04 rvBean0408 = new RVBean04();
            MovieInfoBean movieInfoBean6 = new MovieInfoBean();
            movieInfoBean6.setBitmapUrl("http://pic188.nipic.com/pic/20181031/12398452_134434388000_4.jpg");
            movieInfoBean6.setName("金桔");
            movieInfoBean6.setReview("4.5");
            movieInfoBean6.setVip("");
            movieInfoBean6.setVipflag(false);
            rvBean0408.setMovieInfoBean(movieInfoBean6);
            rvBean0408.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0408);

            //------------------------------008-----------------------------------------------------
            RVBean04 rvBean0409 = new RVBean04();
            MovieInfoBean movieInfoBean7 = new MovieInfoBean();
            movieInfoBean7.setBitmapUrl("http://pic188.nipic.com/pic/20181029/12398452_180040873000_4.jpg");
            movieInfoBean7.setName("灯笼果");
            movieInfoBean7.setReview("4.7");
            movieInfoBean7.setVip("");
            movieInfoBean7.setVipflag(false);
            rvBean0409.setMovieInfoBean(movieInfoBean7);
            rvBean0409.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0409);

            //------------------------------009-----------------------------------------------------
            RVBean04 rvBean0410 = new RVBean04();
            MovieInfoBean movieInfoBean8 = new MovieInfoBean();
            movieInfoBean8.setBitmapUrl("http://pic187.nipic.com/pic/20181023/18540348_125506644246_4.jpg");
            movieInfoBean8.setName("甜橙");
            movieInfoBean8.setReview("4.3");
            movieInfoBean8.setVip("");
            movieInfoBean8.setVipflag(false);
            rvBean0410.setMovieInfoBean(movieInfoBean8);
            rvBean0410.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0410);

            //------------------------------010-----------------------------------------------------
            RVBean04 rvBean0411 = new RVBean04();
            MovieInfoBean movieInfoBean9 = new MovieInfoBean();
            movieInfoBean9.setBitmapUrl("http://pic185.nipic.com/pic/20181013/8840_084554610086_4.jpg");
            movieInfoBean9.setName("成熟的柿子");
            movieInfoBean9.setReview("3.8");
            movieInfoBean9.setVip("");
            movieInfoBean9.setVipflag(false);
            rvBean0411.setMovieInfoBean(movieInfoBean9);
            rvBean0411.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0411);


        }

        return list;
    }

    public static List<RVBean04> getData04Tv() {
        List<RVBean04> list = new ArrayList<>();


        for (int i = 0; i < 4; i++) {

            //------------------------------001-----------------------------------------------------
            RVBean04 rvBean0402 = new RVBean04();
            MovieInfoBean movieInfoBean = new MovieInfoBean();
            movieInfoBean.setBitmapUrl("http://pic41.nipic.com/20140531/6969547_204350693313_2.jpg");
            movieInfoBean.setName("激浪青春");
            movieInfoBean.setReview("4.8");
            movieInfoBean.setVip("荔枝VIP");
            movieInfoBean.setVipflag(true);
            rvBean0402.setMovieInfoBean(movieInfoBean);
            rvBean0402.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0402);

            //------------------------------002-----------------------------------------------------
            RVBean04 rvBean0403 = new RVBean04();
            MovieInfoBean movieInfoBean1 = new MovieInfoBean();
            movieInfoBean1.setBitmapUrl("http://pic45.nipic.com/pic/20140802/6969547_200420116550_4.jpg");
            movieInfoBean1.setName("绣春刀");
            movieInfoBean1.setReview("4.6");
            movieInfoBean1.setVip("");
            movieInfoBean1.setVipflag(false);
            rvBean0403.setMovieInfoBean(movieInfoBean1);
            rvBean0403.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0403);


            //------------------------------003-----------------------------------------------------
            RVBean04 rvBean0404 = new RVBean04();
            MovieInfoBean movieInfoBean2 = new MovieInfoBean();
            movieInfoBean2.setBitmapUrl("http://pic45.nipic.com/pic/20140731/6969547_122820519620_4.jpg");
            movieInfoBean2.setName("闺蜜");
            movieInfoBean2.setReview("4.9");
            movieInfoBean2.setVip("爱奇艺VIP");
            movieInfoBean2.setVipflag(true);
            rvBean0404.setMovieInfoBean(movieInfoBean2);
            rvBean0404.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0404);


            //------------------------------004-----------------------------------------------------
            RVBean04 rvBean0405 = new RVBean04();
            MovieInfoBean movieInfoBean3 = new MovieInfoBean();
            movieInfoBean3.setBitmapUrl("http://pic44.nipic.com/pic/20140725/6969547_181347193749_4.jpg");
            movieInfoBean3.setName("神笔马良");
            movieInfoBean3.setReview("5.0");
            movieInfoBean3.setVip("");
            movieInfoBean3.setVipflag(false);
            rvBean0405.setMovieInfoBean(movieInfoBean3);
            rvBean0405.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0405);


            //------------------------------005-----------------------------------------------------
            RVBean04 rvBean0406 = new RVBean04();
            MovieInfoBean movieInfoBean4 = new MovieInfoBean();
            movieInfoBean4.setBitmapUrl("http://pic43.nipic.com/pic/20140614/6969547_123556177668_1.jpg");
            movieInfoBean4.setName("缘来是游戏");
            movieInfoBean4.setReview("3.9");
            movieInfoBean4.setVip("腾讯会员");
            movieInfoBean4.setVipflag(true);
            rvBean0406.setMovieInfoBean(movieInfoBean4);
            rvBean0406.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0406);


            //------------------------------006-----------------------------------------------------
            RVBean04 rvBean0407 = new RVBean04();
            MovieInfoBean movieInfoBean5 = new MovieInfoBean();
            movieInfoBean5.setBitmapUrl("http://pic41.nipic.com/pic/20140510/6969547_125621323391_4.jpg");
            movieInfoBean5.setName("蜂鸟特攻");
            movieInfoBean5.setReview("4.9");
            movieInfoBean5.setVip("");
            movieInfoBean5.setVipflag(false);
            rvBean0407.setMovieInfoBean(movieInfoBean5);
            rvBean0407.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0407);

            //------------------------------007-----------------------------------------------------
            RVBean04 rvBean0408 = new RVBean04();
            MovieInfoBean movieInfoBean6 = new MovieInfoBean();
            movieInfoBean6.setBitmapUrl("http://pic43.nipic.com/pic/20140623/6969547_165222565229_4.jpg");
            movieInfoBean6.setName("孤胆保镖");
            movieInfoBean6.setReview("4.5");
            movieInfoBean6.setVip("");
            movieInfoBean6.setVipflag(false);
            rvBean0408.setMovieInfoBean(movieInfoBean6);
            rvBean0408.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0408);

            //------------------------------008-----------------------------------------------------
            RVBean04 rvBean0409 = new RVBean04();
            MovieInfoBean movieInfoBean7 = new MovieInfoBean();
            movieInfoBean7.setBitmapUrl("http://pic43.nipic.com/pic/20140613/6969547_193937197631_4.jpg");
            movieInfoBean7.setName("虐面人");
            movieInfoBean7.setReview("4.7");
            movieInfoBean7.setVip("");
            movieInfoBean7.setVipflag(false);
            rvBean0409.setMovieInfoBean(movieInfoBean7);
            rvBean0409.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0409);

            //------------------------------009-----------------------------------------------------
            RVBean04 rvBean0410 = new RVBean04();
            MovieInfoBean movieInfoBean8 = new MovieInfoBean();
            movieInfoBean8.setBitmapUrl("http://pic42.nipic.com/pic/20140618/6969547_101651242000_4.jpg");
            movieInfoBean8.setName("死亡邮件");
            movieInfoBean8.setReview("4.3");
            movieInfoBean8.setVip("");
            movieInfoBean8.setVipflag(false);
            rvBean0410.setMovieInfoBean(movieInfoBean8);
            rvBean0410.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0410);

            //------------------------------010-----------------------------------------------------
            RVBean04 rvBean0411 = new RVBean04();
            MovieInfoBean movieInfoBean9 = new MovieInfoBean();
            movieInfoBean9.setBitmapUrl("http://pic42.nipic.com/pic/20140601/6969547_201729051343_4.jpg");
            movieInfoBean9.setName("疯狂72小时");
            movieInfoBean9.setReview("3.8");
            movieInfoBean9.setVip("");
            movieInfoBean9.setVipflag(false);
            rvBean0411.setMovieInfoBean(movieInfoBean9);
            rvBean0411.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0411);


        }

        return list;
    }

    public static List<RVBean04> getData04Variety() {
        List<RVBean04> list = new ArrayList<>();


        for (int i = 0; i < 4; i++) {

            //------------------------------001-----------------------------------------------------
            RVBean04 rvBean0402 = new RVBean04();
            MovieInfoBean movieInfoBean = new MovieInfoBean();
            movieInfoBean.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=3164020513,77603021&fm=26&gp=0.jpg");
            movieInfoBean.setName("消失的子弹");
            movieInfoBean.setReview("4.8");
            movieInfoBean.setVip("荔枝VIP");
            movieInfoBean.setVipflag(true);
            rvBean0402.setMovieInfoBean(movieInfoBean);
            rvBean0402.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0402);


            //------------------------------002-----------------------------------------------------
            RVBean04 rvBean0403 = new RVBean04();
            MovieInfoBean movieInfoBean1 = new MovieInfoBean();
            movieInfoBean1.setBitmapUrl("http://img3.imgtn.bdimg.com/it/u=3139737031,3366713682&fm=26&gp=0.jpg");
            movieInfoBean1.setName("大兵小将");
            movieInfoBean1.setReview("4.6");
            movieInfoBean1.setVip("");
            movieInfoBean1.setVipflag(false);
            rvBean0403.setMovieInfoBean(movieInfoBean1);
            rvBean0403.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0403);


            //------------------------------003-----------------------------------------------------
            RVBean04 rvBean0404 = new RVBean04();
            MovieInfoBean movieInfoBean2 = new MovieInfoBean();
            movieInfoBean2.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=2179232923,3165532437&fm=26&gp=0.jpg");
            movieInfoBean2.setName("海洋天堂");
            movieInfoBean2.setReview("4.9");
            movieInfoBean2.setVip("爱奇艺VIP");
            movieInfoBean2.setVipflag(true);
            rvBean0404.setMovieInfoBean(movieInfoBean2);
            rvBean0404.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0404);


            //------------------------------004-----------------------------------------------------
            RVBean04 rvBean0405 = new RVBean04();
            MovieInfoBean movieInfoBean3 = new MovieInfoBean();
            movieInfoBean3.setBitmapUrl("http://img2.imgtn.bdimg.com/it/u=3431573186,3404897614&fm=26&gp=0.jpg");
            movieInfoBean3.setName("画皮");
            movieInfoBean3.setReview("5.0");
            movieInfoBean3.setVip("");
            movieInfoBean3.setVipflag(false);
            rvBean0405.setMovieInfoBean(movieInfoBean3);
            rvBean0405.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0405);


            //------------------------------005-----------------------------------------------------
            RVBean04 rvBean0406 = new RVBean04();
            MovieInfoBean movieInfoBean4 = new MovieInfoBean();
            movieInfoBean4.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=1001148850,3591624109&fm=26&gp=0.jpg");
            movieInfoBean4.setName("赤壁");
            movieInfoBean4.setReview("3.9");
            movieInfoBean4.setVip("腾讯会员");
            movieInfoBean4.setVipflag(true);
            rvBean0406.setMovieInfoBean(movieInfoBean4);
            rvBean0406.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0406);


            //------------------------------006-----------------------------------------------------
            RVBean04 rvBean0407 = new RVBean04();
            MovieInfoBean movieInfoBean5 = new MovieInfoBean();
            movieInfoBean5.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=2279086736,3184162569&fm=26&gp=0.jpg");
            movieInfoBean5.setName("追捕");
            movieInfoBean5.setReview("4.9");
            movieInfoBean5.setVip("");
            movieInfoBean5.setVipflag(false);
            rvBean0407.setMovieInfoBean(movieInfoBean5);
            rvBean0407.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0407);


            //------------------------------007-----------------------------------------------------
            RVBean04 rvBean0408 = new RVBean04();
            MovieInfoBean movieInfoBean6 = new MovieInfoBean();
            movieInfoBean6.setBitmapUrl("http://img3.imgtn.bdimg.com/it/u=2100231306,1427090991&fm=26&gp=0.jpg");
            movieInfoBean6.setName("逆战");
            movieInfoBean6.setReview("4.5");
            movieInfoBean6.setVip("");
            movieInfoBean6.setVipflag(false);
            rvBean0408.setMovieInfoBean(movieInfoBean6);
            rvBean0408.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0408);

            //------------------------------008-----------------------------------------------------
            RVBean04 rvBean0409 = new RVBean04();
            MovieInfoBean movieInfoBean7 = new MovieInfoBean();
            movieInfoBean7.setBitmapUrl("http://img3.imgtn.bdimg.com/it/u=3318456280,626480297&fm=26&gp=0.jpg");
            movieInfoBean7.setName("古墓迷途");
            movieInfoBean7.setReview("4.7");
            movieInfoBean7.setVip("");
            movieInfoBean7.setVipflag(false);
            rvBean0409.setMovieInfoBean(movieInfoBean7);
            rvBean0409.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0409);

            //------------------------------009-----------------------------------------------------
            RVBean04 rvBean0410 = new RVBean04();
            MovieInfoBean movieInfoBean8 = new MovieInfoBean();
            movieInfoBean8.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=1552505136,2129059308&fm=26&gp=0.jpg");
            movieInfoBean8.setName("谍影重重2");
            movieInfoBean8.setReview("4.3");
            movieInfoBean8.setVip("");
            movieInfoBean8.setVipflag(false);
            rvBean0410.setMovieInfoBean(movieInfoBean8);
            rvBean0410.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0410);

            //------------------------------010-----------------------------------------------------
            RVBean04 rvBean0411 = new RVBean04();
            MovieInfoBean movieInfoBean9 = new MovieInfoBean();
            movieInfoBean9.setBitmapUrl("http://img2.imgtn.bdimg.com/it/u=1364845328,370719474&fm=26&gp=0.jpg");
            movieInfoBean9.setName("寻龙诀");
            movieInfoBean9.setReview("3.8");
            movieInfoBean9.setVip("");
            movieInfoBean9.setVipflag(false);
            rvBean0411.setMovieInfoBean(movieInfoBean9);
            rvBean0411.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0411);


        }

        return list;
    }

    public static List<RVBean04> getData04VocalConcert() {
        List<RVBean04> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            //------------------------------001-----------------------------------------------------
            RVBean04 rvBean0402 = new RVBean04();
            MovieInfoBean movieInfoBean = new MovieInfoBean();
            movieInfoBean.setBitmapUrl("http://img2.imgtn.bdimg.com/it/u=2119094551,1132308697&fm=26&gp=0.jpg");
            movieInfoBean.setName("何以笙箫默");
            movieInfoBean.setReview("4.8");
            movieInfoBean.setVip("荔枝VIP");
            movieInfoBean.setVipflag(true);
            rvBean0402.setMovieInfoBean(movieInfoBean);
            rvBean0402.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0402);


            //------------------------------002-----------------------------------------------------
            RVBean04 rvBean0403 = new RVBean04();
            MovieInfoBean movieInfoBean1 = new MovieInfoBean();
            movieInfoBean1.setBitmapUrl("http://img4.imgtn.bdimg.com/it/u=3033374255,3105930363&fm=26&gp=0.jpg");
            movieInfoBean1.setName("预审");
            movieInfoBean1.setReview("4.6");
            movieInfoBean1.setVip("");
            movieInfoBean1.setVipflag(false);
            rvBean0403.setMovieInfoBean(movieInfoBean1);
            rvBean0403.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0403);


            //------------------------------003-----------------------------------------------------
            RVBean04 rvBean0404 = new RVBean04();
            MovieInfoBean movieInfoBean2 = new MovieInfoBean();
            movieInfoBean2.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=1756807185,4222877186&fm=26&gp=0.jpg");
            movieInfoBean2.setName("未来警察");
            movieInfoBean2.setReview("4.9");
            movieInfoBean2.setVip("爱奇艺VIP");
            movieInfoBean2.setVipflag(true);
            rvBean0404.setMovieInfoBean(movieInfoBean2);
            rvBean0404.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0404);


            //------------------------------004-----------------------------------------------------
            RVBean04 rvBean0405 = new RVBean04();
            MovieInfoBean movieInfoBean3 = new MovieInfoBean();
            movieInfoBean3.setBitmapUrl("http://img2.imgtn.bdimg.com/it/u=346301946,1299530606&fm=26&gp=0.jpg");
            movieInfoBean3.setName("梅兰芳");
            movieInfoBean3.setReview("5.0");
            movieInfoBean3.setVip("");
            movieInfoBean3.setVipflag(false);
            rvBean0405.setMovieInfoBean(movieInfoBean3);
            rvBean0405.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0405);


            //------------------------------005-----------------------------------------------------
            RVBean04 rvBean0406 = new RVBean04();
            MovieInfoBean movieInfoBean4 = new MovieInfoBean();
            movieInfoBean4.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=125092771,1482349044&fm=26&gp=0.jpg");
            movieInfoBean4.setName("黄石的孩子");
            movieInfoBean4.setReview("3.9");
            movieInfoBean4.setVip("腾讯会员");
            movieInfoBean4.setVipflag(true);
            rvBean0406.setMovieInfoBean(movieInfoBean4);
            rvBean0406.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0406);


            //------------------------------006-----------------------------------------------------
            RVBean04 rvBean0407 = new RVBean04();
            MovieInfoBean movieInfoBean5 = new MovieInfoBean();
            movieInfoBean5.setBitmapUrl("http://img3.imgtn.bdimg.com/it/u=2610111085,2285364834&fm=26&gp=0.jpg");
            movieInfoBean5.setName("激战");
            movieInfoBean5.setReview("4.9");
            movieInfoBean5.setVip("");
            movieInfoBean5.setVipflag(false);
            rvBean0407.setMovieInfoBean(movieInfoBean5);
            rvBean0407.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0407);


            //------------------------------007-----------------------------------------------------
            RVBean04 rvBean0408 = new RVBean04();
            MovieInfoBean movieInfoBean6 = new MovieInfoBean();
            movieInfoBean6.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=2757221278,1797516270&fm=26&gp=0.jpg");
            movieInfoBean6.setName("真功夫");
            movieInfoBean6.setReview("4.5");
            movieInfoBean6.setVip("");
            movieInfoBean6.setVipflag(false);
            rvBean0408.setMovieInfoBean(movieInfoBean6);
            rvBean0408.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0408);

            //------------------------------008-----------------------------------------------------
            RVBean04 rvBean0409 = new RVBean04();
            MovieInfoBean movieInfoBean7 = new MovieInfoBean();
            movieInfoBean7.setBitmapUrl("http://img3.imgtn.bdimg.com/it/u=2234033045,480740470&fm=26&gp=0.jpg");
            movieInfoBean7.setName("幽灵党");
            movieInfoBean7.setReview("4.7");
            movieInfoBean7.setVip("");
            movieInfoBean7.setVipflag(false);
            rvBean0409.setMovieInfoBean(movieInfoBean7);
            rvBean0409.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0409);

            //------------------------------009-----------------------------------------------------
            RVBean04 rvBean0410 = new RVBean04();
            MovieInfoBean movieInfoBean8 = new MovieInfoBean();
            movieInfoBean8.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=2702320683,572451459&fm=26&gp=0.jpg");
            movieInfoBean8.setName("太极");
            movieInfoBean8.setReview("4.3");
            movieInfoBean8.setVip("");
            movieInfoBean8.setVipflag(false);
            rvBean0410.setMovieInfoBean(movieInfoBean8);
            rvBean0410.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0410);

            //------------------------------010-----------------------------------------------------
            RVBean04 rvBean0411 = new RVBean04();
            MovieInfoBean movieInfoBean9 = new MovieInfoBean();
            movieInfoBean9.setBitmapUrl("http://img5.imgtn.bdimg.com/it/u=1235022648,2529090287&fm=26&gp=0.jpg");
            movieInfoBean9.setName("狼图腾");
            movieInfoBean9.setReview("3.8");
            movieInfoBean9.setVip("");
            movieInfoBean9.setVipflag(false);
            rvBean0411.setMovieInfoBean(movieInfoBean9);
            rvBean0411.setItemType(RVBean04.TYPE_THREE);
            list.add(rvBean0411);


        }

        return list;
    }
    //------------------------04页面相关------------------------------------------------------------


    //------------------------05页面相关------------------------------------------------------------
    public static List<RVBean05> getData05() {
        List<RVBean05> list = new ArrayList<>();
        RVBean05 bean05 = new RVBean05();
        bean05.setHeaderUrl("http://img4.imgtn.bdimg.com/it/u=1737533157,1337961427&fm=11&gp=0.jpg");
        bean05.setItemType(RVBean05.TYPE_ONE);
        list.add(bean05);
        for (int i = 0; i < 5; i++) {
            //--------------------------001-----------------------------------------------------------
            RVBean05 bean051 = new RVBean05();
            bean051.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean = new MovieInfoBean();
            movieInfoBean.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=189017658,3214233132&fm=11&gp=0.jpg");
            movieInfoBean.setName("宝贝儿");
            movieInfoBean.setReview("4.8");
            movieInfoBean.setVip("荔枝VIP");
            movieInfoBean.setVipflag(true);
            bean051.setMovieInfoBean(movieInfoBean);
            list.add(bean051);

            //--------------------------002-----------------------------------------------------------
            RVBean05 bean052 = new RVBean05();
            bean052.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean1 = new MovieInfoBean();
            movieInfoBean1.setBitmapUrl("http://img4.imgtn.bdimg.com/it/u=3849000789,1063737491&fm=26&gp=0.jpg");
            movieInfoBean1.setName("夜色撩人");
            movieInfoBean1.setReview("4.8");
            movieInfoBean1.setVip("");
            movieInfoBean1.setVipflag(false);
            bean052.setMovieInfoBean(movieInfoBean1);
            list.add(bean052);
            //--------------------------003-----------------------------------------------------------
            RVBean05 bean053 = new RVBean05();
            bean053.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean2 = new MovieInfoBean();
            movieInfoBean2.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=2010901413,636960256&fm=26&gp=0.jpg");
            movieInfoBean2.setName("魔兽");
            movieInfoBean2.setReview("4.8");
            movieInfoBean2.setVip("");
            movieInfoBean2.setVipflag(false);
            bean053.setMovieInfoBean(movieInfoBean2);
            list.add(bean053);

            //--------------------------004-----------------------------------------------------------

            RVBean05 bean054 = new RVBean05();
            bean054.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean3 = new MovieInfoBean();
            movieInfoBean3.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=22161463,1879162254&fm=26&gp=0.jpg");
            movieInfoBean3.setName("功夫熊猫");
            movieInfoBean3.setReview("4.8");
            movieInfoBean3.setVip("爱奇艺VIP");
            movieInfoBean3.setVipflag(true);
            bean054.setMovieInfoBean(movieInfoBean3);
            list.add(bean054);
            //--------------------------005-----------------------------------------------------------

            RVBean05 bean055 = new RVBean05();
            bean055.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean4 = new MovieInfoBean();
            movieInfoBean4.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=3652835262,1078015000&fm=26&gp=0.jpg");
            movieInfoBean4.setName("七月与安生");
            movieInfoBean4.setReview("4.8");
            movieInfoBean4.setVip("");
            movieInfoBean4.setVipflag(false);
            bean055.setMovieInfoBean(movieInfoBean4);
            list.add(bean055);
            //--------------------------006-----------------------------------------------------------
            RVBean05 bean056 = new RVBean05();
            bean056.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean5 = new MovieInfoBean();
            movieInfoBean5.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=1694940279,655519540&fm=26&gp=0.jpg");
            movieInfoBean5.setName("请叫我英雄");
            movieInfoBean5.setReview("4.8");
            movieInfoBean5.setVip("");
            movieInfoBean5.setVipflag(false);
            bean056.setMovieInfoBean(movieInfoBean5);
            list.add(bean056);


            //--------------------------007-----------------------------------------------------------
            RVBean05 bean057 = new RVBean05();
            bean057.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean6 = new MovieInfoBean();
            movieInfoBean6.setBitmapUrl("http://img3.imgtn.bdimg.com/it/u=2272348182,404997297&fm=26&gp=0.jpg");
            movieInfoBean6.setName("捉妖记");
            movieInfoBean6.setReview("4.8");
            movieInfoBean6.setVip("");
            movieInfoBean6.setVipflag(false);
            bean057.setMovieInfoBean(movieInfoBean6);
            list.add(bean057);


            //--------------------------008-----------------------------------------------------------
            RVBean05 bean058 = new RVBean05();
            bean058.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean7 = new MovieInfoBean();
            movieInfoBean7.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=197376372,3340360609&fm=26&gp=0.jpg");
            movieInfoBean7.setName("红海行动");
            movieInfoBean7.setReview("4.8");
            movieInfoBean7.setVip("");
            movieInfoBean7.setVipflag(false);
            bean058.setMovieInfoBean(movieInfoBean7);
            list.add(bean058);


            //--------------------------009-----------------------------------------------------------
            RVBean05 bean059 = new RVBean05();
            bean059.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean8 = new MovieInfoBean();
            movieInfoBean8.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=204839970,1197078792&fm=26&gp=0.jpg");
            movieInfoBean8.setName("遭遇海明威");
            movieInfoBean8.setReview("4.8");
            movieInfoBean8.setVip("");
            movieInfoBean8.setVipflag(false);
            bean059.setMovieInfoBean(movieInfoBean8);
            list.add(bean059);


            //--------------------------010-----------------------------------------------------------
            RVBean05 bean0510 = new RVBean05();
            bean0510.setItemType(RVBean05.TYPE_TWO);
            MovieInfoBean movieInfoBean9 = new MovieInfoBean();
            movieInfoBean9.setBitmapUrl("http://img2.imgtn.bdimg.com/it/u=2858558773,3044806253&fm=26&gp=0.jpg");
            movieInfoBean9.setName("浮城大亨");
            movieInfoBean9.setReview("4.8");
            movieInfoBean9.setVip("");
            movieInfoBean9.setVipflag(false);
            bean0510.setMovieInfoBean(movieInfoBean9);
            list.add(bean0510);


        }

        return list;

    }

    //------------------------05页面相关------------------------------------------------------------
    //------------------------05页面相关-------------------------group-----------------------------------
    public static List<RVBean05Group> getData05Group() {
        List<RVBean05Group> list = new ArrayList<>();
        RVBean05Group bean05 = new RVBean05Group();
        bean05.setHeaderUrl("http://img4.imgtn.bdimg.com/it/u=1737533157,1337961427&fm=11&gp=0.jpg");
        bean05.setItemType(RVBean05Group.TYPE_ONE);
        list.add(bean05);
        for (int i = 0; i < 5; i++) {
            //--------------------------001-----------------------------------------------------------
            RVBean05Group bean051 = new RVBean05Group();
            bean051.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean = new MovieInfoBean();
            movieInfoBean.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=189017658,3214233132&fm=11&gp=0.jpg");
            movieInfoBean.setName("宝贝儿");
            movieInfoBean.setReview("4.8");
            movieInfoBean.setVip("荔枝VIP");
            movieInfoBean.setVipflag(true);
            bean051.setMovieInfoBean(movieInfoBean);
            list.add(bean051);

            //--------------------------002-----------------------------------------------------------
            RVBean05Group bean052 = new RVBean05Group();
            bean052.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean1 = new MovieInfoBean();
            movieInfoBean1.setBitmapUrl("http://img4.imgtn.bdimg.com/it/u=3849000789,1063737491&fm=26&gp=0.jpg");
            movieInfoBean1.setName("夜色撩人");
            movieInfoBean1.setReview("4.8");
            movieInfoBean1.setVip("");
            movieInfoBean1.setVipflag(false);
            bean052.setMovieInfoBean(movieInfoBean1);
            list.add(bean052);
            //--------------------------003-----------------------------------------------------------
            RVBean05Group bean053 = new RVBean05Group();
            bean053.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean2 = new MovieInfoBean();
            movieInfoBean2.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=2010901413,636960256&fm=26&gp=0.jpg");
            movieInfoBean2.setName("魔兽");
            movieInfoBean2.setReview("4.8");
            movieInfoBean2.setVip("");
            movieInfoBean2.setVipflag(false);
            bean053.setMovieInfoBean(movieInfoBean2);
            list.add(bean053);

            //--------------------------004-----------------------------------------------------------

            RVBean05Group bean054 = new RVBean05Group();
            bean054.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean3 = new MovieInfoBean();
            movieInfoBean3.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=22161463,1879162254&fm=26&gp=0.jpg");
            movieInfoBean3.setName("功夫熊猫");
            movieInfoBean3.setReview("4.8");
            movieInfoBean3.setVip("爱奇艺VIP");
            movieInfoBean3.setVipflag(true);
            bean054.setMovieInfoBean(movieInfoBean3);
            list.add(bean054);
            //--------------------------005-----------------------------------------------------------

            RVBean05Group bean055 = new RVBean05Group();
            bean055.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean4 = new MovieInfoBean();
            movieInfoBean4.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=3652835262,1078015000&fm=26&gp=0.jpg");
            movieInfoBean4.setName("七月与安生");
            movieInfoBean4.setReview("4.8");
            movieInfoBean4.setVip("");
            movieInfoBean4.setVipflag(false);
            bean055.setMovieInfoBean(movieInfoBean4);
            list.add(bean055);
            //--------------------------006-----------------------------------------------------------
            RVBean05Group bean056 = new RVBean05Group();
            bean056.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean5 = new MovieInfoBean();
            movieInfoBean5.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=1694940279,655519540&fm=26&gp=0.jpg");
            movieInfoBean5.setName("请叫我英雄");
            movieInfoBean5.setReview("4.8");
            movieInfoBean5.setVip("");
            movieInfoBean5.setVipflag(false);
            bean056.setMovieInfoBean(movieInfoBean5);
            list.add(bean056);


            //--------------------------007-----------------------------------------------------------
            RVBean05Group bean057 = new RVBean05Group();
            bean057.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean6 = new MovieInfoBean();
            movieInfoBean6.setBitmapUrl("http://img3.imgtn.bdimg.com/it/u=2272348182,404997297&fm=26&gp=0.jpg");
            movieInfoBean6.setName("捉妖记");
            movieInfoBean6.setReview("4.8");
            movieInfoBean6.setVip("");
            movieInfoBean6.setVipflag(false);
            bean057.setMovieInfoBean(movieInfoBean6);
            list.add(bean057);


            //--------------------------008-----------------------------------------------------------
            RVBean05Group bean058 = new RVBean05Group();
            bean058.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean7 = new MovieInfoBean();
            movieInfoBean7.setBitmapUrl("http://img1.imgtn.bdimg.com/it/u=197376372,3340360609&fm=26&gp=0.jpg");
            movieInfoBean7.setName("红海行动");
            movieInfoBean7.setReview("4.8");
            movieInfoBean7.setVip("");
            movieInfoBean7.setVipflag(false);
            bean058.setMovieInfoBean(movieInfoBean7);
            list.add(bean058);


            //--------------------------009-----------------------------------------------------------
            RVBean05Group bean059 = new RVBean05Group();
            bean059.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean8 = new MovieInfoBean();
            movieInfoBean8.setBitmapUrl("http://img0.imgtn.bdimg.com/it/u=204839970,1197078792&fm=26&gp=0.jpg");
            movieInfoBean8.setName("遭遇海明威");
            movieInfoBean8.setReview("4.8");
            movieInfoBean8.setVip("");
            movieInfoBean8.setVipflag(false);
            bean059.setMovieInfoBean(movieInfoBean8);
            list.add(bean059);


            //--------------------------010-----------------------------------------------------------
            RVBean05Group bean0510 = new RVBean05Group();
            bean0510.setItemType(RVBean05Group.TYPE_TWO);
            MovieInfoBean movieInfoBean9 = new MovieInfoBean();
            movieInfoBean9.setBitmapUrl("http://img2.imgtn.bdimg.com/it/u=2858558773,3044806253&fm=26&gp=0.jpg");
            movieInfoBean9.setName("浮城大亨");
            movieInfoBean9.setReview("4.8");
            movieInfoBean9.setVip("");
            movieInfoBean9.setVipflag(false);
            bean0510.setMovieInfoBean(movieInfoBean9);
            list.add(bean0510);


        }

        return list;

    }
    //------------------------05页面相关--------------------------group----------------------------------
    //------------------------07页面相关------------------------------------------------------------
    public static List<RVBean07> getData07() {
        List<RVBean07> list = new ArrayList<>();
        RVBean07 bean05 = new RVBean07();
        bean05.setHeaderUrl1("http://img4.imgtn.bdimg.com/it/u=1737533157,1337961427&fm=11&gp=0.jpg");
        bean05.setHeaderUrl("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=824841670,1660722425&fm=26&gp=0.jpg");
        bean05.setItemType(RVBean07.TYPE_ONE);
        list.add(bean05);
        for (int i = 0; i < 5; i++) {
            //--------------------------001-----------------------------------------------------------
            RVBean07 bean051 = new RVBean07();
            bean051.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean = new MovieInfoBean();
            movieInfoBean.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.jpg");
            movieInfoBean.setName("我不是药神");
            movieInfoBean.setReview("4.8");
            movieInfoBean.setVip("荔枝VIP");
            movieInfoBean.setVipflag(true);
            bean051.setMovieInfoBean(movieInfoBean);
            list.add(bean051);

            //--------------------------002-----------------------------------------------------------
            RVBean07 bean052 = new RVBean07();
            bean052.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean1 = new MovieInfoBean();
            movieInfoBean1.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2535096871.jpg");
            movieInfoBean1.setName("无双");
            movieInfoBean1.setReview("4.8");
            movieInfoBean1.setVip("");
            movieInfoBean1.setVipflag(false);
            bean052.setMovieInfoBean(movieInfoBean1);
            list.add(bean052);
            //--------------------------003-----------------------------------------------------------
            RVBean07 bean053 = new RVBean07();
            bean053.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean2 = new MovieInfoBean();
            movieInfoBean2.setBitmapUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2525528688.jpg");
            movieInfoBean2.setName("动物世界");
            movieInfoBean2.setReview("4.8");
            movieInfoBean2.setVip("");
            movieInfoBean2.setVipflag(false);
            bean053.setMovieInfoBean(movieInfoBean2);
            list.add(bean053);

            //--------------------------004-----------------------------------------------------------

            RVBean07 bean054 = new RVBean07();
            bean054.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean3 = new MovieInfoBean();
            movieInfoBean3.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2529571873.jpg");
            movieInfoBean3.setName("一出好戏");
            movieInfoBean3.setReview("4.8");
            movieInfoBean3.setVip("爱奇艺VIP");
            movieInfoBean3.setVipflag(true);
            bean054.setMovieInfoBean(movieInfoBean3);
            list.add(bean054);
            //--------------------------005-----------------------------------------------------------

            RVBean07 bean055 = new RVBean07();
            bean055.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean4 = new MovieInfoBean();
            movieInfoBean4.setBitmapUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2529701498.jpg");
            movieInfoBean4.setName("悲伤逆流成河");
            movieInfoBean4.setReview("4.8");
            movieInfoBean4.setVip("");
            movieInfoBean4.setVipflag(false);
            bean055.setMovieInfoBean(movieInfoBean4);
            list.add(bean055);
            //--------------------------006-----------------------------------------------------------
            RVBean07 bean056 = new RVBean07();
            bean056.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean5 = new MovieInfoBean();
            movieInfoBean5.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p917846733.jpg");
            movieInfoBean5.setName("哈利·波特与死亡圣器(下)");
            movieInfoBean5.setReview("4.8");
            movieInfoBean5.setVip("");
            movieInfoBean5.setVipflag(false);
            bean056.setMovieInfoBean(movieInfoBean5);
            list.add(bean056);


            //--------------------------007-----------------------------------------------------------
            RVBean07 bean057 = new RVBean07();
            bean057.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean6 = new MovieInfoBean();
            movieInfoBean6.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p511118051.jpg");
            movieInfoBean6.setName("这个杀手不太冷");
            movieInfoBean6.setReview("4.8");
            movieInfoBean6.setVip("");
            movieInfoBean6.setVipflag(false);
            bean057.setMovieInfoBean(movieInfoBean6);
            list.add(bean057);


            //--------------------------008-----------------------------------------------------------
            RVBean07 bean058 = new RVBean07();
            bean058.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean7 = new MovieInfoBean();
            movieInfoBean7.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2535524955.jpg");
            movieInfoBean7.setName("流浪猫鲍勃");
            movieInfoBean7.setReview("4.8");
            movieInfoBean7.setVip("");
            movieInfoBean7.setVipflag(false);
            bean058.setMovieInfoBean(movieInfoBean7);
            list.add(bean058);


            //--------------------------009-----------------------------------------------------------
            RVBean07 bean059 = new RVBean07();
            bean059.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean8 = new MovieInfoBean();
            movieInfoBean8.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1910813120.jpg");
            movieInfoBean8.setName("霸王别姬");
            movieInfoBean8.setReview("4.8");
            movieInfoBean8.setVip("");
            movieInfoBean8.setVipflag(false);
            bean059.setMovieInfoBean(movieInfoBean8);
            list.add(bean059);


            //--------------------------010-----------------------------------------------------------
            RVBean07 bean0510 = new RVBean07();
            bean0510.setItemType(RVBean07.TYPE_TWO);
            MovieInfoBean movieInfoBean9 = new MovieInfoBean();
            movieInfoBean9.setBitmapUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p510876377.jpg");
            movieInfoBean9.setName("阿甘正传");
            movieInfoBean9.setReview("4.8");
            movieInfoBean9.setVip("");
            movieInfoBean9.setVipflag(false);
            bean0510.setMovieInfoBean(movieInfoBean9);
            list.add(bean0510);


        }

        return list;

    }

    //------------------------07页面相关------------------------------------------------------------
    //------------------------08页面相关------------------------------------------------------------
    public static List<RVBean08> getData08() {
        List<RVBean08> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            //----------------------001-------------------------------------------------------------
            RVBean08 bean01 = new RVBean08();
            bean01.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean01.setShowLabel(true);
            bean01.setMoviewImageUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p1512562287.jpg");
            bean01.setName("让子弹飞");
            list.add(bean01);
            //----------------------002-------------------------------------------------------------
            RVBean08 bean02 = new RVBean08();
            bean02.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean02.setShowLabel(false);
            bean02.setMoviewImageUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p480747492.jpg");
            bean02.setName("肖申克的救赎");
            list.add(bean02);
            //----------------------003-------------------------------------------------------------
            RVBean08 bean03 = new RVBean08();
            bean03.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean03.setShowLabel(false);
            bean03.setMoviewImageUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p457760035.jpg");
            bean03.setName("泰坦尼克号");
            list.add(bean03);
            //----------------------004-------------------------------------------------------------
            RVBean08 bean04 = new RVBean08();
            bean04.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean04.setShowLabel(true);
            bean04.setMoviewImageUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2535365481.jpg");
            bean04.setName("嗝嗝老师");
            list.add(bean04);
            //----------------------005-------------------------------------------------------------
            RVBean08 bean05 = new RVBean08();
            bean05.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean05.setShowLabel(false);
            bean05.setMoviewImageUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2233971046.jpg");
            bean05.setName("无间道");
            list.add(bean05);
            //----------------------006-------------------------------------------------------------
            RVBean08 bean06 = new RVBean08();
            bean06.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean06.setShowLabel(false);
            bean06.setMoviewImageUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p479682972.jpg");
            bean06.setName("楚门的世界");
            list.add(bean06);
            //----------------------007-------------------------------------------------------------
            RVBean08 bean07 = new RVBean08();
            bean07.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean07.setShowLabel(false);
            bean07.setMoviewImageUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1312700744.jpg");
            bean07.setName("当幸福来敲门");
            list.add(bean07);
            //----------------------008-------------------------------------------------------------
            RVBean08 bean08 = new RVBean08();
            bean08.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean08.setShowLabel(true);
            bean08.setMoviewImageUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2398141939.jpg");
            bean08.setName("血战钢锯岭");
            list.add(bean08);
            //----------------------009-------------------------------------------------------------
            RVBean08 bean09 = new RVBean08();
            bean09.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean09.setShowLabel(false);
            bean09.setMoviewImageUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1910824951.jpg");
            bean09.setName("放牛班的春天");
            list.add(bean09);
            //----------------------010-------------------------------------------------------------
            RVBean08 bean10 = new RVBean08();
            bean10.setLabelImageUrl(R.drawable.zuoshangjiaolabel);
            bean10.setShowLabel(false);
            bean10.setMoviewImageUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p470006658.jpg");
            bean10.setName("香水");
            list.add(bean10);
        }


        return list;
    }
    //------------------------08页面相关------------------------------------------------------------
    //------------------------09页面相关------------------------------------------------------------

    public static List<RVBean09> getData09() {
        List<RVBean09> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
//            RVBean09 bean09 = new RVBean09();
//            bean09.setItemType(RVBean09.TYPE_ONE);
//            bean09.setName("成龙");
//            bean09.setPortraitUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2016930906.jpg");
//            list.add(bean09);


            //-------------------------------001----------------------------------------------------
            RVBean09 bean09 = new RVBean09();
            bean09.setItemType(RVBean09.TYPE_ONE);
            bean09.setName("成龙");
            bean09.setPortraitUrl("https://gss2.bdstatic.com/9fo3dSag_xI4khGkpoWK1HF6hhy/baike/" +
                    "w%3D268%3Bg%3D0/sign=e174b976ac8b87d65042ac193f334f05/bd315c6034a85edfdfd9f56444540923dd54751b.jpg");
            list.add(bean09);

            //-------------------------------002----------------------------------------------------
            RVBean09 bean0901 = new RVBean09();
            bean0901.setItemType(RVBean09.TYPE_ONE);
            bean0901.setName("张嘉译");
            bean0901.setPortraitUrl("http://img4.imgtn.bdimg.com/it/u=1087786611,1657702153&fm=26&gp=0.jpg");
            list.add(bean0901);

            //-------------------------------003----------------------------------------------------
            RVBean09 bean0902 = new RVBean09();
            bean0902.setItemType(RVBean09.TYPE_ONE);
            bean0902.setName("何冰");
            bean0902.setPortraitUrl("http://img0.imgtn.bdimg.com/it/u=137488357,3343791359&fm=26&gp=0.jpg");
            list.add(bean0902);

            //-------------------------------004----------------------------------------------------
            RVBean09 bean0903 = new RVBean09();
            bean0903.setItemType(RVBean09.TYPE_ONE);
            bean0903.setName("秦海璐");
            bean0903.setPortraitUrl("http://img5.imgtn.bdimg.com/it/u=895367894,480950421&fm=26&gp=0.jpg");
            list.add(bean0903);

            //-------------------------------005----------------------------------------------------
            RVBean09 bean0904 = new RVBean09();
            bean0904.setItemType(RVBean09.TYPE_ONE);
            bean0904.setName("刘佩琦");
            bean0904.setPortraitUrl("http://img0.imgtn.bdimg.com/it/u=949228184,961797994&fm=26&gp=0.jpg");
            list.add(bean0904);

            //-------------------------------006----------------------------------------------------
            RVBean09 bean0905 = new RVBean09();
            bean0905.setItemType(RVBean09.TYPE_ONE);
            bean0905.setName("李洪涛");
            bean0905.setPortraitUrl("http://img5.imgtn.bdimg.com/it/u=3030200563,4095361682&fm=26&gp=0.jpg");
            list.add(bean0905);

            //-------------------------------007----------------------------------------------------
            RVBean09 bean0906 = new RVBean09();
            bean0906.setItemType(RVBean09.TYPE_ONE);
            bean0906.setName("戈治均");
            bean0906.setPortraitUrl("http://www.supcast.cn/Runtime/Home/Thumb/300x400/5b/be/5bbe1374f9de17fbd0cf711b03221bd0.jpg");
            list.add(bean0906);

            //-------------------------------008----------------------------------------------------
            RVBean09 bean0907 = new RVBean09();
            bean0907.setItemType(RVBean09.TYPE_ONE);
            bean0907.setName("雷佳音");
            bean0907.setPortraitUrl("http://img3.imgtn.bdimg.com/it/u=860073441,2867052390&fm=26&gp=0.jpg");
            list.add(bean0907);
            //-------------------------------009----------------------------------------------------
            RVBean09 bean0908 = new RVBean09();
            bean0908.setItemType(RVBean09.TYPE_ONE);
            bean0908.setName("翟天临");
            bean0908.setPortraitUrl("http://img5.imgtn.bdimg.com/it/u=513601315,4026569036&fm=26&gp=0.jpg");
            list.add(bean0908);

            //-------------------------------010----------------------------------------------------
            RVBean09 bean0909 = new RVBean09();
            bean0909.setItemType(RVBean09.TYPE_ONE);
            bean0909.setName("李沁");
            bean0909.setPortraitUrl("http://img4.imgtn.bdimg.com/it/u=186908702,826141868&fm=26&gp=0.jpg");
            list.add(bean0909);

        }
        return list;
    }

    //------------------------09页面相关------------------------------------------------------------
    //------------------------10页面相关------------------------------------------------------------
    public static List<RVBean10> getData10() {
        List<RVBean10> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            //--------------------------001-----------------------------------------------------------
            RVBean10 bean051 = new RVBean10();
            bean051.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean = new MovieInfoBean();
            movieInfoBean.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2519070834.jpg");
            movieInfoBean.setName("我不是药神");
            movieInfoBean.setReview("4.8");
            movieInfoBean.setVip("荔枝VIP");
            movieInfoBean.setVipflag(true);
            bean051.setMovieInfoBean(movieInfoBean);
            list.add(bean051);

            //--------------------------002-----------------------------------------------------------
            RVBean10 bean052 = new RVBean10();
            bean052.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean1 = new MovieInfoBean();
            movieInfoBean1.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2535096871.jpg");
            movieInfoBean1.setName("无双");
            movieInfoBean1.setReview("4.8");
            movieInfoBean1.setVip("");
            movieInfoBean1.setVipflag(false);
            bean052.setMovieInfoBean(movieInfoBean1);
            list.add(bean052);
            //--------------------------003-----------------------------------------------------------
            RVBean10 bean053 = new RVBean10();
            bean053.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean2 = new MovieInfoBean();
            movieInfoBean2.setBitmapUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2525528688.jpg");
            movieInfoBean2.setName("动物世界");
            movieInfoBean2.setReview("4.8");
            movieInfoBean2.setVip("");
            movieInfoBean2.setVipflag(false);
            bean053.setMovieInfoBean(movieInfoBean2);
            list.add(bean053);

            //--------------------------004-----------------------------------------------------------

            RVBean10 bean054 = new RVBean10();
            bean054.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean3 = new MovieInfoBean();
            movieInfoBean3.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2529571873.jpg");
            movieInfoBean3.setName("一出好戏");
            movieInfoBean3.setReview("4.8");
            movieInfoBean3.setVip("爱奇艺VIP");
            movieInfoBean3.setVipflag(true);
            bean054.setMovieInfoBean(movieInfoBean3);
            list.add(bean054);
            //--------------------------005-----------------------------------------------------------

            RVBean10 bean055 = new RVBean10();
            bean055.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean4 = new MovieInfoBean();
            movieInfoBean4.setBitmapUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2529701498.jpg");
            movieInfoBean4.setName("悲伤逆流成河");
            movieInfoBean4.setReview("4.8");
            movieInfoBean4.setVip("");
            movieInfoBean4.setVipflag(false);
            bean055.setMovieInfoBean(movieInfoBean4);
            list.add(bean055);
            //--------------------------006-----------------------------------------------------------
            RVBean10 bean056 = new RVBean10();
            bean056.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean5 = new MovieInfoBean();
            movieInfoBean5.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p917846733.jpg");
            movieInfoBean5.setName("哈利·波特与死亡圣器(下)");
            movieInfoBean5.setReview("4.8");
            movieInfoBean5.setVip("");
            movieInfoBean5.setVipflag(false);
            bean056.setMovieInfoBean(movieInfoBean5);
            list.add(bean056);


            //--------------------------007-----------------------------------------------------------
            RVBean10 bean057 = new RVBean10();
            bean057.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean6 = new MovieInfoBean();
            movieInfoBean6.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p511118051.jpg");
            movieInfoBean6.setName("这个杀手不太冷");
            movieInfoBean6.setReview("4.8");
            movieInfoBean6.setVip("");
            movieInfoBean6.setVipflag(false);
            bean057.setMovieInfoBean(movieInfoBean6);
            list.add(bean057);


            //--------------------------008-----------------------------------------------------------
            RVBean10 bean058 = new RVBean10();
            bean058.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean7 = new MovieInfoBean();
            movieInfoBean7.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2535524955.jpg");
            movieInfoBean7.setName("流浪猫鲍勃");
            movieInfoBean7.setReview("4.8");
            movieInfoBean7.setVip("");
            movieInfoBean7.setVipflag(false);
            bean058.setMovieInfoBean(movieInfoBean7);
            list.add(bean058);


            //--------------------------009-----------------------------------------------------------
            RVBean10 bean059 = new RVBean10();
            bean059.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean8 = new MovieInfoBean();
            movieInfoBean8.setBitmapUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1910813120.jpg");
            movieInfoBean8.setName("霸王别姬");
            movieInfoBean8.setReview("4.8");
            movieInfoBean8.setVip("");
            movieInfoBean8.setVipflag(false);
            bean059.setMovieInfoBean(movieInfoBean8);
            list.add(bean059);


            //--------------------------010-----------------------------------------------------------
            RVBean10 bean0510 = new RVBean10();
            bean0510.setItemType(RVBean10.TYPE_TWO);
            MovieInfoBean movieInfoBean9 = new MovieInfoBean();
            movieInfoBean9.setBitmapUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p510876377.jpg");
            movieInfoBean9.setName("阿甘正传");
            movieInfoBean9.setReview("4.8");
            movieInfoBean9.setVip("");
            movieInfoBean9.setVipflag(false);
            bean0510.setMovieInfoBean(movieInfoBean9);
            list.add(bean0510);


        }

        return list;

    }

    //------------------------10页面相关------------------------------------------------------------
    //------------------------11页面相关------------------------------------------------------------
    public static List<RVBean11> getData11() {
        List<RVBean11> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            RVBean11 bean11 = new RVBean11();
            bean11.setFree("包邮");


            bean11.setInfo("111097人付款");
            bean11.setName("Apple/苹果 iPhone 6s");
            bean11.setType("全新/128G");
            bean11.setPrice("$1056.0");
            bean11.setProduceImageUrl("https://gd2.alicdn.com/imgextra/i1/2314050807/O1CN018VYtlk1Hpe6YsAbWs_!!2314050807.png");


            list.add(bean11);
        }


        return list;
    }

    //------------------------11页面相关------------------------------------------------------------
    //------------------------11页面相关---------------自定义view-----------------------------------
    public static List<RVBean11Single> getData11Single() {
        List<RVBean11Single> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
           //--------------------------------------------------001----------------------------------
            RVBean11Single bean11 = new RVBean11Single();
            bean11.setFree("包邮");
            bean11.setInfo("111097人付款");
            bean11.setName("Apple/苹果 iPhone 6s 全新/128G");
            bean11.setPrice("$1056.0");
            bean11.setProduceImageUrl("https://gd2.alicdn.com/imgextra/i1/2314050807/O1CN018VYtlk1Hpe6YsAbWs_!!2314050807.png");
            list.add(bean11);

            //--------------------------------------------------002----------------------------------

            RVBean11Single bean1102 = new RVBean11Single();
            bean1102.setFree("包邮");
            bean1102.setInfo("111097人付款");
            bean1102.setName("weiimi/唯米 X3刘海全面屏超薄无边框/128g");
            bean1102.setPrice("$1056.0");
            bean1102.setProduceImageUrl("https://gd2.alicdn.com/imgextra/i1/2314050807/O1CN018VYtlk1Hpe6YsAbWs_!!2314050807.png");
            list.add(bean1102);

        }


        return list;
    }

    //------------------------11页面相关--------------自定义view------------------------------------
    //------------------------12页面相关------------------------------------------------------------
    public static List<RVBean12> getData12() {
        List<RVBean12> list = new ArrayList<>();


        for (int i = 0; i < 500; i++) {
            RVBean12 bean12 = new RVBean12();
            bean12.setProductImageUrl("https://gd2.alicdn.com/imgextra/i2/13914365/O1CN01SfIgQP1i7DJ1TuZYh_!!13914365.jpg");
            bean12.setName("渐变色优购256G全网通正品全面屏人脸识别8G运行内存双卡智能手机");
            bean12.setOriginalPrice("￥1498");
            bean12.setPrice("￥899");
            list.add(bean12);
        }

        return list;
    }

    public static List<RVBean12> getData12Indicator() {
        List<RVBean12> list = new ArrayList<>();
        RVBean12 bean12 = new RVBean12();
        List<String> indicator = new ArrayList<>();
        indicator.add("聚好看购物");
        indicator.add("淘宝购物");
        bean12.setIndicator(indicator);
        bean12.setItemType(RVBean04.TYPE_TWO);
        list.add(bean12);
        return list;
    }

    //------------------------12页面相关------------------------------------------------------------


    //------------------------12页面相关---------------------------自定义view-----------------------
    public static List<RVBean12Single> getData12Single() {
        List<RVBean12Single> list = new ArrayList<>();


        for (int i = 0; i < 500; i++) {
            RVBean12Single bean12 = new RVBean12Single();
            bean12.setProductImageUrl("https://gd2.alicdn.com/imgextra/i2/13914365/O1CN01SfIgQP1i7DJ1TuZYh_!!13914365.jpg");
            bean12.setName("渐变色优购256G全网通正品全面屏人脸识别8G运行内存双卡智能手机");
            bean12.setOriginalPrice("￥1498");
            bean12.setPrice("￥899999");
            list.add(bean12);
        }

        return list;
    }

    public static List<RVBean12Single> getData12IndicatorSingle() {
        List<RVBean12Single> list = new ArrayList<>();
        RVBean12Single bean12 = new RVBean12Single();
        List<String> indicator = new ArrayList<>();
        indicator.add("聚好看购物");
        indicator.add("淘宝购物");
        bean12.setIndicator(indicator);
        bean12.setItemType(RVBean04.TYPE_TWO);
        list.add(bean12);
        return list;
    }


    //------------------------12页面相关-------------------------自定义view-------------------------


    //------------------------18页面相关------------------------------------------------------------
    public static List<RVBean18> getData18() {
        List<RVBean18> list = new ArrayList<>();

        RVBean18 bean18Header = new RVBean18();
        RVBean18item01 rvBean18item01 = new RVBean18item01();
        rvBean18item01.setQrCodeUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000" +
                "&sec=1543898443557&di=243f099bc620b6bf4f1ed0d1144d23c6&imgtype=0&src=http%3A%2F%2" +
                "Fwww.mmgl.net%2FApp_Themes%2Fdefault%2Fimages%2FMMGL_WX.gif");
        rvBean18item01.setPosterUrl("https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/" +
                "baike/s%3D235/sign=79545ef6edfe9925cf0c6e5301a85ee4/3ac79f3df8dcd100f9dcbe127f8b4710b9122f44.jpg");
        rvBean18item01.setMovieContent("在特烦恼之城的西虹市，混迹于丙级业余足球队的守门员王多鱼（沈腾饰），" +
                "因比赛失利被开除离队。正处于人生最低谷的他接受了神秘台湾财团一个月花光十亿资金的挑战。" +
                "本以为快乐生活就此开始，王多鱼却第一次感到“花钱特烦恼”。想要人生反转走上巅峰，真的没有那么简单");
        rvBean18item01.setMovieType("喜剧/故事片");
        rvBean18item01.setReview("9.1");
        rvBean18item01.setMovieName("西虹市首富");
        rvBean18item01.setDataFromResouse(R.drawable.label_taopiaopiao);
        bean18Header.setItemType(RVBean18.TYPE_ONE);
        bean18Header.setBean18item01(rvBean18item01);
        list.add(bean18Header);


        for (int i = 0; i < 10; i++) {
            RVBean18 bean18 = new RVBean18();
            RVBean18item02 bean18item02 = new RVBean18item02();
            bean18item02.setTitle("其他热门线下活动----" + i);
            List<RVBean18item02.ChildItem> childItemList = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                RVBean18item02.ChildItem childItem = new RVBean18item02.ChildItem();
                childItem.setActorName("沈腾");
                childItem.setPortraitUrl("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=4130340616,2938826043&fm=26&gp=0.jpg");
                childItemList.add(childItem);
            }
            bean18item02.setChildItemList(childItemList);

            bean18.setBean18item02(bean18item02);
            bean18.setItemType(RVBean18.TYPE_TWO);
            list.add(bean18);
        }

        return list;
    }

    //------------------------18页面相关------------------------------------------------------------
    //------------------------10页面相关---------------------自定义view-----------------------------
    public static List<RVBean10Single> getData10Single() {
        List<RVBean10Single> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            //------------------------------------------------001-----------------------------------
            RVBean10Single rvBean10Single = new RVBean10Single();
            rvBean10Single.setName("复仇者联盟3：无限战争");
            rvBean10Single.setPosterUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.jpg");
            rvBean10Single.setReview("4.9");
            list.add(rvBean10Single);
            //------------------------------------------------002-----------------------------------
            RVBean10Single rvBean10Single01 = new RVBean10Single();
            rvBean10Single01.setName("反贪风暴3");
            rvBean10Single01.setPosterUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2531887203.jpg");
            rvBean10Single01.setReview("4.8");
            list.add(rvBean10Single01);

            //------------------------------------------------003-----------------------------------
            RVBean10Single rvBean10Single02 = new RVBean10Single();
            rvBean10Single02.setName("老炮儿");
            rvBean10Single02.setPosterUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2292976849.jpg");
            rvBean10Single02.setReview("4.7");
            list.add(rvBean10Single02);

            //------------------------------------------------004-----------------------------------
            RVBean10Single rvBean10Single03 = new RVBean10Single();
            rvBean10Single03.setName("9号秘事 万圣节特别篇");
            rvBean10Single03.setPosterUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2538458306.jpg");
            rvBean10Single03.setReview("4.6");
            list.add(rvBean10Single03);

            //------------------------------------------------005-----------------------------------
            RVBean10Single rvBean10Single04 = new RVBean10Single();
            rvBean10Single04.setName("快把我哥带走");
            rvBean10Single04.setPosterUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2531080870.jpg");
            rvBean10Single04.setReview("4.5");
            list.add(rvBean10Single04);

            //------------------------------------------------006-----------------------------------
            RVBean10Single rvBean10Single05 = new RVBean10Single();
            rvBean10Single05.setName("看不见的客人");
            rvBean10Single05.setPosterUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2498971355.jpg");
            rvBean10Single05.setReview("4.3");
            list.add(rvBean10Single05);

            //------------------------------------------------007-----------------------------------
            RVBean10Single rvBean10Single06 = new RVBean10Single();
            rvBean10Single06.setName("釜山行");
            rvBean10Single06.setPosterUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2360940399.jpg");
            rvBean10Single06.setReview("4.2");
            list.add(rvBean10Single06);

            //------------------------------------------------008-----------------------------------
            RVBean10Single rvBean10Single07 = new RVBean10Single();
            rvBean10Single07.setName("天才枪手");
            rvBean10Single07.setPosterUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2501863104.jpg");
            rvBean10Single07.setReview("4.1");
            list.add(rvBean10Single07);

            //------------------------------------------------009-----------------------------------
            RVBean10Single rvBean10Single08 = new RVBean10Single();
            rvBean10Single08.setName("奇异博士");
            rvBean10Single08.setPosterUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2388501883.jpg");
            rvBean10Single08.setReview("4.0");
            list.add(rvBean10Single08);

            //------------------------------------------------002-----------------------------------
            RVBean10Single rvBean10Single09 = new RVBean10Single();
            rvBean10Single09.setName("怦然心动");
            rvBean10Single09.setPosterUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p663036666.jpg");
            rvBean10Single09.setReview("3.9");
            list.add(rvBean10Single09);


        }


        return list;
    }

    //------------------------10页面相关---------------------自定义view-----------------------------
    //------------------------09页面相关---------------------自定义view-----------------------------
    public static List<RVBean09Single> getData09Single() {

        List<RVBean09Single> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {


            //-------------------------------001----------------------------------------------------
            RVBean09Single bean09 = new RVBean09Single();
            bean09.setItemType(RVBean09Single.TYPE_ONE);
            bean09.setName("成龙");
            bean09.setPortraitUrl("https://gss2.bdstatic.com/9fo3dSag_xI4khGkpoWK1HF6hhy/baike/" +
                    "w%3D268%3Bg%3D0/sign=e174b976ac8b87d65042ac193f334f05/bd315c6034a85edfdfd9f56444540923dd54751b.jpg");
            list.add(bean09);

            //-------------------------------002----------------------------------------------------
            RVBean09Single bean0901 = new RVBean09Single();
            bean0901.setItemType(RVBean09Single.TYPE_ONE);
            bean0901.setName("张嘉译");
            bean0901.setPortraitUrl("http://img4.imgtn.bdimg.com/it/u=1087786611,1657702153&fm=26&gp=0.jpg");
            list.add(bean0901);

            //-------------------------------003----------------------------------------------------
            RVBean09Single bean0902 = new RVBean09Single();
            bean0902.setItemType(RVBean09Single.TYPE_ONE);
            bean0902.setName("何冰");
            bean0902.setPortraitUrl("http://img0.imgtn.bdimg.com/it/u=137488357,3343791359&fm=26&gp=0.jpg");
            list.add(bean0902);

            //-------------------------------004----------------------------------------------------
            RVBean09Single bean0903 = new RVBean09Single();
            bean0903.setItemType(RVBean09Single.TYPE_ONE);
            bean0903.setName("秦海璐");
            bean0903.setPortraitUrl("http://img5.imgtn.bdimg.com/it/u=895367894,480950421&fm=26&gp=0.jpg");
            list.add(bean0903);

            //-------------------------------005----------------------------------------------------
            RVBean09Single bean0904 = new RVBean09Single();
            bean0904.setItemType(RVBean09Single.TYPE_ONE);
            bean0904.setName("刘佩琦");
            bean0904.setPortraitUrl("http://img0.imgtn.bdimg.com/it/u=949228184,961797994&fm=26&gp=0.jpg");
            list.add(bean0904);

            //-------------------------------006----------------------------------------------------
            RVBean09Single bean0905 = new RVBean09Single();
            bean0905.setItemType(RVBean09Single.TYPE_ONE);
            bean0905.setName("李洪涛");
            bean0905.setPortraitUrl("http://img5.imgtn.bdimg.com/it/u=3030200563,4095361682&fm=26&gp=0.jpg");
            list.add(bean0905);

            //-------------------------------007----------------------------------------------------
            RVBean09Single bean0906 = new RVBean09Single();
            bean0906.setItemType(RVBean09Single.TYPE_ONE);
            bean0906.setName("戈治均");
            bean0906.setPortraitUrl("http://www.supcast.cn/Runtime/Home/Thumb/300x400/5b/be/5bbe1374f9de17fbd0cf711b03221bd0.jpg");
            list.add(bean0906);

            //-------------------------------008----------------------------------------------------
            RVBean09Single bean0907 = new RVBean09Single();
            bean0907.setItemType(RVBean09Single.TYPE_ONE);
            bean0907.setName("雷佳音");
            bean0907.setPortraitUrl("http://img3.imgtn.bdimg.com/it/u=860073441,2867052390&fm=26&gp=0.jpg");
            list.add(bean0907);
            //-------------------------------009----------------------------------------------------
            RVBean09Single bean0908 = new RVBean09Single();
            bean0908.setItemType(RVBean09Single.TYPE_ONE);
            bean0908.setName("翟天临");
            bean0908.setPortraitUrl("http://img5.imgtn.bdimg.com/it/u=513601315,4026569036&fm=26&gp=0.jpg");
            list.add(bean0908);

            //-------------------------------010----------------------------------------------------
            RVBean09Single bean0909 = new RVBean09Single();
            bean0909.setItemType(RVBean09Single.TYPE_ONE);
            bean0909.setName("李沁");
            bean0909.setPortraitUrl("http://img4.imgtn.bdimg.com/it/u=186908702,826141868&fm=26&gp=0.jpg");
            list.add(bean0909);


        }
        return list;
    }

    //------------------------09页面相关---------------------自定义view-----------------------------
    //------------------------08页面相关---------------------------自定义view-----------------------
    public static List<RVBean08Single> getData08Single() {
        List<RVBean08Single> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            //----------------------001-------------------------------------------------------------
            RVBean08Single bean01 = new RVBean08Single();
            bean01.setInstallFlag(true);
            bean01.setAppImgUrl("http://file.market.xiaomi.com/thumbnail/PNG/l114/AppStore/015005f7c65b3e98eab3133741c6e85a561430fbe");
            bean01.setName("京东到家");
            list.add(bean01);
            //----------------------002-------------------------------------------------------------
            RVBean08Single bean02 = new RVBean08Single();
            bean02.setInstallFlag(false);
            bean02.setAppImgUrl("http://file.market.xiaomi.com/thumbnail/PNG/l114/AppStore/0460b5843e776737394dacf47478620397c4123a3");
            bean02.setName("好好住");
            list.add(bean02);
            //----------------------003-------------------------------------------------------------
            RVBean08Single bean03 = new RVBean08Single();
            bean03.setInstallFlag(false);
            bean03.setAppImgUrl("http://file.market.xiaomi.com/thumbnail/PNG/l114/AppStore/075cb74eb34644f013b46a72532fb99ec8203245c");
            bean03.setName("茶密");
            list.add(bean03);
            //----------------------004-------------------------------------------------------------
            RVBean08Single bean04 = new RVBean08Single();
            bean04.setInstallFlag(true);
            bean04.setAppImgUrl("http://file.market.xiaomi.com/thumbnail/PNG/l114/AppStore/09c357533cc164a2a0c7bae09750c5020feed8db9");
            bean04.setName("子弹邻居");
            list.add(bean04);
            //----------------------005-------------------------------------------------------------
            RVBean08Single bean05 = new RVBean08Single();
            bean05.setInstallFlag(false);
            bean05.setAppImgUrl("http://t3.market.mi-img.com/thumbnail/jpeg/l750/AppStore/087f1465b3054b7ff3a2d19b0da083642d0419fdb");
            bean05.setName("冬天来了");
            list.add(bean05);
            //----------------------006-------------------------------------------------------------
            RVBean08Single bean06 = new RVBean08Single();
            bean06.setInstallFlag(false);
            bean06.setAppImgUrl("http://t2.market.xiaomi.com/thumbnail/jpeg/l750/AppStore/07d9e590f4086083ebed6a0a8530787bfad4160e3");
            bean06.setName("说唱音乐");
            list.add(bean06);
            //----------------------007-------------------------------------------------------------
            RVBean08Single bean07 = new RVBean08Single();
            bean07.setInstallFlag(false);
            bean07.setAppImgUrl("http://t4.market.mi-img.com/thumbnail/jpeg/l750/AppStore/03f0a5234349677995348981c87a13c2da34234db");
            bean07.setName("一吃就对了");
            list.add(bean07);
            //----------------------008-------------------------------------------------------------
            RVBean08Single bean08 = new RVBean08Single();
            bean08.setInstallFlag(true);
            bean08.setAppImgUrl("http://t5.market.xiaomi.com/thumbnail/jpeg/l750/AppStore/09adeb5f367bf4e973e786d801ffee0d167709308");
            bean08.setName("跑下去");
            list.add(bean08);
            //----------------------009-------------------------------------------------------------
            RVBean08Single bean09 = new RVBean08Single();
            bean09.setInstallFlag(false);
            bean09.setAppImgUrl("http://file.market.xiaomi.com/thumbnail/PNG/l114/AppStore/03139460ee5089a4c4747088bd76bdaa21843c5ac");
            bean09.setName("妈妈帮");
            list.add(bean09);
            //----------------------010-------------------------------------------------------------
            RVBean08Single bean10 = new RVBean08Single();
            bean10.setInstallFlag(false);
            bean10.setAppImgUrl("http://file.market.xiaomi.com/thumbnail/PNG/l114/AppStore/06d3a4f57d2b9389d13b4ec6e3f205627714001f4");
            bean10.setName("录音宝");
            list.add(bean10);
        }


        return list;
    }
    //------------------------08页面相关----------------------------自定义view----------------------
////------------------------08页面相关---------------------------自定义view-----------------------
//    public static List<RVBean08Single> getData08Single() {
//        List<RVBean08Single> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            //----------------------001-------------------------------------------------------------
//            RVBean08Single bean01 = new RVBean08Single();
//            bean01.setInstallFlag(true);
//            bean01.setAppImgUrl("http://file.market.xiaomi.com/thumbnail/PNG/l114/AppStore/015005f7c65b3e98eab3133741c6e85a561430fbe");
//            bean01.setName("京东到家");
//            list.add(bean01);
//            //----------------------002-------------------------------------------------------------
//            RVBean08Single bean02 = new RVBean08Single();
//            bean02.setInstallFlag(false);
//            bean02.setAppImgUrl("http://file.market.xiaomi.com/thumbnail/PNG/l114/AppStore/0460b5843e776737394dacf47478620397c4123a3");
//            bean02.setName("好好住");
//            list.add(bean02);
//            //----------------------003-------------------------------------------------------------
//            RVBean08Single bean03 = new RVBean08Single();
//            bean03.setInstallFlag(false);
//            bean03.setAppImgUrl("http://file.market.xiaomi.com/thumbnail/PNG/l114/AppStore/075cb74eb34644f013b46a72532fb99ec8203245c");
//            bean03.setName("茶密");
//            list.add(bean03);
//            //----------------------004-------------------------------------------------------------
//            RVBean08Single bean04 = new RVBean08Single();
//            bean04.setInstallFlag(true);
//            bean04.setAppImgUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2535365481.jpg");
//            bean04.setName("嗝嗝老师");
//            list.add(bean04);
//            //----------------------005-------------------------------------------------------------
//            RVBean08Single bean05 = new RVBean08Single();
//            bean05.setInstallFlag(false);
//            bean05.setAppImgUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2233971046.jpg");
//            bean05.setName("无间道");
//            list.add(bean05);
//            //----------------------006-------------------------------------------------------------
//            RVBean08Single bean06 = new RVBean08Single();
//            bean06.setInstallFlag(false);
//            bean06.setAppImgUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p479682972.jpg");
//            bean06.setName("楚门的世界");
//            list.add(bean06);
//            //----------------------007-------------------------------------------------------------
//            RVBean08Single bean07 = new RVBean08Single();
//            bean07.setInstallFlag(false);
//            bean07.setAppImgUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1312700744.jpg");
//            bean07.setName("当幸福来敲门");
//            list.add(bean07);
//            //----------------------008-------------------------------------------------------------
//            RVBean08Single bean08 = new RVBean08Single();
//            bean08.setInstallFlag(true);
//            bean08.setAppImgUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2398141939.jpg");
//            bean08.setName("血战钢锯岭");
//            list.add(bean08);
//            //----------------------009-------------------------------------------------------------
//            RVBean08Single bean09 = new RVBean08Single();
//            bean09.setInstallFlag(false);
//            bean09.setAppImgUrl("https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1910824951.jpg");
//            bean09.setName("放牛班的春天");
//            list.add(bean09);
//            //----------------------010-------------------------------------------------------------
//            RVBean08Single bean10 = new RVBean08Single();
//            bean10.setInstallFlag(false);
//            bean10.setAppImgUrl("https://img1.doubanio.com/view/photo/s_ratio_poster/public/p470006658.jpg");
//            bean10.setName("香水");
//            list.add(bean10);
//        }
//
//
//        return list;
//    }
//    //------------------------08页面相关----------------------------自定义view----------------------


}
