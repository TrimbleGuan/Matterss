package com.haitian.mattress.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.haitian.mattress.R;
import com.haitian.mattress.base.BaseActivity;

import org.w3c.dom.Text;

public class ForgetPassword_Activity extends BaseActivity {


    private EditText mMobile_ed;
    private TextView mGetcode_tv;
    private EditText mCode_ed;
    private Button mNext_btn;

    @Override
    protected Activity provideBindView() {
        return this;
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_update_password_;
    }

    @Override
    protected void initViews() {
        super.initViews();
        //手机号
        mMobile_ed = findViewById(R.id.mobile_ed);
        //获取验证码
        mGetcode_tv = findViewById(R.id.getcode_tv);
        //验证码输入框
        mCode_ed = findViewById(R.id.code_ed);
        //下一步
        mNext_btn = findViewById(R.id.next_btn);

    }

    @Override
    protected void initListener() {
        super.initListener();
        mNext_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgetPassword_Activity.this, ForgetPassword_next_Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public Context context() {
        return this;
    }
}
