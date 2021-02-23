package test.com;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test03DateTime {

	public static void main(String[] args) {
		System.out.println("date time");
		System.out.println();

//		##### 날짜/시간 관련 객체 #####
//		-> java.util.Date() & java.sql.Date()
//		-> 같은 클래스에서 사용할 경우 (패키지)이름을 명시해주지 않으면 동일 이름 객체이기 때문에
//		-> 둘중 하나밖에 사용하지 못함
		System.out.println(new Date());
		System.out.println(new java.sql.Date(2021, 2, 23)); // 원하는 날짜 세팅 불가
		System.out.println(new java.sql.Date(System.currentTimeMillis()));

		System.out.println();
		
//		-> Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(
				cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.DAY_OF_MONTH));

		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.MILLISECOND));

		System.out.println();
		
		
//		-> GregorianCalendar
		System.out.println(new GregorianCalendar());
		System.out.println(new GregorianCalendar(2021, 2, 23, 15, 48, 15));

		System.out.println();
		
		GregorianCalendar gcal = new GregorianCalendar(2021, 2, 23, 15, 48, 15);
		System.out.println(
				gcal.get(Calendar.YEAR) + "/" + (gcal.get(Calendar.MONTH) + 1) + "/" + gcal.get(Calendar.DAY_OF_MONTH));

		System.out.println(gcal.get(Calendar.HOUR));
		System.out.println(gcal.get(Calendar.MINUTE));
		System.out.println(gcal.get(Calendar.SECOND));
		System.out.println(gcal.get(Calendar.MILLISECOND));

		System.out.println();
		
		
		
//		-> Timestamp
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		ts = new Timestamp(new Date().getTime());
		System.out.println(ts);
		System.out.println();
		
//		##### Singleton #####
//		-> 기본 객체
		Person p = new Person();
		System.out.println(p);
		p = new Person();
		System.out.println(p);

//		-> 싱글톤 객체
		Person sp = Person.getPerson();
		System.out.println(sp);
		sp = Person.getPerson();
		System.out.println(sp);

	}

}
