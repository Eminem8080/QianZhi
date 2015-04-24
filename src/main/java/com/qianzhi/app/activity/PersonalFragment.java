package com.qianzhi.app.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 2015/4/21.
 */
public class PersonalFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View personalFragment = inflater.inflate(R.layout.personal_layout, container, false);
        return personalFragment;
    }
}
