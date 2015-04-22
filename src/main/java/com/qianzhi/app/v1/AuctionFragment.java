package com.qianzhi.app.v1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 2015/4/21.
 */
public class AuctionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View auctionFragment = inflater.inflate(R.layout.auction_layout, container, false);
        return auctionFragment;
    }
}
