package pkg2.dto;

public class HumonService {

	public void test1() {
		
		Humon a = new Humon(2,1);
		
		Any[] a1 = new Any[2];
		
		a1[0] = new Humon();
		a1[1] = a;
		
		
		for(Any a2 : a1) {
			System.out.println(a2);
			a2.move();
			a2.eat();
		}
	}
}
