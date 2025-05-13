package com.example.prgm_4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.text.format.Time;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends Activity{
	TimePicker tp1;
	Button save;
	int hour, min, SystemHour, SystemMin, sum, sub, flag=0;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tp1 = (TimePicker)findViewById(R.id.tp1);
		save = (Button)findViewById(R.id.save);
		save.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				hour = tp1.getCurrentHour();
				min = tp1.getCurrentMinute();
				flag = 0;
				while(flag != 1){
					Time time = new Time();
					time.setToNow();
					SystemHour = time.hour;
					SystemMin = time.minute;
					sum = SystemHour - hour;
					sub = SystemMin - min;
					if(sum == 0){
						if(sub == 0){
							Toast.makeText(MainActivity.this,"Remainder : Set Time Arrived", Toast.LENGTH_LONG).show();
							flag = 1;
						}
					}
				}
			}
		});
	}
}