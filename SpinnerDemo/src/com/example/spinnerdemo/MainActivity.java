package com.example.spinnerdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	Spinner sp;
	String[] arr={"India","USA","China","Pakistan"};
	String country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item,arr);
        sp=(Spinner) findViewById(R.id.spinner1);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				country=arr[position];
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
		});
    }
    public void add(View v){
    	Toast.makeText(this, country, Toast.LENGTH_SHORT).show();
    }
}