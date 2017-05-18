package com.cn;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Url {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String url ="http://223.71.242.115/lime/wxlogin";
		System.out.println(URLEncoder.encode(url,"utf-8"));
	}

}
