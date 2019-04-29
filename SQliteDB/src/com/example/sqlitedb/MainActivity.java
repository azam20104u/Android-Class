package com.example.sqlitedb;

import java.util.ArrayList;
import java.util.List;

import android.R.anim;
import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	DBHack db;
	EditText name,phone,id;
	ListView contactListView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new DBHack(getApplicationContext());
        name=(EditText) findViewById(R.id.editText1);
        phone=(EditText) findViewById(R.id.editText2);
        id=(EditText) findViewById(R.id.editText3);
        contactListView=(ListView)findViewById(R.id.listView1);
        viewData();
        contactListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Contacts contact=(Contacts) contactListView.getItemAtPosition(arg2);
				name.setText(contact.getName());
		    	phone.setText(String.valueOf(contact.getPhone()));
		    	id.setText(String.valueOf(contact.getId()));
			}
		});
    }
    public void saveData(View v) {
    	String tid=id.getText().toString();
    	String ename=name.getText().toString();
		String tphone=phone.getText().toString();
    	if (!ename.equals("")&&ename!=null&&!tphone.equals("")&&tphone!=null&&tid.equals("")) {
    		long ephone=Long.parseLong(tphone);
    		Long l=db.saveData(ename, ephone);
			if (l>0) {
				Toast.makeText(getApplicationContext(), "data saved", Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(), "failed", Toast.LENGTH_SHORT).show();
			}
		} else {
			Toast.makeText(getApplicationContext(), "Please fill the input", Toast.LENGTH_SHORT).show();
		}
		viewData();
	}
    public void viewData(){
    	Cursor cursor=db.viewAll();
    	//for alert dialog
    	/*StringBuffer sb=new StringBuffer();
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
    	builder.show();*/
    	
    	List<Contacts> list=new ArrayList<Contacts>();
    	if (cursor.getCount()>0) {
			while (cursor.moveToNext()) {
				Contacts contact=new Contacts();
				contact.setId(cursor.getInt(0));
				contact.setName(cursor.getString(1));
				contact.setPhone(cursor.getLong(2));
				list.add(contact);
			}
		}
    	ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
    	contactListView.setAdapter(adapter);
    }
    public void clearData(View v){
    	name.setText("");
    	phone.setText("");
    	id.setText("");
    }
    public void updateData(View v){
    	String tid=id.getText().toString();
    	String ename=name.getText().toString();
		String tphone=phone.getText().toString();
		int id=Integer.parseInt(tid);
		long ephone=Long.parseLong(tphone);
		
		Contacts contact=new Contacts();
		contact.setId(id);
		contact.setName(ename);
		contact.setPhone(ephone);
		
    	db.updateContact(contact);
    	viewData();
    }
    public void deleteData(View v){
    	String tid=id.getText().toString();
    	db.deleteContact(tid);
    	viewData();
    }
}
