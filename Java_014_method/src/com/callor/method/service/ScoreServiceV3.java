package com.callor.method.service;

public class ScoreServiceV3 {

	
	
	public ScoreServiceV3() {
		
	}
	
	public void inputScore() {
		InputServiceV2 scV2 = new InputServiceV2();
		
	  Integer  intKor = scV2.inputValue("국어", 0, 100);
	  if(intKor == null) {
		  System.out.println("종료");
		  return;
	  }
	  Integer  intEng = scV2.inputValue("영어", 0, 100);
	  if(intEng == null) {
		  System.out.println("종료");
		  return;
	  }
	  Integer  intMath = scV2.inputValue("수학", 0, 100);
	  if(intMath == null) {
		  System.out.println("종료");
		  return;
	  }
	  
	  int sum = intKor + intEng + intMath;
	  float avg = (float)sum / 3;
		
	  System.out.println("총점 :" + sum);
	  System.out.println("평균 :" + avg);
	  
	}
		
		
		
	
	
}
