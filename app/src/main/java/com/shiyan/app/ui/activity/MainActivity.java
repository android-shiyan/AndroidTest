package com.shiyan.app.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import com.shiyan.app.R;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startActivity(new Intent(this,RoundImageViewActivity.class));

        finish();
    }

}
