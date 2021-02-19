package test.com;

public class Test01Array {
	
	public static void main(String[] args) {
		System.out.println("array");
		System.out.println();
		
//		###### 배열 #####
//		-> 동일 타입이어야 함
//		-> 배열의 길이를 선언해야함
//		-> 배열의 정적 생성
		
		int num1 = 10;
		int num2 = 100;
		int num3 = 1000;
		
		int[] nums;
		nums = new int[10];
		
		nums[0] = 10;
		nums[1] = 100;
		nums[2] = 1000;
		
		System.out.println("nums[0] : " + nums[0]);
		System.out.println("nums[1] : " + nums[1]);
		System.out.println("nums[2] : " + nums[2]);
		System.out.println("nums[9] : " + nums[9]);
		System.out.println();
		
		System.out.println("nums[] 길이 : " + nums.length);
		System.out.println();
		
		double[] ds = new double[30];
		ds[0] = 3.14;
		ds[29] = 99.99;
		
		System.out.println("ds의 값 ---------");
		
		for(int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		System.out.println();
		
		String name1 = "kim1";
		String name2 = "kim2";
		String name3 = "kim3";
		
		String[] names = new String[3];
		System.out.println("names[] 길이 : " + names.length);
		System.out.println("names의 값 ---------");
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		
		boolean[] bools = new boolean[5];
		System.out.println("bools[] 길이 : " + bools.length);
		bools[3] = true;
		System.out.println("bools의 값 ---------");
		for(int i = 0; i < bools.length; i++) {
			System.out.println(bools[i]);
		}
		
		
	}// end main
	
}// end class
