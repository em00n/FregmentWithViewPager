package com.emon.fregmentwithviewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter {
    private List<Fragment> lstFrag = new ArrayList<>();
    private List<String> lsttitle = new ArrayList<>();

    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstFrag.get(position);
    }

    @Override
    public int getCount() {
        return lsttitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lsttitle.get(position);
    }

    public void addFrag(Fragment fragment, String title) {
        lstFrag.add(fragment);
        lsttitle.add(title);
    }
}
