package com.websarva.wings.android.databindinghandlerkotlin.data.model

data class Rectangle(val height: Int, val width: Int) {
	fun getArea(): Int {
		return height * width
	}
	fun getAreaStr(): String {
		return getArea().toString()
	}

	fun getHeightStr(): String {
		return height.toString()
	}

	fun getWidthStr(): String {
		return  width.toString()
	}
}
