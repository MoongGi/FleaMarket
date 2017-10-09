package com.example.moong.fleamarkettest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static com.example.moong.fleamarkettest.R.layout.fragment1;


/**
 * Created by heart on 2017-09-17.
 */
public class Fragment1 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle saveBundledInstanceState)
    {
        View view = inflater.inflate(fragment1,container,false);

        ImageView image1 = (ImageView) view.findViewById(R.id.imageview2);

        image1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              Intent it = new Intent(getActivity() , SecondActivity.class);
                startActivity(it);
            }
        });
        return view;
    }
//테스트
}
