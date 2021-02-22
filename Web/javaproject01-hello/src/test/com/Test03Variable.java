package test.com;

public class Test03Variable {
	
	public static void main(String[] args) {
		System.out.println("variable");
		
//		##### 변수 선언 문법 #####
//		데이터타입 변수명;
//		+) 변수는 명사형(Camel Case)을 권고 -> myName
//		   특수문자는 언더바 허용(PotHoll Case) -> my_name (비권장)
		
		
//		##### String #####
		System.out.println("String");
//		##### 변수 선언 #####
		String msg;
//		##### 변수 초기화/값할당/값대입 #####
		msg = "abc";
		System.out.println(msg);
		msg = "안녕하세요";
		System.out.println(msg);
		
//		##### 변수 선언과 초기화 #####
		String msg2 = "효주링";
		System.out.println(msg2);
		msg2 = "kim";
		System.out.println(msg2);
		
//		##### 다중 변수 선언 #####
		String msg3, msg4, msg5;
		msg3 = "aaaa";
		msg4 = "bbbb";
		msg5 = "cccc";
		System.out.println(msg3+msg4+msg5);
		System.out.println();
		
		
//		##### char #####
		System.out.println("char");
		char c;
		c = 'A'; /* single quotation */
		System.out.println(c);
		c = '2'; /* single quotation */
		System.out.println(c);
		c = 65; /* 숫자 코드에 해당하는 문자가 입력됨 */
		System.out.println(c);
		
		char c2, c3, c4;
		c2 = 'A';
		c3 = 'B';
		c4 = 'C';
		System.out.println(c2 + c3 + c4); /* 문자에 해당하는 숫자코드를 더하여 출력(int) */
		System.out.println();
		
		
//		##### byte-short-int-long  float-double #####
		System.out.println("byte-short-int-long  float-double");
		byte b = 127; /* 1byte(8bit) */
		System.out.println(b);
		
		short s = 32767; /* 2byte(16bit) */
		System.out.println(s);
		
		int i = 2147483647; /* 4byte(32bit) */
		System.out.println(i);
		
		long lng = 9223372036854775807L; /* 8byte(64bit) */
		System.out.println(lng);
		
		float f = 3.14f;
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
		System.out.println();

		
//		##### 숫자 타입 정보 #####
		System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE); /* -128~127 */
		System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE); /* -32768~32767 */
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE); /* -2147483648~2147483647 */ 
		System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE); /* -9223372036854775808~9223372036854775807 */
		System.out.println(Float.MIN_VALUE + "~" + Float.MAX_VALUE); /* 1.4E-45~3.4028235E38 */ 
		System.out.println(Double.MIN_VALUE + "~" + Double.MAX_VALUE); /* 4.9E-324~1.7976931348623157E308 */
		System.out.println();
//		+) command+shift+x -> 대문자 변환
//		   command+shift+y -> 소문자 변환
//		+) 숫자 관련 객체 : Wrapper Class
//		   다양한 정보 또는 명령을 수행할 수 있다.(문자를 숫자로 변경, 최소값/최대값 확인)
		
		
//		##### boolean #####
		System.out.println("boolean");
		boolean bool = false;
		System.out.println(bool);
		bool = true;
		System.out.println(bool);
		System.out.println();
		
		
//		##### null #####
//		null을 할당하기 위해서는 메모리 주소가 있는 데이터 타입에서만 할당 가능
//		객체/배열 타입에만 할당 가능
//		new 키워드는 메모리에 주소를 할당하라는 의미
		String str = null;
		str = "kim"; /* Literal Type */
		str = new String("kim");
		String str2 = new String("kim");
		
		String[] strs = null;
		strs = new String[3];
		String[] strs2 = new String[3];
		
		int[] ints = null;
		ints = new int[50];
		int[] ints2 = new int[50];
		
	}// end main
	
}// end class
