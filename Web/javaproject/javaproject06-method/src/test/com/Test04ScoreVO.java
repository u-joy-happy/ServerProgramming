package test.com;

public class Test04ScoreVO {

	private int num;
//	String name;
	private int kor;
	private int eng;
//	int math;
	private int total;
	private double avg;

	public Test04ScoreVO() {
//		System.out.println("Test04ScoreVO() ----------");
		this.num = 111;
//		this.name = "kimhyoju";
		this.kor = 90;
		this.eng = 70;
		this.total = kor + eng;
		this.avg = total / 2.0;
	}

	public Test04ScoreVO(/* int num, */ /* String name, */ int kor, int eng, int total, double avg) {
//		System.out.println("Test04ScoreVO(int num, int kor, int eng) ----------");
//		this.num = num;
//		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = total;
		this.avg = avg;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + num;
		result = prime * result + total;
		return result;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test04ScoreVO other = (Test04ScoreVO) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (num != other.num)
			return false;
		if (total != other.total)
			return false;
		return true;

	}

	@Override
	public String toString() {
		return "Test04ScoreVO [num=" + num + ", kor=" + kor + ", eng=" + eng + ", total=" + total + ", avg=" + avg
				+ "]";
	}

}
