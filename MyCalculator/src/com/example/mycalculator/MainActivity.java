package com.example.mycalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	TextView tv,tvr;
	Button ac,pm,rm,delete,
	one,two,three,four,five,six,seven,eight,nine,
	zero,dot,equal,
	multiply,divition,plus,minus;
	
	StringBuffer sb=new StringBuffer();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv=(TextView) findViewById(R.id.textView);
        tvr=(TextView) findViewById(R.id.textViewResult);
        
        ac=(Button) findViewById(R.id.buttonAC);
        pm=(Button) findViewById(R.id.buttonPM);
        rm=(Button) findViewById(R.id.buttonReminder);
        delete=(Button) findViewById(R.id.buttonDelete);
        
        one=(Button) findViewById(R.id.button1);
        two=(Button) findViewById(R.id.button2);
        three=(Button) findViewById(R.id.button3);
        four=(Button) findViewById(R.id.button4);
        five=(Button) findViewById(R.id.button5);
        six=(Button) findViewById(R.id.button6);
        seven=(Button) findViewById(R.id.button7);
        eight=(Button) findViewById(R.id.button8);
        nine=(Button) findViewById(R.id.button9);
        
        zero=(Button) findViewById(R.id.button0);
        dot=(Button) findViewById(R.id.buttonDot);
        equal=(Button) findViewById(R.id.buttonEqual);
        
        multiply=(Button) findViewById(R.id.buttonMultiply);
        divition=(Button) findViewById(R.id.buttonDevid);
        plus=(Button) findViewById(R.id.buttonPlus);
        minus=(Button) findViewById(R.id.buttonSubstruct);
    }
    
    public void click(View v){
    	
    }
}
