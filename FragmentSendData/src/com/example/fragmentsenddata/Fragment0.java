package com.example.fragmentsenddata;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment0 extends Fragment{
	View v;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	v=inflater.inflate(R.layout.fragment0, container,false);
	
	TextView tv=(TextView) v.findViewById(R.id.textView1);
	Bundle b=getArguments();
	if (b!=null) {
		String name=b.getString("k1");
		tv.setText(name);
	}
	return v;
}
}
