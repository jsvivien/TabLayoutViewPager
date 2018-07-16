package com.example.tmh.tablayoutviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentTwo extends Fragment {
    private ImageView mImageHero;
    private View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_hero, container, false);
        mImageHero = (ImageView) mView.findViewById(R.id.image_hero);
        mImageHero.setBackgroundResource(R.drawable.iceman);
        return mView;
    }
}
