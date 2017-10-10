package com.example.moong.fleamarkettest;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static com.example.moong.fleamarkettest.R.layout.fragment1;
import static com.example.moong.fleamarkettest.R.layout.fragment_local;


/**
 * Created by heart on 2017-09-17.
 */
public class Fragment_Local extends Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle saveBundledInstanceState)
    {
        View view = inflater.inflate(fragment_local,container,false);

        return view;
    }

}
