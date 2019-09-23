package com.ixuea.courses.kanmeitu.Activity;

import androidx.appcompat.app.AppCompatActivity;

import com.ixuea.courses.kanmeitu.util.SharePreferencesUtil;

public class BaseActivity extends AppCompatActivity {

    protected SharePreferencesUtil sp;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        sp = SharePreferencesUtil.getInstance(getApplicationContext());
    }
}
