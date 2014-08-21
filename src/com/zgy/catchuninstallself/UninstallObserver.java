package com.zgy.catchuninstallself;

/**
 * 
 * @Author ZGY
 * @Date:2013-12-13
 * @version 
 * @since
 * C代码参考网上资料进行修改的，国外开源代码
 * 
 * 欢迎加群：88130145
 */

public class UninstallObserver {

	static{
		System.loadLibrary("observer");
	}
	public static native String startWork(String path, String url, int version);//path：data/data/[packageNmae]   ；   url:跳转的页面，需要http://或https://开头
}
