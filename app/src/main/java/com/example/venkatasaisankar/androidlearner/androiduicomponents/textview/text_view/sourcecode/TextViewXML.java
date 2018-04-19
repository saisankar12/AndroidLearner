package com.example.venkatasaisankar.androidlearner.androiduicomponents.textview.text_view.sourcecode;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.venkatasaisankar.androidlearner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TextViewXML extends Fragment {


    public TextViewXML() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.ui_components, container, false);

        String textxml="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\"com.example.venkatasaisankar.androidlearner.androiduicomponents.widgetsoutput.WidgetsTextView\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView3\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:textSize=\"35dp\"\n" +
                "        android:textColor=\"@color/colorAccent\"\n" +
                "        android:layout_marginTop=\"100dp\"\n" +
                "        android:text=\"Welcome to AndroidLearner\" />\n" +
                "</LinearLayout>\n";
        TextView tv=(TextView)v.findViewById(R.id.widgettext);
        tv.setText(textxml);
        return v;
    }

}
