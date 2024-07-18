package practice;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
			

	/* [실습 문제 1]
		길이가 9인 배열을 선언 및 할당하고, 
		1부터 9까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		
		짝수 번째 인덱스 값의 합을 출력하세요. 
		(0 번째 인덱스는 짝수로 취급)
	 */
	public void practice1() {
		
		int[] arr = new int[9];
		
		for(int i = 0 ; i <arr.length; i++) {
			arr[i] = i + 1;

		}
		
		// 출력 및 합계
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n 짝수 번째 인덱스 값의 합 : " + sum);
	}
	
	public void practice2() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = arr.length - 1 ; i >=0; i--) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		
	
		System.out.println("\n 홀수 번째 인덱스 값의 합 : " + sum);
		
		System.out.println("--------------------------");
		
		// 2)
		// 역방향(8 -> 0)
		int[] arr2 = new int[9];
		
		int sum2 = 0;
		
		// arr.length     : 9 9 9 9 9 9 9 9 9
		// i              : 8 7 6 5 4 3 2 1 0
		// arr.length - i : 1 2 3 4 5 6 7 8 9
		// arr[i]         : 1 2 3 4 5 6 7 8 9
		
		// 대입은 역방향
		for(int i = arr2.length - 1 ; i >= 0 ; i--) {
			arr2[i] = arr2.length - i;
			if(i % 2 == 1)  sum2 += arr2[i];
		}
		
		// 출력은 정방향
		for(int num : arr2) {
			System.out.print(num + " ");
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sum2);
	
	}
	
	
	public void practice3() {
		
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 1; i < arr.length+1; i++ ) {
			
			System.out.print(i+" ");
			
		}
		
	}
	
	public void practice4() {
		
		int[] arr = new int[5];
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
			
		System.out.print("검색 할 값: ");
		int num2 = sc.nextInt();
		
		boolean flag = true; // 일치하는게 없다 
		
		for(int i = 0; i< arr.length; i++) {
			if(num2 == arr[i]) {
				System.out.printf("인덱스 : %d", i);
				flag = false; // 일치하는게 있다 
				break;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	
	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum =0;
		

		for(int i = 0; i< arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt();
			arr[i] = num2;
			sum += num2;
		}
		
		for(int i = 0; i< arr.length; i++) {
			int num2 = arr[i];
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n총합 : " + sum);
	}

	
	
	public void practice6() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i< arr.length; i++) {
			
			arr[i] = str.charAt(i);
			
			if(i > 7) {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
	}
	
	public void practice7() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		if(num >= 3) {
			if(num % 2 == 1) {
				for(int i = 0; i<arr.length ; i++) {
					if(i>3) {
						i--;
					}
				}
			}
		}
		
	}
			
	
	
	
	
	
	
}
