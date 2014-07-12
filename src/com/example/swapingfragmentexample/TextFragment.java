package com.example.swapingfragmentexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment {

	public TextView textview;	
	
    @Override
    public View onCreateView(LayoutInflater inflater, 
              ViewGroup container, Bundle savedInstanceState) {
        
        View view = inflater.inflate(R.layout.text_fragment, 
                   container, false);
        
        textview = (TextView) view.findViewById(R.id.textView1);
        
        Bundle bundle=getArguments(); 
        String texto=bundle.getString("text");
        textview.setText(texto);
        return view;
    }
	
}