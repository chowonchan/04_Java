package practice.dao;

import java.io.IOException;
import java.util.List;

import dto.Member;

public interface PracticeDao {
	
	List<Member> getMemberList();

	
	boolean addMember(Member member) throws IOException;
	
	void saveFile() throws IOException;
}
