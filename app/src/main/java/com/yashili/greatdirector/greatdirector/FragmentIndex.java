package com.yashili.greatdirector.greatdirector;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/7/25.
 */
public class FragmentIndex extends Fragment {
    private LinearLayout hotDirectorsLayout;
    private LinearLayout newMoviesLayout;
    private LinearLayout hotMoviesLayout;
    //热门导演数组
    private int[] hotDirectorsImgIds;
    private String[] hotDirectsorsText;

    //新作品数组
    private int[] newMoviesImgIds;
    private String[] newMoviesText;

    //热门视频数组
    private int[] hotMoviesImgIds;
    private String[] hotMoviesText;

    private LayoutInflater mInflater;
    private Context context;

    public FragmentIndex() {
    }


    public void setContext(Context context){
        this.context = context;
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        View view = inflater.inflate(R.layout.fragment_index, container, false);
        mInflater = LayoutInflater.from(context);
        initData();
        initView(view);
        return view;
    }

    //设置图片id
    protected void initData() {

        hotDirectorsImgIds = new int[]{R.mipmap.touxiang1, R.mipmap.touxiang2, R.mipmap.touxiang3,
                R.mipmap.touxiang4, R.mipmap.touxiang5, R.mipmap.touxiang6, R.mipmap.touxiang7,
        };
        hotDirectsorsText = new String[]{
                "陈凯歌", "张艺谋", "斯皮尔伯格", "贾樟柯", "李安", "王家卫", "冯小刚"
        };

        newMoviesImgIds = new int[]{R.mipmap.dianying01, R.mipmap.dianying02, R.mipmap.dianying03,
                R.mipmap.dianying04, R.mipmap.dianying05, R.mipmap.dianying06, R.mipmap.dianying07,

        };
        newMoviesText = new String[]{
                "教父", "肖申克的救赎", "辛德勒的名单", "公民凯恩", "外星人", "紫色", "卡萨布兰卡"
        };

        hotMoviesImgIds = new int[]{
                R.mipmap.dianying08, R.mipmap.dianying09, R.mipmap.dianying10,
                R.mipmap.dianying11, R.mipmap.dianying15, R.mipmap.dianying16, R.mipmap.dianying17,
        };
        hotMoviesText = new String[]{
                "卧虎藏龙", "后窗", "非常嫌疑犯", "低级小说", "西北偏北", "好家伙", "肖申克的救赎"
        };
    }

    //视图id等初始化
    protected void initView(View view) {
        hotDirectorsLayout = (LinearLayout) view.findViewById(R.id.hot_directors);
        newMoviesLayout = (LinearLayout) view.findViewById(R.id.new_movies);
        hotMoviesLayout = (LinearLayout) view.findViewById(R.id.hot_movies);

        for (int i = 0; i < hotDirectorsImgIds.length; i++) {

            View viewHotDirectors = mInflater.inflate(R.layout.info_layout_item,
                    hotDirectorsLayout, false);
            View viewNewMovies = mInflater.inflate(R.layout.info_layout_item,
                    newMoviesLayout, false);
            View viewHotMovies = mInflater.inflate(R.layout.info_layout_item,
                    hotMoviesLayout, false);

            //设置每个导演和影片的封面
            ImageView imgHotDirectors = (ImageView) viewHotDirectors
                    .findViewById(R.id.imageview_info);
            imgHotDirectors.setImageResource(hotDirectorsImgIds[i]);
            imgHotDirectors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(),DirectorInfo.class);
                    /*Bundle bundle = new Bundle();
                    bundle.putString("movieName", newMoviesText[i]);     //装入数据
                    intent.putExtras(bundle);*/
                    startActivity(intent);
                }
            });
            ImageView imgNewMovies = (ImageView) viewNewMovies
                    .findViewById(R.id.imageview_info);
            imgNewMovies.setImageResource(newMoviesImgIds[i]);

            //设置侦听事件
            //imgNewMovies.setOnClickListener(this);
            imgNewMovies.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(),PlayMovieActivity.class);
                    /*Bundle bundle = new Bundle();
                    bundle.putString("movieName", newMoviesText[i]);     //装入数据
                    intent.putExtras(bundle);*/
                    startActivity(intent);
                }
            });

            ImageView imgHotMovies = (ImageView) viewHotMovies
                    .findViewById(R.id.imageview_info);
            imgHotMovies.setImageResource(hotMoviesImgIds[i]);
            //点击图片跳转
            imgHotMovies.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), PlayMovieActivity.class);
                    /*Bundle bundle = new Bundle();
                    bundle.putString("movieName", newMoviesText[i]);     //装入数据
                    intent.putExtras(bundle);*/
                    startActivity(intent);
                }
            });
            //设置每个导演和影片的名字
            TextView textViewHotDirectors = (TextView) viewHotDirectors
                    .findViewById(R.id.textview_info);
            textViewHotDirectors.setText(hotDirectsorsText[i]);
            TextView textNewMovies = (TextView) viewNewMovies
                    .findViewById(R.id.textview_info);
            textNewMovies.setText(newMoviesText[i]);
            TextView texthotMovies = (TextView) viewHotMovies
                    .findViewById(R.id.textview_info);
            texthotMovies.setText(hotMoviesText[i]);

            //将item添加到对应的layout中去
            hotDirectorsLayout.addView(viewHotDirectors);
            newMoviesLayout.addView(viewNewMovies);
            hotMoviesLayout.addView(viewHotMovies);
        }
    }
}
