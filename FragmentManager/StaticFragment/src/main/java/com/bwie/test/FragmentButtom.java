package com.bwie.test;/**
 * Created by Administrator on 2016/11/29.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 1.
 * 2.作者：佀晋元 2016/11/29
 */
public class FragmentButtom extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
          View view=inflater.inflate(R.layout.fragmentbuttom,null);
        return view;
    }
}
