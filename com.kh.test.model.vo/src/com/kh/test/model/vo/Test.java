package com.kh.test.model.vo;

import java.util.ArrayList;
import com.kh.test.model.vo.Student;

public class Test {

	public static void main(String[] args) {
		// Cannot invoke "java.util.ArrayList.add(Object)" because "list" is null at com.kh.test.model.vo.Test.main
		// list 가 null 때문에 호출 할수 없다는 오류 발생
		// new ArrayList<Student>() 를 작성하여 호출을 할수 있게 한다
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("강건강", 84));
		list.add(new Student("남나눔", 78));
		list.add(new Student("도대담", 96));
		list.add(new Student("류라라", 67));
		
		for(int i = 0; i <list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s);
			
		}
	}
}
