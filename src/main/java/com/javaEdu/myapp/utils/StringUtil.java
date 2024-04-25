package com.javaEdu.myapp.utils;

public class StringUtil {
	
	
	public String[] convertStringToStringArraySplitingComma(String str) {
		String[] strArray = str.split(",");
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = strArray[i].trim();
		}

		return strArray;
	}

}
