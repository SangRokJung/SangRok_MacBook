package SangRok_MacBook.src.noDate;

public class mainFriend {

	public static void main(String[] args) {
		
	
	
	Friend[] f = new Friend[9];
	
	f[0] = new CompFriend("김석기", "010-1111-1111", "ENFP", "삼성");
	f[1] = new CompFriend("이병헌", "010-2222-2222", "INFP", "현대");
	f[2] = new CompFriend("김석기", "010-3333-3333", "ISTJ", "기아");
	f[3] = new UnivFriend("이현주", "010-4444-4444", "ESFP", "컴퓨터 공학");
	f[4] = new UnivFriend("한우석", "010-5555-5555", "INTJ", "기계 공학");
	f[5] = new UnivFriend("정 현", "010-6666-6666", "INFP", "유전자 공학");
	f[6] = new HobbyFriend("김우석", "010-7777-7777", "ENFJ", "컴퓨터 공학");
	f[7] = new HobbyFriend("강정민", "010-8888-8888", "ENFJ", "기계 공학");
	f[8] = new HobbyFriend("최우식", "010-9999-9999", "ISFJ", "유전자 공학");
	
	for (int i = 0; i < f.length; i++)
	{
		f[i].showInfo();
		System.out.println("-------------------------");
	}
	
}
}

