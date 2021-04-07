
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
			System.out.println("빛고을 고등학교 성적처리 프로젝트 2021");
			System.out.println("=".repeat(50));
			System.out.print("1. 학생별 성적 입력");
			System.out.print("2. 학생 성적 리스트 출력");
			System.out.print("QUIT. 업무종료");
			System.out.println("=".repeat(50));
			System.out.print("업무선택 >>");
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
		System.out.println("학생이름을 입력하세요(입력을 중단하려면 QUIT)");
		System.out.println("=".repeat(50));
		System.out.print("이름 >>");
		Integer Names = scan.nextInt();
		if(Names.equals("QUIT")) {
			 break;
		}
		
			
		}
			
		System.out.println("=".repeat(50));
		System.out.println("학생의 성적을 입력하세요 (성적범위 : 0 ~ 100, 입력을 중단하려면 QUIT");
		System.out.println("=".repeat(50));
		System.out.print("국어 >>");
		System.out.print("영어 >>");
		System.out.print("수학 >>");
		System.out.print("과학 >>");
		System.out.print("국사 >>");
		
		
	   }
	
	
    
		
	
	
	
	public void printScore() {
          
		
	}

}
