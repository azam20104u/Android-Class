package com.azam.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyRecievers extends BroadcastReceiver{

	@Override
	public void onReceive(Context arg0, Intent arg1) {

		Toast.makeText(arg0, "Phone Status is changed", Toast.LENGTH_SHORT).show();
	}

	
}
