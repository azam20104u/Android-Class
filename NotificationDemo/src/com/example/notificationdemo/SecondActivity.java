package com.example.notificationdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		TextView tv=(TextView) findViewById(R.id.textView1);
		tv.setText(getIntent().getStringExtra("msg"));
	}
}
