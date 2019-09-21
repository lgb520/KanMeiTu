package com.ixuea.courses.kanmeitu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;

import com.ixuea.courses.kanmeitu.util.SharePreferencesUtil;

import javax.security.auth.login.LoginException;

public class SplashActivity extends AppCompatActivity {
    //延时3秒的handler包
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            next();
        }
    };
    private SharePreferencesUtil sp;

    private void next() {

        Intent intent=null;

        if (sp.isLogin()){
            //已经登录，跳转到首页
            intent = new Intent(this, MainActivity.class);
        }else {
            //否则跳转到登录界面
            intent= new Intent(this,loginActivity.class);
        }

        startActivity(intent);
        //关闭当前界面
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sp = SharePreferencesUtil.getInstance(getApplicationContext());

        //去除状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        },3000);
    }
}
