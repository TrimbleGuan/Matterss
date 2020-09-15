package com.haitian.mattress.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import com.haitian.mattress.app.Constants;
import com.haitian.mattress.app.DoctorBaseAppliction;

import java.util.Set;

public class SplashActivity extends AppCompatActivity {

    private String goodsId;
    private String groupId;
    private String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);

        //默认倒计时两秒启动
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                skipLoginOrMain();

            }
        }, 500);
    }

    private void skipLoginOrMain() {
        Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
        startActivity(intent);

    }


}
