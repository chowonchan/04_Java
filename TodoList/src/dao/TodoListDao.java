package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


import dto.Todo;



public interface TodoListDao {

	List<Todo> TodoListView();
	
	
	
	int addTodo(Todo todo) throws FileNotFoundException, IOException;
	
	void saveFile() throws FileNotFoundException, IOException;
}
