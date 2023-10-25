package com.websarva.wings.android.databindinghandlerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.websarva.wings.android.databindinghandlerkotlin.databinding.ActivityMainBinding
import com.websarva.wings.android.databindinghandlerkotlin.ui.MainHandlers
import com.websarva.wings.android.databindinghandlerkotlin.ui.MainViewModel

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this@MainActivity, R.layout.activity_main)
		val mainViewModel by viewModels<MainViewModel>()
		val mainHandlers = MainHandlers(mainViewModel, activityMainBinding)
		activityMainBinding.rectangle = mainViewModel.rectangle
		activityMainBinding.mainHandlers = mainHandlers
	}
}
