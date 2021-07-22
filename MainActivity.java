package com.example.clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        wv=findViewById(R.id.wv);
        wv.setWebViewClient(new WebViewClient());          // setting or rquesting website as a client
        wv.getSettings().setJavaScriptEnabled(true);      //enabling java script to use functions
        wv.loadUrl("http://skribbl.io/");                //add your required url in between " "


        }

    @Override
    public void onBackPressed()
    {                           //Setting the history in temp memory to travel back
        if(wv.canGoBack())
        {
            wv.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}