package com.viv.lifemeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartPage extends AppCompatActivity {

    private EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        final EditText etUsername = (EditText) findViewById(R.id.userName);
        final EditText etPassword = (EditText) findViewById(R.id.password);
        final Button bRegister = (Button) findViewById(R.id.bRegister);

    }

}
