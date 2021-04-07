package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV2 {

	/*
	 * (전통적)구조적 프로그래밍 원칙적으로 같은 클래스에서 같은 이름의 method는 중복하여 작성할수 없다
	 * 
	 * 객체지향 개발 방법에서는 매개변수의 개수 , 타입 , 순서가 다르면 같은 이름의 method 를 중복하여 작성 할 수 있다
	 * 
	 */
	
	protected Scanner scan;
    public InputServiceV2() {
		scan = new Scanner(System.in);

	}

	public Integer inputValue(String title, int start ,int end) {
		
		String msgTitle = String.format("%s(%d 이상)",title,start,end);
		while(true) {
		Integer intNum = this.inputValue(msgTitle);
		if(intNum != null) {
			if(intNum< start || intNum > end) {
				System.out.printf("입력값은 %d ~ %d 까지 입력하세요\n",start,end);
				continue;
			}
		}
		}
	}
	// 매개변수 3개
	/*
	 * 정수 범위에 대한 유효성검사를 수행하는 method 
	 * 이미 만들어진 inputValue(String title) method 와 연동하여 사용하겠다
	 */
	public Integer inputValue(String title, int start) {
		// 유효성 검사를 수행하겠다는 메시지를 미리 작성
		
		String nsgTitle = String.format("%s (%d~%d 범위의 )",title,start);
		while(true) {
	       Integer intNum =	this.inputValue(nsgTitle);
	       if(intNum != null) {
	    	   if(intNum < start) {
	    		   System.out.printf("입력값은 %d 이상이여야 합니다\n",start);
	    		   continue;
	    		   
	    	   }
	    		 }return intNum;
	       }
         
		
		
	}

	// 매개변수 1개
	public Integer inputValue(String title) {
		/*
		 * exception이 발생했을때 사용자에게 
		 * 안내 메시지를 보여주고 다시 입력을 받도록 
		 * 하기 위한 선 조치
		 */
		while (true) {
			System.out.println(title + "값을 입력하세요(QUIT : 입력취소)");
			System.out.print(">>");
			String strInput = scan.nextLine();
			if (strInput.equals("QUIT")) {
				return null;
			}
			// if 조건문이 false 경우 실행되는 부분
			// 굳이 else 를 사용하지 않아도 문제없는 코드
			Integer intNum = null;
			try {
				 intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("입력값 오류!!");
				System.out.println("정수나 QUIT 문자열만 입력하세요");
				continue;
			}
			// try catch block 의 코드가 정상적으로 모두 완료되었을때 실행되는 부분
			// 입력값이 정상적 정수형 데이터로 변환되어 intNum 변수에 담겨 있다.
			// 입력한 정수값이 return 된다.
			return intNum;
		}
	}
}
