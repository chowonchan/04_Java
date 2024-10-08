package pkg2.service;

import pkg2.dto.Animal;
import pkg2.dto.Cat;
import pkg2.dto.Fish;

public class AbsService {

	/** 
	 * 추상 클래스 객체
	 * 
	 */
	public void test1() {
		
		// Animal은 객체화 할수 없다
		// abstract 추가된 추상 클래스 라서
//		Animal a = new Animal();
		
		Cat  c = new Cat();
		Fish f = new Fish();
		
		// dhqjfkdleldgks cntkd aptjem ghcnf
		
		c.move();
		c.eat();
		c.sleep();
		
		f.move();
		f.eat();
		f.sleep();
		
	}
	
	/**
	 * 추상 클래스 활용법
	 * 
	 * 선행 지식 : 다형성 업캐스팅 + 동적 바인딩
	 */
	public void test2() {
		
		// 추상 클래스는 객체 생성은 X
		// 대신 참조형 변수는 O
		Animal a1 = new Cat(2, 10);
		Animal a2 = new Fish(2, 2);
		
		// 추상 클래스를 이용한 객체 배열
		// -> 추상 클래스 참조 변수 묶음 -> 문제 없음!
		Animal[] animals = new Animal[4];
		
		animals[0] = new Cat();
		animals[1] = a1; // a1에 저장된 값 == Cat 객체 참조 주소
						 // Cat은 Animal 자식 클래스
		
		animals[2] = new Fish();
		animals[3] = a2; 
		
		// 향상된 for문
		for(Animal a : animals) {
			System.out.println(a); // a.toString() 출력
			
			a.sleep();
			a.move();
			a.eat();
			
			System.out.println("------------------------------");
		}
		
	}
	
	
	
	
	
	
	
	
	
}


