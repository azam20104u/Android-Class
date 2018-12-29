package com.example.mycalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	TextView tv,tvr;
	Button ac,pm,rm,delete,
	zero,one,two,three,four,five,six,seven,eight,nine,
	dot,
	equal,multiply,divition,plus,minus;
	
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
        
        zero=(Button) findViewById(R.id.button0);
        one=(Button) findViewById(R.id.button1);
        two=(Button) findViewById(R.id.button2);
        three=(Button) findViewById(R.id.button3);
        four=(Button) findViewById(R.id.button4);
        five=(Button) findViewById(R.id.button5);
        six=(Button) findViewById(R.id.button6);
        seven=(Button) findViewById(R.id.button7);
        eight=(Button) findViewById(R.id.button8);
        nine=(Button) findViewById(R.id.button9);
        
        dot=(Button) findViewById(R.id.buttonDot);
        
        equal=(Button) findViewById(R.id.buttonEqual);
        multiply=(Button) findViewById(R.id.buttonMultiply);
        divition=(Button) findViewById(R.id.buttonDevid);
        plus=(Button) findViewById(R.id.buttonPlus);
        minus=(Button) findViewById(R.id.buttonSubstruct);
    }
    
    public void click(View v){
    	/*****************click listen Number button*****************/
    	if (v.getId()==R.id.button0) {
			tvr.setText(tvr.getText().toString()+"0");
		}
    	if (v.getId()==R.id.button1) {
			tvr.setText(tvr.getText().toString()+"1");
		}
    	if (v.getId()==R.id.button2) {
			tvr.setText(tvr.getText().toString()+"2");
		}
    	if (v.getId()==R.id.button3) {
			tvr.setText(tvr.getText().toString()+"3");
		}
    	if (v.getId()==R.id.button4) {
			tvr.setText(tvr.getText().toString()+"4");
		}
    	if (v.getId()==R.id.button5) {
			tvr.setText(tvr.getText().toString()+"5");
		}
    	if (v.getId()==R.id.button6) {
			tvr.setText(tvr.getText().toString()+"6");
		}
    	if (v.getId()==R.id.button7) {
			tvr.setText(tvr.getText().toString()+"7");
		}
    	if (v.getId()==R.id.button8) {
			tvr.setText(tvr.getText().toString()+"8");
		}
    	if (v.getId()==R.id.button9) {
			tvr.setText(tvr.getText().toString()+"9");
		}
    	if (v.getId()==R.id.buttonDot) {
			tvr.setText(tvr.getText().toString()+".");
		}
    	
    	
    	/*****************click listen operator ac or delete button*****************/
    	if (v.getId()==R.id.buttonAC) {
			tvr.setText(null);
			tv.setText(null);
		}
    	if (v.getId()==R.id.buttonDelete) {
    		if (tvr.getText().length()>0) {
    			CharSequence cs=tvr.getText().toString();
    			tvr.setText(cs.subSequence(0, cs.length()-1));
			}
		}
    	
    	/*****************click listen operator button*****************/
    	if (v.getId()==R.id.buttonMultiply) {
    		operator='*';
    		val1=Double.parseDouble(tvr.getText().toString());
    		tvr.setText(null);
			
		}
    	if (v.getId()==R.id.buttonDevid) {
    		operator='/';
    		val1=Double.parseDouble(tvr.getText().toString());
    		tvr.setText(null);
    		
		}
    	if (v.getId()==R.id.buttonPlus) {
    		operator='+';
    		val1=Double.parseDouble(tvr.getText().toString());
    		tvr.setText(null);
		}
    	if (v.getId()==R.id.buttonSubstruct) {
    		operator='-';
    		val1=Double.parseDouble(tvr.getText().toString());
    		tvr.setText(null);
		}
    	
    	/*****************click listen = button*****************/
    	if (v.getId()==R.id.buttonEqual) {
				val2=Double.parseDouble(tvr.getText().toString());
				double res=0;
				switch (operator) {
				case '*':
					res=val1*val2;
					break;
				case '/':
					res=val1/val2;
					break;
				case '+':
					res=val1+val2;
					break;
				case '-':
					res=val1-val2;
					break;
				}
				tvr.setText(String.valueOf(res));
				tv.setText(String.valueOf(val1+""+operator+""+val2+"="+res));
		}
    }
}
