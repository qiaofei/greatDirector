package com.yashili.greatdirector.greatdirector;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by LaoZhuang on 2015/8/4.
 */
public class FragmentSearch extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        return view;
    }
}
