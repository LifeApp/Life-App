package com.example.life_app;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LifeApp extends ActionBarActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_life_app);
		
		Button greetingsButton = (Button) findViewById(R.id.greetings);
		greetingsButton.setOnClickListener(this);
		
		Button departureButton = (Button) findViewById(R.id.departures);
		departureButton.setOnClickListener(this);	
		
	}
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.life_app, menu);
		return true;
	}
	
	@Override
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
