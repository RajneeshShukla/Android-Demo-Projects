package com.example.rajneeshshukla.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpinner = findViewById(R.id.mySpinner);
        Log.e("Adapter" ,"Pass 1");
        Log.e("Adapter" ,"Pass 2");
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.numbers, android.R.layout.simple_spinner_item );
        Log.e("Adapter" ,"Pass 3");
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Log.e("Adapter" ,"Pass 4");
        /* Set the adapter*/
        mSpinner.setAdapter(adapter);
        Log.e("Adapter" ,"Pass 5");
        mSpinner.setOnItemSelectedListener(this);
        Log.e("Adapter" ,"Pass 6");
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(this, "Bye Bye", Toast.LENGTH_SHORT).show();
    }


}
