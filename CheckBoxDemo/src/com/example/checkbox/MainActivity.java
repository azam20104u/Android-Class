package com.example.checkbox;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	CheckBox cb1,cb2,cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1=(CheckBox) findViewById(R.id.checkBox1);
        cb2=(CheckBox) findViewById(R.id.checkBox2);
        cb3=(CheckBox) findViewById(R.id.checkBox3);
    }
    public void submit(View v){
    	StringBuffer s=new StringBuffer();
    	if (cb1.isChecked()) {
			s.append(cb1.getText().toString()+"\n");
		}
    	if (cb2.isChecked()) {
			s.append(cb2.getText().toString()+"\n");
		}
    	if (cb3.isChecked()) {
			s.append(cb2.getText().toString());
		}
    	Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
