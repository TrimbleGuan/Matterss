package com.haitian.mattress.activity;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.haitian.mattress.R;
import com.haitian.mattress.base.BaseActivity;
import com.haitian.mattress.fragment.Home_Fragment;
import com.haitian.mattress.fragment.Mine_Fragment;


public class MainActivity extends BaseActivity {


    private FrameLayout mMain_fragid;
    private RadioGroup mMain_radiogroup;
    private RadioButton mRb_homepage;
    private TextView mRb_sousuo;
    private RadioButton mRb_setting;
    private FragmentManager mManager;
    private Home_Fragment mHomeFragment;
    private Mine_Fragment mMineFragment;

    @Override
    protected Activity provideBindView() {
        return this;
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        super.initViews();
        mMain_fragid = findViewById(R.id.main_fragid);

        mMain_radiogroup = findViewById(R.id.main_radiogroup);
        mRb_homepage = findViewById(R.id.rb_homepage);
        mRb_sousuo = findViewById(R.id.rb_baogao);
        mRb_setting = findViewById(R.id.rb_mine);

        //初始化碎片（fragment）
        initfragment();
        //第一个显示的界面
        ShowFirstFragment();
    }


    private void initfragment() {
        mManager = getSupportFragmentManager();

        mHomeFragment = new Home_Fragment();
        mMineFragment = new Mine_Fragment();

        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.add(R.id.main_fragid, mHomeFragment);
        transaction.add(R.id.main_fragid, mMineFragment);
        transaction.commit();
    }

    private void ShowFirstFragment() {
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.show(mHomeFragment).hide(mMineFragment);
        transaction.commit();
    }


    @Override
    protected void initListener() {
        super.initListener();
        mMain_radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_homepage: {
                        FragmentTransaction transaction = mManager.beginTransaction();
                        transaction.show(mHomeFragment).hide(mMineFragment);
                        transaction.commit();
                        break;
                    }
                    case R.id.rb_mine: {
                        FragmentTransaction transaction = mManager.beginTransaction();
                        transaction.show(mMineFragment).hide(mHomeFragment);
                        transaction.commit();
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        });

    }

    @Override
    public Context context() {
        return null;
    }
}
