package dto;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // 컴파일 시 getter 구문을 자동 추가
@Setter
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 전체 필드 매개 변수 생성자
@ToString // toString 오버 라이딩
@EqualsAndHashCode // equals(), HashCode() 오버라이딩

public class Member implements Serializable{
	
	// DTO(Data Transfer Object) : 데이터 전달용 객체
	// - 여러 데이터를 한 번에 담아서
	//   계층간 데이터를 전달하는 목적으로 사용하는 객체
	
	// (계층 : view, service, dao 등 다른 클래스)	
	
	

	// 등급을 나타내는 상수
	public static final int COMMON = 0;
	public static final int GOLD = 1;
	public static final int DIAMOND = 2;
	
	// 회원 정보를 저장할 필드
	private String name;
	private String phone;
	private int amount;
	private int grade;
	
	
	// Lombok 을 이용하면 오버라이딩을 대신 실행 해주게 된다
	// @EqualsAndHashCode ==
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		return amount == other.amount && grade == other.grade && Objects.equals(name, other.name)
//				&& Objects.equals(phone, other.phone);
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(amount, grade, name, phone);
//	}
	
	
	
	
	
	
}
