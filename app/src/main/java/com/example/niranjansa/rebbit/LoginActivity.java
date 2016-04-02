package com.example.niranjansa.rebbit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    protected TextView mSignUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 9090

        mSignUpTextView=(TextView)findViewById(R.id.signupText);
        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Since we are in anonymous inner class this for referring the
                * context will not work so we use LoginActivity.this */
                Intent intent=new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });


    }

}
