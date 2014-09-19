package com.example.gesturekithelloworld;

// GestureKit imports
import com.roamotuch.gesturekit.plugin.GKActionInterface;
import com.roamotuch.gesturekit.plugin.PluginInterface;
import com.roamtouch.gesturekit.GestureKit;
import com.roamtouch.gesturekit.GestureKit.GestureKitListener;
import com.roamtouch.gesturekit.gesturekithelper.GestureKitHelper;

// GestureKit Plugin import
//import com.roamtouch.gesturekit.gesturekithelper.GestureKitHelper;
//import com.roamtouch.gesturekit.gesturekitpixiedust.GestureKitPixiedust;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class GestureKitHelloWorld extends Activity implements GKActionInterface {

	Button helloButton;
	GestureKit gesturekit;
	private ProgressBar spinner;
	private TextView textView1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gesture_kit_hello_world);
		
		helloButton = (Button) findViewById(R.id.helloWorldButton);
		
		helloButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), 
						"Hello World! From button", Toast.LENGTH_LONG).show();
				
			}
		});
		
		// GestureKit Object
		this.gesturekit = new GestureKit(this,  "38381630-b759-4c55-91c1-985306dbe587");
		
		// GestureKit Helper Plugin. See README.	
		//this.gesturekit.setPlugin((PluginInterface) new GestureKitHelper(this, this.gesturekit));		
			
		// GestureKit PixieDust Plugin. See README.		
		//this.gesturekit.setPlugin((PluginInterface) new GestureKitPixiedust(this, this.gesturekit));
		
		// GestureKit Listener. 
		this.gesturekit.setGestureKitListener(new GestureKitListener(){

			@Override
			public void onGestureKitLoaded() {
				spinner.setVisibility(View.GONE);		
				textView1.setVisibility(View.GONE);	
			}			
			
		});		
		
		spinner = (ProgressBar)findViewById(R.id.progressBar1);		
		textView1 = (TextView)findViewById(R.id.textView1); 		
		
	}
	
	public void HELLO(){
		Toast.makeText(getApplicationContext(), 
				"Hello World! From gesture", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gesture_kit_hello_world, menu);
		return true;
	}

	@Override
	public String getActionID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onGestureRecognized(Object... params) {
		
	}
	
}
