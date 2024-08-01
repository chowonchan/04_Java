package practice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Member {
	
	// 등급을 나타내는 상수
		public static final int COMMON = 0;
		public static final int GOLD = 1;
		public static final int DIAMOND = 2;
		
		// 회원 정보를 저장할 필드
		private String name;
		private String phone;
		private int amount;
		private int grade;

}
