package pkg2.dto;

// 상속 받은 move() 구현 해야한다
public class Cat extends Animal{
	
	// 필드
	private int beard; // 수염
	
	// 생성자
	public Cat() {
		super(); // 부모(Animal) 객체
	}
	

	public Cat(int eyes, int beard) {
		super(eyes);
		this.beard = beard;
	}
	
	public int getBeard() {
		return beard;
	}
	
	
	public void setBeard(int beard) {
		this.beard = beard;
	}
	
	@Override
	public String toString() {
		return "Cat : " + beard +" / " + getEyes();
	}
	

	/* Animal로 부터 상속 받은
	 * abstract 메서드를 구현 (오버라이딩) 하라고
	 * 오류 발생함
	 * 	-> 오버라이딩 강제화
	 */

	@Override
	public void move() {
		System.out.println("고양이 : 사뿐 사뿐 움직임");
	}
	@Override
	public void eat() {
		System.out.println("고양이 : 엎드려잠");
	}
	@Override
	public void sleep() {
		System.out.println("고양이 : 냠냠 먹음");
	}
	
}
