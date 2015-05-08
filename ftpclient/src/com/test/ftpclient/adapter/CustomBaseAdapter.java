package com.test.ftpclient.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class CustomBaseAdapter<T> extends BaseAdapter {
	private LayoutInflater mInflater;
	private List<T> datas;
	private Context mContext;

	public CustomBaseAdapter(Context context) {
		mContext = context;
		mInflater = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public Context getContext() {
		return mContext;
	}

	public View getItemView(int resource, ViewGroup parent) {
		return mInflater.inflate(resource, parent, false);
	}
	
	public T getItemData(int position) {
		return datas == null ? null : datas.get(position);
	}

	public List<T> getData() {
		return datas;
	}

	public void setData(List<T> datas) {
		this.datas = datas;
	}

	@Override
	public int getCount() {
		return datas == null ? 0 : datas.size();
	}

	@Override
	public Object getItem(int position) {
		return datas == null ? null : datas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

}
