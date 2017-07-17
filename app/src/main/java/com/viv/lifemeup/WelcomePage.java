package com.viv.lifemeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void clickStart(View view){
        Intent intent = new Intent(this, StartPage.class);
        startActivity(intent);
    }

    public void clickLogin(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
