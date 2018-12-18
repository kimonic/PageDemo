package com.hisense.pagedemo.ui.clouds;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hisense.pagedemo.R;

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

        switch (type) {
            case JhkType.MOVIEW_LIST:
                movieType();
                break;
            case JhkType.GAME_LIST:
                break;
            case JhkType.ACTOR_LIST:
                break;
            case JhkType.CINEMA_LIST:
                break;
            case JhkType.TAOBAO_LIST:
                break;
            case JhkType.JHK_LIST:
                break;
            case JhkType.MOVIEW_DETAILS:
                break;
        }



    }

    /**初始化电影列表*/
    public void movieType(){
        mManager = new GridLayoutManager(getContext(), 5);
        mRecyclerView.setLayoutManager(mManager);
        pushAdapter(new BaseAdapter(R.layout.rv_item_jhk_actor, movieList));
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
        pushAdapter(new BaseAdapter(R.layout.rv_item_jhk_movie_details_header, movieList));
//        ((MovieListAdapter)peekAdapter()).setBaseAdapterListener(this);
        mRecyclerView.setAdapter(peekAdapter());
    }



    @Override
    public void executeData(String data) {
        super.executeData(data);
    }
}
