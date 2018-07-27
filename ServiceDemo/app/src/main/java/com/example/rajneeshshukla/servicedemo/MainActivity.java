package com.example.rajneeshshukla.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startServiceDemo(View view) {
        Intent mIntent  = new Intent(this , MyService.class);
        startService(mIntent);
    }

    public void stopServiceDemo(View view) {
        Intent mIntent = new Intent(this, MyService.class);
        stopService(mIntent);
    }
}
