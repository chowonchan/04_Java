package practice.service;

import java.io.IOException;
import java.util.List;

import dto.Member;

public interface PracticeService {

	public abstract boolean addMember(String name, String phone) throws IOException;
	
	public abstract List<Member> getMemberList();
}
