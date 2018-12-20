package com.example.fragmentlifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Fragment1 extends Fragment {
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		Toast.makeText(getActivity(), "onAttach Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Toast.makeText(getActivity(), "onCreate Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Toast.makeText(getActivity(), "onCreateView Fragment1", Toast.LENGTH_SHORT).show();
		return inflater.inflate(R.layout.fragment1, container,false);
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Toast.makeText(getActivity(), "onActivityCreated Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onViewStateRestored(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewStateRestored(savedInstanceState);
		Toast.makeText(getActivity(), "onViewStateRestored Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Toast.makeText(getActivity(), "onStart Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Toast.makeText(getActivity(), "onResume Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Toast.makeText(getActivity(), "onPause Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Toast.makeText(getActivity(), "onStop Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		Toast.makeText(getActivity(), "onDestroyView Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(getActivity(), "onDestroy Fragment1", Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Toast.makeText(getActivity(), "onDetach Fragment1", Toast.LENGTH_SHORT).show();
	}
}
