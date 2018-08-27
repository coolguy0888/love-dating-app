package com.example.junior.love;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Change_Password extends AppCompatActivity {

    public void clickBackToLoginScreenButton(View view){
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change__password);
    }
}
