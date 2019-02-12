package com.hisense.pagedemo.ui.clouds;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.google.gson.Gson;
import com.hisense.pagedemo.R;
import com.hisense.pagedemo.temp.MovieBean;
import com.hisense.pagedemo.ui.clouds.date1218.BaseAdapter;

import java.util.List;

/**
 * * ================================================
 * name:            JhkView
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/18
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class JhkView extends BaseView {
    public JhkView(Context context) {
        super(context);
    }

    private RecyclerView mRecyclerView;
    private List movieList;


    public interface JhkType {
        int MOVIEW_LIST = 1;
        int GAME_LIST = 2;
        int ACTOR_LIST = 3;
        int CINEMA_LIST = 4;
        int TAOBAO_LIST = 5;
        int JHK_LIST = 6;
        int MOVIEW_DETAILS = 7;
    }

    @Override
    public void onCreate(String data) {
        super.onCreate(data);
        initRecyclerView(data);
    }

    private GridLayoutManager mManager;

    /**
     * 当前显示的recyclerview的类型
     */
    private int type = 1;

    private void initRecyclerView(String data) {
        executeData(data);
        //从数据中获取类型
//        type=data.get()?????

        Log.e("dingzhixin","----gson解析开始----");

        Gson gson=new Gson();
        MovieBean bean= gson.fromJson(data,MovieBean.class);

        Log.e("dingzhixin","----1----"+bean.getTitledata());
        Log.e("dingzhixin","----2----"+bean.getViewtype());
        Log.e("dingzhixin","----3----"+bean.getVocalprint());
        Log.e("dingzhixin","----4----"+bean.getTotal());
        Log.e("dingzhixin","----5----"+bean.getContent().getSearchindex());
        Log.e("dingzhixin","----6----"+bean.getContent().getSearchseq());
        Log.e("dingzhixin","----7----"+bean.getContent().getSearchurl());
        Log.e("dingzhixin","----8----"+bean.getContent().getSearchResultList());
        for (int i = 0; i < bean.getContent().getSearchResultList().size(); i++) {
            Log.e("dingzhixin","----9----"+bean.getContent().getSearchResultList().get(i).getAppName());
            Log.e("dingzhixin","----10----"+bean.getContent().getSearchResultList().get(i).getAppType());
            Log.e("dingzhixin","----11----"+bean.getContent().getSearchResultList().get(i).getObjChildType());
            Log.e("dingzhixin","----12----"+bean.getContent().getSearchResultList().get(i).getTips());
            Log.e("dingzhixin","----13---"+bean.getContent().getSearchResultList().get(i).getTotal());
            List<MovieBean.ContentBean.SearchResultListBean.DataBean> temp
                    =bean.getContent().getSearchResultList().get(i).getData();
            for (int j = 0; j < temp.size(); j++) {
                Log.e("dingzhixin","----201----"+temp.get(j).getCountry());
                Log.e("dingzhixin","----202----"+temp.get(j).getDoubanRate());
                Log.e("dingzhixin","----203----"+temp.get(j).getIsFee());

                Log.e("dingzhixin","----204----"+temp.get(j).getJumpParams());
                Log.e("dingzhixin","----205----"+temp.get(j).getMark());
                Log.e("dingzhixin","----206----"+temp.get(j).getMediaSubTitle());

                Log.e("dingzhixin","----207----"+temp.get(j).getMediaTitle());
                Log.e("dingzhixin","----208----"+temp.get(j).getPoster());
                Log.e("dingzhixin","----209----"+temp.get(j).getPubdate());

                Log.e("dingzhixin","----210----"+temp.get(j).getRate());
                Log.e("dingzhixin","----211----"+temp.get(j).getTimeLength());
                Log.e("dingzhixin","----212----"+temp.get(j).getTotal());

                Log.e("dingzhixin","----213----"+temp.get(j).getVenderId());
                Log.e("dingzhixin","----214----"+temp.get(j).getMediaId());
                Log.e("dingzhixin","----215----"+temp.get(j).getIsBuy());

                Log.e("dingzhixin","----216----"+temp.get(j).getChildCategory());
                Log.e("dingzhixin","----217----"+temp.get(j).getCategoryId());
                Log.e("dingzhixin","----218----"+temp.get(j).getVerticalPoster());

            }
        }
        Log.e("dingzhixin","----gson解析结束----");


        //headerView table条
        View view=LayoutInflater.from(getContext()).inflate(R.layout.rv_item_jhk_header,null,false);

        switch (type) {
            case JhkType.MOVIEW_LIST:
                movieType();
                break;
            case JhkType.GAME_LIST:
                gameType();
                break;
            case JhkType.ACTOR_LIST:
                actorType();
                break;
            case JhkType.CINEMA_LIST:
                cinemaType();
                break;
            case JhkType.TAOBAO_LIST:
                taobaoType();
                break;
            case JhkType.JHK_LIST:
                jhkType();
                break;
            case JhkType.MOVIEW_DETAILS:
                movieDetailsType();
                break;
        }



    }

    /**初始化电影列表*/
    public void movieType(){
        mManager = new GridLayoutManager(getContext(), 5);
        mRecyclerView.setLayoutManager(mManager);
        BaseAdapter adapter=new BaseAdapter(R.layout.rv_item_jhk_actor, movieList);
        pushAdapter(adapter);
//        ((MovieListAdapter)peekAdapter()).setBaseAdapterListener(this);
        mRecyclerView.setAdapter(peekAdapter());
    }
    public void actorType(){
        mManager = new GridLayoutManager(getContext(), 5);
        mRecyclerView.setLayoutManager(mManager);
        pushAdapter(new BaseAdapter(R.layout.rv_item_jhk_actor, movieList));
//        ((MovieListAdapter)peekAdapter()).setBaseAdapterListener(this);
        mRecyclerView.setAdapter(peekAdapter());
    }
    public void gameType(){
        mManager = new GridLayoutManager(getContext(), 5);
        mRecyclerView.setLayoutManager(mManager);
        pushAdapter(new BaseAdapter(R.layout.rv_item_jhk_game, movieList));
//        ((MovieListAdapter)peekAdapter()).setBaseAdapterListener(this);
        mRecyclerView.setAdapter(peekAdapter());
    }
    public void cinemaType(){
        mManager = new GridLayoutManager(getContext(), 5);
        mRecyclerView.setLayoutManager(mManager);
        pushAdapter(new BaseAdapter(R.layout.rv_item_jhk_cinema, movieList));
//        ((MovieListAdapter)peekAdapter()).setBaseAdapterListener(this);
        mRecyclerView.setAdapter(peekAdapter());
    }
    public void taobaoType(){
        mManager = new GridLayoutManager(getContext(), 5);
        mRecyclerView.setLayoutManager(mManager);
        pushAdapter(new BaseAdapter(R.layout.rv_item_jhk_taobao, movieList));
//        ((MovieListAdapter)peekAdapter()).setBaseAdapterListener(this);
        mRecyclerView.setAdapter(peekAdapter());
    }
    public void jhkType(){
        mManager = new GridLayoutManager(getContext(), 5);
        mRecyclerView.setLayoutManager(mManager);
        pushAdapter(new BaseAdapter(R.layout.rv_item_jhk_juhaokan, movieList));
//        ((MovieListAdapter)peekAdapter()).setBaseAdapterListener(this);
        mRecyclerView.setAdapter(peekAdapter());
    }
    public void movieDetailsType(){
        mManager = new GridLayoutManager(getContext(), 5);
        mRecyclerView.setLayoutManager(mManager);
        pushAdapter(new BaseAdapter(R.layout.rv_item_jhk_movie_details_item, movieList));
//        ((MovieListAdapter)peekAdapter()).setBaseAdapterListener(this);
        mRecyclerView.setAdapter(peekAdapter());
    }



    @Override
    public void executeData(String data) {
        super.executeData(data);
    }
}
