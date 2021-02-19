package test.com;

public class Test02Type {

//	Eclipse > Preferences > Search 'Key' > Search 'Content Assist'
	
	public static void main(String[] args) {
		System.out.println("java type");
		
//		##### String(문자열) #####
		System.out.println("a"); /* 0글자 이상 */
		System.out.println("aaaa");
		System.out.println(""); /* == System.out.println(); */
//		System.out.print(); ERROR 
		
//		##### char(문자) #####
		System.out.println('A');
//		System.out.println(''); single quotation 은 1개의 문자(char)만 허용(공백불가)

//		##### [byte/short/*int*/long], [float/*double*] #####
		System.out.println(1234);
		System.out.println(1234.1234);
		
//		##### boolean #####
		System.out.println(true);
		System.out.println(false);
		
//		##### null #####
		System.out.println("메모리 상의 주소가 없을 때 : " + null);
//		null은 데이터 타입이 아니기 때문에 단독으로 출력 불가 
		
	}// end main
	
}// end class
