package com.websarva.wings.android.databindinghandlerjava.ui;

import androidx.lifecycle.ViewModel;

import com.websarva.wings.android.databindinghandlerjava.data.model.Rectangle;

public class MainViewModel extends ViewModel {
	Rectangle _rectangle;

	public MainViewModel() {
		generateNewRectangle();
	}

	public void generateNewRectangle() {
		int height = (int) (Math.random() * 10) + 1;
		int width = (int) (Math.random() * 10) + 1;
		_rectangle = new Rectangle(height, width);
	}

	public Rectangle getRectangle() {
		return _rectangle;
	}
}
