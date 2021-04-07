package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 * 데이터를 입력 (키보드,Random,파일,인터넷)
 *  데어터를 VO 에 담고
 * 입력된 데이터를 List에 추가
 * 연산을 수행 다시 List 저장
 * 데이터를 읽어 출력
 * List에서 추출하여 VO에 담고
 * 출력
 */
public class ScoreServiceV6 {
     // final 키우드를 부착한 변수 = 상수
	 // 한번 저장된 값을 변경할숭 없는 특별한 변수 => 상수
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	protected List<ScoreVO> scoreList;

	protected String[] subject;

	protected InputServiceV2 isV2;

	public ScoreServiceV6() {
		subject = new String[] { "국어", "영어", "수학" };
		isV2 = new InputServiceV2();
		scoreList = new ArrayList<ScoreVO>();

	}

	public void inputScore() {
	 for(int i = 5 ; i < 5; i++) {
		 Integer[] scores = new Integer[subject.length];
		 for(int sb = 0 ; sb < subject.length ; sb++) {
			 scores[i] = isV2.inputValue(subject[i], 0, 100);
			 if(scores[i] == null) {
				 return;
			 }
		 }
		 ScoreVO scoreVO = new ScoreVO();
		 int sbIndex  = 0;
		 System.out.println("=".repeat(50));
		 scoreVO.setKor(scores[this.국어]);
		 scoreVO.setEng(scores[this.영어]);
		 scoreVO.setMath(scores[this.수학]);
		 scoreList.add(scoreVO);
    	 
    }
	}
	             
	 public void printScore() {
		 int nSize = scoreList.size();
		 
		 System.out.println("=".repeat(50));
		 for(int i = 0 ; i < subject.length ; i++) {
			 System.out.println(subject[i] + "\t");
		 }
		 
		 for(int i = 0 ; i < nSize ; i++) {
			 ScoreVO scoreVO = scoreList.get(i);
			 System.out.print(scoreVO.getKor() + "\t");
			 System.out.print(scoreVO.getEng() + "\t");
			 System.out.print(scoreVO.getMath() + "\n");
		 }
	 }
}



