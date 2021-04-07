package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV2 {

	/*
	 * (������)������ ���α׷��� ��Ģ������ ���� Ŭ�������� ���� �̸��� method�� �ߺ��Ͽ� �ۼ��Ҽ� ����
	 * 
	 * ��ü���� ���� ��������� �Ű������� ���� , Ÿ�� , ������ �ٸ��� ���� �̸��� method �� �ߺ��Ͽ� �ۼ� �� �� �ִ�
	 * 
	 */
	
	protected Scanner scan;
    public InputServiceV2() {
		scan = new Scanner(System.in);

	}

	public Integer inputValue(String title, int start ,int end) {
		
		String msgTitle = String.format("%s(%d �̻�)",title,start,end);
		while(true) {
		Integer intNum = this.inputValue(msgTitle);
		if(intNum != null) {
			if(intNum< start || intNum > end) {
				System.out.printf("�Է°��� %d ~ %d ���� �Է��ϼ���\n",start,end);
				continue;
			}
		}
		}
	}
	// �Ű����� 3��
	/*
	 * ���� ������ ���� ��ȿ���˻縦 �����ϴ� method 
	 * �̹� ������� inputValue(String title) method �� �����Ͽ� ����ϰڴ�
	 */
	public Integer inputValue(String title, int start) {
		// ��ȿ�� �˻縦 �����ϰڴٴ� �޽����� �̸� �ۼ�
		
		String nsgTitle = String.format("%s (%d~%d ������ )",title,start);
		while(true) {
	       Integer intNum =	this.inputValue(nsgTitle);
	       if(intNum != null) {
	    	   if(intNum < start) {
	    		   System.out.printf("�Է°��� %d �̻��̿��� �մϴ�\n",start);
	    		   continue;
	    		   
	    	   }
	    		 }return intNum;
	       }
         
		
		
	}

	// �Ű����� 1��
	public Integer inputValue(String title) {
		/*
		 * exception�� �߻������� ����ڿ��� 
		 * �ȳ� �޽����� �����ְ� �ٽ� �Է��� �޵��� 
		 * �ϱ� ���� �� ��ġ
		 */
		while (true) {
			System.out.println(title + "���� �Է��ϼ���(QUIT : �Է����)");
			System.out.print(">>");
			String strInput = scan.nextLine();
			if (strInput.equals("QUIT")) {
				return null;
			}
			// if ���ǹ��� false ��� ����Ǵ� �κ�
			// ���� else �� ������� �ʾƵ� �������� �ڵ�
			Integer intNum = null;
			try {
				 intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("�Է°� ����!!");
				System.out.println("������ QUIT ���ڿ��� �Է��ϼ���");
				continue;
			}
			// try catch block �� �ڵ尡 ���������� ��� �Ϸ�Ǿ����� ����Ǵ� �κ�
			// �Է°��� ������ ������ �����ͷ� ��ȯ�Ǿ� intNum ������ ��� �ִ�.
			// �Է��� �������� return �ȴ�.
			return intNum;
		}
	}
}
