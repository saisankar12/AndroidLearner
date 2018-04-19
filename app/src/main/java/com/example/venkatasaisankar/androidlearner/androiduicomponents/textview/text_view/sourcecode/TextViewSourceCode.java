package com.example.venkatasaisankar.androidlearner.androiduicomponents.textview.text_view.sourcecode;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.venkatasaisankar.androidlearner.R;
import com.example.venkatasaisankar.androidlearner.ViewPagerAdapter;
import com.example.venkatasaisankar.androidlearner.androiduicomponents.textview.text_view.output.WidgetsTextView;

/**
 * Created by Sai Sankar on 09-08-2017.
 */

public class TextViewSourceCode extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_overview);


        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragments(new TextViewXML(),"activity_main.xml");
        viewPagerAdapter.addFragments(new TextViewJAVA(),"MainActivity.java");


        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_show,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.sourcecode:
                Intent i=new Intent(TextViewSourceCode.this, WidgetsTextView.class);
                startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

}
