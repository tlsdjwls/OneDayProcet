package com.callor.method.service;

/*
 * �Լ��� ���α׷��� ��� ( �Ǵ� ������ ���α׷��� ���) ������
 * �Ѱ��� ���(����) �Ǵ� �� ������Ʈ���� ���� �̸��� �Լ��� ����
 * �Ҽ� ����
 * 
 * ��ü���� ���α׷����(java) ������
 * �Ѱ��� Ŭ����(����) ������ ���� �̸��� �Լ�(method) �� 
 * �ߺ��Ͽ� ������ �� ����
 * �Ѱ��� Ŭ�������� method �� �ߺ����� �Ҽ� �ִ�.
 * �� ������ �ִµ� : �Ű������� �޶�� �Ѵ�
 * �Ű������� type , ���� , ������ �ٸ��� ���� �̸��� method �� �ߺ����� �Ҽ� �ִ�.
 */
public class NumberServiceV1 {
	/*
	 * method �� �̸��� addNum() �� ���� ������ �Ű������� �޴´� ������ ��𼱰� addNum() ȣ���Ҷ��� ��ü.addNum()
	 * 2���� ������ �����ϰ� �ϰڴ� ��� ���� ��ü.addNum(100,200) �� ���� ������ ���޹ޱ� ���ؼ��� method�� �غ� �ؾ�
	 * �Ѵ� method �� () �ȿ� ������ �����Ѵ� �ΰ��� ������ ����
	 * 
	 * �� ���� ���� ����Ͽ� ����� ¦���̸� �� ���� return ��; �׷����� ������ null �� return �϶� return null;
	 * ����
	 * 
	 * return �� ������ ����� �������� void �� �ƴ� return type �� ������ �־�� �Ѵ�
	 * 
	 * �ܼ��� ������ return �� �ϴ� ���� int type ���� �ϸ�Ǵµ� ���⼭�� � ���ǿ� ���� null���� return �ؾ� �ϴ�
	 * ��쵵 �ֱ� ������ int type �� �ƴϰ� Integer type ���� �����ؾ� �Ѵ�
	 */

	public Integer addNum(int num1, int num2) {
		// TODO  �� ������ ���� ¦���ΰ� �Ǻ��ϴ� �ڵ�
		// ù��° ���
		//  � ������ �����ϰ� �������� ���� return ���� �����ؾ� �ϴ°�� ����� �����
		// ������ ��Ƴ��� ���� �ڵ带 ��������
		 int sum = num1 + num2;
		 if(sum % 2 == 0) {
		 return sum;
		 }
		// �ι�° ���
		// C ���� ���� �Լ��� ������ �Լ��� ������ return ���� �ݹ�������
			// ��� �������� ������ �ִ� �������� ������ ��Ű�� �ڵ忹
	//	Integer sum = null;
	//	if((num1 + num2) == 0) {
	//		sum = num1 + num2;
			
	//	}
	//	return sum;
		// ����° ���
		// if((num1 + num2) % 2 ==0) {
		// return num1 + num2;
		//
		// return null;

		// }
		 return null;
		
	}
	/*
	 *  java �� method �� �Ű������� ���� ȣ���ϴ� ����� �޶�����
	 *  ���� addNum(����,����) ������� ȣ���Ϸ��� 
	 *  addNum(int num1,int num2), addNum(Long num1 , Long Num2) ������� �޼��带 ����
	 *  ���� addNum(�Ǽ�,�Ǽ�) ������� ȣ���Ϸ���
	 *  addNum(float,float) , addNum(double num1 , double num2)
	 *  �������� �����ؾ��Ѵ�.
	 */
	 public Flodat addNum(float num1, float num2) {
		 //TODO �� �Ǽ��� ���޹޾� ¦���ΰ� �Ǻ��ϴ� �ڵ�
		 // method �ڵ尡 ���� �ۼ����� �ʾ����� ���������� ���°��� �����ϴ� �ӽ��ڵ�
		 float sum = num1 + num2;
		 if(sum % 2 == 0) {
			 return sum;
		 }
		 
		 return null;
	 }
	

	
	}
