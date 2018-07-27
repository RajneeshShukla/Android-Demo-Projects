package com.example.rajneeshshukla.customlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTitle;
    private TextView mSubTitle;
    private ImageView mImage;
    private ListView mListView;
//    private int[] image;
//    private String[] tittle;
//    private String[] subTitle;

    int[] image = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    String[] tittle = {"Android", "Android", "Android", "Android", "Android", "Android", "Android", "Android", "Android", "Android",
            "Android",};
    String[] subTitle = {"Description","Description","Description","Description","Description","Description","Description","Description",
            "Description","Description","Description"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.listViewId);
        CustomArrayAdapter arrayAdapter = new CustomArrayAdapter();
    }

    class CustomArrayAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mSubTitle.length();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {


            mImage = view.findViewById(R.id.imageViewId);
            mTitle = view.findViewById(R.id.titleTextViewId);
            mSubTitle = view.findViewById(R.id.subTitleTextViewId);

            view = getLayoutInflater().inflate(R.layout.my_list, null);
            mImage.setImageResource(image[i]);
            mSubTitle.setText(subTitle[i]);
            mTitle.setText(tittle[i]);

            return view;
        }
    }
}
