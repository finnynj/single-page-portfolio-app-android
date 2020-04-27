package com.example.profileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button  btcall;
    Button btnmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btcall = findViewById(R.id.call_btn);
        btnmail = findViewById(R.id.email_btn);

        btcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel: 7737227177"));
                startActivity(callIntent);
            }
        });

        btnmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto: finny.nj@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Lets have a meeting");
                intent.putExtra(Intent.EXTRA_TEXT, "Hi, This <Your name>");

                    startActivity(intent);


        }
        });

    }

    public void webGit(View view){
        gitUrl("https://github.com/finnynj");
    }

    public void gitUrl(String url){
        Uri uri = Uri.parse(url);
        Intent launchGit = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchGit);
    }

    public void webFb(View view){
        fbUrl("https://www.linkedin.com/in/finnynj/");
    }
    public void fbUrl(String url){
        Uri uri = Uri.parse(url);
        Intent launchfb = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchfb);
    }

    public void webGoogle(View view){
        googleUrl("https://www.linkedin.com/in/finnynj/");
    }
    public void googleUrl(String url){
        Uri uri = Uri.parse(url);
        Intent launchGoogle = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchGoogle);
    }

    public void webinsta(View view){
        instaUrl("https://www.instagram.com/finnysjose/");
    }
    public void instaUrl(String url){
        Uri uri = Uri.parse(url);
        Intent launchInsta = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchInsta);
    }

}

