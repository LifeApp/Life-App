package com.example.life_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

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

	public void onClick(View theView)
	{
		int id = theView.getId();
		if (id == R.id.greetings)
		{
			Intent greetIntent = new Intent(this,Greetings.class);
			startActivity(greetIntent);
		} 
		else if (id == R.id.departures) 
		{
			Intent departIntent = new Intent(this,Departures.class);
			startActivity(departIntent);
		}
		else if (id == R.id.written_samples) 
		{
			Intent scriptIntent = new Intent(this,Written_Samples.class);
			startActivity(scriptIntent);
		}		
		else
		{
		}
	}	

}
