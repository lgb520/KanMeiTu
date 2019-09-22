package com.ixuea.courses.kanmeitu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ixuea.courses.kanmeitu.Activity.loginActivity;
import com.ixuea.courses.kanmeitu.util.SharePreferencesUtil;

public class MainActivity extends AppCompatActivity {

    private SharePreferencesUtil sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = SharePreferencesUtil.getInstance((getApplicationContext()));
    }

    public void onlogoutCLick(View view) {
         sp.setLogin(false);

        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);

        finish();
    }
}
