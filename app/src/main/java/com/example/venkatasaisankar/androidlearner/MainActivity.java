package com.example.venkatasaisankar.androidlearner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText et1,et2;
    SharedPreferences sharedPreferences;
    boolean verify;
    public static final String SHARED_PREF = "myPref";
    private AwesomeValidation awesomeValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.username, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.mail, Patterns.EMAIL_ADDRESS, R.string.emailerror);
        sharedPreferences=getSharedPreferences(SHARED_PREF,0);
        verify=sharedPreferences.getBoolean("verify",false);
        if (verify){
            Intent i=new Intent(MainActivity.this,AndroidOverview.class);
            startActivity(i);
            finish();
        }
        et1=(EditText)findViewById(R.id.username);
        et2=(EditText)findViewById(R.id.mail);
        b1=(Button)findViewById(R.id.register);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
               /* editor.putString("Name",et1.getText().toString());*/
                editor.putString("Email",et2.getText().toString());
                editor.putBoolean("verify",true);
                if (awesomeValidation.validate()) {
                    //Toast.makeText(getApplicationContext(), "Registration Successfull", Toast.LENGTH_LONG).show();
                    //process the data further
                    if (v == b1) {
                        editor.commit();
                        Intent i=new Intent(MainActivity.this,AndroidOverview.class);
                        startActivity(i);
                        /*finish();*/
                    }
                }
            }
        });
    }
}
