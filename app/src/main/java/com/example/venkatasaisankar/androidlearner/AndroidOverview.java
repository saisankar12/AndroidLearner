package com.example.venkatasaisankar.androidlearner;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class AndroidOverview extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout  tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    TextView tv1;

    /*private int[] tabIcons = {
            R.mipmap.tutorial,
            R.mipmap.examples,
            R.mipmap.concept
    };*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_overview);


        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragments(new AndroidTutorial(),"Tutorial");
        viewPagerAdapter.addFragments(new AndroidUI_Components(),"UI-Components");
        viewPagerAdapter.addFragments(new AndroidConcepts(),"Concepts");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
       //setupTabIcons();

    }

    /*private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }*/
}
