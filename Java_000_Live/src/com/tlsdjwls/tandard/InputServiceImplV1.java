package com.tlsdjwls.tandard;

import java.util.Scanner;

/*
 * �������̽��� implements �� Ŭ������ 
 * �̸��� ������ ���̻翡  Impl�� ���δ�
 * 
 * �������̽��� Impl �� Ŭ������ 
 * �������̽��� ����� �߻�޼��带 "�ݵ��" ��ü���� �ڵ�� 
 * �����ؾ��Ѵ�.
 * 
 * ���� ���� ��ü���� �ڵ尡 �������� �ʾҴ��� method�� ���´�
 * ���� �Ҽ� ����
 * 
 * �̷��� ��Ģ�� �����Ͽ� �ٸ� Ŭ������ �����Ҷ� ���ϰ� , ������ ������
 * �ϱ� �����̴�
 */
public class InputServiceImplV1 implements InputService {

	protected Scanner scan;

	public InputServiceImplV1() {
		scan = new Scanner(System.in);

	}

	@Override
	public Integer inputValue(String title) {
		// TODO Prompt Ÿ��Ʋ�� �����ְ� ���� �Է� �ޱ�
		while (true) {

			System.out.println(title + "���� �Է��ϼ��� (QUIT:�Է��ߴ�)");
			System.out.print(">>");
			String strIn = scan.nextLine();
			if (strIn.equals("QUIT")) {
				System.out.println("�Է����!!!");
				return null;
			}
			Integer intIn = null;
			try {
				intIn = Integer.valueOf(strIn);
			} catch (Exception e) {
				System.out.println("������ QUIT �� �Է°���");
				continue;
			}

		} // end while

	}

	@Override
	public Integer inputValue(String title, int start) {
		// TODO Prompt ���۰��� ���� ��ȿ�� �˻� �߰��� method 
		title = String.format("%s ( %d �̻�)",title,start);
		while (true) {
			// intIn�� ����� �� == InputValue(String title) �� return ���ذ�
		Integer intIn=this.inputValue(title);
		if(intIn != null) {
			if(intIn < start) {
				System.out.printf("�Է°��� $d �̻�����!! \n"+start);
               continue;
			}
		}return intIn;
		}// end while	
	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		// TODO  ���� , ���۰� , ���ᰪ���� ��ȿ�� �˻� method
		title = String.format("%s (%d ~ %d ������", title,start,end);
		while (true) {
			Integer intIn = this.inputValue(title);
			if(intIn != null) {
				if(intIn < start || intIn > end) {
					System.out.printf("���� %d ~ %d ������ �Է��ϼ��� ~~~\n",start,end);
					continue;
				}
			}
			return intIn;
		}//end while
		
	}

}
