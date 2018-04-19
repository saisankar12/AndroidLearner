package com.example.venkatasaisankar.androidlearner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.ActivityLifeCycle;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.Actv;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.AndroidComponents;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.AndroidContent;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.AndroidFeatures;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.AndroidProjectStructure;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.FirstApplication;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.Fragments;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.GalleryGrid;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.HowtoText;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.Intents;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.Layout;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.ListDynamic;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.ListStatic;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.SPF;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.SQLite;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.SQLiteInsert;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.Spinner;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.WebView;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.WebviewHTML;
import com.example.venkatasaisankar.androidlearner.androidtutorialvideo.WhatIsAndroid;

import static android.R.interpolator.cycle;
import static android.widget.Toast.makeText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidTutorial extends Fragment {

    ImageView android,features,components,content,structure,
            layact,lifecycle,howtotext,application,intents,actv,
            spinner,liststatic,listdynamic,galgrid,webview,webviewhtml,fragments,
            spf,sqliteinsert,sqlite;
    ImageView androiddoc,featuresdoc,componentsdoc,contentdoc,structuredoc,
            layactdoc,lifecycledoc,howtotextdoc,applicationdoc,intentsdoc,actvdoc,
            spinnerdoc,liststaticdoc,listdynamicdoc,
            galgriddoc,webviewdoc,webviewhtmldoc,fragmentsdoc,
            spfdoc,sqliteinsertdoc,sqlitedoc;

    public AndroidTutorial() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_android_tutorial, container, false);


       TextView tv1=(TextView)v.findViewById(R.id.example);

        SharedPreferences sharedPreferences=getActivity().getSharedPreferences(MainActivity.SHARED_PREF,0);


        tv1.setText(sharedPreferences.getString("Email",""));

        Toast t=Toast.makeText(getActivity(), tv1.getText(), Toast.LENGTH_LONG);
        t.getView().setBackgroundResource(R.drawable.toast);
        t.show();


        /*Android what is android play Button Configure*/
        android=(ImageView)v.findViewById(R.id.whatisandroid);
        androiddoc=(ImageView)v.findViewById(R.id.whatisandroiddoc);

        /*Click event for what is android*/
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(), WhatIsAndroid.class);
                startActivity(i);

            }
        });
        
        /*Click event for what is android*/
        androiddoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "  Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });


         /*Android  android features play Button Configure*/
        features=(ImageView)v.findViewById(R.id.features);
        featuresdoc=(ImageView)v.findViewById(R.id.featuresdoc);
        /*Click event for android features*/
        features.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getActivity(), AndroidFeatures.class);
                startActivity(i1);
            }
        });

        featuresdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

         /*Android  android components play Button Configure*/
        components=(ImageView)v.findViewById(R.id.components);
        componentsdoc=(ImageView)v.findViewById(R.id.componentsdoc);
        /*Click event for android features*/
        components.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), AndroidComponents.class);
                startActivity(i2);
            }
        });

        componentsdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

/*Android  android Content play Button Configure*/
        content=(ImageView)v.findViewById(R.id.content);
        contentdoc=(ImageView)v.findViewById(R.id.contentdoc);
        /*Click event for android content*/
        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), AndroidContent.class);
                startActivity(i2);
            }
        });

        contentdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });


        /*Android  android Project Structure play Button Configure*/
        structure=(ImageView)v.findViewById(R.id.structure);
        structuredoc=(ImageView)v.findViewById(R.id.structuredoc);
        /*Click event for android content*/
        structure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), AndroidProjectStructure.class);
                startActivity(i2);
            }
        });

        structuredoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });


        /*Android  android layout activity play Button Configure*/
        layact=(ImageView)v.findViewById(R.id.layoutactivity);
        layactdoc=(ImageView)v.findViewById(R.id.layoutactivitydoc);
        /*Click event for android layoutactivity*/
        layact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), Layout.class);
                startActivity(i2);
            }
        });

        layactdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

        /*Android  android layout activity play Button Configure*/
        lifecycle=(ImageView)v.findViewById(R.id.lifecycle);
        lifecycledoc=(ImageView)v.findViewById(R.id.lifecycledoc);
        /*Click event for android layoutactivity*/
        lifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), ActivityLifeCycle.class);
                startActivity(i2);
            }
        });

        lifecycledoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

        /*Android  android layout activity play Button Configure*/
        howtotext=(ImageView)v.findViewById(R.id.textApplication);
        howtotextdoc=(ImageView)v.findViewById(R.id.textApplicationdoc);
        /*Click event for android layoutactivity*/
        howtotext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), HowtoText.class);
                startActivity(i2);
            }
        });

        howtotextdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

        /*Android  android layout activity play Button Configure*/
        application=(ImageView)v.findViewById(R.id.firstApplication);
        applicationdoc=(ImageView)v.findViewById(R.id.firstApplicationdoc);
        /*Click event for android layoutactivity*/
        application.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), FirstApplication.class);
                startActivity(i2);
            }
        });

        applicationdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

        /*Android  android intents play Button Configure*/
        intents=(ImageView)v.findViewById(R.id.intents);
        intentsdoc=(ImageView)v.findViewById(R.id.intentsdoc);
        /*Click event for android intents*/
        intents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), Intents.class);
                startActivity(i2);
            }
        });

        intentsdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

         /*Android  android intents play Button Configure*/
        actv=(ImageView)v.findViewById(R.id.actv);
        actvdoc=(ImageView)v.findViewById(R.id.actvdoc);
        /*Click event for android intents*/
        actv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), Actv.class);
                startActivity(i2);
            }
        });

        actvdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

        /*Android  android intents play Button Configure*/
        spinner=(ImageView)v.findViewById(R.id.spinner);
        spinnerdoc=(ImageView)v.findViewById(R.id.spinnerdoc);
        /*Click event for android intents*/
        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), Spinner.class);
                startActivity(i2);
            }
        });

        spinnerdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });
        /*Android  android intents play Button Configure*/
        liststatic=(ImageView)v.findViewById(R.id.listviewstatic);
        liststaticdoc=(ImageView)v.findViewById(R.id.listviewstaticdoc);
        /*Click event for android intents*/
        liststatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), ListStatic.class);
                startActivity(i2);
            }
        });

        liststaticdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });
        /*Android  android intents play Button Configure*/
        listdynamic=(ImageView)v.findViewById(R.id.listviewdynamic);
        listdynamicdoc=(ImageView)v.findViewById(R.id.listviewdynamicdoc);
        /*Click event for android intents*/
        listdynamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), ListDynamic.class);
                startActivity(i2);
            }
        });

        listdynamicdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

        /*Android  android intents play Button Configure*/
        galgrid=(ImageView)v.findViewById(R.id.gallerygridview);
        galgriddoc=(ImageView)v.findViewById(R.id.gallerygridviewdoc);
        /*Click event for android intents*/
        galgrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), GalleryGrid.class);
                startActivity(i2);
            }
        });

        galgriddoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

        /*Android  android intents play Button Configure*/
        webview=(ImageView)v.findViewById(R.id.webview);
        webviewdoc=(ImageView)v.findViewById(R.id.webviewdoc);
        /*Click event for android intents*/
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), WebView.class);
                startActivity(i2);
            }
        });

        webviewdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

        /*Android  android intents play Button Configure*/
        webviewhtml=(ImageView)v.findViewById(R.id.webviewhtml);
        webviewhtmldoc=(ImageView)v.findViewById(R.id.webviewhtmldoc);
        /*Click event for android intents*/
        webviewhtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), WebviewHTML.class);
                startActivity(i2);
            }
        });

        webviewhtmldoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });
         /*Android  android intents play Button Configure*/
        fragments=(ImageView)v.findViewById(R.id.fragments);
        fragmentsdoc=(ImageView)v.findViewById(R.id.fragmentsdoc);
        /*Click event for android intents*/
        fragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), Fragments.class);
                startActivity(i2);
            }
        });

        fragmentsdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });
        /*Android  android intents play Button Configure*/
        spf=(ImageView)v.findViewById(R.id.spf);
        spfdoc=(ImageView)v.findViewById(R.id.spfdoc);
        /*Click event for android intents*/
        spf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), SPF.class);
                startActivity(i2);
            }
        });

        spfdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

         /*Android  android intents play Button Configure*/
        sqliteinsert=(ImageView)v.findViewById(R.id.sqliteinsert);
        sqliteinsertdoc=(ImageView)v.findViewById(R.id.sqliteinsertdoc);
        /*Click event for android intents*/
        sqliteinsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), SQLiteInsert.class);
                startActivity(i2);
            }
        });

        sqliteinsertdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });

        /*Android  android intents play Button Configure*/
        sqlite=(ImageView)v.findViewById(R.id.sqlite);
        sqlitedoc=(ImageView)v.findViewById(R.id.sqlitedoc);
        /*Click event for android intents*/
        sqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(), SQLite.class);
                startActivity(i2);
            }
        });

        sqlitedoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), " Under Process....!", Toast.LENGTH_SHORT).show();

            }
        });
        return v;
    }





}
