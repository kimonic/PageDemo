package com.hisense.pagedemo.realdata;

import java.util.List;

/**
 * * ================================================
 * name:            GameBean
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/14
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class GameBean {

    /**
     * searchindex : 0
     * searchurl : http://api-unisearch.hismarttv.com/searchApi/audioSearch/result?pageSize=20&page=1&packageName=com.keylab.speech.core.vidaa&index=0&sequence=1544519447106&license=1015&deviceId=86100300900000100000060a487696de&subscriberId=5786421&customerId=5786421&apiVersion=2017.3.2.2.6.30&appVersionCode=21000115&modelId=1&searchVersion=1.3&textWord=%E6%96%97%E5%9C%B0%E4%B8%BB&isSuperApp=0&keyWord=(objname:%E6%96%97%E5%9C%B0%E4%B8%BB)&searchKey=%E6%96%97%E5%9C%B0%E4%B8%BB&appTypeSelected=3,5
     * searchseq : 1544519447106
     * searchResultList : [{"total":5,"appName":"游戏","data":[{"mediaId":9000015375725,"categoryName":["我的游戏分类"],"slogan":"公平竞技比赛，与人斗其乐无穷","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015375725,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015375725\",\"name\":\"cn.jj.tv\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015375725\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"8.6","finalDownloadCount":"2604345","packageName":"cn.jj.tv","mediaTitle":"JJ斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/150587412993119228.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000015681005.jpg","versionCode":"40801"},{"mediaId":9000015341115,"categoryName":["棋牌游戏"],"slogan":"奖品话费轻松到手","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015341115,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015341115\",\"name\":\"com.youjoy.strugglelandlord\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015341115\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"9.4","finalDownloadCount":"1846277","packageName":"com.youjoy.strugglelandlord","mediaTitle":"有乐斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/147617442326519261.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/2149587187558440.jpg","versionCode":"204"},{"mediaId":9000015310040,"categoryName":["棋牌游戏"],"slogan":"","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015310040,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015310040\",\"name\":\"com.pokercity.lobby\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015310040\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"9.0","finalDownloadCount":"243198","packageName":"com.pokercity.lobby","mediaTitle":"波克斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172299.jpg","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172307.jpg","versionCode":"10012"},{"mediaId":9000015337707,"categoryName":["棋牌游戏"],"slogan":"","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015337707,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015337707\",\"name\":\"com.xm.ddz.haixintv\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015337707\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"8.9","finalDownloadCount":"168135","packageName":"com.xm.ddz.haixintv","mediaTitle":"西米斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/146433925299219844.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172298.jpg","versionCode":"24"},{"mediaId":9000015369589,"categoryName":["棋牌游戏"],"slogan":"斗地主，领红包！","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015369589,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015369589\",\"name\":\"org.cocos2dx.crazyChampion\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015369589\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"9.1","finalDownloadCount":"1400393","packageName":"org.cocos2dx.crazyChampion","mediaTitle":"红包斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/147523139001619663.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172296.jpg","versionCode":"61"}],"tips":["打开腾讯游戏管家","果宝特攻游戏","变形卡车","安装城堡战争"],"appType":3},{"total":5,"appName":"应用","data":[{"mediaId":9000015375725,"slogan":"公平竞技比赛，与人斗其乐无穷","categoryName":["我的游戏分类"],"jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.store.tv\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"android.intent.action.VIEW\",\"type\":\"String\"},{\"key\":\"uri\",\"value\":\"himarket://transferjump?type=0&id=9000015375725&backToMain=false&thirdPackageName=com.ju.unifiedsearch\",\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"4\",\"id\":\"9000015375725\",\"name\":\"cn.jj.tv\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015375725\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"8.6","finalDownloadCount":"2604345","packageName":"cn.jj.tv","mediaTitle":"JJ斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/150587412993119228.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000015681005.jpg","versionCode":"40801","size":"47953929"},{"mediaId":9000015341115,"slogan":"奖品话费轻松到手","categoryName":["棋牌游戏"],"jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.store.tv\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"android.intent.action.VIEW\",\"type\":\"String\"},{\"key\":\"uri\",\"value\":\"himarket://transferjump?type=0&id=9000015341115&backToMain=false&thirdPackageName=com.ju.unifiedsearch\",\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"4\",\"id\":\"9000015341115\",\"name\":\"com.youjoy.strugglelandlord\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015341115\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"9.4","finalDownloadCount":"1846277","packageName":"com.youjoy.strugglelandlord","mediaTitle":"有乐斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/147617442326519261.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/2149587187558440.jpg","versionCode":"204","size":"43036087"},{"mediaId":9000015310040,"slogan":"","categoryName":["棋牌游戏"],"jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.store.tv\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"android.intent.action.VIEW\",\"type\":\"String\"},{\"key\":\"uri\",\"value\":\"himarket://transferjump?type=0&id=9000015310040&backToMain=false&thirdPackageName=com.ju.unifiedsearch\",\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"4\",\"id\":\"9000015310040\",\"name\":\"com.pokercity.lobby\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015310040\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"9.0","finalDownloadCount":"243198","packageName":"com.pokercity.lobby","mediaTitle":"波克斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172299.jpg","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172307.jpg","versionCode":"10012","size":"30573745"},{"mediaId":9000015337707,"slogan":"","categoryName":["棋牌游戏"],"jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.store.tv\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"android.intent.action.VIEW\",\"type\":\"String\"},{\"key\":\"uri\",\"value\":\"himarket://transferjump?type=0&id=9000015337707&backToMain=false&thirdPackageName=com.ju.unifiedsearch\",\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"4\",\"id\":\"9000015337707\",\"name\":\"com.xm.ddz.haixintv\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015337707\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"8.9","finalDownloadCount":"168135","packageName":"com.xm.ddz.haixintv","mediaTitle":"西米斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/146433925299219844.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172298.jpg","versionCode":"24","size":"36611313"},{"mediaId":9000015369589,"slogan":"斗地主，领红包！","categoryName":["棋牌游戏"],"jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.store.tv\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"android.intent.action.VIEW\",\"type\":\"String\"},{\"key\":\"uri\",\"value\":\"himarket://transferjump?type=0&id=9000015369589&backToMain=false&thirdPackageName=com.ju.unifiedsearch\",\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"4\",\"id\":\"9000015369589\",\"name\":\"org.cocos2dx.crazyChampion\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015369589\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"9.1","finalDownloadCount":"1400393","packageName":"org.cocos2dx.crazyChampion","mediaTitle":"红包斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/147523139001619663.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172296.jpg","versionCode":"61","size":"39432508"}],"tips":["热门应用","打开天籁K歌","鼠标操控的软件","退出悟空识字"],"appType":5}]
     */

    private String searchindex;
    private String searchurl;
    private String searchseq;
    private List<SearchResultListBean> searchResultList;

    public String getSearchindex() {
        return searchindex;
    }

    public void setSearchindex(String searchindex) {
        this.searchindex = searchindex;
    }

    public String getSearchurl() {
        return searchurl;
    }

    public void setSearchurl(String searchurl) {
        this.searchurl = searchurl;
    }

    public String getSearchseq() {
        return searchseq;
    }

    public void setSearchseq(String searchseq) {
        this.searchseq = searchseq;
    }

    public List<SearchResultListBean> getSearchResultList() {
        return searchResultList;
    }

    public void setSearchResultList(List<SearchResultListBean> searchResultList) {
        this.searchResultList = searchResultList;
    }

    public static class SearchResultListBean {
        /**
         * total : 5
         * appName : 游戏
         * data : [{"mediaId":9000015375725,"categoryName":["我的游戏分类"],"slogan":"公平竞技比赛，与人斗其乐无穷","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015375725,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015375725\",\"name\":\"cn.jj.tv\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015375725\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"8.6","finalDownloadCount":"2604345","packageName":"cn.jj.tv","mediaTitle":"JJ斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/150587412993119228.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000015681005.jpg","versionCode":"40801"},{"mediaId":9000015341115,"categoryName":["棋牌游戏"],"slogan":"奖品话费轻松到手","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015341115,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015341115\",\"name\":\"com.youjoy.strugglelandlord\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015341115\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"9.4","finalDownloadCount":"1846277","packageName":"com.youjoy.strugglelandlord","mediaTitle":"有乐斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/147617442326519261.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/2149587187558440.jpg","versionCode":"204"},{"mediaId":9000015310040,"categoryName":["棋牌游戏"],"slogan":"","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015310040,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015310040\",\"name\":\"com.pokercity.lobby\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015310040\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"9.0","finalDownloadCount":"243198","packageName":"com.pokercity.lobby","mediaTitle":"波克斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172299.jpg","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172307.jpg","versionCode":"10012"},{"mediaId":9000015337707,"categoryName":["棋牌游戏"],"slogan":"","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015337707,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015337707\",\"name\":\"com.xm.ddz.haixintv\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015337707\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"8.9","finalDownloadCount":"168135","packageName":"com.xm.ddz.haixintv","mediaTitle":"西米斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/146433925299219844.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172298.jpg","versionCode":"24"},{"mediaId":9000015369589,"categoryName":["棋牌游戏"],"slogan":"斗地主，领红包！","jumpParams":"{\"startupType\":4,\"startupUrl\":[{\"key\":\"startupType\",\"value\":1,\"type\":\"int\"},{\"key\":\"packageName\",\"value\":\"com.hisense.tv.gamecenter\",\"type\":\"String\"},{\"key\":\"action\",\"value\":\"com.hisense.tv.gamecenter.start\",\"type\":\"String\"},{\"key\":\"className\",\"value\":\"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity\",\"type\":\"String\"},{\"key\":\"gamecenterParam\",\"value\":{\"objecttype\":0,\"id\":9000015369589,\"sourcePackageName\":\"com.ju.unifiedsearch\",\"backToMain\":false},\"type\":\"String\"},{\"key\":\"superAppParam\",\"value\":{\"productCode\":\"5\",\"id\":\"9000015369589\",\"name\":\"org.cocos2dx.crazyChampion\",\"typeCode\":\"4001\",\"subTypeCode\":\"9000015369589\",\"packageVipId\":\"\",\"albumType\":\"\"},\"type\":\"String\"}]}","rate":"9.1","finalDownloadCount":"1400393","packageName":"org.cocos2dx.crazyChampion","mediaTitle":"红包斗地主","appPoster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/147523139001619663.png","poster":"https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000019172296.jpg","versionCode":"61"}]
         * tips : ["打开腾讯游戏管家","果宝特攻游戏","变形卡车","安装城堡战争"]
         * appType : 3
         */

        private int total;
        private String appName;
        private int appType;
        private List<DataBean> data;
        private List<String> tips;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public int getAppType() {
            return appType;
        }

        public void setAppType(int appType) {
            this.appType = appType;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public List<String> getTips() {
            return tips;
        }

        public void setTips(List<String> tips) {
            this.tips = tips;
        }

        public static class DataBean {
            /**
             * mediaId : 9000015375725
             * categoryName : ["我的游戏分类"]
             * slogan : 公平竞技比赛，与人斗其乐无穷
             * jumpParams : {"startupType":4,"startupUrl":[{"key":"startupType","value":1,"type":"int"},{"key":"packageName","value":"com.hisense.tv.gamecenter","type":"String"},{"key":"action","value":"com.hisense.tv.gamecenter.start","type":"String"},{"key":"className","value":"com.hisense.tv.gamecenter.ThirdPartnerEntryActivity","type":"String"},{"key":"gamecenterParam","value":{"objecttype":0,"id":9000015375725,"sourcePackageName":"com.ju.unifiedsearch","backToMain":false},"type":"String"},{"key":"superAppParam","value":{"productCode":"5","id":"9000015375725","name":"cn.jj.tv","typeCode":"4001","subTypeCode":"9000015375725","packageVipId":"","albumType":""},"type":"String"}]}
             * rate : 8.6
             * finalDownloadCount : 2604345
             * packageName : cn.jj.tv
             * mediaTitle : JJ斗地主
             * appPoster : https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/150587412993119228.png
             * poster : https://pic-appstore.hismarttv.com/epgdata/ApplicationPicture/9000015681005.jpg
             * versionCode : 40801
             */

            private long mediaId;
            private String slogan;
            private String jumpParams;
            private String rate;
            private String finalDownloadCount;
            private String packageName;
            private String mediaTitle;
            private String appPoster;
            private String poster;
            private String versionCode;
            private List<String> categoryName;

            public long getMediaId() {
                return mediaId;
            }

            public void setMediaId(long mediaId) {
                this.mediaId = mediaId;
            }

            public String getSlogan() {
                return slogan;
            }

            public void setSlogan(String slogan) {
                this.slogan = slogan;
            }

            public String getJumpParams() {
                return jumpParams;
            }

            public void setJumpParams(String jumpParams) {
                this.jumpParams = jumpParams;
            }

            public String getRate() {
                return rate;
            }

            public void setRate(String rate) {
                this.rate = rate;
            }

            public String getFinalDownloadCount() {
                return finalDownloadCount;
            }

            public void setFinalDownloadCount(String finalDownloadCount) {
                this.finalDownloadCount = finalDownloadCount;
            }

            public String getPackageName() {
                return packageName;
            }

            public void setPackageName(String packageName) {
                this.packageName = packageName;
            }

            public String getMediaTitle() {
                return mediaTitle;
            }

            public void setMediaTitle(String mediaTitle) {
                this.mediaTitle = mediaTitle;
            }

            public String getAppPoster() {
                return appPoster;
            }

            public void setAppPoster(String appPoster) {
                this.appPoster = appPoster;
            }

            public String getPoster() {
                return poster;
            }

            public void setPoster(String poster) {
                this.poster = poster;
            }

            public String getVersionCode() {
                return versionCode;
            }

            public void setVersionCode(String versionCode) {
                this.versionCode = versionCode;
            }

            public List<String> getCategoryName() {
                return categoryName;
            }

            public void setCategoryName(List<String> categoryName) {
                this.categoryName = categoryName;
            }
        }
    }
}
