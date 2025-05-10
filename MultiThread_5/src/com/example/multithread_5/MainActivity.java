package com.example.multithread_5;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends Activity{
	private Handler handler;
	private Button clickMeButton;
	private TextView timerTextView;
	private int timerCount;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		handler = new Handler();
		timerTextView = (TextView)findViewById(R.id.timerTextView);
		clickMeButton = (Button)findViewById(R.id.clickMeButton);
		timerCount = 10;
		timerTextView.setText(String.valueOf(timerCount));
		clickMeButton.setVisibility(View.GONE);
		startCountdown();
	}
	private void startCountdown(){
		handler.postDelayed(new Runnable(){
			public void run(){
				updateTime();
			}
		},1000);
	}
	private void updateTime(){
		timerCount --;
		timerTextView.setText(String.valueOf(timerCount));
		if(timerCount==0){
			showAlertDialog();
			clickMeButton.setVisibility(View.VISIBLE);
		}
		else{
			startCountdown();
		}
	}
	private void showAlertDialog(){
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
		builder.setTitle("Countdown Completed...")
			.setMessage("Happy News !!!")
			.setPositiveButton("OK",null)
			.create()
			.show();
	}
	public void onClick(View view){
		if(view.getId()==R.id.clickMeButton){
			clickMeButton.setVisibility(View.GONE);
			timerCount = 10;
			timerTextView.setText(String.valueOf(timerCount));
			startCountdown();
		}
	}
}
