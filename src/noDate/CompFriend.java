package noDate;


public class CompFriend extends Friend {

	private String company;
	
	public CompFriend()
	{
		
	}
	
	public CompFriend(String name, String phone, String MBTI, String company)
	{
		super(name, phone, MBTI);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void showInfo() //우선순위 가저감 오버라이딩
	{
		
		super.showInfo();
		
		System.out.println("회사 : " + company);
	
	}
	
	
}
