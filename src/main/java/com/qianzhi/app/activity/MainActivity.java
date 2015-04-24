package com.qianzhi.app.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;



public class MainActivity extends Activity {
    /***
     * Xutils
     */
    @ViewInject(R.id.home_icon)
    View homeicon;
    @ViewInject(R.id.finance_icon)
    View financeicon;
    @ViewInject(R.id.auction_icon)
    View auctionicon;
    @ViewInject(R.id.appraisal_icon)
    View appraisalicon;
    @ViewInject(R.id.personal_icon)
    View personalicon;
    /**
     * 首页面
     */
    private HomeFragment homeFragment;
    /**
     * 金融页面（众筹，融资）
     */
    private FinanceFragment financeFragment;
    /**
     * 拍卖页面
     */
    private AuctionFragment auctionFragment;
    /**
     * 鉴定页面（寄售、送拍、投保等线下进行的项目）
     */
    private AppraisalFragment appraisalFragment;
    /**
     * 个人页面（注册登录）
     */
    private PersonalFragment personalFragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    @OnClick(R.id.home_icon)
    public void homeicononClick(View view) {
        setTabSelection(0);
    }

    @OnClick(R.id.finance_icon)
    public void financeicononClick(View view) {
        setTabSelection(1);
    }

    @OnClick(R.id.auction_icon)
    public void auctionicononClick(View view) {
        setTabSelection(2);
    }

    @OnClick(R.id.appraisal_icon)
    public void appraisalicononClick(View view) {
        setTabSelection(3);
    }

    @OnClick(R.id.personal_icon)
    public void personalicononClick(View view) {
        setTabSelection(4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);
        fragmentManager = getFragmentManager();
        setTabSelection(0);

    }

    private void setTabSelection(int index) {
        clearSelection();
        transaction = fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch (index) {
            case 0:
                homeicon.setBackgroundColor(Color.RED);
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    transaction.add(R.id.content, homeFragment);
                } else {
                    transaction.show(homeFragment);
                }
                break;
            case 1:
                financeicon.setBackgroundColor(Color.RED);
                if (financeFragment == null) {
                    financeFragment = new FinanceFragment();
                    transaction.add(R.id.content, financeFragment);
                } else {
                    transaction.show(financeFragment);
                }
                break;
            case 2:
                auctionicon.setBackgroundColor(Color.RED);
                if (auctionFragment == null) {
                    auctionFragment = new AuctionFragment();
                    transaction.add(R.id.content, auctionFragment);
                } else {
                    transaction.show(auctionFragment);
                }
                break;
            case 3:
                appraisalicon.setBackgroundColor(Color.RED);
                if (appraisalFragment == null) {
                    appraisalFragment = new AppraisalFragment();
                    transaction.add(R.id.content, appraisalFragment);
                } else {
                    transaction.show(appraisalFragment);
                }
                break;
            case 4:
                personalicon.setBackgroundColor(Color.RED);
                if (personalFragment == null) {
                    personalFragment = new PersonalFragment();
                    transaction.add(R.id.content, personalFragment);
                } else {
                    transaction.show(personalFragment);
                }
                break;
            default:
                break;
        }
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if (homeFragment != null) {
            fragmentTransaction.hide(homeFragment);
        }
        if (financeFragment != null) {
            fragmentTransaction.hide(financeFragment);
        }
        if (auctionFragment != null) {
            fragmentTransaction.hide(auctionFragment);
        }
        if (appraisalFragment != null) {
            fragmentTransaction.hide(appraisalFragment);
        }
        if (personalFragment != null) {
            fragmentTransaction.hide(personalFragment);
        }
    }

    private void clearSelection() {
        homeicon.setBackgroundColor(Color.WHITE);
        financeicon.setBackgroundColor(Color.WHITE);
        auctionicon.setBackgroundColor(Color.WHITE);
        appraisalicon.setBackgroundColor(Color.WHITE);
        personalicon.setBackgroundColor(Color.WHITE);
    }




}


