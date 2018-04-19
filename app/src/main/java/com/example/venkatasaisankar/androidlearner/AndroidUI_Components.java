package com.example.venkatasaisankar.androidlearner;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.venkatasaisankar.androidlearner.androiduicomponents.textview.edittext.output.WidgetsEditText;
import com.example.venkatasaisankar.androidlearner.androiduicomponents.textview.edittext.sourcecode.EditTextSourceCode;
import com.example.venkatasaisankar.androidlearner.androiduicomponents.textview.text_view.output.WidgetsTextView;
import com.example.venkatasaisankar.androidlearner.androiduicomponents.textview.text_view.sourcecode.TextViewSourceCode;

/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidUI_Components extends Fragment {

    Button widgets,layout,containers,images,androiddate;

    LinearLayout linearwidgets,linearlayout,linearcontainer,
            linearimages,lineardatetime;

    ImageView tvout,textcode,etout,edittextcode;

    public AndroidUI_Components() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v=inflater.inflate(R.layout.fragment_android_ui_components, container, false);

        //v.setBackgroundColor(Integer.parseInt("#ff99ff"));
        /*Configure Android Widgets TextView ID*/
        widgets=(Button) v.findViewById(R.id.androidwidgets);
        /*Configure Android Widgets  LinerLayout ID*/
        linearwidgets=(LinearLayout) v.findViewById(R.id.widgets);
        widgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearwidgets.setVisibility(View.VISIBLE);
                linearlayout.setVisibility(View.GONE);
                linearcontainer.setVisibility(View.GONE);
                linearimages.setVisibility(View.GONE);
                lineardatetime.setVisibility(View.GONE);

            }
        });

        linearlayout=(LinearLayout) v.findViewById(R.id.layout);
        layout=(Button) v.findViewById(R.id.androidlayout);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearwidgets.setVisibility(View.GONE);
                linearlayout.setVisibility(View.VISIBLE);
                linearcontainer.setVisibility(View.GONE);
                linearimages.setVisibility(View.GONE);
                lineardatetime.setVisibility(View.GONE);


            }
        });
        linearcontainer=(LinearLayout) v.findViewById(R.id.containers);
        containers=(Button) v.findViewById(R.id.androidcontainers);
        containers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearwidgets.setVisibility(View.GONE);
                linearlayout.setVisibility(View.GONE);
                linearcontainer.setVisibility(View.VISIBLE);
                linearimages.setVisibility(View.GONE);
                lineardatetime.setVisibility(View.GONE);

            }
        });

        linearimages=(LinearLayout) v.findViewById(R.id.images);
        images=(Button) v.findViewById(R.id.androidimage);
        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearwidgets.setVisibility(View.GONE);
                linearlayout.setVisibility(View.GONE);
                linearcontainer.setVisibility(View.GONE);
                linearimages.setVisibility(View.VISIBLE);
                lineardatetime.setVisibility(View.GONE);

            }
        });
        lineardatetime=(LinearLayout) v.findViewById(R.id.date);
        androiddate=(Button) v.findViewById(R.id.androiddate);
        androiddate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearwidgets.setVisibility(View.GONE);
                linearlayout.setVisibility(View.GONE);
                linearcontainer.setVisibility(View.GONE);
                linearimages.setVisibility(View.GONE);
                lineardatetime.setVisibility(View.VISIBLE);

            }
        });

/*UI-Components --> Android Widgets --> EditText   */
        tvout=(ImageView)v.findViewById(R.id.tvout);
        textcode=(ImageView)v.findViewById(R.id.textcode);
        tvout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getActivity(), WidgetsTextView.class);
                startActivity(i);

            }
        });
        textcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(), TextViewSourceCode.class);
                startActivity(i);
            }
        });
/*UI-Components --> Android Widgets --> EditText   */
        etout=(ImageView)v.findViewById(R.id.etout);
        edittextcode=(ImageView)v.findViewById(R.id.edittextcode);
        etout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getActivity(), WidgetsEditText.class);
                startActivity(i);

            }
        });
        edittextcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(), EditTextSourceCode.class);
                startActivity(i);
            }
        });
        return v;
    }



}
