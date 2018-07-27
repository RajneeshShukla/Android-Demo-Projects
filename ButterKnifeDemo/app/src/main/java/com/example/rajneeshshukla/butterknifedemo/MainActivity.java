package com.example.rajneeshshukla.butterknifedemo;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_view_id)
    TextView mTextView;

    @BindView(R.id.edit_text_id)
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mTextView.setText(R.string.hello_rajneesh);
    }

    @OnClick(R.id.button_id)
    public void onShowText(View view){
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        String mText = mEditText.getText().toString();
        mTextView.setText(mText);
    }

}
