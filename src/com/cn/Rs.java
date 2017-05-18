package com.cn;

import java.net.URLEncoder;

public class Rs {
	public static void main(String[] args){
		String paString = "ZHUaLE300APPhAVGY83szZX4gt4o6O7yv4MQf_uXTe_i8CUJMxJ9CBAcEH8SrTND-6AyeCKX dsS3aZ4bjyqqspdxKhpmv8KOQJ17kJStfhu6wlpNJILUzMeXCa_bwabJajNH HWUrnbILbHHadpd9TkqV1gIuDgDdmJ4GebNjFoaqKfE1EouwG4Dk-ew-x6My nypnmUhELyArFwFOCA230TDvxUUNv4CQEzbwWXKkbon6";
        paString=URLEncoder.encode(paString);
        System.out.print(paString);
	}


	


}
