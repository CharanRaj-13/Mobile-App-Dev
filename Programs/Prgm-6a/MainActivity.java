package com.example.simple_gui_components_6i;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends Activity{
	Button b1,b2;
	TextView t1;
	float font;
	int i = 1;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button)findViewById(R.id.b1);
		t1 = (TextView)findViewById(R.id.t1);
		b1.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				t1.setTextSize(font);
				font = font + 4;
				if(font == 40)
					font = 20;
			}
		});
		b2 = (Button)findViewById(R.id.b2);
		b2.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				switch(i){
				case 1:
					t1.setTextColor(Color.parseColor("#000FFF"));
					break;
				case 2:
					t1.setTextColor(Color.parseColor("#2F2F2F"));
					break;
				case 3:
					t1.setTextColor(Color.parseColor("#FF0000"));
					break;
				default:
					t1.setTextColor(Color.parseColor("#800000"));
					break;
				}
				i++;
				if(i==5)
					i = 1;
			}
		});
	}
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main,menu);
		return true;
	}
}

