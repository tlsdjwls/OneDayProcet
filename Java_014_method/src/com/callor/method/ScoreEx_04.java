package com.callor.method;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

public class ScoreEx_04 {

	public static void main(String[] args) {
	
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		/*
		 * scoreVO ��� �������� (Heap �޸𸮿� ����)
		 * ���� setter �� ���� ������ �ּҸ� 
		 * scoreList �� �����϶�
		 */
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(90);
		scoreVO.setEng(90);
		scoreVO.setMath(90);
		scoreList.add(scoreVO);
		
		/*
		 * ���� scoreVO = new ScoreVO() �ڵ带 �����ϸ� �̹�
		 * �������ִ� scoreVO �����͸� ������ �� ���ּҸ�
		 * scoreList �� �߰��϶� �̷��� �ϸ� 
		 * ù��° List �� ����Ű�� �ִ� ���� �����Ͱ� ����Ǵ�
		 * ȿ���� ��Ÿ���� ��� ����Ʈ�� �����Ͱ� ������ ������.
		 * 
		 * ���� VO Ŭ������ ����Ͽ� ���� ���� List �� �߰��� �Ϸ���
		 * �׻� ��  ���� ���� ����� �Ѵ�.
		 */
		scoreVO = new ScoreVO();
		scoreVO.setKor(55);
		scoreVO.setEng(68);
		scoreVO.setMath(70);
		scoreList.add(scoreVO);
		
		scoreVO = new ScoreVO();
		scoreVO.setKor(95);
		scoreVO.setEng(48);
		scoreVO.setMath(89);
		scoreList.add(scoreVO);
		
		
		
		for(int i = 0 ; i < scoreList.size() ; i++) {
			System.out.println(scoreList.get(i).getKor()+ "\t");
			System.out.println(scoreList.get(i).getEng()+ "\t");
			System.out.println(scoreList.get(i).getMath()+ "\t");
		

		}	  
	}
	}
