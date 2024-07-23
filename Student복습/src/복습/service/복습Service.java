package 복습.service;

import java.util.Random;

import 복습.dto.복습DTO;
import 복습.dto.복습DTO;

public class 복습Service {

	private 복습DTO[] students = new 복습DTO[5];
	
	public 복습Service() {
		
		students[0]	= new 복습DTO( "24001", "신짱구", '남');
		students[1]	= new 복습DTO( "24002", "유리"  , '여');
		students[2]	= new 복습DTO( "24003", "맹구"  , '남');
		
		
		Random random = new Random();
		
		for(복습DTO std : students) { // 향상된 for문
			
			// 현재 접근한 요소가 참조하는 객체가 없다면
			// 반복을 종료
			if(std == null) break;
			
			std.setHtml(random.nextInt(101));
			std.setCss( random.nextInt(101));
			std.setJs(  random.nextInt(101));
			std.setJava(random.nextInt(101));
		
		}
	
	}
	
	
	public boolean addStudent(복습DTO std) {
		
	
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) { // i 번째 요소가 비어있는 경우
				students[i] = std;
				return true;
			}
		}
		
		return false;
	}
}
