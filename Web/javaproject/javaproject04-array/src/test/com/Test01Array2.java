package test.com;

public class Test01Array2 {
	
	public static void main(String[] args) {
		System.out.println("array");
		System.out.println();
		
//		###### 배열 #####
//		-> 배열의 동적 생성 : {}
		
		int[] nums1 = new int[3];
		nums1[0] = 44;
		nums1[0] = 55;
		nums1[0] = 66;
		
		// 정적 생성
		int[] nums2 = new int[] {44, 55, 66, 77, 88};
		int[] nums3 = {11, 22, 33};
		
		System.out.println("nums3[] length : " + nums3.length);
		System.out.println("nums3[] values ---------");
		for(int i = 0; i < nums3.length; i++) {
			System.out.println(nums3[i]);
		}
		System.out.println();
		
		String[] names = new String[] {"kim", "lee", "park"};
		System.out.println("names[] length : " + names.length);
		System.out.println("names[] values ---------");
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		
		System.out.println("========= for-each =========");
		System.out.println();
		
		System.out.println("nums2[] values ---------");
		for(int x : nums2) {
			System.out.println(x);
		}
		
		
	}// end main
	
}// end class
