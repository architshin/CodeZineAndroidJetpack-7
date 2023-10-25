package com.websarva.wings.android.databindingexpression.ui;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
	private double _randNum = 0;

	public void generateNewRandNum() {
		_randNum = Math.random();
	}

	public double getRandNum() {
		return _randNum;
	}
}
