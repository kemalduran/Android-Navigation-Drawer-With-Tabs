package com.example.navtab.tabfragments;

import com.example.navtab.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab1Fragment extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootview = inflater.inflate(R.layout.fragment_tab1, container, false);
		
		return rootview;
	}
}
