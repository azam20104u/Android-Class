package com.azam.broadcastdemo;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*ConnectivityManager cm=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		boolean b=cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();
		if (b) {			
			Toast.makeText(this, "Wifi connected", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(this, "Wifi disconnected", Toast.LENGTH_SHORT).show();
		}*/
    }
}
