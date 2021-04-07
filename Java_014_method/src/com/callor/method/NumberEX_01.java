package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class NumberEX_01 {

	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		// �ΰ��� �Ű������� ���� addNum() method ����
		// ���� 31 �� 29�� �����ϰ�
		// �� ����� retNum ������ ��ƶ� (�����ش޶�)
		Integer retNum = nsV1.addNum(31, 29);
		if(retNum == null) {
			System.out.println("����� ¦���� �ƴ�");
		}else {
			System.out.printf("��� [%d] �� ¦��",retNum);
		}
		/*
		 * addNum(float num1 , float num2) method �� return type �̱� ������
		 * ���� �Ǵ� ������� �����ϴ� ����(retNum1) �� �ݵ�� float,Float ���̿��� �Ѵ� 
		 */
		// Integer retNum1 = nsV1.addNum(30.2F,33.2F);
		Float retNum1 = nsV1.addNum(30.2F,33.2F);
		
		//NullPointerException �߻�
		//float retNum2 = nsV1.addNum(30.2F,33.2F);
		
		/*
		 * ������ �����ϴ� ��Ŀ���  primitive ��İ� wrappre class ����� �ִ�
		 * 
		 * Ư�� ���ڸ� �ٷ�� ��쿡 �׻� ���ڰ��� ����ȴٴ� ������ �������� 
		 * primitive ������� �����ص� �ƹ��� ������ ����
		 * 
		 * java �� DB(DataBase) �� �����Ǵ� ������Ʈ�� �����Ҷ��� null �̶�� 
		 * Ư���� ���� �׻� �ν��ؾ� �Ѵ� � ����� null ���� ���ԵǴ� ���
		 * primitive ��Ŀ����� ����� �Ұ����ϴ�
		 * 
		 * �̷����� ������ �����Ҷ� wrapper class ����� ����ϴ°��� �ٶ��� �ϴ�
		 */
		
		// ��ü���� Ư¡�� ������
		// method �� �ߺ����� �̶�� �Ѵ�
		// ���� �̸��� method �� �Ѱ��� Ŭ������ �ߺ� ���� �Ǿ� �־ �����ϴ�
		// ���� type �� ���� java �� �ڵ����� �Ű����� ���İ� ��ġ�ϴ� �޼��� ��
		// ã�Ƽ� �������ش�.
		
		// public Integer addNum(int num1 , int num2) �� ȣ��
		nsV1.addNum(30, 40);
		//public float addNum(float num1 , float num2) �� ȣ��
		nsV1.addNum(30f,40f);
	}  

}
