package noDate;

public class UnivFriend extends Friend {

	//이름, 전공, 전화번호, showInfo()
	
	private String major;
	
	
	public UnivFriend()
	{
				
	}
	
	public UnivFriend(String name, String phone, String MBTI, String major)
	{
		super(name, phone, MBTI);	
		this.major = major;

	}
	

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	

	public void showInfo()
	{
		
		super.showInfo();
		
		System.out.println("전공 : " + major);	
	}

	
	
}
