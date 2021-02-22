package test.com;

public class Test02Switch2 {

	public static void main(String[] args) {
		// 분기분 switch case break
	      // 논리분기(boolean타입결과에 따른)가 아닌 맵핑분기
	      // key type : int,char,String
		char key = 'x';
		switch (key) {
			case 'A':
				System.out.println("A...."+ (int)key);
				break;
			case 'B':
				System.out.println("B...."+ (int)key);
				break;
			case 'C':
				System.out.println("C...."+ (int)key);
				break;
			
			default:
				System.out.println("other...."+ key + (int)key);
				break;
		}
	      
		int tmp = 99;
		switch(tmp) {
		case 33 : 
			System.out.println("hi 3");
			break;
		case 66 :
			System.out.println("hihi 6");			
			break;
		case 99 :
			System.out.println("hihihi 9");			
			break;
		default :
			System.out.println("no hi");
			break;
		}
		
		String name = "kim";
		switch(name) {
		case "kim" :
			System.out.println("kim hi");
			break;
		case "lee" :
			System.out.println("lee hi");
			break;
		case "park" :
			System.out.println("park hi");
			break;
		default :
			System.out.println("just hi");
			break;
		}
	}
	
}
