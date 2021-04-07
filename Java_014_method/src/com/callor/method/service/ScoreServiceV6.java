package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 * �����͸� �Է� (Ű����,Random,����,���ͳ�)
 *  �����͸� VO �� ���
 * �Էµ� �����͸� List�� �߰�
 * ������ ���� �ٽ� List ����
 * �����͸� �о� ���
 * List���� �����Ͽ� VO�� ���
 * ���
 */
public class ScoreServiceV6 {
     // final Ű��带 ������ ���� = ���
	 // �ѹ� ����� ���� �����Ҽ� ���� Ư���� ���� => ���
	protected final int ���� = 0;
	protected final int ���� = 1;
	protected final int ���� = 2;
	
	protected List<ScoreVO> scoreList;

	protected String[] subject;

	protected InputServiceV2 isV2;

	public ScoreServiceV6() {
		subject = new String[] { "����", "����", "����" };
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
		 scoreVO.setKor(scores[this.����]);
		 scoreVO.setEng(scores[this.����]);
		 scoreVO.setMath(scores[this.����]);
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



