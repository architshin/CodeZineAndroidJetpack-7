package com.websarva.wings.android.databindingexpression;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.websarva.wings.android.databindingexpression.databinding.ActivityMainBinding;
import com.websarva.wings.android.databindingexpression.ui.MainViewModel;

public class MainActivity extends AppCompatActivity {
	MainViewModel _mainViewModel;
	ActivityMainBinding _activityMainBinding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		_activityMainBinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
		ViewModelProvider provider = new ViewModelProvider(MainActivity.this);
		_mainViewModel = provider.get(MainViewModel.class);

		_activityMainBinding.setRandNum(_mainViewModel.getRandNum());
		_activityMainBinding.btnRand.setOnClickListener(new ButtonClickListener());
	}

	private class ButtonClickListener implements View.OnClickListener {
		@Override
		public void onClick(View v) {
			_mainViewModel.generateNewRandNum();
			_activityMainBinding.setRandNum(_mainViewModel.getRandNum());
		}
	}
}
