package com.javaex.problem05;

public class StringUtil {

	public static String concatString(String[] strArray) {

		String concatStr = "";

		for (int i = 0; i < strArray.length; i++) {
			concatStr = concatStr + strArray[i];
		}
		return concatStr;

	}

}
