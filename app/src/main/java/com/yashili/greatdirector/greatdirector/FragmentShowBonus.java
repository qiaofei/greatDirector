package com.yashili.greatdirector.greatdirector;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by LaoZhuang on 2015/8/6.
 */
public class FragmentShowBonus extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        View view = inflater.inflate(R.layout.show_bonus_layout, container, false);
        return view;
    }
}
