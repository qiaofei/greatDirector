package com.yashili.greatdirector.greatdirector;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/7/25.
 */
public class FragmentIndex extends Fragment {
    private LinearLayout hotDirectorsLayout;
    private LinearLayout newMoviesLayout;
    private LinearLayout hotMoviesLayout;
    private LinearLayout famousDirectorLayout;
    private LinearLayout movieCategoryLayout;
    private LinearLayout bonusCategoryLayout;
    //热门导演数组
    private int[] hotDirectorsImgIds;
    private String[] hotDirectsorsText;

    //新作品数组
    private int[] newMoviesImgIds;
    private String[] newMoviesText;

    //热门视频数组
    private int[] hotMoviesImgIds;
    private String[] hotMoviesText;

    //名家数组
    private int[] famousDirectorImgIds;
    private String[] famousDirectorText;

    //题材数组
    private int[] movieCategoryImgIds;
    private String[] movieCategoryText;

    //奖项数组
    private int[] bonusCategoryImgIds;
    private String[] bonusCategoryText;

    private LayoutInflater mInflater;
    private Context context;

    public FragmentIndex() {
    }


    public void setContext(Context context) {
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

        newMoviesImgIds = new int[]{R.mipmap.dianying01, R.mipmap.dianying17, R.mipmap.dianying03,
                R.mipmap.dianying04, R.mipmap.dianying18, R.mipmap.dianying06, R.mipmap.dianying07,

        };
        newMoviesText = new String[]{
                "教父", "肖申克的救赎", "辛德勒的名单", "公民凯恩", "外星人", "紫色", "卡萨布兰卡"
        };

        hotMoviesImgIds = new int[]{
                R.mipmap.dianying02, R.mipmap.dianying05, R.mipmap.dianying12,
                R.mipmap.dianying11, R.mipmap.dianying17, R.mipmap.dianying15, R.mipmap.dianying16,
        };
        hotMoviesText = new String[]{
                "卧虎藏龙", "后窗", "非常嫌疑犯", "低级小说", "西北偏北", "好家伙", "肖申克的救赎"
        };
        //设置名家排行的图片和文字
        famousDirectorImgIds = new int[]{
                R.mipmap.touxiang5, R.mipmap.touxiang4, R.mipmap.touxiang3,
                R.mipmap.touxiang7, R.mipmap.touxiang1, R.mipmap.touxiang2, R.mipmap.touxiang6,
        };
        famousDirectorText = new String[]{
                "贾樟柯", "李安", "王家卫", "张艺谋", "陈凯歌", "冯小刚", "斯皮尔伯格"
        };
        //设置题材图片和文字
        movieCategoryImgIds = new int[]{
                R.mipmap.dianying04, R.mipmap.dianying06, R.mipmap.dianying17,
                R.mipmap.dianying15, R.mipmap.dianying12, R.mipmap.dianying16, R.mipmap.dianying11,
        };
        movieCategoryText = new String[]{
                "科幻", "儿童", "综艺", "搞笑", "纪录片", "悬疑", "动漫"
        };

        //设置奖项图片和文字
        bonusCategoryImgIds = new int[]{
                R.mipmap.dianying08, R.mipmap.dianying09, R.mipmap.dianying10,
                R.mipmap.dianying11, R.mipmap.dianying15, R.mipmap.dianying16,
                R.mipmap.dianying17, R.mipmap.dianying18
        };
        bonusCategoryText = new String[]{
                "最佳微电影奖", "最佳栏目剧奖 ", "最佳纪录片奖", "最佳儿童剧奖",
                "最佳电视剧奖", "最佳企宣片奖", "最佳产品片奖", "最佳晚会导演"
        };
    }

    //视图id等初始化
    protected void initView(View view) {
        hotDirectorsLayout = (LinearLayout) view.findViewById(R.id.hot_directors);
        newMoviesLayout = (LinearLayout) view.findViewById(R.id.new_movies);
        hotMoviesLayout = (LinearLayout) view.findViewById(R.id.hot_movies);
        famousDirectorLayout = (LinearLayout) view.findViewById(R.id.famous_director);
        movieCategoryLayout = (LinearLayout) view.findViewById(R.id.movie_category);
        bonusCategoryLayout = (LinearLayout) view.findViewById(R.id.bonus_category);
        //热门导演跳转
        LinearLayout hotDirectsorsTextLayout =
                (LinearLayout) view.findViewById(R.id.hot_directors_text_layout);
        hotDirectsorsTextLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HotDirectorsActivity.class);
                startActivity(intent);
            }
        });
        //新作品上架跳转
        LinearLayout newMoviesTextLayout =
                (LinearLayout) view.findViewById(R.id.new_movies_text_layout);
        newMoviesTextLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewMovieActivity.class);
                startActivity(intent);
            }
        });
        //观看排行跳转
        LinearLayout hotMoviesTextLayout =
                (LinearLayout) view.findViewById(R.id.hot_movies_text_layout);
        hotMoviesTextLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewMovieActivity.class);
                startActivity(intent);
            }
        });
        //跳转名家排行
        LinearLayout famousDirectsorsTextLayout =
                (LinearLayout) view.findViewById(R.id.famous_directors_text_layout);
        famousDirectsorsTextLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HotDirectorsActivity.class);
                startActivity(intent);
            }
        });
        //跳转题材分类
        LinearLayout moviesCategoryTextLayout =
                (LinearLayout) view.findViewById(R.id.movies_category_text_layout);
        moviesCategoryTextLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewMovieActivity.class);
                startActivity(intent);
            }
        });
        //跳转到奖项分类
        LinearLayout bonusCategoryTextLayout =
                (LinearLayout) view.findViewById(R.id.bonus_category_text_layout);
        bonusCategoryTextLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HotDirectorsActivity.class);
                startActivity(intent);
            }
        });

        for (int i = 0; i < hotDirectorsImgIds.length; i++) {

            View viewHotDirectors = mInflater.inflate(R.layout.info_layout_item,
                    hotDirectorsLayout, false);
            View viewNewMovies = mInflater.inflate(R.layout.info_layout_item,
                    newMoviesLayout, false);
            View viewHotMovies = mInflater.inflate(R.layout.info_layout_item,
                    hotMoviesLayout, false);
            View viewFamousDirector = mInflater.inflate(R.layout.info_layout_item,
                    famousDirectorLayout, false);
            View viewMovieCategory = mInflater.inflate(R.layout.info_layout_item,
                    movieCategoryLayout, false);
            View viewBonusCategory = mInflater.inflate(R.layout.info_layout_item,
                    bonusCategoryLayout, false);
            //设置每个导演和影片的封面

            viewHotDirectors.setBackgroundResource(hotDirectorsImgIds[i]);
            viewHotDirectors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), DirectorInfo.class);
                    startActivity(intent);
                }
            });

            viewNewMovies.setBackgroundResource(newMoviesImgIds[i]);

            //设置侦听事件
            //imgNewMovies.setOnClickListener(this);
            viewNewMovies.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), PlayMovieActivity.class);
                    startActivity(intent);
                }
            });


            viewHotMovies.setBackgroundResource(hotMoviesImgIds[i]);
            //点击图片跳转
            viewHotMovies.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), PlayMovieActivity.class);
                    startActivity(intent);
                }
            });
            //设置名家展示图片
            viewFamousDirector.setBackgroundResource(famousDirectorImgIds[i]);
            //点击图片跳转
            viewFamousDirector.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), PlayMovieActivity.class);
                    startActivity(intent);
                }
            });

            //设置题材分类背景图片
            viewMovieCategory.setBackgroundResource(movieCategoryImgIds[i]);
            //点击图片跳转
            viewMovieCategory.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), PlayMovieActivity.class);
                    startActivity(intent);
                }
            });

            //设置奖项分类背景图片
            viewBonusCategory.setBackgroundResource(bonusCategoryImgIds[i]);
            //点击图片跳转
            viewBonusCategory.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), PlayMovieActivity.class);
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
            //设置名家展示文字
            TextView textFamousDirector = (TextView) viewFamousDirector
                    .findViewById(R.id.textview_info);
            textFamousDirector.setText(famousDirectorText[i]);

            //设置题材分类文字
            TextView textMovieCategory = (TextView) viewMovieCategory
                    .findViewById(R.id.textview_info);
            textMovieCategory.setText(movieCategoryText[i]);

            //设置奖项分类文字
            TextView textBonusCategory = (TextView) viewBonusCategory
                    .findViewById(R.id.textview_info);
            textBonusCategory.setText(bonusCategoryText[i]);

            //将item添加到对应的layout中去
            hotDirectorsLayout.addView(viewHotDirectors);
            newMoviesLayout.addView(viewNewMovies);
            hotMoviesLayout.addView(viewHotMovies);
            famousDirectorLayout.addView(viewFamousDirector);
            movieCategoryLayout.addView(viewMovieCategory);
            bonusCategoryLayout.addView(viewBonusCategory);
        }
    }
}
