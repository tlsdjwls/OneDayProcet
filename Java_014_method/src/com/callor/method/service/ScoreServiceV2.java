package com.callor.method.service;



/*
 * inputServiceV2 Ŭ������ inputValue () �޼��忡
 * "����" ,0,100 ���� ������ �������� null �̸�����
 * �������̸� ����: ?? �������� ���
 */
public class ScoreServiceV2 {
  /*
   * ����Ʈ ���� V2 Ŭ������ Ȱ���ϴ� �޼��尡 2���̻��� ��쿡�� ��� ����,
   * ��ü�� Ŭ���� ����(�ɹ���������) ���� ��������
   * �׸��� �����ڿ��� �ʱ�ȭ �Ͽ� ����ϵ��� �Ѵ�.
   */
	protected InputServiceV2 inV2;
	public ScoreServiceV2() {
	inV2 = new InputServiceV2();
	}
	public void inputScore() {
		
	InputServiceV2 inV2 = new InputServiceV2();
	Integer intKor = inV2.inputValue("����", 0,100);
	if(intKor == null) {
		System.out.println("����");
	}else {
		System.out.printf("���� ���� : %d",intKor);
	}
	}
}