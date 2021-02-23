package test.com;

public class Test02StringBuffer {

	public static void main(String[] args) {
		System.out.println("string buffer");
		System.out.println();
		
		long startTime = System.currentTimeMillis();
		String txt = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 100000; i++) {
//			txt += "kim";
			sb.append("kim");
		}
		long diffTime = System.currentTimeMillis()-startTime;
		System.out.println("경과 시간 : " + diffTime);
	}
	
}
