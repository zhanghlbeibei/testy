package com.cn;

public class Length {
	public static void main(String[] args) {
		String ordercode = "'aaa','bbbb','cccc'";
		String ordercode1 = "'aaa'";
		String[] strs = ordercode1.split(",");
		System.out.println(strs.length);
		System.out.println(ordercode1.replace("'", ""));
		
	}

	
		
}
