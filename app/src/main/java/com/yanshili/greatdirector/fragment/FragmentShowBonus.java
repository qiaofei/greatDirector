package com.yanshili.greatdirector.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.yashili.greatdirector.greatdirector.R;
import com.yanshili.greatdirector.utils.ShowBonus;
import com.yanshili.greatdirector.utils.ShowBonusAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LaoZhuang on 2015/8/6.
 */
public class FragmentShowBonus extends Fragment {
    private Context context;
    private List<ShowBonus> listShowBonus = new ArrayList<ShowBonus>();
    private ListView showBonusListView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        View view = inflater.inflate(R.layout.show_bonus_layout, container, false);
        initBonus();
        ShowBonusAdapter showBonusAdapter = new ShowBonusAdapter
                (this.getActivity(), R.layout.show_bous_item, listShowBonus);
        showBonusListView = (ListView) view.findViewById(R.id.bonus_listview);
        showBonusListView.setAdapter(showBonusAdapter);
        return view;
    }

    //实例化几个ShowBonus对象
    private void initBonus() {
        ShowBonus showBonus1 = new ShowBonus("1,最佳微电影导演奖", "李安", 20);
        ShowBonus showBonus2 = new ShowBonus("2,最佳栏目剧导演奖", "张艺谋", 16);
        ShowBonus showBonus3 = new ShowBonus("3,最佳纪录片导演奖", "贾樟柯", 19);
        ShowBonus showBonus4 = new ShowBonus("4,最佳儿童剧导演奖", "冯小刚", 13);
        ShowBonus showBonus5 = new ShowBonus("5,最佳电视剧导演奖", "陈凯歌", 23);
        ShowBonus showBonus6 = new ShowBonus("6,最佳企宣片导演奖", "王家卫", 25);
        ShowBonus showBonus7 = new ShowBonus("7,最佳产品片导演奖", "李安", 20);
        ShowBonus showBonus8 = new ShowBonus("7,最佳晚会导演奖", "斯皮尔伯格", 13);
        listShowBonus.add(showBonus1);
        listShowBonus.add(showBonus2);
        listShowBonus.add(showBonus3);
        listShowBonus.add(showBonus4);
        listShowBonus.add(showBonus5);
        listShowBonus.add(showBonus6);
        listShowBonus.add(showBonus7);
        listShowBonus.add(showBonus8);

    }
}
