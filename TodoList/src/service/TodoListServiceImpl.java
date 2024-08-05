package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import dao.TodoListDao;
import dao.TodoListDaoImpl;
import dto.Todo;

public class TodoListServiceImpl implements TodoListService{

	private TodoListDao dao = null;
	
	public TodoListServiceImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		 dao = new TodoListDaoImpl();
	}
	
	@Override
	public Map<String, Object>selectTodo() {
		
		return null;
	}

	@Override
	public int addTodo(String title, String detail) throws FileNotFoundException, IOException {
		
		Todo todo = new Todo(title, detail, false, LocalDateTime.now());
		
		return dao.addTodo(todo);
	}

	@Override
	public String dateFormat(LocalDateTime regDate) {
		
		return null;
	}
	
	
}
