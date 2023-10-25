package com.websarva.wings.android.databindinghandlerjava.ui;

import com.websarva.wings.android.databindinghandlerjava.databinding.ActivityMainBinding;

public class MainHandlers {
	MainViewModel _mainViewModel;
	ActivityMainBinding _activityMainBinding;

	public MainHandlers(MainViewModel mainViewModel, ActivityMainBinding activityMainBinding) {
		_mainViewModel = mainViewModel;
		_activityMainBinding = activityMainBinding;
	}

	public void onBtnGenerateClick() {
		_mainViewModel.generateNewRectangle();
		_activityMainBinding.setRectangle(_mainViewModel.getRectangle());
	}
}
