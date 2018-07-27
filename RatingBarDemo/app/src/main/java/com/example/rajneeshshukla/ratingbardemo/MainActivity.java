package com.example.rajneeshshukla.ratingbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mSubmitBtn;
    private RatingBar mRatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRatingBar = findViewById(R.id.ratingBarId);
        mSubmitBtn = findViewById(R.id.submitButtonId);
        //Set lisner on Button
        mSubmitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //getting the ratting from the ratinf bar
        Float rate = Float.valueOf(mRatingBar.getRating());

        //Display rating on Toast
        Toast.makeText(this, "You give " + rate, Toast.LENGTH_SHORT).show();
    }
}
