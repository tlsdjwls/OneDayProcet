package com.tlsdjwls.tandard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class EX_01 {
	
	public static void main(String[] args) {
	    
		InputServiceImplV2 isV2 = new InputServiceImplV2();
		InputServiceImplV1 isV1 = new InputServiceImplV1();
		
		isV1.inputValue("�����");
		isV1.inputValue("�����", 0);
		isV1.inputValue("�����", 0, 1000);
		
		/*
		 * List �������̽��� ������ Ŭ������ 
		 * ArrayList,LinkedList,Vector ���� 3������ �ִ�
		 * 3������ Ŭ������ �ڵ忡 List �������̽��� impl ������ �̴�
		 * �̷��� Ŭ������ ����� ������ �Ҷ� �������̽��� ������ �ϰ�
		 * Ŭ������ �����ڷ� ��ü�� �����ϴ� ���� ����
		 * 
		 * List �������̽��� impl �� Ŭ�������� 
		 * List type�� Ŭ������ ��� ȣĪ��
		 */
		// List 3���� ���� : ������� �Ȱ���
		List<Integer> intList = new ArrayList<Integer>();
		intList = new LinkedList<>();
		intList = new Vector<Integer>();
		// �̷��� ����� �����ø����̼ǿ��� �ַλ��!!
		ArrayList<String> strList = new ArrayList<String>();
		
	}


}
