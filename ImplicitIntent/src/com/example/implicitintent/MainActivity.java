package com.example.implicitintent;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

	EditText et1,et2;
	ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        iv=(ImageView)findViewById(R.id.imageView1);
    }
    public void call(View v) {
    	String phNo=et1.getText().toString();
		Intent intent=new Intent(Intent.ACTION_DIAL);
		intent.setData(Uri.parse("tel: "+phNo));
		startActivity(intent);
	}
    public void brows(View v) {
    	String web=et2.getText().toString();
		Intent intent=new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse(web));
		startActivity(intent);
	}
    public void camera(View v) {
		Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(intent, 2);
	}
    @Override
    protected void onActivityResult(int arg0, int arg1, Intent arg2) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(arg0, arg1, arg2);
    	Bitmap bitmap=(Bitmap) arg2.getExtras().get("data");
    	iv.setImageBitmap(bitmap);
    }
}
