[String의 불변성( immutable ) ]
String은 기본적으로 값이 변하는 것이 불가능

- String 클래스에서 값을 저장하는 필드가 final
	 	-> 상수 == 변경 불가

    - System.identityHashCode(참조변수)
	 	 -> 객체의 주소 값을 이용해서 생성된 해시코드
	 	 -> 모든 객체가 다른 결과를 반환

    	 - 같은 객체에 저장된 값이 변했다면
	 	 주소값은 일정해야만 한다 !!
	 
	 - 참조하고 있던 객체가 변했다면
	 	 주소값은 변하게 된다



  [Constant Pool 확인]
	
	 - "" String 리터럴 표기법을 이용해 생성된 String 객체가
	 	 저장되는 Heap 내부 영역
	 
	 - 동일한 문자열을 생성하게 되는 경우
	 	 객체가 새롭게 생성되지 않고
	 	 기존 주소가 반환된다(재활용)



[String 관련 메서드]
  1) String[] 문자열.split("구분자")
	  - 문자열을 "구분자"를 기준으로 나누어
		 String[] 형태로 반환

  2) String String.join("구분자", 배열)
		- String 배열을 하나의 문자열로 변환
		- 각 요소 사이에 "구분자" 추가!!

  3) String 문자열.replace("대상 문자열", "바꿀 문자열")
	  - 문자열 변경


[프로그램 오류]
  비정상 종료 상황이 발생한 것

  -[예외 처리]
  상황(예측 가능한 에러) 구문을 처리 하는 방법

  1. 컴파일 에러 : 프로그램의 실행을 막는 소스 코드상의 문법 에러. 
                 소스 코드 수정으로 해결.

  2. 런타임 에러 : 프로그램 실행 중 발생하는 에러.
                 대부분 if문 사용으로 에러 처리 가능

  3. 시스템 에러 : 컴퓨터 오작동으로 인한 에러,
                  소스 코드 수정으로 해결 불가

  -[예외 확인]
  Java에서 에러/예외를 발생 시키는 방법

  ex) 중간에 잘못된 코드가 수행된 경우
      String str = null; str.split("/");
      -> JVM이 new NullPointException(); 구문을 수행
      (코드 수행중 예외 상황을 만나면 그 상황에 맞는 
      객체를 만들어 그 위치에 던짐)

      -> 만들어진 예외 객체를 던짐
      --> 예외처리 구문이 없으면 --> 프로그램 종료
      --> 예외처리 구문이 있으면 --> 처리후 정상 수행
      
    {Exception 확인}

      - Unchecked Exception 처리 하지 않아도 되는
      프로그래머의 부주의로 인한 오류 경우가 많아 코드 수정해야 하는 경우가 많다

        {ArrayIndexOutOfBoundsException} 
          - 배열의 index범위를 넘어서 참조하는 경우 던져지는 예외

        {NullPointerException} 
          - Null인 참조 변수로 객체 멤버 참조 시도 시 발생
          - 참조 변수가 null인지 확인

        {InputMismatchException}
          - 스캐너 입력시 next 자료형() 으로 읽어오는 값과
		  	    입력된 값의 자료형이 일치하지 않을때

        {RuntimeException}
         - catch에 매개 변수 타입을 부모 타입으로 설정!!
			     -> 던져지는 모든 자식 타입의 예외를 잡아서 처리
           (예외 처리에 다형성 (업 캐스팅 ) 적용)

      - Checked Exception   반드시 처리 해야하는

    {예외 처리 방법}

    try ~ catch문
     - {try}
        Exception 발생할 가능성이 있는 코드를 안에 기술

     - {catch} 
        try 구문에서 Exception 발생 시 해당하는 Exception에 대한 처리 기술
        여러 개의 Exception 처리가 가능하나 Exception간의 상속 관계 고려해야 함

    {throws} : 메서드 내부에서 던져진 예외를
	  			호출부로 다시 던지는예외 처리 구문
	  
	  {throw}  : 생성된 예외 객체를 던져 예외 발생
	 			(예외 강제 발생)

    - 메소드 선언 시 'throws Exception명'을 추가하여
      호출한 상위 메소드에게 처리 위임
      ( public void ooo() throws Exception )


