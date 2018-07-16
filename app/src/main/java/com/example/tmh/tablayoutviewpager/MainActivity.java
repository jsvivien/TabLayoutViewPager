package com.example.tmh.tablayoutviewpager;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTab;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTab = (TabLayout) findViewById(R.id.tab_layout);
        mPager = (ViewPager) findViewById(R.id.view_pager);
        FragmentManager mManager = getSupportFragmentManager();
        PagerAdapter mPagerAdapter = new PagerAdapter(mManager);
        mPager.setAdapter(mPagerAdapter);
        mTab.setupWithViewPager(mPager);
        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTab));
        mTab.setTabsFromPagerAdapter(mPagerAdapter);
    }

    public class PagerAdapter extends FragmentStatePagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment mFragment = null;
            switch (position) {
                case 0:
                    mFragment = new FragmentOne();
                    break;
                case 1:
                    mFragment = new FragmentTwo();
                    break;
                case 2:
                    mFragment = new FragmentThree();
                    break;
            }
            return mFragment;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            String title = null;
            switch (position) {
                case 0:
                    title = getString(R.string.batman);
                    break;
                case 1:
                    title = getString(R.string.iceman);
                    break;
                case 2:
                    title = getString(R.string.spiderman);
                    break;
            }
            return title;
        }
    }
}
