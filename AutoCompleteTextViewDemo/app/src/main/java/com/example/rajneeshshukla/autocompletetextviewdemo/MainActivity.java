package com.example.rajneeshshukla.autocompletetextviewdemo;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import static android.R.layout.simple_spinner_item;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.autoTextFiller);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line
                , getResources().getStringArray(R.array.city));
        mTextView.setThreshold(3);
        mTextView.setAdapter(adapter);

        mTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You City is "+ adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
