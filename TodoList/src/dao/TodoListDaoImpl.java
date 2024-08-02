package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Todo;

public class TodoListDaoImpl implements TodoListDao{

	private final String FILE_PATH = "/io_test/LocalDateTime.dat";
	
	private List<Todo> todoList = null;
	
	private ObjectInputStream    ois = null;
	private ObjectOutputStream   oos = null;
	
	
	
	// 기본 생성자
	public TodoListDaoImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// 파일이 존재하는지 검사
		File file = new File(FILE_PATH);
		
		if( file.exists() ) { //  존재 하다면
			try {
				ois = new ObjectInputStream( new FileInputStream( FILE_PATH ));
				
				// 파일에서 읽어와 다운 캐스팅 해서 todoList가 참조
				todoList = ( ArrayList<Todo> ) ois.readObject();
				
				
			}finally {
				if(ois == null) ois.close();
			}
		}
		
		// 파일이 존재 하지 않을때
		else {
			// 새로운 ArrayList를 만들어서 참조
			todoList = new ArrayList<Todo>();
		}
		
	}
	
	
	
	
	
}
