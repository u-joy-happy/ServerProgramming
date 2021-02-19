package test.com;

public class Test03Student {
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	String grade;
//	-> 기본 생성자
	public Test03Student() {
	
	}
	
//	-> 인자 있는 생성자
	
	public Test03Student(int num, String name, int kor, int eng, int math, int total, double avg, String grade) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.grade = grade;
	}
	
}
