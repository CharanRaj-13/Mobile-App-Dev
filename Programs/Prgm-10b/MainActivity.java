package com.example.email_10ii;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText from,to,cc,bcc,msg;
	private Button send;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        from = (EditText)findViewById(R.id.from);
        to = (EditText)findViewById(R.id.to);
        cc = (EditText)findViewById(R.id.cc);
        bcc = (EditText)findViewById(R.id.bcc);
        msg = (EditText)findViewById(R.id.msg);
        send = (Button)findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v){
        		String frommail = from.getText().toString();
        		String tomail = to.getText().toString();
        		String mailmsg = msg.getText().toString();
        		if(!frommail.equals(" ")){
        			if(!tomail.equals(" ")){
        				if(!mailmsg.equals(" ")){
        					Toast.makeText(MainActivity.this,"Mail Sent",Toast.LENGTH_LONG).show();
        				}else{
        					Toast.makeText(MainActivity.this,"Mail Not Sent",Toast.LENGTH_LONG).show();
        				}
        			}else{
        				Toast.makeText(MainActivity.this,"Mail Not Sent",Toast.LENGTH_LONG).show();
        			}
        		}else{
        			Toast.makeText(MainActivity.this,"Mail Not Sent",Toast.LENGTH_LONG).show();
        		}
        	}
        });
    }

}
