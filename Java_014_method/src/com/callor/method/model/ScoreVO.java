package com.callor.method.model;

public class ScoreVO {

	/*
	 * ����ó���� �ϴ� �����͸� �����ϱ� ���� vo Ŭ���� ����
	 * �й� , �л��̸� , ���� , ���� ,���� , ���� , ���
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

