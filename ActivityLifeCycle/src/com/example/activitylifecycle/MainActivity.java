package com.example.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "OnCreate invoked");
        Toast.makeText(this, "OnCreate invoked", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	Log.d("LifeCycle", "onStart invoked");
    	Toast.makeText(this, "onStart invoked", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	Log.d("LifeCycle", "onResume invoked");
    	Toast.makeText(this, "onResume invoked", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	Log.d("LifeCycle", "onPause invoked");
    	Toast.makeText(this, "onPause invoked", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	Log.d("LifeCycle", "onStop invoked");
    	Toast.makeText(this, "onStop invoked", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	super.onRestart();
    	Log.d("LifeCycle", "onRestart invoked");
    	Toast.makeText(this, "onRestart invoked", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	Log.d("LifeCycle", "onDestroy invoked");
    	Toast.makeText(this, "onDestroy invoked", Toast.LENGTH_SHORT).show();
    }
}
