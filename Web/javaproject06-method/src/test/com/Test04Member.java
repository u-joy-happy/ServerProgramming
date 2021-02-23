package test.com;

public class Test04Member {
	
	int userNum;
	String userName;
	String userId;
	String userPw;
	String userPhone;
	
	public Test04Member() {
		System.out.println("Test04Member() --------");
		userNum = 1000;
		userName = "no name";
		userId = "no id";
		userPw = "no pw";
		userPhone = "no phone";
	}

	public Test04Member(int userNum, String userName, String userId, String userPw, String userPhone) {
		System.out.println("Test04Member(int userNum, String userName, String userId, String userPw, String userPhone) --------");
		this.userNum = userNum;
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		this.userPhone = userPhone;
	}

	public Test04Member(String userPhone) {
		this();
		System.out.println("Test04Member(String userPhone) --------");
		this.userPhone = userPhone;
	}
	
	
	
}
