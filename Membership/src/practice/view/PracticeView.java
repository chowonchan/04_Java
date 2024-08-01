package practice.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import practice.service.PracticeService;
import practice.service.PracticeServiceImpl;

public class PracticeView {
	
	
	private PracticeService service = null;
	private BufferedReader br = null;
	
	public PracticeView() {
		try {
			service = new PracticeServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}catch (Exception e) {
			System.out.println("\n*** 프로그램 실행중 오류 발생 ***\n");
			
			e.printStackTrace();
			System.exit(0);
	
		}
	}
	
	public void mainMenu() {
		int input = 0;
		
		do {
			try {
				// 메뉴 출력 후 입력된 번호를 반환 받기
				input = selectMenu();
				
				// 선택된 메뉴 번호에 따라 case 선택
				switch(input) {
				case 1: addMember(); break;
				case 2:  break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 6: break;
				case 0: System.out.println("*** 프로그램 종료 ***"); break;
				default : System.out.println("### 메뉴에 작성된 번호만 입력해주세요 ###");
				}
				
				System.out.println("--------------------------------------------");
				
			}catch (NumberFormatException e) {
				System.out.println("\n ### 숫자만 입력해 주세요 ###\n");
				
				input = -1; // 첫 반복에서 종료되지 않게 값 변경
				
			}catch (IOException e) {
				System.out.println("\n### 입출력 관련 예외 발생 ###\n");
				e.printStackTrace(); // 예외 추적
				
			}catch(Exception e) { // 나머지 예외 처리
				e.printStackTrace();
			}
			
		}while ( input !=0 );
		
	}
	
	
	private int selectMenu() throws NumberFormatException, IOException {
		System.out.println("\n==== 회원 관리 프로그램 ====\n");
		
		System.out.println("1. 회원가입(추가)");
		System.out.println("2. 회원 전체 조회"); 
		System.out.println("3. 이름 검색(동명이인 있으면 모두 조회)");
		System.out.println("4. 특정 회원 사용금액 누적하기");
		System.out.println("5. 회원 정보 수정");
		System.out.println("5. 회원 정보 수정");
		System.out.println("6. 회원 탈퇴");
		System.out.println("0. 종료");
		
		System.out.print("메뉴 선택 : ");
		
		// 입력 받은 문자열을 int 형태로 변환
		int input = Integer.parseInt( br.readLine() );
		System.out.println();
		
		return input; // private int 로 바꿔야 함
		
	}
	
	private void addMember() throws IOException{
		System.out.println("\n---- 회원 가입(추가) ---- \n");
		
		System.out.print("이름 : ");
		String name = br.readLine();
		
		String phone = null;
		
		while(true) {
			System.out.print("휴대폰 번호(-제외) : ");
			phone = br.readLine();
			
			if(phone.length() != 11) {
				System.out.println("**** 다시 입력 해주세요 ****\n");
				continue;
			}
			break;
		}
		
		boolean result = service.addMember(name, phone);
		
		if(result) {
			System.out.println("\n*** 회원이 추가되었습니다 ***\n");
		} else {
			System.out.println("\n ### 중복되는 번호가 존재합니다 ###\n");
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
