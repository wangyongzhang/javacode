package com.Xcc.test.service;

import com.Xcc.test.bean.JavaInfo;
import com.Xcc.test.bean.SystemInfo;

/** 
* @ClassName: SystemService 
* @Description: the service for system infomation
* @author wangyongzhang
* @date 2015-1-7 PM 3:09:57 
*  
*/
public interface SystemService {

	
	 /** 
	* @description：Get system infomation
	* @param  
	* @return SystemInfo    
	* @author wangyongzhang
	*/
	public SystemInfo getSystemInfo();
	
	/** 
	* @description：Get java infomation
	* @param    
	* @return JavaInfo    
	* @author wangyongzhang
	*/
	public JavaInfo getJavaInfo();
}
