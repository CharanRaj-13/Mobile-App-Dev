package com.example.phone_call_10i;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity{
	private EditText phno;
	private Button call;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		phno = (EditText)findViewById(R.id.phno);
		call = (Button)findViewById(R.id.call);
		call.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				String phonenum = phno.getText().toString().trim();
				if(phonenum.equals(" ")){
					Toast.makeText(MainActivity.this, "Enter a valid Phone Number", Toast.LENGTH_SHORT).show();
					return;
				}
				else{
					Toast.makeText(MainActivity.this, "Calling : "+phonenum, Toast.LENGTH_SHORT).show();
					
				}
			}
		});
	}
    
}
