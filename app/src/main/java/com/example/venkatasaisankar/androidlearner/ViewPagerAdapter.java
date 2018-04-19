package com.example.venkatasaisankar.androidlearner;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Venkata Sai Sankar on 18-Feb-17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments=new ArrayList<>();
    ArrayList<String> tabTitles=new ArrayList<>();

    public void addFragments(Fragment fragments,String tabTitles){
        this.fragments.add(fragments);
        this.tabTitles.add(tabTitles);
    }

    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}
