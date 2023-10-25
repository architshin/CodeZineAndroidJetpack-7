package com.websarva.wings.android.databindinghandlerkotlin.ui

import com.websarva.wings.android.databindinghandlerkotlin.databinding.ActivityMainBinding

class MainHandlers(private val _mainViewModel: MainViewModel, private val _activityMainBinding: ActivityMainBinding) {
	fun onBtnGenerateClick() {
		_mainViewModel.generateNewRectangle()
		_activityMainBinding.rectangle = _mainViewModel.rectangle
	}
}
