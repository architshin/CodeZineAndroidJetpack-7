package com.websarva.wings.android.databindinghandlerjava.data.model;

public class Rectangle {
	private final int _height;
	private final int _width;

	public Rectangle(int height, int width) {
		_height = height;
		_width = width;
	}

	public int getArea() {
		return _height * _width;
	}

	public String getAreaStr() {
		return String.valueOf(getArea());
	}

	public int getHeight() {
		return _height;
	}
	public int getWidth() {
		return _width;
	}

	public String getHeightStr() {
		return String.valueOf(_height);
	}

	public String getWidthStr() {
		return String.valueOf(_width);
	}
}
