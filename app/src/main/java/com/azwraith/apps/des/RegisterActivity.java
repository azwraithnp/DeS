 package com.azwraith.apps.des;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class RegisterActivity extends AppCompatActivity {

    TextView registerText, requiredText;
     EditText fname, lname, email, bio, pno, pass, confpass;
     Button confRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerText = (TextView)findViewById(R.id.registerText);
        requiredText = (TextView)findViewById(R.id.requiredText);
        fname = (EditText) findViewById(R.id.fnameEnter);
        lname = (EditText)findViewById(R.id.lnameEnter);
        email = (EditText)findViewById(R.id.emailEnter);
        bio = (EditText)findViewById(R.id.bioEnter);
        pno = (EditText)findViewById(R.id.phoneEnter);
        pass = (EditText)findViewById(R.id.passEnter);
        confpass = (EditText)findViewById(R.id.confEnter);
        confRegister = (Button)findViewById(R.id.confRegister);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/PTN57F.ttf");

        registerText.setTypeface(tf, Typeface.BOLD);
        requiredText.setTypeface(tf, Typeface.BOLD);
        fname.setTypeface(tf, Typeface.BOLD);
        lname.setTypeface(tf, Typeface.BOLD);
        email.setTypeface(tf, Typeface.BOLD);
        bio.setTypeface(tf, Typeface.BOLD);
        pno.setTypeface(tf, Typeface.BOLD);
        pass.setTypeface(tf, Typeface.BOLD);
        confpass.setTypeface(tf, Typeface.BOLD);
        confRegister.setTypeface(tf, Typeface.BOLD);
    }
}
