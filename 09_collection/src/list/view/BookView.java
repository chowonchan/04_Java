package list.view;

import java.util.List;
import java.util.Scanner;

import list.dto.BookDTO;
import list.service.BookService;

// view : 사용자에게 보여지는 부분(출력, 입력)
public class BookView {
	
	private static final int Price = 0;

	private Scanner sc = new Scanner(System.in);
	
	private BookService service = new BookService();

	
	/**
	 * 사용자에게 보여질 메인 화면
	 */
	public void mainMenu() {
		int input = 0;
		
		do {
			System.out.println("\n***** 도서 관리 프로그램 *****\n");
			
			System.out.println("1. 전체 조회");
			System.out.println("2. index로 조회");
			System.out.println("3. 책 이름으로 조회(포함)");
			System.out.println("4. 글쓴이 이름으로 조회");
			System.out.println("5. 가격으로 조회");
			
			System.out.println("6. 책 추가하기");
			System.out.println("7. 책 제거하기");
			System.out.println("8. 책 가격 수정하기");
			
			System.out.println("0. 종료");
			
			System.out.println();
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 엔터 제거
			
			System.out.println();
			
			switch(input){
				case 1: selectAll(); break;
				case 2: selectIndex(); break;
				case 3: selectTitle(); break;
				case 4: selectWriter(); break;
				case 5: selectPrice(); break;
				case 6: addBook(); break;
				case 7: removeBook(); break;
				case 8: updateBook(); break;
				
				case 0: System.out.println("***** 프로그램 종료 *****");
				default : System.out.println("=-=-= 잘못 입력 =-=-=");
			}
			
		}while(input !=0);
	} // mainMenu() end
	
	
	/**
	 * 전체 조회
	 * - BookService에 있는 bookList를 얻어와
	 * 	 존재하는 모든 요소의 정보를 출력
	 */
	private void selectAll() {
		System.out.println("\n@@@@ 전체 조회 @@@@\n");
		
		List<BookDTO> bookList = service.selectAll();
		
		// 인덱스 번호 를 활용하기 위해 일반 for문 활용
		
		for(int i = 0; i < bookList.size(); i++) {
			// print() 관련 구문에서 참조 변수명을 작성하면
			// 자동으로 toString()이 호출된다!
			System.out.println( i + ") " + bookList.get(i) ); // == book.toString()
			
		}
	}
	
	
	/**
	 * 입력 받은 index 번째 BookDTO를 반환 받아와 출력
	 */
	private void selectIndex() {
		
		System.out.println("\n@@@@ 인덱스 조회 @@@@\n");
		System.out.print("조회할 책의 index번호 입력 : ");
		int index = sc.nextInt();
		
		// 전달한 index번째 요소가 존재하면 BookDTO 객체 주소
		// 없다면 null (참조하는 객체가 없음) 반환

		BookDTO book = service.selectIndex(index);
		
		if(book == null) {
			System.out.println("=-=-=해당 인덱스에 책이 존재 X =-=-=");
			return;
		}
		
		System.out.println( "제목 : " + book.getTitle() );
		System.out.println( "저자 : " + book.getWriter() );
		System.out.println( "가격 : " + book.getPrice() );
		
	}
	
	
	/**
	 * 입력 받은 책 제목이 포함된 모든 책 출력하기
	 * 단, 없으면 "조회 결과가 없습니다" 출력
	 */
	private void selectTitle() {
		
		System.out.println("\n@@@@ 책 이름으로 조회 @@@@\n");
		System.out.println("검색 할 책 제목 입력 : ");
		String title = sc.nextLine();
		
		List<BookDTO> searchList =  service.selectTitle(title);
		
		// 만약 검색 결과가 없을경우
//		if(searchList.size() == 0) {
		if(searchList.isEmpty()) {
			System.out.println("=-=-= 조회 결과가 없습니다 =-=-=");
			return;
		}
		
		for(BookDTO book : searchList) {
			System.out.println(book);
		}
	}
	
	
	/**
	 * 입력된 글쓴이 이름이 같은 책을 모두 조회 하여 출력하기
	 * 단, 없으면 " 조회 결과가 없습니다" 출력
	 */
	private void selectWriter() {
		
		System.out.println("\n@@@@ 글쓴이 이름으로 조회 @@@@\n");
		System.out.println("조회할 글쓴이 입력 : ");
		String writer = sc.nextLine();
		
		List<BookDTO> searchList = service.selectWriter(writer);
		
		if(searchList.isEmpty()) {
			System.out.println("=-=-= 조회 결과가 없습니다 =-=-=");
			return;
		}
		
		for(BookDTO book : searchList) {
			System.out.println(book);
		}
	}
	
	/**
	 * 검색할 가격의 범위(최솟값, 최대값)을 입력 받아
	 * 가격 범위 내의 모든 책을 조회하여 출력
	 * 단, 없으면 " 조회 결과가 없습니다" 출력
	 */
	private void selectPrice() {
		
		System.out.println("\n@@@@ 가격으로 조회 @@@@\n");
		System.out.println("최소값 입력 : ");
		int min= sc.nextInt();
		
		System.out.println("최대값 입력 : ");
		int max = sc.nextInt();
		
		
		List<BookDTO> searchList = service.selectPrice(min, max);
		
		if(searchList.isEmpty()) {
			System.out.println("=-=-= 조회 결과가 없습니다 =-=-=");
			return;
		}
		
		for(BookDTO book : searchList) {
			System.out.println(book);
		}
		
	}
	
	/**
	 * 제목, 글쓴이 , 가격을 입력받ㅇ
	 * BookService의 bookList에 추가 하기
	 */
	private void addBook() {
		
		System.out.println("\n @@@@@ 책 추가 하기 @@@@\n");
		
		System.out.println("제목 : ");
		String title = sc.nextLine();
		
		System.out.println("글쓴이 : ");
		String writer = sc.nextLine();
		
		System.out.println("가격 : ");
		int price = sc.nextInt();
		
		// 입력 받은 정보를 묶어서 Service로 전달할 수 있도록
		// BookDTO 객체를 생성
		
		BookDTO newBook = new BookDTO(title, writer, price);
		
		boolean result = service.addBook(newBook);

		// service.addBook(new BookDTO(title,writer, price)	);
		
		if(result) {
			System.out.println("**** 추가완료 ****");
		} else {
			System.out.println("***** 추가 중 문제 발생 *****");
			}	
	}
	
	/** 7
	 * 인덱스 번호를 입력 받아 
	 * 
	 * 1) 일치하는 인덱스가 있으면 bookList에서 제거 후
	 * "[책제목]" 책이 목록에서 제거 되었습니다.
	 * 
	 * 2) 일치하는 인덱스가 없으면
	 * "해당 인덱스에 존재하는 책이 없습니다" 출력
	 * 
	 * 
	 */
	private void removeBook() {
		
		System.out.println("\n@@@@ 책 제거하기 @@@@\n");
		System.out.print("제거할 책의 인덱스 입력 : ");
		int index = sc.nextInt();
		
		String result = service.removeBook(index);
		
		if(result == null) {
			System.out.println("해당 인덱스에 존재하는 책이 없습니다");
		}else {
			System.out.printf("[%s] 책이 목록에서 제거 되었습니다. ",
					result );
		}	
	}
	
	/** 8
	 * index 번호를 입력 받아
	 * 해당 index에 책이 존재하지 않으면
	 * -> "해당 인덱스에 책이 존재하지 않습니다." 출력후 메서드 종료
	 * 
	 * 해당 index에 책이 존재하면
	 * -> 수정할 가격을 입력 후 수정
	 * -> "[책 제목] 가격이 (이전 가격) -> ( 새 가격) 수정되었습니다."
	 */
	private void updateBook() {
		System.out.println(" \n@@@@ 책 가격 수정 하기 @@@@\n");
		
		System.out.println("추가할 인덱스 : ");
		int index = sc.nextInt();
		
		
		BookDTO book = service.selectIndex(index);
		
		if(book == null) {
			System.out.println("해당 인덱스에 책이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("수정할 책의 가격 입력 : ");
		int price = sc.nextInt();
		
		int before =  book.getPrice();
		
		book.setPrice(price);
		
		
		System.out.printf("[%s] 가격이 (%d) -> (%d)로 수정 되었습니다",
				book.getTitle(), before, price);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
