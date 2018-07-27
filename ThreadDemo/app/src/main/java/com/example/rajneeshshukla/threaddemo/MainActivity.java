package com.example.rajneeshshukla.threaddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean flag = true;
    private Button mStartBtn;
    private Button mStopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartBtn = findViewById(R.id.startButton);
        mStopBtn = findViewById(R.id.stopButton);

        mStartBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Thread thread = null;

        if (view.getId() == R.id.startButton) {
            Toast.makeText(this, "Start Button Clicked!", Toast.LENGTH_SHORT).show();

            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (flag) {
                        try {
                            Log.e("Main", "Thread Id" + Thread.currentThread().getId());
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            thread.start();

        } else if (view.getId() == R.id.stopButton) {
            flag = false;
            thread.stop();
        }
    }
}
