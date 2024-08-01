package practice.service;

import java.io.IOException;
import java.util.List;

import dto.Member;
import practice.dao.PracticeDao;
import practice.dao.PracticeDaoImpl;
import service.MemberService;

public class PracticeServiceImpl implements PracticeService{

	private PracticeDao dao = null;
	
	public PracticeServiceImpl() throws ClassNotFoundException, 
	  									IOException{
		dao = new PracticeDaoImpl();
		
	}
	
	@Override
	public boolean addMember(String name, String phone) throws IOException{
		
		List<Member> memberList = dao.getMemberList();
		
		for(Member member : memberList) {
			
			if(phone.equals(member.getPhone()))	{
				return false;
			}
		}
		
		Member member = new Member(name, phone, 0, Member.COMMON);
		
		boolean result = dao.addMember(member);
		
		return result;
	}
	
	@Override
	public List<Member> getMemberList(){
		return dao.getMemberList();
	}
	
	
}


