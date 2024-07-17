package loop.ex;

import java.util.Scanner;

public class LoopEx2 {
	
	Scanner sc = new Scanner(System.in);

	/** 다음 모양 출력하기
	 * 1234
	 * 1234
	 * 1234
	 * 
	 */
	public void method1() {
		for(int i = 1; i<=3; i++) { // 행 제어 (3행 반복)
			for(int y = 1; y <=4; y++) { // 열 제어(4열 반복)
				System.out.print(y);
			}
			System.out.println(); // 한 행이 끝나면 줄 바꿈
		}
	}
	
	
	/** 다음 모양 출력하기
	 * 54321
	 * 54321
	 * 54321
	 * 54321
	 */
	public void method2() {
		
		for(int i = 1; i<=4; i++) {
			for(int y = 5; y >= 1; y--) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
	
	/**
	 * 행, 열, 정방향(0)/역방향(1)
	 * 
	 * 행 입력 : 3
	 * 열 입력 : 6
	 * 정방향(1)/역방향(-1) : 1
	 * 
	 * 123456
	 * 123456
	 * 123456
	 */
	public void method3() {
		System.out.print("행 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 입력 : ");
		int col = sc.nextInt();
		System.out.print("정방향(1)/역방향(-1) : ");
		int direction = sc.nextInt();
		
		// 1)
//		for(int i = 1; i<=col; i++) {
//			switch(direction){
//			
//				case 1  : for(int y = 1; y<=row; y++) System.out.print(y); break;
//				case -1 : for(int y = row; y>=1; y--) {System.out.print(y); break;
//				default : System.out.println("잘못된 입력"); return;
//				}
//			}
//			
//			System.out.println();
//		}
		
		
		// 2)
//		for(int i = 1; i<=row; i++) {
//			
//			if(direction == 1) {
//				for(int y = 1; y<=col; y++) {
//					System.out.print(y);
//				}
//			}else {
//				for(int y = col; y>=1; y--) {
//					System.out.print(y);
//				}
//			}
//			System.out.println();
//		}
		
		// 3)
		System.out.println("--------------------------");
		
		// 정방향 초기화
		int start = 1;
		int end = col;
		
		if(direction == -1) { // 역방향
			start = col;
			end = 1;
		}
		
		for(int i = 1; i<=row; i++) {
			for(int y = start;  ; y += direction) {
				
				if(direction ==1 && y <= end) {
					System.out.print(y);
					continue;
				}
				
				if(direction == -1 && y>= end) {
					System.out.print(y);
					continue;
				}
				break;
			}
			System.out.println(); // 줄 바꿈
		}
	}
	
	/**다음 모양 출력 하기
	 * 
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 *  
	 */
	public void method4() {
		
		for(int i= 0; i<=2; i++) {
			for(int y = 0; y<=2; y++) {
				System.out.printf("(%d,%d)",i ,y);
			}
			
			System.out.println();
		}
	}
	
	public void method5() {
		
		for(int i= 0; i <= 2; i++) {
			for(int y = 0; y <= i; y++) {
				System.out.printf("(%d,%d)",i ,y);
			}
			
			System.out.println();
		}
	}
	
	/**다음 모양 출력 하기
	 * 
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) 
	 * (2,0) 
	 * 
	 */
	public void method6() {
		for(int i= 0; i < 3; i++) {
			for(int y = 0; y < 3-i; y++) {
				System.out.printf("(%d,%d)",i ,y);
			}
			
			System.out.println();
		}
	}
	
	/** [do ~ while]
	 * - 최소 1회 이상 반복 하는 while문 
	 */
	public void method7() {
		int num = 10;
		
		do{
			System.out.println("반복 출력");
			
		} while(num < 10);
		 
		System.out.println("--- 종료 ---");
	}
	
	
	// 0이 입력될 때 까지 입력된 모든 수의 합
	public void method8() {
		
		int input = 0; // 숫자를 입력 받을 변수
		int sum   = 0;
		
		
		do{
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			sum += input;
			
		}while(input != 0);
		
		System.out.println("합계 : " + sum);
	}
	
	
	
	
}










