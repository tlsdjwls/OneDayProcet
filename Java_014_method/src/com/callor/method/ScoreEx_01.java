package com.callor.method;

import com.callor.method.service.ScoreServiceV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreServiceV1 scV1 = new ScoreServiceV1();
		
		scV1.inputValue("국어", 0, 100);
		scV1.inputValue("국어");
		
	}
}
