package com.yanshili.greatdirector.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yanshili.greatdirector.utils.DirectorInfo;
import com.yashili.greatdirector.greatdirector.R;

/**
 * Created by Administrator on 2015/7/25.
 */
public class FragmentStar extends Fragment {
    private Context context;
    private LinearLayout famousMoiveCommetLayout;
    private LinearLayout famousDirectorLayout;
    private LinearLayout famousMovierLayout;
    //热知名影评数组
    private int[] famousCommentImgIds;
    private String[] famousCommentText;
    //入驻导演数组
    private int[] famousDirectorImgIds;
    private String[] famousDirectorText;
    //入驻名家数组
    private int[] famousMovierImgIds;
    private String[] famousMovierText;

    private LayoutInflater mInflater;

    public void setContext(Context context) {
        this.context = context;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        View view = inflater.inflate(R.layout.fragment_star, container, false);
        mInflater = LayoutInflater.from(context);
        initData();
        initView(view);
        return view;
    }

    private void initData() {
        famousCommentImgIds = new int[]{R.mipmap.touxiang1, R.mipmap.touxiang2, R.mipmap.touxiang3,
                R.mipmap.touxiang4, R.mipmap.touxiang5, R.mipmap.touxiang6, R.mipmap.touxiang7,
        };
        famousCommentText = new String[]{
                "陈凯歌", "斯皮尔伯格", "张艺谋", "贾樟柯", "李安", "王家卫", "冯小刚"
        };
        famousDirectorImgIds = new int[]{R.mipmap.touxiang4, R.mipmap.touxiang5, R.mipmap.touxiang7,
                R.mipmap.touxiang4, R.mipmap.touxiang3, R.mipmap.touxiang6, R.mipmap.touxiang7,
        };
        famousDirectorText = new String[]{
                "贾樟柯", "王家卫", "陈凯歌", "贾樟柯", "李安", "张艺谋", "冯小刚"
        };
        famousMovierImgIds = new int[]{R.mipmap.touxiang6, R.mipmap.touxiang4, R.mipmap.touxiang2,
                R.mipmap.touxiang4, R.mipmap.touxiang5, R.mipmap.touxiang6, R.mipmap.touxiang7,
        };
        famousMovierText = new String[]{
                "陈凯歌", "张艺谋", "斯皮尔伯格", "贾樟柯", "冯小刚", "王家卫", "李安"
        };
    }

    private void initView(View view) {
        famousMoiveCommetLayout = (LinearLayout) view.findViewById(R.id.famous_movie_comment);
        famousDirectorLayout = (LinearLayout) view.findViewById(R.id.famous_movie_director);
        famousMovierLayout = (LinearLayout) view.findViewById(R.id.famous_movier);
        for (int i = 0; i < famousCommentImgIds.length; i++) {
            //设置知名影评人
            View viewFamousMoiveCommet = mInflater.inflate(R.layout.info_layout_item,
                    famousMoiveCommetLayout, false);
            viewFamousMoiveCommet.setBackgroundResource(famousCommentImgIds[i]);
            TextView viewFamousMoiveCommetTextView =
                    (TextView) viewFamousMoiveCommet.findViewById(R.id.textview_info);
            viewFamousMoiveCommetTextView.setText(famousCommentText[i]);
            viewFamousMoiveCommet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), DirectorInfo.class);
                    startActivity(intent);
                }
            });


            //入驻导演项设置图片文字
            View viewFamousDirector = mInflater.inflate(R.layout.info_layout_item,
                    famousDirectorLayout, false);
            viewFamousDirector.setBackgroundResource(famousDirectorImgIds[i]);
            TextView viewFamousDirectorTextView =
                    (TextView) viewFamousDirector.findViewById(R.id.textview_info);
            viewFamousDirectorTextView.setText(famousDirectorText[i]);
            viewFamousDirector.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), DirectorInfo.class);
                    startActivity(intent);
                }
            });

            //名家设置图片文字
            View viewFamousMovier = mInflater.inflate(R.layout.info_layout_item,
                    famousMovierLayout, false);
            viewFamousMovier.setBackgroundResource(famousMovierImgIds[i]);
            TextView viewFamousMovierTextView =
                    (TextView) viewFamousMovier.findViewById(R.id.textview_info);
            viewFamousMovierTextView.setText(famousMovierText[i]);
            viewFamousMovier.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), DirectorInfo.class);
                    startActivity(intent);
                }
            });
            famousMoiveCommetLayout.addView(viewFamousMoiveCommet);
            famousDirectorLayout.addView(viewFamousMovier);
            famousMovierLayout.addView(viewFamousDirector);
        }
    }
}
