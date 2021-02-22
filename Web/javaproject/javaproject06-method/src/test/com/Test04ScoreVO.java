package test.com;

public class Test04ScoreVO {

	int num;
	int kor;
	int eng;
	int total;
	double avg;

	public Test04ScoreVO() {
//		System.out.println("Test04ScoreVO() ----------");
		this.num = 111;
		this.kor = 90;
		this.eng = 70;
		this.total = kor + eng;
		this.avg = total/2.0;
	}
	
	public Test04ScoreVO(int num, int kor, int eng) {
//		System.out.println("Test04ScoreVO(int num, int kor, int eng) ----------");
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.total = kor + eng;
		this.avg = total/2.0;
	}

//	public Test04ScoreVO(int num, int kor, int eng, int total, double avg) {
//		System.out.println("Test04ScoreVO(int num, int kor, int eng, int total, double avg) ----------");
//		this.num = num;
//		this.kor = kor;
//		this.eng = eng;
//		this.total = total;
//		this.avg = avg;
//	}
	
	
}
