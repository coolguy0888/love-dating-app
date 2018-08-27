package com.example.junior.love;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public Intent forgotPasswordActivity, signUpScreenActivity, mainActivity, changePasswordActivity;
    public Button forgetPassword, loginButton, tinySignUpButton,
                  getCodeButton, changePasswordButton, savePasswordButton,
                  backToLoginScreenButton, signUpButton, tinyLogInHereButton;

    public void clickForgetPassword(View view){
        startActivity(forgotPasswordActivity);


    }

    public void clickSignUpScreenActivity(View view){
        startActivity(signUpScreenActivity);

    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //all activities
        forgotPasswordActivity = new Intent(this, Forgot_Password.class);
        signUpScreenActivity = new Intent(this, signUp_screen.class);
        mainActivity = new Intent(this, MainActivity.class);
        changePasswordActivity = new Intent(this, Change_Password.class);

        //all buttons
        forgetPassword = (Button) findViewById(R.id.forgetPassword);
        loginButton = (Button) findViewById(R.id.loginButton);
        tinySignUpButton = (Button) findViewById(R.id.tinySignUpButton);
        getCodeButton = (Button) findViewById(R.id.getCodeButton);
        changePasswordButton = (Button) findViewById(R.id.changePasswordButton);
        savePasswordButton = (Button) findViewById(R.id.savePasswordButton);
        backToLoginScreenButton = (Button) findViewById(R.id.backToLoginScreenButton);
        signUpButton = (Button) findViewById(R.id.signUpButton);
        tinyLogInHereButton = (Button) findViewById(R.id.tinyLogInHereButton);







    }


}
