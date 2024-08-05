package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import dto.Todo;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {

	private TodoListService service = null;
	private BufferedReader br = null;
	private LocalDateTime currentDateTime;
	private Todo[] todo;
	private char complete;
	
	public TodoListView() {
		
		try{
			service = new TodoListServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (Exception e) {
			System.out.println(" *** 프로그램 실행 중 오류 발생 ***");
			e.printStackTrace();
			System.exit(0); // 프로그램 종료
		}
	}
	
	
	
	// 메인 메뉴
	public void mainMenu() {
		int input = 0;
		do {
			try {
				// 메뉴 출력후 입력 받기
				input = viewMenu();
				
				switch(input) {
				case 1: selectTodo(); break;
				case 2: break;
				case 3: addTodo(); break;
				case 4: break;
				case 5: break;
				case 6: break;
				case 0: System.out.println("*** 프로그램 종료 ***"); break;
				default : System.out.println("\n### 메뉴의 번호만 입력 해주세요 ###\n");
				}
				
			}catch (NumberFormatException e) {
				System.out.println("\n### 숫자 입력 해주세요 ###\n");
				
			}catch (IOException e) {
				System.out.println("\n### 입출력 관련 예외 발생 ###\n");
				e.printStackTrace(); // 예외 추적
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		} while(input != 0);
		
		try {
			if (br != null) 	br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	// 메뉴 출력
	private int viewMenu() throws NullPointerException, 
								IndexOutOfBoundsException, 
								NumberFormatException, IOException {
		
		System.out.println("\n======= Todo List =======\n");
		
		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo Delete");
		System.out.println("0. EXIT");
		
		System.out.println("Select menu number >>> ");
		int input = Integer.parseInt(br.readLine());
		
		System.out.println();
		
		return input;
		
	}
	
	
	
	private void selectTodo() throws NullPointerException, IOException{
	System.out.println("\n===============[1. Todo List Full View]===============\n");
		
		
		// 할 일 목록, 완료 개수
		Map<String, Object> map = service.selectTodo();
		
		List<Todo> todoList = (List<Todo>)map.get("todoList");
		int completeCount = (int)map.get("completeCount");
		
		System.out.printf("[ 완료된 Todo 개수 / 전체 Todo 수 : %d / %d ]\n"
											, completeCount, todoList.size());

		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-3s %10s   %10s     %s\n", "인덱스", "등록일", "완료여부", "할 일 제목");
		System.out.println("--------------------------------------------------------------------");
		
		for(int i=0, len = todoList.size(); i < len; i++) {
			String title = todoList.get(i).getTitle();
			String completeYN = todoList.get(i).isComplete() ? "O" : "X";
			String regDate = service.dateFormat(todoList.get(i).getRegDate());
			System.out.printf("[%3d]  %20s    (%s)       %s\n", i, regDate, completeYN, title);
			
		}

		
		
	}
	
	
	
	
	
	
	private void addTodo() throws IOException {
		
		System.out.println("\n=============== 3. Todo Add ================\n");
		
		System.out.println("할일 제목 입력: ");
		String title = br.readLine();
		
		System.out.println("세부 내용 작성 (입력 종료 시 !wq 작성 후 엔터)");
		System.out.println("-----------------------------------------------");
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String content = br.readLine();
			
			if(content.equals("!wq"))  break;
			
			sb.append(content);
			sb.append("\n");
		}
		
		System.out.println("---------------------------------------------");
		int index = service.addTodo(title, sb.toString());
		
		if(index == -1) {
			System.out.println("### 추가 실패 ###");
			return;
		}
		
		System.out.printf("[%d] 인덱스에 추가 되었습니다 \n", index);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
