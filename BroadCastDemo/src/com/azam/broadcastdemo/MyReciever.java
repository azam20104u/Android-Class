package com.azam.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver{

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		/*ConnectivityManager cm=(ConnectivityManager) arg0.getSystemService(Context.CONNECTIVITY_SERVICE);
		boolean b=cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnected();
		if (b) {			
			Toast.makeText(arg0, "Wifi is Turn On", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(arg0, "Wifi is Turn Off", Toast.LENGTH_SHORT).show();
		}*/
		Toast.makeText(arg0, "Wifi status is changed", Toast.LENGTH_SHORT).show();
	}
}
