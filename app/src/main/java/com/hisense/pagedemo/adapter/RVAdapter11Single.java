package com.hisense.pagedemo.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean11Single;
import com.hisense.pagedemo.ui.item.Shopping11View;

import java.util.List;

/**
 * * ================================================
 * name:            RVAdapter10
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/11/27
 * description：第五个页面的适配器
 * introduce:
 * history：
 * ===================================================
 */
public class RVAdapter11Single extends BaseMultiItemQuickAdapter<RVBean11Single, BaseViewHolder> {


    private boolean isShowPosition=true;

    public RVAdapter11Single(List<RVBean11Single> data) {
        super(data);
        addItemType(RVBean11Single.TYPE_ONE, R.layout.rv_item1101);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean11Single item) {
        switch (helper.getItemViewType()) {

            case RVBean11Single.TYPE_ONE:

                Shopping11View shopping11View=helper.getView(R.id.sv_rvitem_1101);

                shopping11View.setGoodsImgUrl(item.getProduceImageUrl());
                shopping11View.setFreeShipping(item.getFree());
                shopping11View.setTitle(item.getName());
                shopping11View.setPrice(item.getPrice());
                shopping11View.setPaymentCount(item.getInfo());




                if (isShowPosition) {
                    shopping11View.setPosition("" + (helper.getAdapterPosition()+1));
                } else {
                    shopping11View.setPosition("");
                }
                break;
        }
    }
}
