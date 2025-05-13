package com.example.sms_10iii;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	private Button send;
	private EditText phno,sms;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phno = (EditText)findViewById(R.id.phno);
        sms = (EditText)findViewById(R.id.sms);
        send = (Button)findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View V){
	        	String phonenum = phno.getText().toString().trim();
	        	String mess = sms.getText().toString();
	        	if(!phonenum.equals(" ")){
	        		if(!mess.equals(" ")){
	        			Toast.makeText(MainActivity.this,"Message Sent Successfully to : "+phonenum,Toast.LENGTH_LONG).show();
	        		}else{
	        			Toast.makeText(MainActivity.this,"Enter Proper Message",Toast.LENGTH_LONG).show();
	
	        		}
	        	}else{
	    			Toast.makeText(MainActivity.this,"Enter Phone Number",Toast.LENGTH_LONG).show();
	        	}
        	}
        });
    }

    
}
