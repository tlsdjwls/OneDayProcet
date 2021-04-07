package com.callor.method.service;

import java.util.Scanner;

public class InputNumberV1 {

	/*
	 * Scanner class �� Ű���� �ڿ��� �����Ͽ� Ű����� ���� ���� �Է� �ޱ� ���� Ŭ�����̴� ��Ŭ������ ��ǻ���� �ڿ��� ����ϴ�
	 * ������ �ſ� �����ϰ� �ʿ��� Ŭ���� �̴� ����Ѵ� ����� ���� , ������ �߻��ϰų� ������ ��ǻ�� �ý��� ���ߴ� ������� �߻��� �� �ִ�
	 * �̷��� Ŭ������ ����Ҷ��� ����� ���� �� �ʿ��ϴ�
	 * 
	 * inputValue1("�����")
	 * inputValue2("�����",100)
	 * inputValue3("�����",0,1000)
	 * inputValue2("�����",0,1000);//�Ű����� ����
	 * 
	 * 
	 * public Integer inputValue1(String title); // 1
	 * public Integer inputValue2(String title,int start); // 2
	 * public Integer inputValue3(String title,int start , int end); //3
	 * 
	 * ��ü.inputValue("�����",100); // �ڵ����� 2�� method �� ���� , ȣ��
	 * ��ü.inputValue(100,"�����"); // �Ű����� ����
	 * 
	 */

	// Scanner Ŭ������ main() method �� �ƴ� Service ���� Ŭ�������� ����Ҷ��� Ŭ���� ����
	// ������ �ϰ� Ŭ���� �� ������ ���� ����(�ʱ�ȭ) �� �ϴ°��� ����

	protected Scanner scan;

	public InputNumberV1() {
		scan = new Scanner(System.in);

	}

	/*
	 * ���ڿ� , ���� , ���� �Ű������� ���� �޼��� ����
	 * 
	 * ���ڿ��� ���� (start ~ end ) ���� ���޹޾� prompt ���ڿ��� �����ϰ� inputValue(String title) �޼��带
	 * ȣ���Ͽ� ���� �Է� �޵��� �ϰ� return �� ���� ���� null�� return �Ǹ� �׳� return �ع����� �������� return
	 * �Ǹ� start , end �� ������ �ִ°����� ��ȿ�� �˻縦 �ϰ� �ݺ��Ѵ�
	 */

	public Integer inputValue(String title, int start , int end) {
		while(true) {
		Integer  retNum = this.inputValue(title);
		if(retNum == null) {
			return null;
		}else if (retNum < start || retNum > end){
         		System.out.printf("�Է°��� %d ~ %d " + "���� �̿��� �մϴ� \n", start,end);
         		continue;
		}
		  return null;
		}
	}
	/*
	 * String title �Ű������� �ް� �������̳� QUIT �� �ԷµǴ��� Ȯ���� �ϰ� �߸� �Էµ� ���� ������ �ٽ� �Է� �޵��� �ϴ�
	 * �޼���
	 */

	public Integer inputValue(String title) {
		while (true) {

			System.out.println(title + "���� �Է��ϼ���(QUIT:�Է��ߴ�");
			System.out.print(">>");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				return null;
			} else {
				Integer num = null;
				try {
					num = Integer.valueOf(strNum);
				} catch (Exception e) {
					System.out.println("\n �Է��� QUIT Ȥ�� ���ڸ� �����մϴ�");
					continue;
				}
			}
			return null;
		}
	}
}
