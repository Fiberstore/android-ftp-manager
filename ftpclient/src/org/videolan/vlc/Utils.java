package org.videolan.vlc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

public class Utils {
	public static String getVersionName(Context context) {
		try {
			PackageInfo packageInfo = context.getPackageManager()
					.getPackageInfo(context.getPackageName(), 0);
			// 当前应用的版本名称
			String versionName = packageInfo.versionName;
			return versionName;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		
		return "";
	}

	public static int getVersionCode(Context context) {
		try {
			PackageInfo packageInfo = context.getPackageManager()
					.getPackageInfo(context.getPackageName(), 0);
			// 当前版本的版本号
			int versionCode = packageInfo.versionCode;
			return versionCode;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	public static String getPackName(Context context) {
		try {
			PackageInfo packageInfo = context.getPackageManager()
					.getPackageInfo(context.getPackageName(), 0);
			// 当前版本的包名
			String packageNames = packageInfo.packageName;
			return packageNames;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		
		return "";
	}
}
