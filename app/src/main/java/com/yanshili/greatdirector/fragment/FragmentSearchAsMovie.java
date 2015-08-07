package com.yanshili.greatdirector.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yashili.greatdirector.greatdirector.R;

/**
 * Created by LaoZhuang on 2015/8/5.
 */
public class FragmentSearchAsMovie extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        View view = inflater.inflate(R.layout.fragment_search_as_movies, container, false);
        return view;
    }
}
