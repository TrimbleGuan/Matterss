package com.haitian.mattress.activity;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.haitian.mattress.R;
import com.haitian.mattress.base.BaseActivity;

public class ForgetPassword_next_Activity extends BaseActivity {

    private EditText mPassword_ed;
    private EditText mPassword_next_ed;
    private Button mRight_btn;

    @Override
    protected Activity provideBindView() {
        return this;
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_forget_password_next_;
    }

    @Override
    protected void initViews() {
        super.initViews();
        //密码
        mPassword_ed = findViewById(R.id.password_ed);
        //确认密码
        mPassword_next_ed = findViewById(R.id.password_next_ed);
        //完成
        mRight_btn = findViewById(R.id.right_btn);
    }

    @Override
    public Context context() {
        return null;
    }
}
