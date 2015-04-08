package com.example.navtab.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navtab.Page1Activity;
import com.example.navtab.Page2Activity;
import com.example.navtab.Page3Activity;
import com.example.navtab.R;
import com.example.navtab.appcodes.Settings;

public class MenuFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		final View view = inflater.inflate(R.layout.fragment_menu, container, false);
        
		return view;
	}
	public void onClickItem(View v){
		String s =  (String) v.getTag();
		int t = Integer.parseInt(s);
		Log.d("clck", " " + t);
		displayView(t);
	}
	private void displayView(int position) {
		// update the main content by replacing fragments
		
		if(position==0 && 0 != Settings.currentPage){
			Settings.currentPage = 0;
			Intent i = new Intent(getActivity(), Page1Activity.class);
			startActivity(i);
		}
		else if(position==1 && 1 != Settings.currentPage){
			Settings.currentPage = 1;
			Intent i = new Intent(getActivity(), Page2Activity.class);
			startActivity(i);
		}
		else if(position==2 && 2 != Settings.currentPage){
			Settings.currentPage = 2;
			Intent i = new Intent(getActivity(), Page3Activity.class);
			startActivity(i);
		}
	}
}
