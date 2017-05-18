package com.cn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rSsld {
	
	public static void main(String[] args) {
		String aa="/Shucai/907.html?classId=0&s_ensinds=12536.250";
		System.out.println(aa.indexOf(".html"));
		System.out.println(aa.substring(aa.indexOf("/Shucai/")+8,aa.indexOf(".html")));
		
		String ss="";
		System.out.println(ss.substring(0,ss.length()));
		
		
		 
		
	}

}
