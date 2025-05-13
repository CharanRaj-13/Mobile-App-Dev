package com.example.prgm_2;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.app.Activity;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends Activity{
	public static final Random RANDOM = new Random();
	private Button rollDice;
	private ImageView img1,img2;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rollDice = (Button)findViewById(R.id.rollDice);
		img1 = (ImageView)findViewById(R.id.img1);
		img2 = (ImageView)findViewById(R.id.img2);

		rollDice.setOnClickListener(new View.OnClickListener(){
			
			public void onClick(View view){
				rollDices();
			}
		});
	}
	private void rollDices(){
		int val1 = randomDiceValue();
		int val2 = randomDiceValue();
		int res1 = getResources().getIdentifier("dice_"+val1, "drawable",getPackageName());
		int res2 = getResources().getIdentifier("dice_"+val2, "drawable",getPackageName());
		img1.setImageResource(res1);
		img2.setImageResource(res2);
	}
	public static int randomDiceValue(){
		return RANDOM.nextInt(6)+1;
	}
}