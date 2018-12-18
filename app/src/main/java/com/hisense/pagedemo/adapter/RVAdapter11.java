package com.hisense.pagedemo.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.bean.RVBean11;

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
public class RVAdapter11 extends BaseMultiItemQuickAdapter<RVBean11, BaseViewHolder> {


    private boolean isShowPosition=true;

    public RVAdapter11(List<RVBean11> data) {
        super(data);
        addItemType(RVBean11.TYPE_ONE, R.layout.rv_item1101_group);
    }

    @Override
    protected void convert(BaseViewHolder helper, RVBean11 item) {
        switch (helper.getItemViewType()) {

            case RVBean11.TYPE_ONE:

                ImageView imageView=helper.getView(R.id.iv_rvitem_1101_group_portrait);
                Glide.with(imageView).load(item.getProduceImageUrl())
                        .apply(RequestOptions.bitmapTransform(new FitCenter()))
                        .into(imageView);

                ((TextView) (helper.getView(R.id.tv_rvitem_1101_group_free))).setText(item.getFree());
                ((TextView) (helper.getView(R.id.tv_rvitem_1101_group_goodsname))).setText(item.getName());
                ((TextView) (helper.getView(R.id.tv_rvitem_1101_group_price))).setText(item.getPrice());
                ((TextView) (helper.getView(R.id.tv_rvitem_1101_group_shoppinginfo))).setText(item.getInfo());
                ((TextView) (helper.getView(R.id.tv_rvitem_1101_group_type))).setText(item.getType());



                if (isShowPosition) {
                    ((TextView) (helper.getView(R.id.tv_rvitem_1101_group_position)))
                            .setText(("" + (helper.getAdapterPosition()+1)));
                } else {
                    ((TextView) (helper.getView(R.id.tv_rvitem_1101_group_position)))
                            .setText("");
                }
                break;
        }
    }
}
