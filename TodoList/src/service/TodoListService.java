package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import dto.Todo;



public interface TodoListService {

	public abstract int addTodo(String title, String detail) throws FileNotFoundException, IOException;
	

	
	public abstract String dateFormat(LocalDateTime regDate);



	public abstract Map<String, Object> selectTodo();


}
