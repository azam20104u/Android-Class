package com.example.fragmentlifecycle;

import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
    public void go(View v) {
		if (v.getId()==R.id.button1) {
			Fragment1 fr1=new Fragment1();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.replace(R.id.fragment1, fr1);
			ft.commit();
		} else {
			Fragment0 fr0=new Fragment0();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.replace(R.id.fragment1, fr0);
			ft.commit();
		}
	}
}
