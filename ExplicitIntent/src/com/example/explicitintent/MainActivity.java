package com.example.explicitintent;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView2);
    }
    public void goSecond(View v) {
    	//1. without sending data MainActivity to SecondActivity
		/*Intent intent=new Intent(this,SecondActivity.class);
		startActivity(intent);*/
    	
    	//2. sending data from MainAcivity to SecondActivity
    	/*Intent intent=new Intent(this,SecondActivity.class);
    	intent.putExtra("data", "data from MainActivity");
		startActivity(intent);*/
    	
    	//3. sending data from Main to Second and received data from Second to Main
    	Intent intent=new Intent(this,SecondActivity.class);
    	intent.putExtra("data", "data from MainActivity");
    	startActivityForResult(intent, 2);
	}
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	if (resultCode==RESULT_OK) {			
    		tv.setText(data.getStringExtra("data"));
		}
    }
}
