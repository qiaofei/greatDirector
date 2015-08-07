package com.yanshili.greatdirector.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.yashili.greatdirector.greatdirector.R;

import java.util.List;

/**
 * Created by LaoZhuang on 2015/8/7.
 */
public class ShowBonusAdapter extends ArrayAdapter<ShowBonus>{
    private int resourceID;
    public ShowBonusAdapter(Context context,  int textViewResourceId, List<ShowBonus> objects) {
        super(context,  textViewResourceId, objects);
        resourceID = textViewResourceId ;
    }
    //重写getView方法

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //获取当前的ShowBonus实例
        ShowBonus showBonus = getItem(position);
        //为子view的各个控件设置内容
        View view = LayoutInflater.from(getContext()).inflate(resourceID,null);
        TextView bonusCatrgory = (TextView) view.findViewById(R.id.bonus_category_text);
        bonusCatrgory.setText(showBonus.getBonusCatrgory());
        TextView directorName = (TextView) view.findViewById(R.id.director_name);
        directorName.setText(showBonus.getDirectorName());
        TextView bonusCount = (TextView) view.findViewById(R.id.bonus_count);
        bonusCount.setText(""+showBonus.getMoviesCount());
        return view;
    }
}
