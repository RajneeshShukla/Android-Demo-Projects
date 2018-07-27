package com.example.rajneeshshukla.asynctaskdemo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.widget.ProgressBar;

public class MyAsyncTask extends AsyncTask< void , Integer, String> {

    Context context;
    ProgressDialog pd;

    MyAsyncTask(Context context){
        this.context = context;
     }

    @Override
    protected void onPreExecute() {
        pd = new ProgressDialog(context);
        pd.setTitle("ProgressBar...");
        pd.setMessage("Downloading file...");
        pd.setMax(10);
        pd.setIcon(R.drawable.ic_launcher_background);
        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, (CharSequence) context, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                pd.cancel();
            }
        });
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(void... voids) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
