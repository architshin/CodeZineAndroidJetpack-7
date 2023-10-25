package com.websarva.wings.android.databindingentitykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.websarva.wings.android.databindingentitykotlin.databinding.ActivityMainBinding
import com.websarva.wings.android.databindingentitykotlin.ui.MainViewModel

class MainActivity : AppCompatActivity() {
	private val _mainViewModel by viewModels<MainViewModel>()
	private lateinit var _activityMainBinding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		_activityMainBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
		_activityMainBinding.rectangle = _mainViewModel.rectangle

		val btnGenerate = findViewById<Button>(R.id.btnGenerate)
		btnGenerate.setOnClickListener(ButtonClickListener())

	}

	private inner class ButtonClickListener : View.OnClickListener {
		override fun onClick(view: View?) {
			_mainViewModel.generateNewRectangle()
			_activityMainBinding.rectangle = _mainViewModel.rectangle
		}
	}
}
