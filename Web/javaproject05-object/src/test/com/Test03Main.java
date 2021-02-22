package test.com;

public class Test03Main {

	public static void main(String[] args) {
		System.out.println("student main");
//		##### 학생의 정보를 담는 객체 #####
//		-> 필요 데이터 : 번호, 이름, 국영수 점수, 총점, 평균, 등급
		
		Test03Student student = new Test03Student();
		System.out.println("values(default) ------------");
		System.out.println(student.num);
		System.out.println(student.name);
		System.out.println(student.kor);
		System.out.println(student.eng);
		System.out.println(student.math);
		System.out.println(student.total);
		System.out.println(student.avg);
		System.out.println(student.grade);
		System.out.println();
		
		
		Test03Student student2 = new Test03Student();
		System.out.println("values(속성에 접근하여 값 지정) ------------");
		student2.num = 1234;
		student2.name = "lee";
		student2.kor = 78;
		student2.eng = 33;
		student2.math = 68;
		student2.total = student2.kor + student2.eng + student2.math;
		student2.avg = student2.total/3.0;
		switch((int)student2.avg/10) {
			case 10:
			case 9:
				student2.grade = "A";
				break;
			case 8:
				student2.grade = "B";
				break;
			case 7:
				student2.grade = "C";
				break;
			default :
				student2.grade = "F";
				break;
		}
		System.out.println(student2.num);
		System.out.println(student2.name);
		System.out.println(student2.kor);
		System.out.println(student2.eng);
		System.out.println(student2.math);
		System.out.println(student2.total);
		System.out.println(student2.avg);
		System.out.println(student2.grade);
		System.out.println();
		
		
		int num = 218230031;
		String name = "kim";
		int kor = 90;
		int eng = 80;
		int math = 77;
		int total = kor + eng + math;
		double avg = total/3.0;
		String grade = avg >= 90 ? "A" : avg >= 80 ? "B" : avg >= 70 ? "C" : "F";
		
		
		Test03Student student3 = new Test03Student(num, name, kor, eng, math, total, avg, grade);
		System.out.println("values(생성자를 통한 값 지정) ------------");
		System.out.println(student3.num);
		System.out.println(student3.name);
		System.out.println(student3.kor);
		System.out.println(student3.eng);
		System.out.println(student3.math);
		System.out.println(student3.total);
		System.out.println(student3.avg);
		System.out.println(student3.grade);
		System.out.println();
		
		
		Test03Main m = new Test03Main();
		
	}
	
}
