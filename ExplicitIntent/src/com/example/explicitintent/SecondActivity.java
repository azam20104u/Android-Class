package com.example.explicitintent;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		//if data is receiving from MainActivity
		Intent intent=getIntent();
		Bundle bundle=intent.getExtras();
		String data=bundle.getString("data");
		TextView tv=(TextView) findViewById(R.id.textView2);
		tv.setText(data);
	}
	public void goFirst(View v) {
		// without sending data from Second to MainActivity
		/*Intent intent=new Intent(this,MainActivity.class);
		startActivity(intent);*/
		
		//sending data from  Second to MainActivity
		Intent intent=new Intent();
		intent.putExtra("data", "data from SecondActivity");
		setResult(RESULT_CANCELED, intent);
		finish();
	}
}
