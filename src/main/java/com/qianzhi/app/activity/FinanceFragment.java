package com.qianzhi.app.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 2015/4/21.
 */
public class FinanceFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View financeFragment = inflater.inflate(R.layout.finance_layout, container, false);
        return financeFragment;
    }
}
