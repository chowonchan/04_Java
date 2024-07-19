package cls.pkg1;

public class ClassRun {

	public static void main(String[] args) {
		// pulic class인 ClassTest을
		// import하여 객체 생성 하기 -> 문제 O/X
		
		ClassTest1 t1 = new ClassTest1();
		t1.method();
		
		// (default) class + 같은 패키지
		// DefaultClass 객체 생성 -> 문제 X
		DefaultClass d1 = new DefaultClass();
		d1.method();
	}
}
