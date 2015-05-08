package com.test.ftpclient.ui;

import it.sauronsoftware.ftp4j.FTPFile;

import java.util.Arrays;
import java.util.List;

import org.simple.eventbus.EventBus;
import org.simple.eventbus.Subscriber;
import com.test.ftpclient.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.InjectView;

import com.test.ftpclient.adapter.FileAdapter;
import com.test.ftpclient.service.FtpService;

public class MainActivity extends BaseActivity {
	@InjectView(R.id.tv_title)
	TextView tvTitle;
	@InjectView(R.id.lv_file_list)
	ListView lvFileList;
	private FileAdapter fileAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		startService(new Intent(this, FtpService.class));

		initView();
	}

	@Override
	void initView() {
		tvTitle.setText("");
		fileAdapter = new FileAdapter(this);
		lvFileList.setAdapter(fileAdapter);
		lvFileList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				FTPFile ftpFile = fileAdapter.getItemData(position);
				if (ftpFile != null && ftpFile.getType() == FTPFile.TYPE_FILE) {
					// 读取文件
					startActivity(new Intent(MainActivity.this,
							FileShowActivity.class));
					EventBus.getDefault().post(ftpFile, "start");
				} else if (ftpFile != null
						&& ftpFile.getType() == FTPFile.TYPE_DIRECTORY) {
					// 打开文件夹

				}
			}
		});
	}

	@Subscriber(tag = "login_success")
	private void login_success(String str) {
		EventBus.getDefault().post("", "showlist");
	}

	@Subscriber(tag = "showlist_success")
	private void showFileList(FTPFile[] lists) {
		List<FTPFile> fileList = Arrays.asList(lists);
		fileAdapter.setData(fileList);
		fileAdapter.notifyDataSetChanged();
	}

	@Override
	public void onDestroy() {
		stopService(new Intent(this, FtpService.class));
		super.onDestroy();
	}

	@Override
	void initContentView() {
		setContentView(R.layout.activity_main);
	}

	@Override
	void initData() {

	}
}
