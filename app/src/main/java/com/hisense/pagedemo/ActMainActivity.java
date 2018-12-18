package com.hisense.pagedemo;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.hisense.pagedemo.adapter.RVAdapter04;
import com.hisense.pagedemo.adapter.RVAdapter04Group;
import com.hisense.pagedemo.adapter.RVAdapter05;
import com.hisense.pagedemo.adapter.RVAdapter05Group;
import com.hisense.pagedemo.adapter.RVAdapter07;
import com.hisense.pagedemo.adapter.RVAdapter08;
import com.hisense.pagedemo.adapter.RVAdapter08Single;
import com.hisense.pagedemo.adapter.RVAdapter09;
import com.hisense.pagedemo.adapter.RVAdapter09Single;
import com.hisense.pagedemo.adapter.RVAdapter10;
import com.hisense.pagedemo.adapter.RVAdapter10Single;
import com.hisense.pagedemo.adapter.RVAdapter11;
import com.hisense.pagedemo.adapter.RVAdapter11Single;
import com.hisense.pagedemo.adapter.RVAdapter12;
import com.hisense.pagedemo.adapter.RVAdapter12Single;
import com.hisense.pagedemo.adapter.RVAdapter18;
import com.hisense.pagedemo.bean.FalseData;
import com.hisense.pagedemo.bean.RVBean04;
import com.hisense.pagedemo.bean.RVBean05;
import com.hisense.pagedemo.bean.RVBean05Group;
import com.hisense.pagedemo.bean.RVBean07;
import com.hisense.pagedemo.bean.RVBean08;
import com.hisense.pagedemo.bean.RVBean08Single;
import com.hisense.pagedemo.bean.RVBean09;
import com.hisense.pagedemo.bean.RVBean09Single;
import com.hisense.pagedemo.bean.RVBean10;
import com.hisense.pagedemo.bean.RVBean10Single;
import com.hisense.pagedemo.bean.RVBean11;
import com.hisense.pagedemo.bean.RVBean11Single;
import com.hisense.pagedemo.bean.RVBean12;
import com.hisense.pagedemo.bean.RVBean12Single;
import com.hisense.pagedemo.bean.RVBean18;
import com.hisense.pagedemo.handlefocus.HandleFocus04;
import com.hisense.pagedemo.handlefocus.HandleFocus10;
import com.hisense.pagedemo.handlefocus.HandleFocus10Single;
import com.hisense.pagedemo.handlefocus.HandleFocus11;
import com.hisense.pagedemo.handlefocus.HandleFocus12;
import com.hisense.pagedemo.handlefocus.handle18.HandleFocus18;
import com.hisense.pagedemo.ui.item.IndicatorView;
import com.hisense.pagedemo.ui.item.MovieInfoView;
import com.hisense.pagedemo.ui.item.MoviePosterView;
import com.hisense.pagedemo.ui.PageRecyclerView;
import com.hisense.pagedemo.ui.item.RecommendImageView;
import com.hisense.pagedemo.ui.SelectConstraintLayout;
import com.hisense.pagedemo.ui.TempTextView;

import java.util.ArrayList;
import java.util.List;

public class ActMainActivity extends AppCompatActivity implements View.OnKeyListener {
    private PageRecyclerView recyclerView;

    private TempTextView tempTextView1, tempTextView2, tempTextView3, tempTextView4, tempTextView5, tempTextView6,
            tempTextView7, tempTextView8, tempTextView9, tempTextView10, tempTextView11, tempTextView12, tempTextView13, tempTextView14, tempTextView15, tempTextView16, tempTextView17, tempTextView18, tempTextView19, tempTextView20;

    private Group group;

    private List<List> listCollection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        listCollection = new ArrayList<>();
        initView();
        initRecyclerView();
    }


    //------------------------04页面列表相关------------------------------start------------------------------
    /**
     * 上一个有焦点的 tab
     */
    private IndicatorView lastIndicaorView;
    private int lastIndicaorViewPosition = -1;
    private List<RVBean04> list;
    private RVAdapter04 adapter04;

    private void initRecyclerView() {
        list = new ArrayList<>();
        listCollection.add(list);
        list.addAll(FalseData.getData04Header());
        list.addAll(FalseData.getData04());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter04 = new RVAdapter04(list);
        recyclerView.setAdapter(adapter04);
        // TODO: 2018/12/4 ---------------------04页---------使用控件显示---------------------------
//        focusLogic();
        HandleFocus04 handleFocus04 = new HandleFocus04(recyclerView, adapter04, list);
        handleFocus04.handleFocus();
        // TODO: 2018/12/4 ---------------------04页---------使用控件显示---------------------------


        adapter04.setListener(new RVAdapter04.FocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if ((v instanceof IndicatorView) && hasFocus) {
                    int position = ((IndicatorView) v).getPositionInParent();
                    if (lastIndicaorViewPosition != position) {
                        switch (position) {
                            case 0:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList = FalseData.getData04();
                                list.addAll(tempList);
                                notifyData(adapter04,tempList.size());
//                                adapter04.notifyItemRangeChanged(2, tempList.size());
                                break;
                            case 1:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList1 = FalseData.getData04Movie();
                                list.addAll(tempList1);
                                notifyData(adapter04,tempList1.size());
//                                adapter04.notifyItemRangeChanged(2, tempList1.size());
                                break;
                            case 2:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList2 = FalseData.getData04Tv();
                                list.addAll(tempList2);
                                notifyData(adapter04,tempList2.size());
//                                adapter04.notifyItemRangeChanged(2, tempList2.size());
                                break;
                            case 3:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList3 = FalseData.getData04Variety();
                                list.addAll(tempList3);
                                notifyData(adapter04,tempList3.size());
//                                adapter04.notifyItemRangeChanged(2, tempList3.size());
                                break;
                            case 4:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList4 = FalseData.getData04VocalConcert();
                                list.addAll(tempList4);
                                notifyData(adapter04,tempList4.size());
                                break;
                        }
                    }

                }
            }
        });

        //屏蔽刷新动画
        ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    private Handler handler = new Handler(Looper.getMainLooper());

    private void notifyData(final RecyclerView.Adapter adapter, final int size) {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                adapter.notifyItemRangeChanged(2, size);

            }
        }, 1000);
    }

    /**
     * 设置焦点逻辑
     */
    private void focusLogic() {
        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {
                if (focused instanceof MovieInfoView) {
//                    final int position = recyclerView.getChildAdapterPosition((View) focused.getParent());
//                    switch (direction) {
//                        case View.FOCUS_LEFT:
//                            if (position > 2) {
//                                recyclerView.mFocusSearch(focused, View.FOCUS_UP);
//                                return adapter04.getViewByPosition(recyclerView, position - 1, R.id.miv_rvitem_0402);
//                            }
//                            break;
//                        case View.FOCUS_RIGHT:
//                            if (position + 1 < adapter04.getItemCount()) {
//                                recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
//                                return adapter04.getViewByPosition(recyclerView, position + 1, R.id.miv_rvitem_0402);
//                            } else {
//                                return null;
//                            }
//                        case View.FOCUS_DOWN:
//                            if (nextFocused == null) {
//                                View downView = recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
//                                if (position + 5 < adapter04.getItemCount()) {
//                                    return adapter04.getViewByPosition(recyclerView, position + 5, R.id.miv_rvitem_0402);
//                                } else {
//                                    return downView;
//                                }
//                            }
//                            break;
//                        case View.FOCUS_UP:
//                            if (nextFocused == null) {
//                                View upView = recyclerView.mFocusSearch(focused, View.FOCUS_UP);
//                                if (upView instanceof MovieInfoView) {
//                                    return adapter04.getViewByPosition(recyclerView, position - 5, R.id.miv_rvitem_0402);
//                                }
//                            } else if (nextFocused instanceof MovieInfoView) {
//                                return adapter04.getViewByPosition(recyclerView, position - 5, R.id.miv_rvitem_0402);
//                            }
//                            break;
//                    }
                    View view = defineOrder(direction, focused, nextFocused, adapter04, R.id.miv_rvitem_0402);
                    if (focused != view) {
                        return view;
                    }
                }
                if (focused instanceof IndicatorView) {
                    lastIndicaorViewPosition = ((IndicatorView) focused).getPositionInParent();
                }
                if ((focused instanceof IndicatorView) && !(nextFocused instanceof IndicatorView)) {
                    lastIndicaorView = (IndicatorView) focused;
//                    lastIndicaorViewPosition = ((IndicatorView) focused).getPositionInParent();
                    lastIndicaorView.setEnableFocusInvalidate(false);
                }
                if (!(focused instanceof IndicatorView) && (nextFocused instanceof IndicatorView) && lastIndicaorViewPosition != -1) {
                    return ((LinearLayout) (nextFocused.getParent())).getChildAt(lastIndicaorViewPosition);
                } else if (lastIndicaorViewPosition == -1 && (nextFocused instanceof IndicatorView)) {
                    lastIndicaorViewPosition = 0;
                    return ((LinearLayout) (nextFocused.getParent())).getChildAt(0);
                }
                if (nextFocused instanceof LinearLayout) {
                    return ((LinearLayout) nextFocused).getChildAt(lastIndicaorViewPosition);
                }

                if ((focused instanceof IndicatorView) && (nextFocused instanceof MovieInfoView)) {
                    return adapter04.getViewByPosition(recyclerView, 2, R.id.miv_rvitem_0402);
                }
                return nextFocused;
            }
        });
    }


    /**
     * 移除list集合中指定位置之后的多余元素
     */
    public void removeListDataFromPosition(List list, int position) {
        while (list.size() > position) {
            list.remove(list.size() - 1);
        }
    }
    //------------------------04页面列表相关----------------------------------end--------------------------


    //------------------------04页面列表相关Group----------------------------------start------------------------

    private RVAdapter04Group adapter04Group;

    private void initRecyclerViewGroup() {
        list = new ArrayList<>();
        listCollection.add(list);
        list.addAll(FalseData.getData04Header());
        list.addAll(FalseData.getData04());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter04Group = new RVAdapter04Group(list);
        recyclerView.setAdapter(adapter04Group);


        adapter04Group.setListener(new RVAdapter04Group.FocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if ((v instanceof IndicatorView) && hasFocus) {
                    int position = ((IndicatorView) v).getPositionInParent();
                    if (lastIndicaorViewPosition != position) {
                        switch (position) {
                            case 0:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList = FalseData.getData04();
                                list.addAll(tempList);
                                notifyData(adapter04Group,tempList.size());
//                                adapter04Group.notifyItemRangeChanged(2, tempList.size());
                                break;
                            case 1:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList1 = FalseData.getData04Movie();
                                list.addAll(tempList1);
                                notifyData(adapter04Group,tempList1.size());
//                                adapter04Group.notifyItemRangeChanged(2, tempList1.size());
                                break;
                            case 2:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList2 = FalseData.getData04Tv();
                                list.addAll(tempList2);
                                notifyData(adapter04Group,tempList2.size());
//                                adapter04Group.notifyItemRangeChanged(2, tempList2.size());
                                break;
                            case 3:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList3 = FalseData.getData04Variety();
                                list.addAll(tempList3);
                                notifyData(adapter04Group,tempList3.size());
//                                adapter04Group.notifyItemRangeChanged(2, tempList3.size());
                                break;
                            case 4:
                                removeListDataFromPosition(list, 2);
                                List<RVBean04> tempList4 = FalseData.getData04VocalConcert();
                                list.addAll(tempList4);
                                notifyData(adapter04Group,tempList4.size());
//                                adapter04Group.notifyItemRangeChanged(2, tempList4.size());
                                break;
                        }
                    }

                }
            }
        });

        //屏蔽刷新动画
        ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    //------------------------04页面列表相关Group----------------------------------end--------------------------


    //------------------------0506页面列表相关----------------------------------start--------------------------
    private List<RVBean05> bean05List;
    private RVAdapter05 adapter05;

    public void initRecyclerView05() {
        recyclerView.setFocusSearchListener(null);
        bean05List = new ArrayList<>();
        listCollection.add(bean05List);
        bean05List.addAll(FalseData.getData05());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter05 = new RVAdapter05(bean05List);
        recyclerView.setAdapter(adapter05);
        focusLogic05();

    }

    public void focusLogic05() {
        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {

                if (focused instanceof MovieInfoView) {
                    if (direction == View.FOCUS_LEFT && recyclerView.getChildAdapterPosition((View) focused.getParent()) == 1) {
                        recyclerView.mFocusSearch(focused, View.FOCUS_UP);
                        return adapter05.getViewByPosition(recyclerView, 0, R.id.riv_rvheader_05);
                    }
                    View view = defineOrder(direction, focused, nextFocused, adapter05, R.id.miv_rvitem_0501);
                    if (focused != view) {
                        return view;
                    }
                }
                if ((focused instanceof RecommendImageView)) {
                    if (direction == View.FOCUS_DOWN || direction == View.FOCUS_RIGHT) {
                        return adapter05.getViewByPosition(recyclerView, 1, R.id.miv_rvitem_0501);
                    } else if (direction == View.FOCUS_LEFT) {
                        return recyclerView.mFocusSearch(focused, View.FOCUS_UP);
                    }
                }
                return nextFocused;
            }
        });
    }
    //------------------------0506页面列表相关--------------------------------end-------------------
    //------------------------0506页面列表相关----------------group----------------end--------------

    private List<RVBean05Group> bean05GroupList;
    private RVAdapter05Group adapter05Group;

    public void initRecyclerView05Group() {
        recyclerView.setFocusSearchListener(null);
        bean05GroupList = new ArrayList<>();
        listCollection.add(bean05GroupList);
        bean05GroupList.addAll(FalseData.getData05Group());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter05Group = new RVAdapter05Group(bean05GroupList);
        recyclerView.setAdapter(adapter05Group);

    }
    //------------------------0506页面列表相关----------------group----------------end--------------


    

    //------------------------07页面列表相关-------------------------------------start--------------
    private List<RVBean07> bean07List;
    private RVAdapter07 adapter07;

    public void initRecyclerView07() {
        list.clear();
        recyclerView.setFocusSearchListener(null);
        bean07List = new ArrayList<>();
        listCollection.add(bean07List);
        bean07List.addAll(FalseData.getData07());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter07 = new RVAdapter07(bean07List);
        recyclerView.setAdapter(adapter07);
        focusLogic07();

    }

    public void focusLogic07() {
        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {

                if (focused instanceof MovieInfoView) {
                    if (direction == View.FOCUS_LEFT && recyclerView.getChildAdapterPosition((View) focused.getParent()) == 1) {
                        recyclerView.mFocusSearch(focused, View.FOCUS_UP);
                        return null;
                    }
                    View view = defineOrder(direction, focused, nextFocused, adapter07, R.id.miv_rvitem_0701);
                    if (focused != view) {
                        return view;
                    }
                }
                if ((focused instanceof RecommendImageView)) {
                    int id = focused.getId();
                    if ((direction == View.FOCUS_DOWN || direction == View.FOCUS_RIGHT)
                            && (id == R.id.riv_rvheader_0702)) {
                        return adapter07.getViewByPosition(recyclerView, 1, R.id.miv_rvitem_0701);
                    } else if (direction == View.FOCUS_LEFT && id == R.id.riv_rvheader_0702) {
                        return ((ViewGroup) (focused.getParent())).getChildAt(0);
                    }
                }
                return nextFocused;
            }
        });
    }
    //------------------------07页面列表相关------------------------------------end------------------------


    //------------------------08页面列表相关---------------------------------start---------------------------
    private List<RVBean08> bean08List;
    private RVAdapter08 adapter08;

    public void initRecyclerView08() {
        recyclerView.setFocusSearchListener(null);
        bean08List = new ArrayList<>();
        listCollection.add(bean08List);
        bean08List.addAll(FalseData.getData08());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter08 = new RVAdapter08(bean08List);
        recyclerView.setAdapter(adapter08);
        focusLogic08();

    }

    private int lastPositionPage08 = -1;
    private int count = 0;

    private void focusLogic08() {

        recyclerView.setFocusSearchListener(new PageRecyclerView.FocusSearchListener() {
            @Override
            public View focusSearch(View focused, View nextFocused, int direction) {
                if (focused instanceof SelectConstraintLayout) {
                    int position = recyclerView.getChildAdapterPosition(focused);
//                    if (!flag){
//                        if (position + 5*loneKeyDownCount < adapter08.getItemCount()){
//                            Log.e("Tag","当前位置------------------"+(position + 5*loneKeyDownCount));
//                            recyclerView.smoothScrollToPosition(position+5*loneKeyDownCount);
//                            adapter08.getViewByPosition(recyclerView,position+5*loneKeyDownCount,R.id.scl_rvitem_0801_group).requestFocus();
//                            return null;
//                        }else if (position - 5*loneKeyDownCount>0){
//                            recyclerView.smoothScrollToPosition(position-5*loneKeyDownCount);
//                            adapter08.getViewByPosition(recyclerView,position-5*loneKeyDownCount,R.id.scl_rvitem_0801_group).requestFocus();
//                            return null;
//                        }
//                    }
                    lastPositionPage08 = position;
                    switch (direction) {
                        case View.FOCUS_LEFT:
                            if (position - 1 > -1) {
                                View leftView = adapter08.getViewByPosition(recyclerView, position - 1, R.id.scl_rvitem_0801_group);
                                if (leftView != null) {
                                    return leftView;
                                } else {
                                    recyclerView.mFocusSearch(focused, View.FOCUS_UP);
                                    return adapter08.getViewByPosition(recyclerView, position - 1, R.id.scl_rvitem_0801_group);
                                }
                            } else {
                                return nextFocused;
                            }
//                            break;
                        case View.FOCUS_RIGHT:
                            if (position + 1 < adapter08.getItemCount()) {
                                View rightView = adapter08.getViewByPosition(recyclerView, position + 1, R.id.scl_rvitem_0801_group);
                                if (rightView != null) {
                                    return rightView;
                                } else {
                                    recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
                                    return adapter08.getViewByPosition(recyclerView, position + 1, R.id.scl_rvitem_0801_group);
                                }

                            } else {
                                return null;
                            }
//                            break;
                        case View.FOCUS_DOWN:
                            if (position + 5 < adapter08.getItemCount()) {
                                View downView = adapter08.getViewByPosition(recyclerView, position + 5, R.id.scl_rvitem_0801_group);
                                if (downView != null) {
                                    return downView;
                                } else {
                                    recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
                                    return adapter08.getViewByPosition(recyclerView, position + 5, R.id.scl_rvitem_0801_group);
                                }
                            } else {
                                return null;
                            }
//                            break;
                        case View.FOCUS_UP:
                            if (position - 5 > -1) {
                                View upView = adapter08.getViewByPosition(recyclerView, position - 5, R.id.scl_rvitem_0801_group);
                                if (upView != null) {
                                    return upView;
                                } else {
                                    recyclerView.mFocusSearch(focused, View.FOCUS_UP);
                                    return adapter08.getViewByPosition(recyclerView, position - 5, R.id.scl_rvitem_0801_group);
                                }

                            } else {
                                return nextFocused;
                            }
//                            break;
                    }
                }
//                return null;
                return nextFocused;
            }
        });


    }
    //------------------------08页面列表相关--------------------------------end---------------------
    //------------------------08页面列表相关---------------自定义view-----------------start---------
    private List<RVBean08Single> bean08SingleList;
    private RVAdapter08Single adapter08Single;

    public void initRecyclerView08Single() {
        recyclerView.setFocusSearchListener(null);
        bean08SingleList = new ArrayList<>();
        listCollection.add(bean08SingleList);
        bean08SingleList.addAll(FalseData.getData08Single());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter08Single = new RVAdapter08Single(bean08SingleList);
        recyclerView.setAdapter(adapter08Single);

    }
    //------------------------08页面列表相关---------------自定义view-----------------end-----------


    //------------------------09页面列表相关----------------------------------start--------------------------
    private List<RVBean09> bean09List;
    private RVAdapter09 adapter09;

    public void initRecyclerView09() {
        recyclerView.setFocusSearchListener(null);
        bean09List = new ArrayList<>();
        listCollection.add(bean09List);
        bean09List.addAll(FalseData.getData09());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(7, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter09 = new RVAdapter09(bean09List);
        recyclerView.setAdapter(adapter09);
    }

    //------------------------09页面列表相关-------------------------------end-----------------------------
    //------------------------09页面列表相关------------------------自定义view-------start-----------------------------
    private List<RVBean09Single> bean09SingleList;
    private RVAdapter09Single adapter09Single;

    public void initRecyclerView09Single() {
        recyclerView.setFocusSearchListener(null);
        bean09SingleList = new ArrayList<>();
        listCollection.add(bean09SingleList);
        bean09SingleList.addAll(FalseData.getData09Single());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(7, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter09Single = new RVAdapter09Single(bean09SingleList);
        recyclerView.setAdapter(adapter09Single);
    }
    //------------------------09页面列表相关---------------------自定义view----------end-----------------------------


    //------------------------10页面列表相关----------------------------------start--------------------------
    private List<RVBean10> bean10List;
    private RVAdapter10 adapter10;

    public void initRecyclerView10() {
        recyclerView.setFocusSearchListener(null);
        bean10List = new ArrayList<>();
        listCollection.add(bean10List);
        bean10List.addAll(FalseData.getData10());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(7, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter10 = new RVAdapter10(bean10List);
        recyclerView.setAdapter(adapter10);

        HandleFocus10 handleFocus10=new HandleFocus10(recyclerView,adapter10,bean10List);
        handleFocus10.handleFocus();
    }

    //------------------------10页面列表相关-----------------------------------end-------------------------
    //------------------------10页面列表相关----------------------自定义view-------------start------
    private List<RVBean10Single> bean10SingleList;
    private RVAdapter10Single adapter10Single;

    public void initRecyclerView10Single() {
        recyclerView.setFocusSearchListener(null);
        bean10SingleList = new ArrayList<>();
        listCollection.add(bean10SingleList);
        bean10SingleList.addAll(FalseData.getData10Single());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(7, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter10Single = new RVAdapter10Single(bean10SingleList);
        recyclerView.setAdapter(adapter10Single);

        HandleFocus10Single handleFocus10Single=new HandleFocus10Single(recyclerView,adapter10Single,bean10SingleList);
        handleFocus10Single.handleFocus();


    }

    //------------------------10页面列表相关----------------------自定义view-------------end--------


    //------------------------11页面列表相关-----------------------------------start----------------
    private List<RVBean11Single> bean11SingleList;
    private RVAdapter11Single adapter11Single;

    public void initRecyclerView11Single() {
        recyclerView.setFocusSearchListener(null);
        bean11SingleList = new ArrayList<>();
        listCollection.add(bean11SingleList);
        bean11SingleList.addAll(FalseData.getData11Single());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter11Single = new RVAdapter11Single(bean11SingleList);
        recyclerView.setAdapter(adapter11Single);

    }

    //------------------------11页面列表相关-----------------------------------end------------------
    //------------------------11页面列表相关--------------------------自定义view---------start------

    private List<RVBean11> bean11List;
    private RVAdapter11 adapter11;

    public void initRecyclerView11() {
        recyclerView.setFocusSearchListener(null);
        bean11List = new ArrayList<>();
        listCollection.add(bean11List);
        bean11List.addAll(FalseData.getData11());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter11 = new RVAdapter11(bean11List);
        recyclerView.setAdapter(adapter11);

        HandleFocus11 handleFocus11=new HandleFocus11(recyclerView,adapter11,bean11List);
        handleFocus11.handleFocus();
    }
    
    
    //------------------------11页面列表相关--------------------------自定义view---------end--------


    //------------------------12页面列表相关-----------------------------------start----------------
    private List<RVBean12> bean12List;
    private RVAdapter12 adapter12;

    public void initRecyclerView12() {
        recyclerView.setFocusSearchListener(null);
        bean12List = new ArrayList<>();
        listCollection.add(bean12List);
        bean12List.addAll(FalseData.getData12Indicator());
        bean12List.addAll(FalseData.getData12());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter12 = new RVAdapter12(bean12List);
        recyclerView.setAdapter(adapter12);
        HandleFocus12 handleFocus12=new HandleFocus12(recyclerView,adapter12,bean12List);
        handleFocus12.handleFocus();
    }
    //------------------------12页面列表相关-----------------------------------end------------------
    //------------------------12页面列表相关-----------------------------------自定义view-----------

    private List<RVBean12Single> bean12SingleList;
    private RVAdapter12Single adapter12Single;

    public void initRecyclerView12Single() {
        recyclerView.setFocusSearchListener(null);
        bean12SingleList = new ArrayList<>();
        listCollection.add(bean12SingleList);
        bean12SingleList.addAll(FalseData.getData12IndicatorSingle());
        bean12SingleList.addAll(FalseData.getData12Single());
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter12Single = new RVAdapter12Single(bean12SingleList);
        recyclerView.setAdapter(adapter12Single);
    }
    //------------------------12页面列表相关-----------------------------------自定义view-----------


    //------------------------18页面列表相关-------------------------------------start--------------
    private List<RVBean18> bean18List;
    private RVAdapter18 adapter18;

    public void initRecyclerView18() {
        recyclerView.setFocusSearchListener(null);
        bean18List = new ArrayList<>();
        listCollection.add(bean18List);
        bean18List.addAll(FalseData.getData18());
//        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        adapter18 = new RVAdapter18(bean18List);
        recyclerView.setAdapter(adapter18);
        HandleFocus18 handleFocus18 = new HandleFocus18(recyclerView, adapter18, bean18List);
        handleFocus18.handleFocus();
    }
    //------------------------18页面列表相关-----------------------------------end-------------------------


//----------------------------------测试用,待删除----------------start-----------------------------------

    @Override
    public void onBackPressed() {
        group.setVisibility(View.VISIBLE);
//        super.onBackPressed();
    }

//----------------------------------测试用,待删除---------------end------------------------------------

    /**
     * movieinfoview相关的列表焦点逻辑
     */
    public View defineOrder(int direction, View focused, View nextFocused, BaseMultiItemQuickAdapter adapter
            , int id) {
        final int position = recyclerView.getChildAdapterPosition((View) focused.getParent());
        switch (direction) {
            case View.FOCUS_LEFT:
                if (position > 2) {
                    recyclerView.mFocusSearch(focused, View.FOCUS_UP);
                    return adapter.getViewByPosition(recyclerView, position - 1, id);
                }
                break;
            case View.FOCUS_RIGHT:
                if (position + 1 < adapter.getItemCount()) {
                    recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
                    return adapter.getViewByPosition(recyclerView, position + 1, id);
                } else {
                    return null;
                }
            case View.FOCUS_DOWN:
                if (nextFocused == null) {
                    View downView = recyclerView.mFocusSearch(focused, View.FOCUS_DOWN);
                    if (position + 5 < adapter.getItemCount()) {
                        return adapter.getViewByPosition(recyclerView, position + 5, id);
                    } else {
                        return downView;
                    }
                }
                break;
            case View.FOCUS_UP:
                if (nextFocused == null) {
                    View upView = recyclerView.mFocusSearch(focused, View.FOCUS_UP);
                    if (upView instanceof MovieInfoView) {
                        return adapter.getViewByPosition(recyclerView, position - 5, id);
                    }
                } else if (nextFocused instanceof MovieInfoView) {
                    return adapter.getViewByPosition(recyclerView, position - 5, id);
                }
                break;
        }
        return focused;
    }



    private void initView() {
        recyclerView = findViewById(R.id.prv_act_main);

        tempTextView1 = findViewById(R.id.tv_act_main_1);
        tempTextView2 = findViewById(R.id.tv_act_main_2);
        tempTextView3 = findViewById(R.id.tv_act_main_3);
        tempTextView4 = findViewById(R.id.tv_act_main_4);
        tempTextView5 = findViewById(R.id.tv_act_main_5);
        tempTextView6 = findViewById(R.id.tv_act_main_6);
        tempTextView7 = findViewById(R.id.tv_act_main_7);
        tempTextView8 = findViewById(R.id.tv_act_main_8);
        tempTextView9 = findViewById(R.id.tv_act_main_9);
        tempTextView10 = findViewById(R.id.tv_act_main_10);
        tempTextView11 = findViewById(R.id.tv_act_main_11);
        tempTextView12 = findViewById(R.id.tv_act_main_12);
        tempTextView13 = findViewById(R.id.tv_act_main_13);
        tempTextView14 = findViewById(R.id.tv_act_main_14);
        tempTextView15 = findViewById(R.id.tv_act_main_15);
        tempTextView16 = findViewById(R.id.tv_act_main_16);
        tempTextView17 = findViewById(R.id.tv_act_main_17);
        tempTextView18 = findViewById(R.id.tv_act_main_18);
        tempTextView19 = findViewById(R.id.tv_act_main_19);
        tempTextView20 = findViewById(R.id.tv_act_main_20);
        group = findViewById(R.id.group_act_main);

        tempTextView1.setOnKeyListener(this);
        tempTextView2.setOnKeyListener(this);
        tempTextView3.setOnKeyListener(this);
        tempTextView4.setOnKeyListener(this);
        tempTextView5.setOnKeyListener(this);
        tempTextView6.setOnKeyListener(this);
        tempTextView7.setOnKeyListener(this);
        tempTextView8.setOnKeyListener(this);
        tempTextView9.setOnKeyListener(this);
        tempTextView10.setOnKeyListener(this);
        tempTextView11.setOnKeyListener(this);
        tempTextView12.setOnKeyListener(this);
        tempTextView13.setOnKeyListener(this);
        tempTextView14.setOnKeyListener(this);
        tempTextView15.setOnKeyListener(this);
        tempTextView16.setOnKeyListener(this);
        tempTextView17.setOnKeyListener(this);
        tempTextView18.setOnKeyListener(this);
        tempTextView19.setOnKeyListener(this);
        tempTextView20.setOnKeyListener(this);

    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) {
            switch (v.getId()) {
                case R.id.tv_act_main_1://04
                    lastIndicaorViewPosition = -1;
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (list != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView();
                    break;
                case R.id.tv_act_main_2://05

                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean05List != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView05();
                    break;
                case R.id.tv_act_main_3://06,发送广播
                    sendBrodcast();
//                    for (int i = 0; i < listCollection.size(); i++) {
//                        if (bean05List != listCollection.get(i)) {
//                            clearList(listCollection.get(i));
//                        }
//                    }
//                    initRecyclerView05();
                    break;

                case R.id.tv_act_main_4://07

                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean07List != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView07();
                    break;
                case R.id.tv_act_main_5://08
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean08SingleList != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView08Single();
                    break;
                case R.id.tv_act_main_6://09
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean09List != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView09Single();
                    break;
                case R.id.tv_act_main_7://10
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean10SingleList != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView10Single();
                    break;
                case R.id.tv_act_main_8://11
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean11SingleList != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView11Single();
                    break;
                case R.id.tv_act_main_9://12
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean12SingleList != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView12Single();
                    break;
                case R.id.tv_act_main_10://18
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean18List != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView18();
                    break;

                case R.id.tv_act_main_11://04
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (list != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerViewGroup();
                    break;
                case R.id.tv_act_main_12://05
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean05GroupList != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView05Group();

                    break;
                case R.id.tv_act_main_13://06
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean05GroupList != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView05Group();
                    break;
                case R.id.tv_act_main_14://07
                    break;
                case R.id.tv_act_main_15://08
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean08List != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }

                    initRecyclerView08();
                    break;
                case R.id.tv_act_main_16://09
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean09List != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView09();
                    break;
                case R.id.tv_act_main_17://10页面group
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean10List != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView10();
                    break;
                case R.id.tv_act_main_18://11
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean11List != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView11();
                    break;
                case R.id.tv_act_main_19://12
                    for (int i = 0; i < listCollection.size(); i++) {
                        if (bean12List != listCollection.get(i)) {
                            clearList(listCollection.get(i));
                        }
                    }
                    initRecyclerView12();
                    break;
                case R.id.tv_act_main_20://18
                    //显示当前显示区域内的位置,直接获取recyclerview中的实际子view,位置赋值后刷新
                    Log.e("Tag","当前recyclerviewview中的view数----"+recyclerView.getChildCount());
                    for (int i = 0; i < recyclerView.getChildCount(); i++) {
                        View view=recyclerView.getChildAt(i);
                        if (view instanceof ConstraintLayout){
                            Log.e("Tag","当前recyclerviewview中的view数----"+view);
                            ((MoviePosterView) ((ConstraintLayout) view).getChildAt(0)).setPosition(""+(100+i));
                            Log.e("Tag","当前recyclerviewview中的view数----"
                                    +((MoviePosterView) ((ConstraintLayout) view).getChildAt(0)).getPosition());
                            ((MoviePosterView) ((ConstraintLayout) view).getChildAt(0)).invalidate();
                        }
                    }
                    return false;
            }
            group.setVisibility(View.GONE);
            return true;
        }
        return false;
    }


    private void clearList(List list) {
        if (list != null) {
            list.clear();
        }
    }

    /**发送广播*/
    public void sendBrodcast(){
        Intent intent=new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction("com.action.test.show.test6");
        sendBroadcast(intent);
    }
}
