package com.example.rajneeshshukla.imageswicherdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mImage;
    private Button mChangeBtn;
    private int imageIndex=0;

    private int[] img = {R.drawable.ic_one, R.drawable.ic_two, R.drawable.ic_launcher_background,
                    R.drawable.office};
    int maxIndex = img.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get reference to widget
        mImage = findViewById(R.id.imageViewId);
        mChangeBtn = findViewById(R.id.changeBtnId);

        mChangeBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(imageIndex==maxIndex) {
           imageIndex=0;
        }

        Log.e("Main Activity", "Set Image Index" + imageIndex);
        mImage.setImageResource(img[imageIndex]);
        imageIndex++;
    }
}
