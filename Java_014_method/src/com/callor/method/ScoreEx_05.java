package com.callor.method;

import com.callor.method.model.ScoreVO;

public class ScoreEx_05 {

	public static void main(String[] args) {
		
	// stack �޸𸮿� 2���� ����Ҹ� ����� ���� 100 , 200�� ������ ������ �ξ��
	int intNum1 = 100;
	int intNum2 = 200;
	
	/*
	 * Heap �޸𸮿� kor,eng,math ... ���� ���� ������
	 * ����Ҹ� ����� ����ҵ��� ù��° �ּҸ� static �޸𸮿� �����ϰ� �װ���
	 * scoreVO ��� �̸��� �ٿ���
	 */
	ScoreVO scoreVO = new ScoreVO();
	scoreVO.setKor(90);
	scoreVO.setEng(90);
	scoreVO.setMath(90);
	
	/*
	 * scoreVO ��ü�� kor ������ ���� �о intkor ��
	 * ������ ������ �޶�
	 * 
	 * �����δ�
	 * 1. stack �޸𸮿� �ִ� scoreVO ������ ã�Ƽ�
	 * 2. scoreVO ������ ����� �ּҸ� �б� 
	 * 3. ���ּҿ� �ش��ϴ� Heap �޸𸮸� ã�� 
	 * 4. (Heap �޸�)�� kor �������� ���� �о 
	 * 5.intKor ������ ����
	 */
	  int intKor = scoreVO.getKor();
	  
	  
	  
	}
}
