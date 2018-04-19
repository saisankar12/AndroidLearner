package com.example.venkatasaisankar.androidlearner.androiduicomponents.textview.text_view.output;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.venkatasaisankar.androidlearner.AndroidOverview;
import com.example.venkatasaisankar.androidlearner.R;
import com.example.venkatasaisankar.androidlearner.androiduicomponents.textview.text_view.sourcecode.TextViewSourceCode;

public class WidgetsTextView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets_text_view);
        final TextView tv=(TextView)findViewById(R.id.textView3);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WidgetsTextView.this, tv.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(getApplicationContext(), AndroidOverview.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_sourcecode,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.sourcecode:
                Intent i=new Intent(WidgetsTextView.this, TextViewSourceCode.class);
                startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
