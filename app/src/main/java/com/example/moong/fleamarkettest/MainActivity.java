package com.example.moong.fleamarkettest;

import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import static android.support.design.R.styleable.TabLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    Fragment1 fragment1;
    Fragment_Local fragment_local;
    Fragment_Thema fragment_thema;
    RelativeLayout local_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        fragment1 = new Fragment1();
        fragment_thema = new Fragment_Thema();
        fragment_local = new Fragment_Local();

        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment1).commit();

        TabLayout tabs = (TabLayout)findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("테마별검색"));
        tabs.addTab(tabs.newTab().setText("위치별검색"));
        tabs.setSelected(false);

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Fragment selected = null;
                if(position==0){
                    //selected = fragment_thema;
                    Drawable alpha1;
                    local_activity = (RelativeLayout)findViewById(R.id.local_activity);
                    alpha1 = local_activity.getBackground();
                    alpha1.setAlpha(100); //투명도조절
                    local_activity.setVisibility(View.VISIBLE);
                }
                if(position==1)
                {
                    selected = fragment_local;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
