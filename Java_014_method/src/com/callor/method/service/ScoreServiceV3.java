package com.callor.method.service;

public class ScoreServiceV3 {

	
	
	public ScoreServiceV3() {
		
	}
	
	public void inputScore() {
		InputServiceV2 scV2 = new InputServiceV2();
		
	  Integer  intKor = scV2.inputValue("����", 0, 100);
	  if(intKor == null) {
		  System.out.println("����");
		  return;
	  }
	  Integer  intEng = scV2.inputValue("����", 0, 100);
	  if(intEng == null) {
		  System.out.println("����");
		  return;
	  }
	  Integer  intMath = scV2.inputValue("����", 0, 100);
	  if(intMath == null) {
		  System.out.println("����");
		  return;
	  }
	  
	  int sum = intKor + intEng + intMath;
	  float avg = (float)sum / 3;
		
	  System.out.println("���� :" + sum);
	  System.out.println("��� :" + avg);
	  
	}
		
		
		
	
	
}
