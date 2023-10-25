package com.websarva.wings.android.databindingentityjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.websarva.wings.android.databindingentityjava.databinding.ActivityMainBinding;
import com.websarva.wings.android.databindingentityjava.ui.MainViewModel;

public class MainActivity extends AppCompatActivity {
	MainViewModel _mainViewModel;
	ActivityMainBinding _activityMainBinding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		_activityMainBinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
		ViewModelProvider provider = new ViewModelProvider(MainActivity.this);
		_mainViewModel = provider.get(MainViewModel.class);
		_activityMainBinding.setRectangle(_mainViewModel.getRectangle());

		Button btnGenerate = findViewById(R.id.btnGenerate);
		btnGenerate.setOnClickListener(new ButtonClickListener());
	}

	private class ButtonClickListener implements View.OnClickListener {
		@Override
		public void onClick(View v) {
			_mainViewModel.generateNewRectangle();
			_activityMainBinding.setRectangle(_mainViewModel.getRectangle());
		}
	}
}
