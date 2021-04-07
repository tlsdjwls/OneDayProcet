package com.callor.method.model;

public class ScoreVO {

	/*
	 * 성적처리를 하는 데이터를 저장하기 위한 vo 클래스 설계
	 * 학번 , 학생이름 , 국어 , 영어 ,수학 , 총점 , 평균
	 */
	
   private String num;
   private String name;
   private Integer kor;
   private Integer eng;
   private Integer math;
   private Integer total;
   public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getKor() {
	return kor;
}
public void setKor(Integer kor) {
	this.kor = kor;
}
public Integer getEng() {
	return eng;
}
public void setEng(Integer eng) {
	this.eng = eng;
}
public Integer getMath() {
	return math;
}
public void setMath(Integer math) {
	this.math = math;
}
public Integer getTotal() {
	return total;
}
public void setTotal(Integer total) {
	this.total = total;
}
public float getAvg() {
	return avg;
}
public void setAvg(float avg) {
	this.avg = avg;
}
float avg;
}

