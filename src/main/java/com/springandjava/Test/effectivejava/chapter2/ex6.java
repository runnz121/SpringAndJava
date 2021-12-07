package com.springandjava.Test.effectivejava.chapter2;

import java.util.regex.Pattern;

public class ex6 {
		private static final Pattern ROMAN = Pattern.compile("^(?=.)");

	static boolean ex6 (String s){
		return ROMAN.matcher(s).matches();
	}
}
