package com.example.d_graphics_7;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnTouchListener{
	ImageView imageView;
	Bitmap bitmap;
	Canvas canvas;
	Paint paint;
	float downx=0,downy=0,upx=0,upy=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView);
        Display currentDisplay = getWindowManager().getDefaultDisplay();
        float dw = currentDisplay.getWidth();
        float dh = currentDisplay.getHeight();
        bitmap = Bitmap.createBitmap((int)dw,(int)dh,Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        paint = new Paint();
        paint.setColor(Color.MAGENTA);
        imageView.setImageBitmap(bitmap);
        imageView.setOnTouchListener(this);
    }

    
    public boolean onTouch(View v, MotionEvent event){
    	int action = event.getAction();
    	switch(action){
    	case MotionEvent.ACTION_DOWN:
    		downx = event.getX();
    		downy = event.getY();
    		break;
    	case MotionEvent.ACTION_MOVE:
    		break;
    	case MotionEvent.ACTION_UP:
    		upx = event.getX();
    		upy = event.getY();
    		canvas.drawLine(downx, downy,upx,upy,paint);
    		imageView.invalidate();
    		break;
    	case MotionEvent.ACTION_CANCEL:
    		break;
    	default:
    		break;
    	}	
    	return true;
    }
    
}
