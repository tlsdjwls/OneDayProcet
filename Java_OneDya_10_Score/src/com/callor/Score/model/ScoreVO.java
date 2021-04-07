package com.callor.Score.model;

public class ScoreVO {
	private int Names;
	private int Kor;
	private int Eng;
	private int Math;
	public int getNames() {
		return Names;
	}
	public void setNames(int names) {
		Names = names;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	public int getEin() {
		return ein;
	}
	public void setEin(int ein) {
		this.ein = ein;
	}
	public int getKan() {
		return Kan;
	}
	public void setKan(int kan) {
		Kan = kan;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public float getAvg() {
		return Avg;
	}
	public void setAvg(float avg) {
		Avg = avg;
	}
	private int ein;
	private int Kan;
	private int Total;
	private float Avg;
	
}
