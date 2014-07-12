package com.example.swapingfragmentexample;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class SampleFragment extends Fragment {

	public View view;
	public int seekvalue = 10;
	public EditText edittext;
	public Button button;

	SampleListener activityCallback;

	public interface SampleListener {
		public void onButtonClick(String text);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			activityCallback = (SampleListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement SampleListener");
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, 
			ViewGroup container, Bundle savedInstanceState) {

		view =  inflater.inflate(R.layout.sample_fragment_view, container, false);
		edittext = (EditText) view.findViewById(R.id.editText1);
		button = (Button) view.findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				buttonClicked(v);
			}
		});

		return view;
	}

	public void buttonClicked (View view) {
		activityCallback.onButtonClick(edittext.getText().toString());
	}

}
