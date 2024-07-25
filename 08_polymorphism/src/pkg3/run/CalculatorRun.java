package pkg3.run;

import pkg3.dto.CWCCalculator;
import pkg3.dto.Calculator;

public class CalculatorRun {

	public static void main(String[] args) {
	
		// 인터페이스도 추상클래스 처럼
		// - 객체 생성 X
		// - 부모 타입 참조 변수로 사용  O
		//	-> 다형성 업캐스팅 + 동적 바인딩
		
		Calculator c = new CWCCalculator();
		
		System.out.println( c.plus(9000000, 3000000));
		System.out.println( c.minus(1, 30));
		System.out.println( c.multi(70, 30));
		System.out.println( c.div(7777, 3));
		System.out.println( c.mod(77, 3));
		System.out.println( c.pow(2, 16) );
		System.out.println( c.areaOfCircle(5.7) );
		System.out.println( c.toBinary(100) );
		System.out.println( c.toHexadecimal(100) );
		
		
	}
}
