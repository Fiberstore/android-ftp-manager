package com.test.ftpclient.utils;

import java.io.File;

public class FileUtils {
	// 递归删除指定路径下的所有文件
	public static void deleteAll(File file) {
		if (file.isFile() || file.list().length == 0) {
			file.delete();
		} else {
			File[] files = file.listFiles();
			for (File f : files) {
				deleteAll(f);// 递归删除每一个文件
				f.delete();// 删除该文件夹
			}
		}
	}
}
