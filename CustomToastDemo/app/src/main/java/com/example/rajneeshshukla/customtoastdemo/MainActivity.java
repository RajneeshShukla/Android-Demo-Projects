package com.example.rajneeshshukla.customtoastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Toast", "onClick called" );
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.show_toast_btn_id);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater myInflater = getLayoutInflater();
                View layout = myInflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_container));

//                //set text on text view
//                TextView myTextView = findViewById(R.id.textid);
//                myTextView.setText(R.string.toast_message);
//                Log.e("Toast", "Line 1" );
                Toast myToast = new Toast(getApplicationContext());
                myToast.setGravity(Gravity.CENTER_VERTICAL, 100, 10
                );
                myToast.setDuration(Toast.LENGTH_SHORT);
                myToast.setView(layout);
                myToast.show();
             }
        });
    }

}
