package com.example.rajneeshshukla.webbrowserdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;
    private EditText mUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = findViewById(R.id.webView);
    }

    public void loadURL(View view) {
        mUrl = findViewById(R.id.url);
        //get String from URL
        String myUrl = mUrl.getText().toString();
        mWebView.loadUrl(myUrl);

    }
}
