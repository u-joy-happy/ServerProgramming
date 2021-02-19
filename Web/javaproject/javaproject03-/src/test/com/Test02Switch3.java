package test.com;

public class Test02Switch3 {

	public static void main(String[] args) {
//		분기분 switch case break
//		논리분기(boolean타입결과에 따른)가 아닌 맵핑분기
//		key type : int,char,String
		
//		##### 성적 처리 학점부여 프로그램 #####
//		필요 데이터 : 국영수 점수
//		결과 데이터 : 총점, 평균, 등급
		
		int kor = 96, math = 100, eng = 75;
		int total;
		double avg;
		String grade;
		
		total = kor + math + eng;
		avg = total/3.0;
		
		System.out.println("=========== 성적 ==========");
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
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
		
		System.out.println("========== 결과 ==========");
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("등급 : " + grade);
		
	}
	
}
