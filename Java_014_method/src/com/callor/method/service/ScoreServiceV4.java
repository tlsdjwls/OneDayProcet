package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV4 {
	/*
	 * ������ �̸��� ����� �迭�� Ŭ���������� ���� ���������Է�,��������Ʈ ��µ�� ����ϱ� ������ �ɹ����� ����, Ŭ���� ������ ����
	 * 
	 */

	protected String[] subject;
	protected InputServiceV2 inService;

	/*
	 * ������ method ScoreServiceV4 Ŭ������ ����Ͽ� ��ü�� �����Ҷ� ȣ���� method
	 */
	public ScoreServiceV4() {
		// �����ڿ� �ۼ��Ǵ� �ڵ�
		// �ɹ����� ������ ����� ����, ��ü�� �����ϴ� �ڵ�
		subject = new String[] { "����", "����", "����" };
		inService = new InputServiceV2();
	}

	// Ű���带 ����Ͽ� 3������ ������ �Է¹޴µ�
	// ����Ʈ ���� V2�� ����� method�� ����� �����̹Ƿ�
	// ���⿡���� Ű���� ���� Ŭ���� , ��ü�� ����� �ʿ䰡 ����
	public void inputScore() {

		/*
		 * ������� �迭�� ������ ������ ������ �Է¹޴� method ȣ�� �ڵ带 �ѹ��� �ۼ��ϰ� for() �ݺ����� ����Ͽ� ó���Ҽ� �ִ�
		 */
		
		// ������ ������ ������ score �迭�� ����
		int[] scores = new int[ subject.length];
		
		for (int i = 0; i < subject.length; i++) {
		 Integer score = inService.inputValue(subject[i], 0, 100);
		 if(score == null) {
			 System.out.println("����");
			 /*
			  *  break �� return 
			  *  break �� �����ϸ� for() �ݺ����� �ߴ��ϰ� for()
			  *  �ݺ��� ������ �ڵ带 �����Ѵ�
			  *  for() �ݺ������Ŀ� �ٸ� ���� (�ڵ�) �� ������ �ʿ䰡
			  *  �������� break 
			  *  
			  *  return �� �����ϸ� ���� method(inputScore()) �� ������ ���� �ع�����.
			  *  inputScore() �޼��带 ȣ���ߴ� �ڵ�� �ǵ��ư���
			  */
			 return;
		 }
		 // return ���� ������ scores �迭�� i��° ��ġ�� �����϶�
         scores[i] = score;
		}
		
		int sum = 0;
	    for(int i = 0 ; i < scores.length ; i++) {
	    	sum += scores[i];
	    }
        float avg = (float)sum / subject.length;
        
        System.out.println("���� :" + sum);
        System.out.println("��� :" + avg);
	    
	}

}
