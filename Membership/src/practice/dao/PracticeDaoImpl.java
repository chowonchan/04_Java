package practice.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Member;

public class PracticeDaoImpl implements PracticeDao {
	
	private final String FILE_PATH = "/io_test/membership2.dat";
	
	private List<Member> memberList = null;
	
	
	private ObjectInputStream   ois = null;
	private ObjectOutputStream  oos = null;

	
	public PracticeDaoImpl() throws IOException, ClassNotFoundException {
		File file = new File(FILE_PATH);
		
		if( file.exists() ) {
			try {
				ois = new ObjectInputStream( new FileInputStream( FILE_PATH ));
				
				memberList = (ArrayList<Member> ) ois.readObject();
				
			} finally {
				if(ois != null) ois.close();
				// 여기서 발생하는 예외 도 throws 로 던져서 try 구문 X
			}
		}
		// 파일이 존재하지 않는 경우
		else {
			memberList = new ArrayList<Member>();
		}
	}
	
	
	public List<Member> getMemberList(){
		
		return memberList;
	}
	

	public boolean addMember(Member member) throws IOException {
		
		memberList.add(member);
		
		saveFile();
		
		return true;
	}


	public void saveFile() throws IOException{
		try {
			oos = new ObjectOutputStream( new FileOutputStream(FILE_PATH) );
			oos.writeObject(memberList);
			
		}finally {
			if(oos != null) oos.close();
		}
		
	}
	
	
	
	
	
	
	
	
}
