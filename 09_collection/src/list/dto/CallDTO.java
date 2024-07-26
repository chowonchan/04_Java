package list.dto;

public class CallDTO {

	private String name;
	private String rocate;
	private int number;
	
	


	public CallDTO(String name, String rocate, int number) {
		super();
		this.name = name;
		this.rocate = rocate;
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRocate() {
		return rocate;
	}


	public void setRocate(String rocate) {
		this.rocate = rocate;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}





	@Override
	public String toString() {
		return "CallDTO [name=" + name + ", rocate=" + rocate + ", number=" + number + "]";
	}
	
	




	

	

	

	
	
	
}
