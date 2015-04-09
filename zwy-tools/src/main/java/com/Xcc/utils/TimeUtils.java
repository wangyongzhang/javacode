package com.Xcc.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

	public static String date2String1(Date date){
		if(null == date){
			return null;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		String dateStr = simpleDateFormat.format(date);
		return dateStr;
	}
}
