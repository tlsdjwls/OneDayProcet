package com.callor.method.service;



/*
 * inputServiceV2 클래스의 inputValue () 메서드에
 * "국어" ,0,100 값을 전달후 렌덤값이 null 이면종료
 * 정수값이면 점수: ?? 형식으로 출력
 */
public class ScoreServiceV2 {
  /*
   * 인프트 서비스 V2 클래스를 활용하는 메서드가 2개이상일 경우에는 모든 변수,
   * 객체를 클래스 영역(맴버변수영역) 에서 선언하자
   * 그리고 생성자에서 초기화 하여 사용하도록 한다.
   */
	protected InputServiceV2 inV2;
	public ScoreServiceV2() {
	inV2 = new InputServiceV2();
	}
	public void inputScore() {
		
	InputServiceV2 inV2 = new InputServiceV2();
	Integer intKor = inV2.inputValue("국어", 0,100);
	if(intKor == null) {
		System.out.println("종료");
	}else {
		System.out.printf("국어 점수 : %d",intKor);
	}
	}
}