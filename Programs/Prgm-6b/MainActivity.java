package com.example.layout_event_handler_6ii;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity{
	private EditText t1,t2;
	private Button b1;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t1 = (EditText)findViewById(R.id.t1);
		t2 = (EditText)findViewById(R.id.t2);
		b1 = (Button)findViewById(R.id.b1);
		b1.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				String v1 = t1.getText().toString();
				String v2 = t2.getText().toString();
				int a = Integer.parseInt(v1);
				int b = Integer.parseInt(v2);
				int sum = a + b;
				Toast.makeText(MainActivity.this, "Sum of Two numbers is "+sum ,Toast.LENGTH_LONG).show();
			}
		});
	}
}

