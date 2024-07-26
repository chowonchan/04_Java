package list.service;

import java.util.ArrayList;
import java.util.List;

import list.dto.CallDTO;

public class CallService {

	private List<CallDTO> callList = new ArrayList<CallDTO>();
	
	public CallService() {
		callList.add(new CallDTO("KH 지원", "종각",5678));
		callList.add(new CallDTO("집", "삼송", 12678));
		callList.add(new CallDTO("삼송역", "삼송", 1218));
		callList.add(new CallDTO("북한산", "연신내", 178));
		callList.add(new CallDTO("경복궁역", "경복궁", 12678));
	}

	
	public List<CallDTO> selectAll() {
		
		return callList;
	}
}
