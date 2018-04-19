package com.example.venkatasaisankar.androidlearner;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidConcepts extends Fragment {


    public AndroidConcepts() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v=inflater.inflate(R.layout.fragment_android_concepts, container, false);
        //v.setBackgroundColor(Integer.parseInt("#f999ff"));
        return v;
    }

}
