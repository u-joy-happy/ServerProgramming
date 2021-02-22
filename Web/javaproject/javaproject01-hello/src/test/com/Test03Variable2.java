package test.com;

public class Test03Variable2 {

	public static void main(String[] args) {
		System.out.println("variable2");

//		##### 변수 선언 문법 #####
//		데이터타입 변수명;
//		+) 변수는 명사형(Camel Case)을 권장 -> myName
//		   특수문자는 언더바 허용(PotHoll Case) -> my_name (비권장)

//		##### 무엇을 변수로 만들것인가? #####
//		-> 소프트웨어에는 여러 기능(동작)들이 존재
//		-> 기능들은 특징이 존재하고, 그 특징을 변수로 지정
//		-> 즉, 특정 대상의 속성을 표현하는 명사를 변수로 지정
//		-> 예를 들어 게시판 프로그램을 작성할 경우 : 제목, 내용, 작성자, 날짜 등 변수로 지정

//		##### 게시판 글쓰기 프로그램 #####
		System.out.println();
		System.out.println("===== 게시판 =====");
		System.out.println("제목을 입력하세요");
		String title = "즐거운 자바시간입니다.";
		System.out.println("내용을 입력하세요");
		String content = "즐겁지만 배도 고파요 ㅜㅡㅜ";
		System.out.println("작성자를 입력하세요");
		String writer = "kim";

		System.out.println("제목 : " + title);
		System.out.println("내용 : " + content);
		System.out.println("작성자 : " + writer);
		System.out.println("=================");

//		##### 사람의 정보를 다루는 프로그램 #####
//		필요 데이터 : 성, 이름, 나이, 전화번호 
		System.out.println();
		System.out.println("===== 사용자 정보 입력 =====");
		System.out.println("input your name");
		String name = "김효주";
		System.out.println("input your age");
		int age = 3;
		System.out.println("input your phone number");
		String phone = "010-5745-8717";

		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("핸드폰 번호 : " + phone);
		System.out.println("=========================");
		System.out.println();

//		##### 노트북의 정보를 다루는 프로그램 #####
//		필요 데이터 : 모델명, 가격, 무게 
		System.out.println();
		System.out.println("===== 노트북 정보 입력 =====");
		System.out.println("input model name");
		String modelName = "MacbookPro";
		System.out.println("input price");
		int price = 30000;
		System.out.println("input weight");
		double weight = 1.5;

		System.out.println();
		System.out.println("모델 명 : " + modelName);
		System.out.println("가격 : " + price + "원");
		System.out.println("무게 : " + weight + "kg");
		System.out.println("=========================");
		System.out.println();

//		##### 회원가입 프로그램 #####
//		필요 데이터 : 아이디, 비밀번호, 이름, 생년월일
		System.out.println();
		System.out.println("===== 회원 정보 입력 =====");
		System.out.println("input ID");
		String id = "kimhyoju";
		System.out.println("input password");
		String pw = "hyoju1234";
		System.out.println("input name");
		String userName = "김효주";
		System.out.println("input birthday");
		String birth = "1999-02-04";

		System.out.println();
		System.out.println("ID : " + id);
		System.out.println("PassWord : " + pw);
		System.out.println("이름 : " + userName);
		System.out.println("생년월일 : " + birth);
		System.out.println("========================");
		System.out.println();

	}// end main

}// end class
