package com.example.rajneeshshukla.dimstatusandnavigationbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mHideBtn;
    private Button mShowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHideBtn = findViewById(R.id.button_id);
        mHideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View decorView = getWindow().getDecorView();
                int uiOptions = View.SYSTEM_UI_FLAG_LOW_PROFILE;
                decorView.setSystemUiVisibility(uiOptions);
            }
        });

        mShowBtn = findViewById(R.id.button_id2);
        mShowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View decorView = getWindow().getDecorView();
                decorView.setSystemUiVisibility(0);
            }
        });
    }
}
