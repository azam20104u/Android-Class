package com.example.fragmentsenddata;

import android.support.v7.app.ActionBarActivity;
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
    public void go(View v){
    	Fragment0 fr=new Fragment0();
    	Bundle b=new Bundle();
    	b.putString("k1", "This is data from Activity");
    	fr.setArguments(b);
    	getFragmentManager().beginTransaction().replace(R.id.fragment1, fr).commit();
    }
}
