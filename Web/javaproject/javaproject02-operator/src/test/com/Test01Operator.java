package test.com;

public class Test01Operator {
	
	public static void main(String[] args) {
		System.out.println("operator");
		
//		##### 산술 연산 #####
		System.out.println("========= 산술 연산 =========");
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3); /* 정수일때는 몫만 나옴 */
		System.out.println(10 / 3.0); /* 실수일때는 소수점 나옴 */
		System.out.println(10 % 3);
		System.out.println();
		
//		##### 대입,할당 연산 #####
		System.out.println("========= 대입 할당 연산 =========");
		int x = 10;
		x = x + 11; /* 할당 연산보다 산술 연산의 우선순위가 높음 */
		System.out.println(x);
		System.out.println();
		
//		##### 복합 할당 연산 #####
		System.out.println("========= 복합 할당 연산 =========");
		x += 11;
		System.out.println(x); //32
		x -= 11;
		System.out.println(x); //21
		x *= 11;
		System.out.println(x); //231
		x /= 11;
		System.out.println(x); //21
		x %= 11;
		System.out.println(x); //10
		System.out.println();
		
//		##### 비교 연산 #####
		System.out.println("========= 비교 연산 =========");
//		-> ==, !=, >=, <=, >, <
//		-> 결과는 true/false
		System.out.println(5==5);
		System.out.println(5!=5);
		System.out.println(5>=5);
		System.out.println(5<=5);
		System.out.println(5>5);
		System.out.println(5<5);
		System.out.println();
		
		System.out.println("========= String 비교 연산 =========");
//		-> String일 때는 equals()
		String name = "kim";
		System.out.println(name == "kim"); //literal 일 경우에만 T
		System.out.println(name.equals("kim"));
		System.out.println(!name.equals("kim"));
		
		System.out.println(name.equals("Kim"));
		System.out.println(name.equalsIgnoreCase("Kim"));
		
		System.out.println(name.compareTo("kim")); //0이면 같은 단어(대소문자 구분)
		System.out.println(name.compareTo("kim") == 0);
		System.out.println();
		
//		##### 참조 연산 #####
//		-> . 좌측 객체 안에 우측속성이 존재
//		-> , 연결 
//		-> new 메모리 주소를 생성 
//		-> ! NOT연산 
//		-> ++, --
		
		System.out.println("========= 참조 연산 =========");
		int i = 10;
		System.out.println(i);
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		System.out.println();
		
		System.out.println("========= 연산 우선순위 =========");
		int a = 10;
		System.out.println(a);		
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		
//		##### 비트 연산 #####
		System.out.println("========= 비트 연산 =========");
//		-> 정수를 비트단위로 변환하여 연산
//		-> &(AND),|(OR),^(XOR),~(2의보수:NOT+1)
//		-> 8 = 1000
//		-> 3 = 0011
//		
		System.out.println("8 & 3 = " + (8 & 3));
		System.out.println("8 | 3 = " + (8 | 3));
		System.out.println("8 ^ 3 = " + (8 ^ 3));
		System.out.println("~3 = " + (~3));
		System.out.println();
		
//		##### 논리 연산 #####
		System.out.println("========= 논리 연산 =========");
		System.out.println(true & true);
		System.out.println(false & true);

		System.out.println(true | true);
		System.out.println(false | false);
		
		System.out.println(true && true);
		System.out.println(false && true);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println();
		
		System.out.println("========= 논리 연산(DeadCode) =========");
//		-> 직접 값이 명시되어 있지 않은 경우에는 Dead Code가 발생하지 않음
		int j = 11;
		System.out.println(j < 2 && j < 33);
		System.out.println(j < 2 || j < 33);
		System.out.println();
		
//		##### 쉬프트 연산 #####
		System.out.println("========= 쉬프트 연산 =========");
//		-> 0000 0001 << 1 = 2
//		-> << : 2배 
		System.out.println(1 << 1);
		System.out.println(2 << 1);
		
//		-> 0001 0000 >> 1 = 8
//		-> >> : 1/2배
		System.out.println(16 >> 1);
		System.out.println(8 >> 1);
		
//		-> 1000 0000 >>> 1 : 
		System.out.println(0b1000000 >>> 1);		
//		System.out.println(-128 >>> 1);		
		System.out.println();
		
		
//		##### 삼항 연산 #####
		System.out.println("========= 삼항 연산 =========");
//		-> 문법 : (비교 T or F) ? (return T값) : (return F값)
		System.out.println(true ? "kim" : "lee");
		System.out.println(false ? "kim" : "lee");
		String res1 = true ? "kim" : "lee";
		
		String txt = "kims";
		System.out.println(txt.equals("kim") ? 100 : 90);
		System.out.println(txt.equals("kims") ? 100 : 90);
		int res2 = txt.equals("kim") ? 100 : 90;
		
//		-> 예시
//		int score = 80;
//		System.out.println(score >= 90 ? "A" : "B");
		
//		-> 예시에서 조건을 더 추가해야할 경우 
		int score = 79;
		System.out.println(score >= 90 ? "A" : score >= 80 ? "B" : "C");
		System.out.println();
		
		
//		##### 캐스팅 연산 #####
		System.out.println("========= 캐스팅 연산 =========");
		
		System.out.println(128);
		byte bb = (byte)128;
		System.out.println(bb);
		
		int ii = (int)2200000000L;
		System.out.println(ii);
		
		
//		##### 열거 연산 #####
//		-> ...열거 연산 (,,, 하나로 표현 연산)
		
		
		
	}// end main
	
}// end class
