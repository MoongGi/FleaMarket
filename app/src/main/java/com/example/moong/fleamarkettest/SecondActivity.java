package com.example.moong.fleamarkettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
    Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        fragment2 = new Fragment2();

        getSupportFragmentManager().beginTransaction().replace(R.id.container1,fragment2).commit();
    }
}
