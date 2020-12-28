package com.sspicolab.combasix;


import com.sspicolab.combasix.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class COMBasix extends Activity {

	
	ImageButton tl,tr,ml,mr,bl,br;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setTitle("COMBasix");
		
	
		tl = (ImageButton) findViewById(R.id.button_topleft);
		tr = (ImageButton) findViewById(R.id.button_topright);
		ml = (ImageButton) findViewById(R.id.button_LeftMiddle);
		mr = (ImageButton) findViewById(R.id.button_LeftRight);
		bl = (ImageButton) findViewById(R.id.button_bottomleft);
		br = (ImageButton) findViewById(R.id.button_bottomright);
		
		tl.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View arg0) {
				Intent C = new Intent(getApplicationContext(), C.class);
				startActivity(C);
			}
		});
		
		tr.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View arg0) {
				
				
				Intent CP = new Intent(getApplicationContext(), CPP.class);
				startActivity(CP);
				
			}
		});
		
		ml.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent Java = new Intent(getApplicationContext(), Java.class);
				startActivity(Java);
			
			}
		});
		
		mr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				

				Intent os = new Intent(getApplicationContext(), OS.class);
				startActivity(os);
			}
		});

	bl.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent hn = new Intent(getApplicationContext(), HN.class);
			startActivity(hn);
			
		}
	});
	
	br.setOnClickListener(new View.OnClickListener(){
		
		@Override
		public void onClick(View arg0) {
			
		
			Intent ab = new Intent(getApplicationContext(), About.class);
			startActivity(ab);
			
		}
	});
	
	}
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
