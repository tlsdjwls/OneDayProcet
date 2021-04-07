package com.callor.method;

import com.callor.method.service.InputNumberV1;

public class NumberEX_02 {
       
	
	// 문자열을 1개만 전달받아 method 호출 
	// 문자열을 전달받아 값을 입력받아 결과를 return 
	public static void main(String[] args) {
		InputNumberV1 inV1 = new InputNumberV1();
		inV1.inputValue("세우깡", 5, 50);
		inV1.inputValue("세우깡");
		
	// 문자열 1개와 정수 2개를 전달하여 method 호출 
		// 2개의 정수 범위 내의 값이 입력됬는지 유효성 검사를 수행하기
	}
}
