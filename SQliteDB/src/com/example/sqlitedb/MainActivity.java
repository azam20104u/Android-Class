package com.example.sqlitedb;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	DBHack db;
	EditText name,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new DBHack(getApplicationContext());
        name=(EditText) findViewById(R.id.editText1);
        phone=(EditText) findViewById(R.id.editText2);
    }
    public void saveData(View v) {
		String ename=name.getText().toString();
		long ephone=Long.parseLong(phone.getText().toString());
		Long l=db.saveData(ename, ephone);
		if (l>0) {
			Toast.makeText(getApplicationContext(), "data saved", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(getApplicationContext(), "failed", Toast.LENGTH_SHORT).show();
		}
	}
    public void viewData(View v){
    	Cursor cursor=db.viewAll();
    	StringBuffer sb=new StringBuffer();
    	AlertDialog.Builder builder=new AlertDialog.Builder(this);
    	builder.setTitle("==Contact Details==");
    	if (cursor.getCount()==0) {
			builder.setMessage("No Contacts Found");
		} else {
			while (cursor.moveToNext()) {
				sb.append("Name: "+cursor.getString(0)+"\n"+"Phone: "+cursor.getLong(1)+"\n\n");
			}
			builder.setMessage(sb.toString());
		}
    	builder.setCancelable(true);
    	builder.show();
    }
}
