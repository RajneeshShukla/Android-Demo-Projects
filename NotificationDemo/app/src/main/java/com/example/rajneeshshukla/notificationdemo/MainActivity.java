package com.example.rajneeshshukla.notificationdemo;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void showNotification(View view) {
        NotificationManagerCompat myNotificationManager = NotificationManagerCompat.from(this);

        NotificationCompat.Builder myNotification = new NotificationCompat.Builder(this);

        myNotification.setContentTitle("New Notification");
        myNotification.setContentText("Have you done your launch");
        myNotification.setSmallIcon(android.R.drawable.btn_dialog);

        Intent myIntent = new Intent(this, MainActivity.class);
        PendingIntent myPendingIntent = PendingIntent.getActivity(this,1, myIntent, 0);
        myNotification.setContentIntent(myPendingIntent);
        myNotification.setAutoCancel(true);         

        myNotificationManager.notify(1, myNotification.build());
    }
}
