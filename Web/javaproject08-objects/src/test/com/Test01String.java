package test.com;

import java.util.StringTokenizer;

public class Test01String {
	
	public static void main(String[] args) {
		System.out.println("string");
		
//		##### 문자열 인덱스 #####
		
		String str = "우리나라 무궁화 꽃이 피었습니다.";
		System.out.println(str);
		System.out.println("str.length() : " + str.length());
//		System.out.println("str.charAt(0) : " + str.charAt(0));
		for (int i = 0; i < str.length(); i++) {
			System.out.println("str.charAt(" + i + ") : " 
		+ str.charAt(i));
		}
		System.out.println();
		
//		##### 인덱스를 이용한 문자열 구분 #####
		System.out.println("str.indexOf(\"꽃\") : " + str.indexOf("꽃"));
		System.out.println("str.substring(4) : " + str.substring(4));
		System.out.println("str.substring(4) : " + str.substring(str.indexOf("꽃")));
		
		System.out.println(str.substring(5, 7+1));
	
		System.out.println();
		
//		##### 문자열 연결 #####
		str = "aaaaaaa";
		System.out.println(str.concat("bbbbbbbb")); 
		System.out.println(str);
		System.out.println();
		
//		##### 시작하거나 끝나는 문자열이 대상과 같은지 비교 #####
		str = "http://kireii333.blog.me/java.png";
		System.out.println(str.endsWith(".png"));
		System.out.println(str.startsWith("http")); 
		System.out.println();
		
		System.out.println("가장 마지막에 위치하는 곳은?");
		System.out.println(str.lastIndexOf("/"));
		System.out.println(str.substring(str.lastIndexOf("/")+1));
		
		System.out.println();
		
//		##### 재배치 #####
		System.out.println(str);
		System.out.println(str.replace("/", "&"));
		System.out.println(str);
		str = str.replace("kireii", "kimhyoju");
		System.out.println(str);
		System.out.println();
		
//		##### 문자 단위로 쪼개어 char배열 형식으로 변환 #####
		System.out.println(str.toCharArray());
		char[] cs = str.toCharArray();
		for(char c : cs) {
			System.out.println(c);
		}
		System.out.println();
		
//		##### 대소문자 변경 #####
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println();
		
		
//		##### 처음과 끝의 공백 제거 #####
		str = "      aaa  123  bb  456  ccccc   789     ";
		System.out.println(str.length());
		System.out.println(str.trim().length());
		System.out.println(str.trim());
		
//		-> 중간부분의 공백은 replace로 제거
		System.out.println(str.replace(" ", "")); //\s와 동일 표현
		System.out.println(str.replace("\s", "")); //&nbsp;와 동일 표현
		System.out.println();
		
		
//		##### 대상 문자를 기준으로 구분하여 배열로 반환 #####
		str = "aaa:bbb::cccc:dd:";
		System.out.println(str.split(":").length);
		for (String x : str.split(":")) {
			System.out.println(x);
		}
		System.out.println();
		
//		##### 2개 이상의 문자열 연결 #####
//		-> 문자열 사이에 대상 문자를 구분 기호로 삽입하여 연결
//		-> (대상문자,[문자열1, 문자열2, 문자열3, 문자열4])
//		-> 단, 대괄호는 생략
//		-> static method
		String msg = String.join("-", "java", "is", "cool");
		System.out.println(msg);
		System.out.println();
		
		
//		##### 다른 타입의 데이터를 String 타입으로 변환 #####
		String bool = String.valueOf(false);
		System.out.println(bool);
		System.out.println();
		
//		##### 작업 수행 시간 경과 확인 #####
		long startTime = System.currentTimeMillis();
		String txt = "";
		for(int i = 0; i < 100000000; i++) {
			txt = String.valueOf(false);
		}
		System.out.println(System.currentTimeMillis()-startTime);
		
		System.out.println();
		
		
//		##### replace() 응용 #####
		str = " aaaa aaaa   123  45 bb 6789 cccc  ";
		System.out.println("replaceAll(\"regexp\", \"\"));");
		System.out.println(str);
		System.out.println(str.replaceAll("[0-9]","")); //숫자 제거
		System.out.println(str.replaceAll("\\d","")); //숫자 제거
		System.out.println(str.replaceAll("\\d{3}","")); //숫자 3자리? 제거
		System.out.println(str.replaceAll("[a-z]","")); //소문자 제거
		System.out.println(str.replaceAll("[a-zA-Z]","")); //대소문자 제거
		
		System.out.println();
		System.out.println("--------------------------------");
		
//		##### StringTokenizer : 문자열 구분 #####
//		-> split은 구분자 기호가 연속 되어 있으면 구분하지 못함
//		-> 또, 구분자에 따라서 원하는 결과값이 나오지 않는 경우가 있음
//		-> StringTokenizer로 개선 가능 
		str = "aaa|bbb||ccc";
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(str, "|");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
			cnt ++;
		}
		System.out.println("개수 : " + cnt);
		for (String x : str.split("|") /* str.split("\\|") */) {
			System.out.println(x);
		}
		System.out.println("개수 : "+str.split("|").length);
		
	}
	
}
