package com.test.ftpclient.ui;

import org.simple.eventbus.EventBus;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;

public abstract class BaseActivity extends Activity {
	abstract void initContentView();

	abstract void initView();

	abstract void initData();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		initContentView();
		ButterKnife.inject(this);
		EventBus.getDefault().register(this);
		initView();
		initData();
	}

	@Override
	public void onDestroy() {
		EventBus.getDefault().unregister(this);
		super.onDestroy();
	}
}
