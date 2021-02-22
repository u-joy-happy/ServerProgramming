package test.com;

public class Test03For4 {
	public static void main(String[] args) {
		
//		##### 반복문 #####
		System.out.println("loof");
		System.out.println();
		
		
//		##### for #####
		
		
//		##### 3명의 학생의 성적을 처리하는 프로그램 #####
//		-> Test02Switch3.java 참고
//		-> 필요 데이터 : 번호, 학생명
		
		int[] kor = {69, 53, 100};
		int[] math = {44, 85, 97};
		int[] eng = {97, 33, 98};
		int[] num = {202103, 202108, 202101};
		int total;
		double avg;
		String grade;
		String[] name = {"정은지", "뚱땡이", "김효주"};
		
		
		for(int i = 0; i < 3; i++) {
			total = kor[i] + math[i] + eng[i];
			avg = total/3.0;
			
			System.out.println("=========== 성적 ==========");
			System.out.println("학번 : " + num[i]);
			System.out.println("이름 : " + name[i]);
			System.out.println();
			System.out.println("국어 : " + kor[i] + "점");
			System.out.println("영어 : " + eng[i] + "점");
			System.out.println("수학 : " + math[i] + "점");
			System.out.println();
			
			switch((int)avg/10) {
				case 10 :
				case 9 :
					grade = "A";
					break;
				case 8 :
					grade = "B";
					break;
				case 7 :
					grade = "C";
					break;
				case 6 :
					grade = "D";
					break;
				default :
					grade = "F";
					break;
			}
			
			System.out.println("총점 : " + total + "점");
			System.out.println("평균 : " + avg + "점");
			System.out.println("등급 : " + grade);
			System.out.println();
		}
		
	}
}






