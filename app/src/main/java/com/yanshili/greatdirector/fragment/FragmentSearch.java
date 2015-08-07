package com.yanshili.greatdirector.fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yashili.greatdirector.greatdirector.R;

/**
 * Created by LaoZhuang on 2015/8/4.
 */
public class FragmentSearch extends Fragment{

    private FragmentSearchAsMovie fragmentSearchAsMovie;
    private FragmetSearchAsDirector fragmetSearchAsDirector;
    private FragmentSearchAsBonus fragmentSearchAsBonus;

    private TextView textViewSearchAsMovies;
    private TextView textViewSearchAsDirectors;
    private TextView getTextViewSearchAsBonus;
    FragmentManager fManager;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        //fManager = getSupportFragmentManager();
        //initViews();
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        return view;
    }
}
