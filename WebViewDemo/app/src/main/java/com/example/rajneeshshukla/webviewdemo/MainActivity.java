package com.example.rajneeshshukla.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;



public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    private String URL = "https://m.facebook.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = findViewById(R.id.web_View_Id);
        mWebView.loadUrl(URL);
    }
}
