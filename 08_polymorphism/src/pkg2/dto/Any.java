package pkg2.dto;

public abstract class Any {

	private int body;
	
	// 기본 생성자
	public Any() {}
	
	// 매개 변수 생성자
	public Any(int body) {
		super();
		this.body = body;
	}

	
	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return body+ "";
	}
	
	public abstract void move();
	public abstract void eat();
	
	
}
