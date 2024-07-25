package pkg2.dto;

public class Humon extends Any{

	private int hear;
	
	public Humon() {
		super();
	}

	public Humon(int body, int hear) {
		super(body);
		this.hear = hear;
	}
	

	public int getHear() {
		return hear;
	}

	public void setHear(int hear) {
		this.hear = hear;
	}
	
	@Override
	public String toString() {
		return "Humon: " + hear + " / " + getBody(); 
	}

	@Override
	public void move() {
		System.out.println("걸어다님");
		
	}

	@Override
	public void eat() {
		System.out.println("햄버거 먹음");
		
	}
	
	
}
