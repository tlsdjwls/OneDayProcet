package com.tlsdjwls.tandard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class EX_01 {
	
	public static void main(String[] args) {
	    
		InputServiceImplV2 isV2 = new InputServiceImplV2();
		InputServiceImplV1 isV1 = new InputServiceImplV1();
		
		isV1.inputValue("새우깡");
		isV1.inputValue("새우깡", 0);
		isV1.inputValue("새우깡", 0, 1000);
		
		/*
		 * List 인터페이스를 구현한 클래스는 
		 * ArrayList,LinkedList,Vector 등의 3가지가 있다
		 * 3가지의 클래스는 코드에 List 인터페이스를 impl 했을것 이다
		 * 이러한 클래스는 선언과 생성을 할때 인터페이스로 선언을 하고
		 * 클래스의 생성자로 객체를 생성하는 것이 좋다
		 * 
		 * List 인터페이스를 impl 한 클래스들은 
		 * List type의 클래스다 라고 호칭함
		 */
		// List 3가지 종류 : 사용방법은 똑같음
		List<Integer> intList = new ArrayList<Integer>();
		intList = new LinkedList<>();
		intList = new Vector<Integer>();
		// 이러한 기법은 웹어플리케이션에서 주로사용!!
		ArrayList<String> strList = new ArrayList<String>();
		
	}


}
