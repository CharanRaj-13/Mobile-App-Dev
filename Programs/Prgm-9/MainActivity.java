package com.example.media_player_9;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private MediaPlayer mediaPlayer;
	private Button startbtn,stopbtn,pausebtn;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mediaPlayer = MediaPlayer.create(this, R.raw.music);
		startbtn = (Button)findViewById(R.id.startbtn);
		stopbtn = (Button)findViewById(R.id.stopbtn);
		pausebtn = (Button)findViewById(R.id.pausebtn);
		startbtn.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				mediaPlayer.start();
				Toast.makeText(MainActivity.this, "Started Playing", Toast.LENGTH_LONG).show();
			}
		});
		stopbtn.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				mediaPlayer.stop();
				Toast.makeText(MainActivity.this, "Stopped Playing", Toast.LENGTH_LONG).show();
				try{
					mediaPlayer.prepare();
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		});
		pausebtn.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				mediaPlayer.pause();
				Toast.makeText(MainActivity.this, "Paused Playing", Toast.LENGTH_LONG).show();
			}
		});
	}
    
}
