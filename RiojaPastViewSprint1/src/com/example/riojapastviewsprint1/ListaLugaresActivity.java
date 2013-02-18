package com.example.riojapastviewsprint1;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class ListaLugaresActivity extends ListActivity implements OnItemClickListener {

	public ListaLugaresActivity() {
		
		
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lista_lugares_activity_layout);
		getListView().setOnItemClickListener(this);

		
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
	
	

}
