package com.example.williams.taqueria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

public class MainActivity extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente =(Button)findViewById(R.id.button);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent siguiente = new  Intent (MainActivity.this,Main2Activity.class);

                startActivity(siguiente);
            }
        });




        if (AccessToken.getCurrentAccessToken() == null) {
            goLoginScreen();
        }

    }

    private void goLoginScreen() {
        Intent intent = new Intent(this, loginFacebook.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void logout(View view) {
        LoginManager.getInstance().logOut();
        goLoginScreen();
    }






}

