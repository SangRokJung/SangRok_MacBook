package noDate;

public class Friend {

	protected String name;
	protected String phone;
	protected String MBTI;
	
	public Friend()
	{
		
	}
	
	public Friend(String name, String phone, String MBTI)
	{
		this.name = name;
		this.phone = phone;
		this.MBTI = MBTI;
	}
	
	public void showInfo() //자식 info 도 따라온다.
	{
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("MBTI : " + MBTI);
	}

	public String getMBTI() {
		return MBTI;
	}

	public void setMBTI(String mBTI) {
		MBTI = mBTI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
