package com.callor.method.service;

import java.util.Scanner;

public class InputNumberV1 {

	/*
	 * Scanner class 는 키보드 자원을 연동하여 키보드로 부터 값을 입력 받기 위한 클래스이다 이클래스는 컴퓨터의 자원을 사용하는
	 * 관리가 매우 엄격하게 필요한 클래스 이다 사용한는 방법에 따라 , 오류가 발생하거나 심지어 컴퓨터 시스템 멈추는 현상까지 발생할 수 있다
	 * 이러한 클래스는 사용할때는 상당한 주의 가 필요하다
	 * 
	 * inputValue1("세우깡")
	 * inputValue2("세우깡",100)
	 * inputValue3("세우깡",0,1000)
	 * inputValue2("세우깡",0,1000);//매개변수 오류
	 * 
	 * 
	 * public Integer inputValue1(String title); // 1
	 * public Integer inputValue2(String title,int start); // 2
	 * public Integer inputValue3(String title,int start , int end); //3
	 * 
	 * 객체.inputValue("세우깡",100); // 자동으로 2번 method 가 연결 , 호출
	 * 객체.inputValue(100,"세우깡"); // 매개변수 오류
	 * 
	 */

	// Scanner 클래스를 main() method 가 아닌 Service 등의 클래스에서 사용할때는 클래스 영역
	// 선언을 하고 클래스 의 생성자 에서 생성(초기화) 를 하는것이 좋다

	protected Scanner scan;

	public InputNumberV1() {
		scan = new Scanner(System.in);

	}

	/*
	 * 문자열 , 정수 , 정수 매개변수를 갖는 메서드 선언
	 * 
	 * 문자열과 범위 (start ~ end ) 값을 전달받아 prompt 문자열을 생성하고 inputValue(String title) 메서드를
	 * 호출하여 값을 입력 받도록 하고 return 된 값에 따라 null이 return 되면 그냥 return 해버리고 정수값이 return
	 * 되면 start , end 값 범위에 있는값인지 우효성 검사를 하고 반복한다
	 */

	public Integer inputValue(String title, int start , int end) {
		while(true) {
		Integer  retNum = this.inputValue(title);
		if(retNum == null) {
			return null;
		}else if (retNum < start || retNum > end){
         		System.out.printf("입력값은 %d ~ %d " + "범위 이여야 합니다 \n", start,end);
         		continue;
		}
		  return null;
		}
	}
	/*
	 * String title 매개변수를 받고 정수값이나 QUIT 가 입력되는지 확인을 하고 잘못 입력된 값이 있으면 다시 입력 받도록 하는
	 * 메서드
	 */

	public Integer inputValue(String title) {
		while (true) {

			System.out.println(title + "값을 입력하세요(QUIT:입력중단");
			System.out.print(">>");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				return null;
			} else {
				Integer num = null;
				try {
					num = Integer.valueOf(strNum);
				} catch (Exception e) {
					System.out.println("\n 입력은 QUIT 혹은 숫자만 가능합니다");
					continue;
				}
			}
			return null;
		}
	}
}
