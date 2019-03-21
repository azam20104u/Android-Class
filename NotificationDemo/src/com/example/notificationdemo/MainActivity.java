package com.example.notificationdemo;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v7.app.ActionBarActivity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getNotify(View v) {
		NotificationCompat.Builder builder=new NotificationCompat.Builder(this);
		builder.setContentTitle("Notification");
		builder.setContentText("This demo notification");
		builder.setSmallIcon(R.drawable.ic_launcher);
		builder.setAutoCancel(true);
		
		//PendingIntent which response by SecondActivity
		/*Intent intent=new Intent(this, SecondActivity.class);
		intent.putExtra("msg", "This is a action message");
		PendingIntent pendingIntent=PendingIntent.getActivity(this, 0, intent, 0);
		builder.setContentIntent(pendingIntent);*/
		
		//PendingIntent with addAction 
		Intent intent=new Intent(Intent.ACTION_DIAL);
		intent.setData(Uri.parse("tel: 7278039915"));
		PendingIntent pendingIntent=PendingIntent.getActivity(this, 0, intent, 0);
		builder.addAction(R.drawable.ic_launcher, "Call", pendingIntent);
		builder.setContentIntent(pendingIntent);
		
		Notification notification=builder.build();
		NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notificationManager.notify(1, notification);
	}
}
