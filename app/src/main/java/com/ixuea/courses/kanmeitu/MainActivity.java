package com.ixuea.courses.kanmeitu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import com.ixuea.courses.kanmeitu.Activity.BaseActivity;
import com.ixuea.courses.kanmeitu.Activity.loginActivity;
import com.ixuea.courses.kanmeitu.adapter.ImageAdapter;
import com.ixuea.courses.kanmeitu.domain.Image;
import com.ixuea.courses.kanmeitu.util.SharePreferencesUtil;

import java.util.ArrayList;

public class MainActivity extends BaseActivity{


    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv=findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        rv.setLayoutManager(layoutManager);

        ArrayList<Image> datas = new ArrayList<>();
        for (int i=0;i<100;i++){
            datas.add(new Image(""));
        }
        ImageAdapter adapter = new ImageAdapter(this);
        rv.setAdapter(adapter);

        adapter.setData(datas);

    }

    public void onlogoutCLick(View view) {
         sp.setLogin(false);

        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);

        finish();
    }
}
