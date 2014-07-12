package com.example.swapingfragmentexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.swapingfragmentexample.SampleFragment.SampleListener;

public class MainActivity extends FragmentActivity implements SampleListener  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Fragment fragment = new SampleFragment();  
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		fragmentTransaction.replace(R.id.layoutToReplace, fragment);
		fragmentTransaction.commit(); 
	}

	public void onButtonClick(String text) {	
		Bundle bundl = new Bundle();
		bundl.putString("text", text);
		
		TextFragment fragment = new TextFragment();  
		fragment.setArguments(bundl);
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		fragmentTransaction.replace(R.id.layoutToReplace, fragment);
		fragmentTransaction.commit(); 
		
	}

}
