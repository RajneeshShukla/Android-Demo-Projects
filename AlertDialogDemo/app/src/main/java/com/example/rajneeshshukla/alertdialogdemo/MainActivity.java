package com.example.rajneeshshukla.alertdialogdemo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get refernce of button
        mButton1 = findViewById(R.id.button1_id);
        mButton2 = findViewById(R.id.button2_id);
        mButton3 = findViewById(R.id.button3_id);

        //set lishner on the button
        mButton3.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton1.setOnClickListener(this);
    }

    /**
     * Handle the onClick event on the Button
     */
    @Override
    public void onClick(View view) {

        AlertDialog.Builder mAlertDialog;

        switch (view.getId()) {

            //button 1 is clicked
            case R.id.button1_id:
                mAlertDialog = new AlertDialog.Builder(this);
                mAlertDialog.setTitle(R.string.my_alert);
                mAlertDialog.setMessage(R.string.alert_box_message);
                mAlertDialog.setIcon(R.mipmap.ic_launcher);
                mAlertDialog.setPositiveButton(getString(R.string.ok_btn), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "OK Button Clicked!", Toast.LENGTH_SHORT).show();
                    }
                }).show();

                break;

            //button 2 is clicked
            case R.id.button2_id:
                mAlertDialog = new AlertDialog.Builder(this);
                mAlertDialog.setTitle(R.string.my_alert);
                mAlertDialog.setMessage(R.string.alert_box_message);
                mAlertDialog.setIcon(R.mipmap.ic_launcher);
                mAlertDialog.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "OK Button Clicked!", Toast.LENGTH_SHORT).show();
                    }
                })
                        .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "No button is clicked", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
                break;

                //Button 3 is clicked
            case R.id.button3_id:
                mAlertDialog = new AlertDialog.Builder(this);
                mAlertDialog.setTitle(R.string.my_alert);
                mAlertDialog.setMessage(R.string.alert_box_message);
                mAlertDialog.setIcon(R.mipmap.ic_launcher);
                mAlertDialog.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "OK Button Clicked!", Toast.LENGTH_SHORT).show();
                    }
                });

                //set Negative button
                mAlertDialog.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "No button is clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                //set cencel button
                mAlertDialog.setNeutralButton(getString(R.string.back), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Back button is clicked!", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.show();
        }
    }
}
