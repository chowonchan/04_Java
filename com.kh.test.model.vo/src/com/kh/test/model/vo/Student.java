package com.kh.test.model.vo;

public class Student {
	private String name;
	private int score;
	
	public Student() {}

	// 7번과 9번 사이에 매개 변수 생성자 작성 되어있지 않음
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
// 24번줄에 name 과  score 값들이 return 을 하여 결과 화면에 출력될 형식 이 작성 되어있지 않음
	@Override
	public String toString() {
//		return name + " 학생의 점수 : " + score + "점";
		return String.format(" %s 학생의 점수 : %d 점", name, score);
	}


	
	
	
	
}




