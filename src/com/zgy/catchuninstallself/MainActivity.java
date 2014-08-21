package com.zgy.catchuninstallself;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

/**
 * 
 * @Author ZGY
 * @Date:2013-12-13
 * @version 
 * @since
 * C代码参考网上资料进行修改的，国外开源代码
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.e("", "result = " + UninstallObserver.startWork("/data/data/" + getPackageName(), "https://github.com", android.os.Build.VERSION.SDK_INT));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
