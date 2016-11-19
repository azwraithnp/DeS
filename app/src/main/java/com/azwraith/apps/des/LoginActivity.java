package com.azwraith.apps.des;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class LoginActivity extends AppCompatActivity {

    private LoginButton loginButton;
    private CallbackManager callbackManager;
    private TextView welcomeText, signIn, forgotText, ORText;
    private EditText username, password;
    Button signInButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_login);

        loginButton = (LoginButton)findViewById(R.id.login_button);
        welcomeText = (TextView)findViewById(R.id.welcomeText);
        signIn = (TextView)findViewById(R.id.signInText);
        signInButton = (Button)findViewById(R.id.SignButton);
        registerButton = (Button)findViewById(R.id.RegisterButton);
        forgotText = (TextView)findViewById(R.id.forgotText);
        ORText = (TextView)findViewById(R.id.ORText);
        username = (EditText)findViewById(R.id.usernameEnter);
        password = (EditText)findViewById(R.id.passEnter);

        callbackManager = CallbackManager.Factory.create();

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Toast.makeText(LoginActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                Toast.makeText(LoginActivity.this, "Login cancelled!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(LoginActivity.this, "Login failed!" + error.toString(), Toast.LENGTH_SHORT).show();
            }
        });




        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/PTN57F.ttf");
        welcomeText.setTypeface(tf, Typeface.BOLD);
        signIn.setTypeface(tf, Typeface.BOLD);
        signInButton.setTypeface(tf, Typeface.BOLD);
        registerButton.setTypeface(tf, Typeface.BOLD);
        forgotText.setTypeface(tf, Typeface.BOLD);
        ORText.setTypeface(tf, Typeface.BOLD);
        username.setTypeface(tf);
        password.setTypeface(tf);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);

    }
}
