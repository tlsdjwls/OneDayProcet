package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	Scanner scan;
	
	public ScoreServiceV1() {
	
		scan = new Scanner(System.in);
		
	}

 public Integer inputValue(String strKor, int num , int end) {
	 while(true) {
		 Integer strNum =this.inputValue(strKor);
		 if(strNum == null) {
			 return null;
		 }else if(strNum < num || strNum > end) {
			  System.out.println("���� :");
			  continue;
		 }
		 return null;
	 }
	 
	 
	 
 }	 
 public Integer inputValue(String strKor) {	 
    
	 while(true) {
	 System.out.println(strKor + "������ �Է��ϼ���");
	 System.out.print(">>");
	 String strNum = scan.nextLine();
	 if(strKor.equals(null)) {
		 return null;
	 }else {
		 Integer num = null;
	 }try {
		Integer num = Integer.valueOf(null);
	} catch (Exception e) {
		System.out.println("���ڷθ� �Է��ؾ��մϴ�");
	}
	 }
 
 }
}
