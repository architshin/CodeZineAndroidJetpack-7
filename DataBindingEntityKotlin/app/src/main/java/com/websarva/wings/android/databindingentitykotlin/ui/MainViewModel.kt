package com.websarva.wings.android.databindingentitykotlin.ui

import androidx.lifecycle.ViewModel
import com.websarva.wings.android.databindingentitykotlin.data.model.Rectangle

class MainViewModel : ViewModel() {
	var rectangle: Rectangle

	init {
		rectangle = Rectangle(0, 0)
		generateNewRectangle()
	}

	fun generateNewRectangle() {
		val height = (Math.random() * 10).toInt() + 1
		val width = (Math.random() * 10).toInt() + 1
		rectangle = Rectangle(height, width)
	}
}
