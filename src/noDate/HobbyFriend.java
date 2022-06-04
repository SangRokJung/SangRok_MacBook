package noDate;
public class HobbyFriend extends Friend {

	String hobby;
	
	public HobbyFriend()
	{
		
	}
	
	public HobbyFriend(String name, String phone, String MBTI, String hobby)
	{
		super(name, phone, MBTI);
		
		this.hobby = hobby;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void showInfo()
	{
		super.showInfo();
		
		System.out.println("hobby : " + hobby);
	}
}
