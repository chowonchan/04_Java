package condition.ex;
/**
 * 조건문 예시 기능용 클래스
 */

import java.util.Scanner;

public class ConditionEx {
	
	// 필드(field) == 멤버 변수 == 인스턴스 변수(전역 변수 비슷)
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 *  1~ 10 사이 난수가 짝수 인지 홀수 인지 출력
	 */
	
	public void method1() {
		
		int ran = (int) (Math.random() * 10 +1);
		
		if(ran % 2 != 1) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}
		
	}
	
	/**
	 * 나이를 입력 받아
	 * 13세 이하 : 어린이
	 * 14세 이상 19세 이하 : 청소년
	 * 20세 이상 : 성인
	 * 
	 * 구분하여 출려하기
	 */
	public void method2() {
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age<= 13) {
			result = ("어린이");
		}else if(age <=19) {
			result = ("청소년");
		}else {
			result = ("성인");
		}
		
		System.out.println(result);
	}
	
	/**
	 * 나이를 입력 받아
	 * 13세 이하 : 어린이
	 * 14세 이상 19세 이하 : 청소년
	 * 	-14 ~ 16 : 청소년 (중)
	 * 	-17 ~ 19 : 청소년 (고)
	 * 20세 이상 : 성인
	 * 
	 * 0이하 또는 100 초과 : 잘못 입력 하셨습니다.
	 * 
	 * 구분하여 출려하기
	 */
	public void method3() {
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age <=0 || age>=100) result = ("잘못 입력 하셨습니다.");
		else if(age<=13)        result = ("어린이");

		else if(age<=19) {	 
			
			// result = "청소년" + ((age<=16) ? "(중)" : "(고)");
			
			if(age<=16) 		result =("청소년(중)");
			else 				result = ("청소년(고)");	
		}
		else 					result =("성인");
		
		System.out.println(result);
	}
	
	/** [switch 를 이용한 메서드 호출]
	 */
	public void displayMenu() {
		
		System.out.println("1. method1() : - 난수 출력");
		System.out.println("2. method2() : - 나이 구분1");
		System.out.println("3. method3() : - 나이 구분2");
		System.out.println("4. method4() : - 계절 찾기");
		System.out.println("5. method5() : - 성적 입력");
		
		System.out.print("번호 선택 >> ");
		int num = sc.nextInt();
		
		System.out.println("----------------------------------");
		
		switch (num) {
		case 1  : method1(); break;
		case 2  : method2(); break;
		case 3  : method3(); break;
		case 4  : method4(); break;
		case 5  : method5(); break;
		default : System.out.println("잘못 입력 하셨습니다");
		}
	}
	
	/**
	 * 입력된 달 (월)의 계절 출력하기
	 */
	public void method4() {
		
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		// case를 연속해서 작성하는 여러 방법
		
		// 1) 세로로 쭉
		case 3:
		case 4:
		case 5:   result = "봄"; break;
		
		// 2) 가로로 쭉
		case 6: case 7: case 8:   result = "여름"; break;
		
		// 3) case 값, 값, 값 형식
		case 9, 10, 11: result = "가을"; break;
		
		case 12: case 1: case 2:  result = "겨울"; break;
		
		default : result = "잘못 입력";
		
		} // switch end
		
		System.out.println(result);
	}
	
	/** [성적 판별기]
	 * 
	 * 중간고사, 기말고사, 과제점수를 입력받아 성적 부여
	 * 
	 * - 중간고사(40%), 기말고사(50%), 과제(10%)
	 * - 입력시 각각 100점 만점으로 입력 받음
	 * - 합산된 점수에 따라 성적 부여
	 * 
	 * 95점 이상 : A+
	 * 90점 이상 : A
	 * 85점 이상 : B+
	 * 80점 이상 : B
	 * 75점 이상 : C+
	 * 70점 이상 : C
	 * 65점 이상 : D+
	 * 60점 이상 : D
	 * 나머지    : F
	 * 
	 * [실행 화면]
	 * 이름 : 홍길동
	 * 중간고사 점수(40%) : 100
	 * 기말고사 점수(50%) : 80
	 * 과제 점수(10%) : 50
	 * 
	 * 최종 점수 : 85점
	 * 성적 : B+

	 * 
	 * 
	 */
	public void method5() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("중간고사 점수(40%) : ");
		int mi = sc.nextInt();
		System.out.print("기말고사 점수(50%) : ");
		int fi  = sc.nextInt();
		System.out.print("과제 점수(10%) : ");
		double test   = sc.nextDouble();
		
		double score = mi * 0.4 + fi * 0.5 + test * 0.1;
		
		String grade;
		
		// 1)
//		if(score>=95) grade = "A+";
//		else if(score>=90) grade = "A";
//		else if(score>=85) grade = "B+";
//		else if(score>=80) grade = "B";
//		else if(score>=75) grade = "C+";
//		else if(score>=70) grade = "C";
//		else if(score>=65) grade = "D+";
//		else if(score>=60) grade = "D";
//		else grade = "F";
		
		// 2)
//		if(score>=90) 	   grade = "A"+ ((score>=95) ? "+" : "");
//		else if(score>=80) grade = "B"+ ((score>=85) ? "+" : "");
//		else if(score>=70) grade = "C"+ ((score>=75) ? "+" : "");
//		else if(score>=60) grade = "D"+ ((score>=65) ? "+" : "");
//		else grade = "F";
		
		
		// 3)
//		switch ((int)(score / 5)) {
//		case 20,19: grade = "A+"; break;
//		case 18: grade    = "A"; break;
//		case 17: grade    = "B+"; break;
//		case 16: grade    = "B"; break;
//		case 15: grade    = "C+"; break;
//		case 14: grade    = "C"; break;
//		case 13: grade    = "D+"; break;
//		case 12: grade    = "D"; break;
//		default : grade   = "F"; break;
//		}
		
		// 4)
		switch ((int)(score / 10)) {
		case 10,9: grade = "A"; break;
		case 8: grade    = "B"; break;
		case 7: grade    = "C"; break;
		case 6: grade    = "D"; break;
		default : grade   = "F"; break;
		}
		if(score > 60 && score %10 >=5) grade += "+";
		
		
		
//		System.out.println("-----------------------------");
//		System.out.println("이름 : " + name);
//		System.out.println("중간고사 점수(40%) :" + mi);
//		System.out.println("기말고사 점수(50%) :" + fi);
//		System.out.println("과제 점수(10%) :" + test);
		
		System.out.println();
		
		System.out.println("최종 점수 : " + score);
		System.out.println("성적 : " + grade);
		System.out.println("-----------------------------");
		
	}
	
	/** [연습 문제]
	 * 국어, 영어, 수학, 사탐, 과탐 점수를 입력 받아
	 * 40점 미만 과목이 있으면 FAIL
	 * 평균이 60점 미만인 경우도 FAIL
	 * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
	 * 
	 * [출력 예시]
	 * 점수 입력(국 영 수 사 과) : 100 50 60 70 80
	 * 
	 * 1) 40점 미만 과목이 존재하는 경우
	 * FAIL [40점 미만 과목 : 국어 영어]
	 * 
	 * 
	 * 2) 평균 60점 미만인 경우
	 * FAIL [점수 : 50.4 (평균 미달)]
	 * 
	 * 3) PASS인 경우
	 * PASS [점수 : 83.4 / 100]
	 * 
	 */
	
	public void practice() {
		
		System.out.print("점수 입력(국 영 수 사 과 ) : ");
		double kor  = sc.nextDouble();
		double eng  = sc.nextDouble();
		double math = sc.nextDouble();
		double soc  = sc.nextDouble();
		double sci  = sc.nextDouble();
		
		String str = "";
		if(kor<40) str  += "국어 ";
		if(eng<40) str  += "영어 ";
		if(math<40)str  += "수학 ";
		if(soc<40) str  += "사탐 ";
		if(sci<40) str  += "과탐 ";
		
		
		double score = (kor + eng + math + soc + sci) / 5;
		
		if(kor <40 || eng < 40 || math <40 || soc <40 || sci <40) {
			System.out.printf("FAIL [40점 미만 과목 : %s ]", str);
		}else if(score < 60) {
			System.out.printf("FAIL [점수 : %.1f ( 평균 미달 )]", score);
		}else {
			System.out.printf("PASS [점수 : %.1f / 100]",score);
		}
		
		
	}

	

}








