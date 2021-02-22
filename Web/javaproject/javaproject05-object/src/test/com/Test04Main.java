package test.com;

public class Test04Main {

	public static void main(String[] args) {
		System.out.println("sign-up main");
		System.out.println();
		
//		##### 회원가입 객체 #####
//		-> 필요 데이터 : 회원번호, 회원명, 아이디, 비밀번호, 전화번호
		
		Test04Member member = new Test04Member();
//		member.userNum = 111;
//		member.userName = "kim";
//		member.userId = "kimss";
//		member.userPw = "kim1234";
//		member.userPhone = "010-1234-1234";
		System.out.println("values ---------");
		System.out.println("회원 번호 : " + member.userNum);
		System.out.println("회원 이름 : " + member.userName);
		System.out.println("회원 아이디 : " + member.userId);
		System.out.println("회원 비밀번호 : " + member.userPw);
		System.out.println("회원 전화번호 : " + member.userPhone);
		System.out.println("-------------------------");
		System.out.println();
		
		Test04Member member2 = new Test04Member(222, "lee", "lee22", "lee456", "010-5678-5678");
		System.out.println("values -----------");
		System.out.println("회원 번호 : " + member2.userNum);
		System.out.println("회원 이름 : " + member2.userName);
		System.out.println("회원 아이디 : " + member2.userId);
		System.out.println("회원 비밀번호 : " + member2.userPw);
		System.out.println("회원 전화번호 : " + member2.userPhone);
		System.out.println("------------------");
		System.out.println();
		
		member = new Test04Member("010-1234-1234");
		System.out.println("values -----------");
		System.out.println("회원 번호 : " + member.userNum);
		System.out.println("회원 이름 : " + member.userName);
		System.out.println("회원 아이디 : " + member.userId);
		System.out.println("회원 비밀번호 : " + member.userPw);
		System.out.println("회원 전화번호 : " + member.userPhone);
		System.out.println("------------------");
		System.out.println();
		
	}

}
