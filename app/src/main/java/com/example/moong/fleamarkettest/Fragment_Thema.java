package com.example.moong.fleamarkettest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.moong.fleamarkettest.R.layout.fragment_thema;


/**
 * Created by heart on 2017-09-17.
 */
public class Fragment_Thema extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle saveBundledInstanceState)
    {
        View view = inflater.inflate(fragment_thema,container,false);

        return view;
    }

}
