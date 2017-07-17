package com.viv.lifemeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.userName);
        final EditText etPassword = (EditText) findViewById(R.id.password);
        final Button bLogin = (Button) findViewById(R.id.loginButton);
        final TextView registerLink =(TextView) findViewById(R.id.registerLink);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent (Login.this, StartPage.class);
                Login.this.startActivity(registerIntent);
            }
        });
    }

}
