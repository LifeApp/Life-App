package com.example.life_app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Departures extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.departures_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.departures, menu);
		return true;
	}

}
