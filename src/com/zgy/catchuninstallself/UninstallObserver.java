package com.zgy.catchuninstallself;

/**
 * 
 * @Author ZGY
 * @Date:2013-12-13
 * @version 
 * @since
 * C����ο��������Ͻ����޸ĵģ����⿪Դ����
 * 
 * ��ӭ��Ⱥ��88130145
 */

public class UninstallObserver {

	static{
		System.loadLibrary("observer");
	}
	public static native String startWork(String path, String url, int version);//path��data/data/[packageNmae]   ��   url:��ת��ҳ�棬��Ҫhttp://��https://��ͷ
}
