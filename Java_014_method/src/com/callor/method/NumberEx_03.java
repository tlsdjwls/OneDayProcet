package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.InputServiceV2;

public class NumberEx_03 {

	public static void main(String[] args) {
		
		InputServiceV2 isV2 = new InputServiceV2();
		//isV2.inputValue("»õ¿ì±ø");
		isV2.inputValue(null, 0, 0);
		isV2.inputValue(null, 0);
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		//scan.close();		
	} 
}
