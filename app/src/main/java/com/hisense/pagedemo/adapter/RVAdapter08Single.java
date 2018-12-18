package com.hisense.pagedemo.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean08Single;
import com.hisense.pagedemo.ui.item.AppInfoView;

import java.util.List;

/**
 * * ================================================
 * name:            RVAdapter05
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：第五个页面的适配器
 * introduce:
 * history：
 * ===================================================
 */
public class RVAdapter08Single extends BaseMultiItemQuickAdapter<RVBean08Single, BaseViewHolder> {


    private boolean isShowPosition = true;

    public RVAdapter08Single(List<RVBean08Single> data) {
        super(data);
        addItemType(RVBean08Single.TYPE_ONE, R.layout.rv_item_0801);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean08Single item) {
        switch (helper.getItemViewType()) {
            case RVBean08Single.TYPE_ONE:
                AppInfoView appInfoView=helper.getView(R.id.aiv_rvitem_0801);

                //-----------------------------电影图片---------------------------------------------
                appInfoView.loadBitmap(item.getAppImgUrl());
                appInfoView.setDownLoadCount(item.getDownLoadCount());
                appInfoView.setAppType(item.getType());

                //--------------------------当前所处位置--------------------------------------------
                if (isShowPosition) {
                    appInfoView.setPosition("" + (helper.getAdapterPosition()+1));
                } else {
                    appInfoView.setPosition("");
                }

                //----------------------------左上角label-------------------------------------------
                appInfoView.setInstallFlag(item.isInstallFlag());
                appInfoView.setInstall(item.getInstallText());


                //--------------------评分--------应用名称--------------------------------------------------
                appInfoView.setReview(item.getReview());
                appInfoView.setName(item.getName());

                break;


        }
    }
}
