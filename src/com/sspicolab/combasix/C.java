package com.sspicolab.combasix;

import com.sspicolab.combasix.R;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.webkit.WebView;

public class C extends Activity {

	WebView wv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_c);
		setTitle("C Programming");
		wv = (WebView) findViewById(R.id.webView1);
		wv.setBackgroundColor(Color.WHITE);
		wv.loadUrl("file:///android_asset/c/index.html"); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.c, menu);
		return true;
	}

}
