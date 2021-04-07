
package com.callor.Score.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.Score.model.ScoreVO;

public class ScoreServiceV1 {

	protected Scanner scan;
	protected List<Integer> scoreList;
	ScoreVO scoreVO = new ScoreVO();
   
	public ScoreServiceV1() {

		scan = new Scanner(System.in);
		scoreList = new ArrayList(scoreList);
     
		
		scoreVO.getKan();
		scoreVO.getNames();
		scoreVO.getKor();
		scoreVO.getEng();
		scoreVO.getMath();
		scoreVO.getEin();
		scoreVO.getTotal();
		scoreVO.getAvg();
	}

	public void inputScore() {

		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("������ ����б� ����ó�� ������Ʈ 2021");
			System.out.println("=".repeat(50));
			System.out.print("1. �л��� ���� �Է�");
			System.out.print("2. �л� ���� ����Ʈ ���");
			System.out.print("QUIT. ��������");
			System.out.println("=".repeat(50));
			System.out.print("�������� >>");
			String strNums = scan.nextLine();
			if(strNums.equals("QUIT")) {
				return;
			}
			Integer intNum = scan.nextInt();
           if(intNum == 1) {
        	   this.ScoreNames();
           }else if(intNum == 2){
        	   this.printScore();
           }
           
		}
	}

	public void ScoreNames() {
	   
		while(true) {
        System.out.println("=".repeat(50));
		System.out.println("�л��̸��� �Է��ϼ���(�Է��� �ߴ��Ϸ��� QUIT)");
		System.out.println("=".repeat(50));
		System.out.print("�̸� >>");
		Integer Names = scan.nextInt();
		if(Names.equals("QUIT")) {
			 break;
		}
		
			
		}
			
		System.out.println("=".repeat(50));
		System.out.println("�л��� ������ �Է��ϼ��� (�������� : 0 ~ 100, �Է��� �ߴ��Ϸ��� QUIT");
		System.out.println("=".repeat(50));
		System.out.print("���� >>");
		System.out.print("���� >>");
		System.out.print("���� >>");
		System.out.print("���� >>");
		System.out.print("���� >>");
		
		
	   }
	
	
    
		
	
	
	
	public void printScore() {
          
		
	}

}
