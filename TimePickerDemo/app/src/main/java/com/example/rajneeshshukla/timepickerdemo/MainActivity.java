package com.example.rajneeshshukla.timepickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private TimePicker mTimePicker;
    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get reference to member variable
        mButton = findViewById(R.id.buttonId);
        mTextView = findViewById(R.id.textViewId);
        mTimePicker = findViewById(R.id.timePickerId);
    }
}
