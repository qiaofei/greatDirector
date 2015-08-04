package com.yashili.greatdirector.greatdirector;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private FragmentIndex Fragmentindex;
    private FragmentStar Fragmentstar;
    private FragmentFavorite Fragmentfavorite;
    private FragmentMy Fragmentmy;
    private FragmentSearch Fragmentsearch;

    private RelativeLayout index_layout;
    private RelativeLayout star_layout;
    private RelativeLayout favorite_layout;
    private RelativeLayout my_layout;
    private RelativeLayout search_layout;

    private ImageView index_image;
    private ImageView star_image;
    private ImageView favorite_image;
    private ImageView my_image;
    private ImageView search_image;

    private int whirt = 0xFFFFFFFF;
    private int gray = 0xFF7597B3;
    private int blue =0xFF0AB2FB;
    FragmentManager fManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        fManager = getSupportFragmentManager();
        initViews();
        //默认选择首页
        setChioceItem(0);
    }

    //初始化四个fragment布局
    public void initViews()
    {
        //四个选择按钮的图标
        index_image = (ImageView) findViewById(R.id.index_image);
        star_image = (ImageView) findViewById(R.id.star_image);
        favorite_image = (ImageView) findViewById(R.id.favorite_image);
        my_image = (ImageView) findViewById(R.id.my_image);
        search_image = (ImageView) findViewById(R.id.search_image);

        //四个切换按钮的布局id
        index_layout = (RelativeLayout) findViewById(R.id.index_layout);
        star_layout = (RelativeLayout) findViewById(R.id.star_layout);
        favorite_layout = (RelativeLayout) findViewById(R.id.favorite_layout);
        my_layout = (RelativeLayout) findViewById(R.id.my_layout);
        search_layout = (RelativeLayout) findViewById(R.id.search_layout);
        //设置布局侦听事件
        index_layout.setOnClickListener(this);
        star_layout.setOnClickListener(this);
        favorite_layout.setOnClickListener(this);
        my_layout.setOnClickListener(this);
        search_layout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.index_layout:
                setChioceItem(0);
                break;
            case R.id.star_layout:
                setChioceItem(1);
                break;
            case R.id.favorite_layout:
                setChioceItem(2);
                break;
            case R.id.my_layout:
                setChioceItem(3);
                break;
            case R.id.search_layout:
                setChioceItem(4);
                break;
            default:
                break;
        }

    }

    //主界面fragment布局选择
    public void setChioceItem(int index)
    {
        FragmentTransaction transaction = fManager.beginTransaction();
        clearChioce();
        hideFragments(transaction);
        switch (index) {
            case 0:
                index_image.setImageResource(R.mipmap.index_image);
                //index_layout.setBackgroundResource(R.mipmap.bottom_feed_press);
                if (Fragmentindex == null) {
                    Fragmentindex = new FragmentIndex();
                    Fragmentindex.setContext(this);
                    transaction.add(R.id.content, Fragmentindex);
                } else {
                    transaction.show(Fragmentindex);
                }
                break;

            case 1:
                star_image.setImageResource(R.mipmap.star_image);
                //star_layout.setBackgroundResource(R.mipmap.bottom_my_press);
                if (Fragmentstar == null) {
                    Fragmentstar = new FragmentStar();
                    transaction.add(R.id.content, Fragmentstar);
                } else {
                    transaction.show(Fragmentstar);
                }
                break;

            case 2:
                favorite_image.setImageResource(R.mipmap.favorite_image);
               // favorite_layout.setBackgroundResource(R.mipmap.bottom_hotrank_press);
                if (Fragmentfavorite == null) {
                    Fragmentfavorite = new FragmentFavorite();
                    transaction.add(R.id.content, Fragmentfavorite);
                } else {
                    transaction.show(Fragmentfavorite);
                }
                break;

            case 3:
                my_image.setImageResource(R.mipmap.my_image);
               // my_layout.setBackgroundResource(R.mipmap.bottom_my_press);
                if (Fragmentmy == null) {
                    Fragmentmy = new FragmentMy();
                    transaction.add(R.id.content, Fragmentmy);
                } else {
                    transaction.show(Fragmentmy);
                }
                break;

            case 4:
                search_image.setImageResource(R.mipmap.sear_image);
                // my_layout.setBackgroundResource(R.mipmap.bottom_my_press);
                if (Fragmentsearch == null) {
                    Fragmentsearch = new FragmentSearch();
                    transaction.add(R.id.content, Fragmentsearch);
                } else {
                    transaction.show(Fragmentsearch);
                }
                break;
        }
        transaction.commit();
    }

    private void hideFragments(FragmentTransaction transaction) {
        if (Fragmentindex != null) {
            transaction.hide(Fragmentindex);
        }
        if (Fragmentstar != null) {
            transaction.hide(Fragmentstar);
        }
        if (Fragmentfavorite != null) {
            transaction.hide(Fragmentfavorite);
        }
        if (Fragmentmy != null) {
            transaction.hide(Fragmentmy);
        }
        if (Fragmentsearch != null) {
            transaction.hide(Fragmentsearch);
        }
    }


    public void clearChioce()
    {
        index_image.setImageResource(R.mipmap.index_image);
//        index_layout.setBackgroundColor(whirt);


        star_image.setImageResource(R.mipmap.star_image);
//        star_layout.setBackgroundColor(whirt);


        favorite_image.setImageResource(R.mipmap.favorite_image);
//        favorite_layout.setBackgroundColor(whirt);

        my_image.setImageResource(R.mipmap.my_image);
//        my_layout.setBackgroundColor(whirt);
        search_image.setImageResource(R.mipmap.sear_image);
    }

}