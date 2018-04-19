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
public class TextViewJAVA extends Fragment {


    public TextViewJAVA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.ui_components, container, false);
    String textjava="import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import com.example.venkatasaisankar.androidlearner.R;\n" +
            "\n" +
            "public class WidgetsTextView extends AppCompatActivity {\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_widgets_text_view);\n" +
            "        final TextView tv=(TextView)findViewById(R.id.textView3);\n" +
            "        tv.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Toast.makeText(WidgetsTextView.this, tv.getText().toString(), Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

        TextView tv=(TextView)v.findViewById(R.id.widgettext);
        tv.setText(textjava);
        return v;
    }

}
