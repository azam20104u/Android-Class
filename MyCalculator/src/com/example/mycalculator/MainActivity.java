package com.example.mycalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	TextView tv,tvr;
	Button ac,pm,rm,delete,
	one,two,three,four,five,six,seven,eight,nine,
	zero,dot,equal,
	multiply,divition,plus,minus;
	
	double val1,val2;
	char operator='0';
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
    	//click listen 0 to 9 button
    	if (v.getId()==R.id.button0) {
			tv.setText(tv.getText().toString()+"0");
		}
    	if (v.getId()==R.id.button1) {
			tv.setText(tv.getText().toString()+"1");
		}
    	if (v.getId()==R.id.button2) {
			tv.setText(tv.getText().toString()+"2");
		}
    	if (v.getId()==R.id.button3) {
			tv.setText(tv.getText().toString()+"3");
		}
    	if (v.getId()==R.id.button4) {
			tv.setText(tv.getText().toString()+"4");
		}
    	if (v.getId()==R.id.button5) {
			tv.setText(tv.getText().toString()+"5");
		}
    	if (v.getId()==R.id.button6) {
			tv.setText(tv.getText().toString()+"6");
		}
    	if (v.getId()==R.id.button7) {
			tv.setText(tv.getText().toString()+"7");
		}
    	if (v.getId()==R.id.button8) {
			tv.setText(tv.getText().toString()+"8");
		}
    	if (v.getId()==R.id.button9) {
			tv.setText(tv.getText().toString()+"9");
		}
    	
    	if (v.getId()==R.id.buttonAC) {
			tv.setText(null);
			tvr.setText(null);
		}
    	
    	//click listen operator button
    	if (v.getId()==R.id.buttonMultiply) {
    		operator='*';
    		val1=Double.parseDouble(tv.getText().toString());
    		tv.setText(null);
			
		}
    	if (v.getId()==R.id.buttonDevid) {
    		operator='/';
    		val1=Double.parseDouble(tv.getText().toString());
    		tv.setText(null);
    		
		}
    	if (v.getId()==R.id.buttonPlus) {
    		operator='+';
    		val1=Double.parseDouble(tv.getText().toString());
    		tv.setText(null);
		}
    	if (v.getId()==R.id.buttonSubstruct) {
    		operator='-';
    		val1=Double.parseDouble(tv.getText().toString());
    		tv.setText(null);
		}
    	
    	
    	if (v.getId()==R.id.buttonEqual) {
				val2=Double.parseDouble(tv.getText().toString());
				double res;
				switch (operator) {
				case '*':
					res=val1*val2;
					tv.setText(String.valueOf(res));
					tvr.setText(String.valueOf(res));
					break;
				case '/':
					res=val1/val2;
					tv.setText(String.valueOf(res));
					tvr.setText(String.valueOf(res));
					break;
				case '+':
					res=val1+val2;
					tv.setText(String.valueOf(res));
					tvr.setText(String.valueOf(res));
					break;
				case '-':
					res=val1-val2;
					tv.setText(String.valueOf(res));
					tvr.setText(String.valueOf(res));
					break;
				}
		}
    }
}
