package com.mila.financialcontrol.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.mila.financialcontrol.R;

public class AddOperation extends Activity {

	Button add_expense, add_income;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_operation);
		
		OnClickListener listener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), CreateOperation.class);
				startActivity(intent);
			}
		};
		
		add_expense = (Button)findViewById(R.id.add_expense);
		add_income = (Button)findViewById(R.id.add_income);
		add_expense.setOnClickListener(listener);
		add_income.setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_operation, menu);
		return true;
	}

}
