[컬렉션] - 모음

메모리상에서 자료를 구조적으로 처리하는 방법을 자료구조라 일컫는데
컬렉션(Collection)은 자바에서 제공하는 자료구조를 담당하는 프레임워크

'추가, 삭제, 정렬' 등의 기능처리가 간단하게 해결 되어 
자료구조적 알고리즘을 구현할 필요 없음



  -[List]  add();
    인덱스 존재 / 자료들을 순차적으로 나열한 자료구조(배열 비슷)
    부모 인터페이스 -> 객체 생성 불가 / 부모 참조 변수 가능

    -{ArrayList}
     List 인터페이스를 상속 받은 자식 클래스

    // 1. boolean add(E e)
		// - List에 주어진 객체(e)를 맨끝에 추가
    // 2. void add(int index, E e)
		// - index 번째에 e를 추가 -> 중간에 삽입한다
    // 3. int size()
		// - 저장된 Data(객체)의 수를 반환
    // 4. E get(int index)
		// - index번째 요소를 반환

    list.add("아무거나"); // String 타입
		list.add(new Object()); // Object 타입
    list.add(new int[4]); // int[] 타입
    list.add(123); // int 타입

  -[Set] (집합)   add();
    인덱스 X , 중복 X


  --- list 와 set 은 컬렉션에 묶음 add(); 를 사용

  -[Map] JS 객체 - {K:V, K:V, K:V} put(); 을 사용



[제네릭스(Generics)]

  제네릭(Generics, <> )
		 1) 컬렉션의 타입을 제한하여
		 	  한 가지 자료형만 저장할 수 있게하는 기능
		 
		 2) 클래스나 메서드가 다룰 타입을 지정하는 기능

// -------String으로 타입이 제한된 List 생성-------
		List<String> menuList = new ArrayList<String>();

    // 5. E set(int index, E e)
		// - 지정된 index번째 요소를
		//   e(두 번째 매개 변수)로 변경 후
		//   -> 메서드 반환 값으로 이전 객체가 반환된다
    String before = menuList.set(2, "소갈비");

    // 6. boolean contains(E e)
		// - List에 내부에 e와 같은 객체가 
		//   존재하면 true, 없으면 false 반환  (확인 기능)
		System.out.println("보쌈 : " + menuList.contains("막국수") ); false

    // 7. int indexOf(E e)
		//  - List에 내부에 e와 같은 객체가 
		//   존재하면 해당 index 반환
		//   존재하지 않으면 -1 반환
		System.out.println("삼겹살 : " + menuList.indexOf("삼겹살")); 4 / 없다면 -1

    // 8. E remove(int index)
		// - List에서 지정된 index 번째 요소를 제거
		//   뒤에 있는 index 요소를 앞으로 이동
		// - 제거된 요소는 메서드 결과로 반환됨
		
		System.out.println(menuList.remove(1) + " 제거");
