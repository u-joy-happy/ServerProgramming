package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03For4Ex {
	public static void main(String[] args) throws IOException {

//		##### 반복문 #####
		System.out.println("loof");
		System.out.println();

//		##### for #####

//		##### 3명의 학생의 성적을 처리하는 프로그램 #####
//		-> Test02Switch3.java 참고
//		-> 필요 데이터 : 번호, 학생명

		int kor, math, eng, total;

		double avg;
		String grade;
		String name, studentInfo = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번 학생의 이름을 입력하세요");
			name = br.readLine();
			System.out.println("국어 점수를 입력하세요.");
			kor = 90 - (i * 8);
			System.out.println("수학 점수를 입력하세요.");
			math = 98 - (i * 5);
			System.out.println("영어 점수를 입력하세요.");
			eng = 85 - (i * 6);

			total = kor + math + eng;
			avg = total / 3.0;

			switch ((int) avg / 10) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
			}

			studentInfo += "학번 : " + 2021 + i + "\t이름 : " + name + "\n";
			studentInfo += "국어 : " + kor + "점\t영어 : " + eng + "점\t수학 : " + math + "점\n";
			studentInfo += "총점 : " + total + "점\t평균 : " + avg + "점\t등급 : " + grade + "\n";
		}
		System.out.println(studentInfo);

	}
}
