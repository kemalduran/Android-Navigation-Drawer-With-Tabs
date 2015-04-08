package com.example.navtab.tabfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navtab.R;

public class Tab2Fragment extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootview = inflater.inflate(R.layout.fragment_tab2, container, false);
		
		return rootview;
	}
}
