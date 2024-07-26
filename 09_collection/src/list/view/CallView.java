package list.view;

import java.util.List;
import java.util.Scanner;

import list.dto.CallDTO;
import list.service.CallService;

public class CallView {

	private Scanner sc = new Scanner(System.in);
	
	private CallService service = new CallService();
	
	
	
	public void mainBook() {
		int input = 0;
		
		do {
			System.out.println("\n********* 전화 번호 부 책 *********\n");
			
			System.out.println("1. 전체 조회 ");
			System.out.println("2. index로 조회");
			System.out.println("3. 주소(rocate)로 조회");
			System.out.println("4. 추가");
			System.out.println("5. 번호 수정");
			
			System.out.println("0. 종료");
			System.out.println();
			
			System.out.println("번호 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : selectAll(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			
			case 0 : System.out.println("@@@@@ 프로그램 종료 @@@@"); break;
			default : System.out.println("=-=-= 잘못 입력 =-=-=");
				
			}
		}while(input != 0);
		
	}
	
	private void selectAll() {
		
		System.out.println("\n**** 전체 조회 ****\n");
		List<CallDTO> callList = service.selectAll();
		
		for(CallDTO call : callList) {
			System.out.println(call);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
