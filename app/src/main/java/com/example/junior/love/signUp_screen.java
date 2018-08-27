package com.example.junior.love;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class signUp_screen extends AppCompatActivity {

    public void clickTinyLogInHereButton(View view){
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
    }
}
