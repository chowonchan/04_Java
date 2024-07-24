[상속]

다른 클래스가 가지고 있는 멤버(필드, 메서드)들을 새로 작성할 클래스에서 직접 만들지 않고
상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있는 기능

- [상속의 목적]

  클래스의 재사용, 연관된 일련의 클래스들에 대한 공통적인 규약 정의


- [상속 장점]
		1. 코드 길이 감소
		 	-> 부모 필드/메서드를 자식이 안써도 사용가능
		 
		2. 재사용성 증가
		 	-> super(), super 참조변수를 이용해
		 		자식이 부모 코드를 호출해서 자식 코드 길이 감소
		 
		3. 공통적인 코드 관리, 유지 보수성 증가
		 	-> 부모의 코드만 수정해도
		 		부모 코드를 활용하던 자식의 코드도 일괄 수정
    
    4. 자식에게 상속하는 기능의 이름을 강제할 수 있음
		   -> 오버라이딩 시 
		 	부모의 메서드명과 동일해야 한다!!

[오버라이딩 과 오버로딩 차이]

- 오버라이딩 : 메서드 이름 동일 매개변수 동일(개수, 타입, 순서) 리턴 타입 동일
- 오버로딩 : 메서드 이름 동일 매개변수 다름(개수, 타입, 순서) 리턴 타입 상관 없음


[다형성]

상속을 이용한 기술로 부모 클래스 타입 참조변수 하나로
상속 관계에 있는 여러 타입의 자식 객체를 참조할 수 있는 기술

한 객체가 2가지 모습을 가짐 

Parent 참조 변수 p2가 Child 객체를 참조하고 있지만
Child 내부에 구현된 Parent만을 참조할 수있기 때문에
Child 객체가 Parent 객체로 변한 것이 보인다!!

- [업 캐스팅 (Up Casting)]
  -부모타입의 참조형 변수가
  모든 자식 타입 객체의 주소를 참조할 수 있음

- [다운 캐스팅(Down Casting)]
  - 업 캐스팅 상태에서 (부모 = 자식 객체)
	  참조 변수의 자료형을
	  자식 객체 자료형으로 강제 형 변환 하는 것

    [instanceof]
    참조 하고 있는 객체가 클래스명 객체가 맞는지 확인
		 *  (true/false)로 반환

     ****** 주의 사항 ******
		 * - instanceof는 참조하고 있는 객체의
		 * 	 상속하고 있는 객체도 같이 확인하기 때문에
		 * 	 자식 객체를 참조하는 변수에
		 * 	 부모 타입을 검사하면 true가 나온다 !!
     * 
     * 	Parent p = new Child(); // 업 캐스팅
		 
		 	
		
		// 향상된 for문
		for(Object obj : arr) {
			/* tip. 자료형을 연달아 검사하는경우
			 * 마지막 자식 자료형 부터 검사하는게 좋다!
			 */
			
			// 얻어온 요소가 Child 타입이면
			if(obj instanceof Child) 
			p instanceof Child  ? true
		
		  p instanceof Parent ? true

      p instanceof Object ? true
			
			// 얻어온 요소가 Parent 타입이면
			if(obj instanceof Parent) 
      p instanceof Child  ? false
		
		  p instanceof Parent ? true

      p instanceof Object ? true
			
			// 얻어온 요소가 Object 타입이면
			if(obj instanceof Object)
			p instanceof Child  ? false
		
		  p instanceof Parent ? false

      p instanceof Object ? true
    }