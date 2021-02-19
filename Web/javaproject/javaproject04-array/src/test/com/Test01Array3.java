package test.com;

public class Test01Array3 {
	
	public static void main(String[] args) {
		System.out.println("array");
		System.out.println();
		
//		###### 배열 #####
//		-> 다차원 배열 : 배열 속 배열이 존재
//		-> 1차원 배열의 배열 : 2차원 배열
//		-> 2차원 배열의 배열 : 3차원 배열
		
		int[] nums1 = new int[3];
		int[] nums2 = new int[4];
		int[] nums3 = new int[30];

		int[][] arrays = new int[3][];
		arrays[0] = new int[] {11,22,33,44,55,66};
		arrays[1] = nums1;
		arrays[2] = nums2;
		
		int[][] arr = new int[3][4];
		
		System.out.println("arrays[][] length : " + arrays.length);
		System.out.println("arrays[0] length : " + arrays[0].length);
		System.out.println("arrays[1] length : " + arrays[1].length);
		System.out.println("arrays[2] length : " + arrays[2].length);
		
		System.out.println();
		
		for(int[] ii : arr) {
			for(int i : ii) {
				System.out.print(i + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		##### 다차원 배열 생성 방법 #####
//		1.
		String[] n1 = new String[] {"홍길동", "강길동", "최길동"};
		String[] n2 = new String[] {"양성호", "한성호", "김성호", "최성호"};
		String[] n3 = new String[] {"박광수", "강광수", "한광수", "이광수", "광수생각"};
		String[][] nn = new String[3][];
		nn[0] = n1;
		nn[1] = n2;
		nn[2] = n3;
		
//		2.
		String[][] nn2 = new String[][] {n1, n2, n3};
		
//		3.
		String[][] nn3 = new String[][] {
			{"홍길동", "강길동", "최길동"}, 
			{"양성호", "한성호", "김성호", "최성호"}, 
			{"박광수", "강광수", "한광수", "이광수", "광수생각"}
		};
		
//		String[][][] namess = new String[3][][];
		String[][] names = new String[3][];
//		namess[0] = names;
		names[0] = new String[]{"홍길동", "강길동", "최길동"};
		names[1] = new String[]{"양성호", "한성호", "김성호", "최성호"};
		names[2] = new String[]{"박광수", "강광수", "한광수", "이광수", "광수생각"};
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("names[" + i + "] : ");
			for(int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + "  ");
			}
			System.out.println();
		}// end for
		System.out.println();
		
		for(String[] ss : names) {
			for(String s : ss) {
				System.out.print(s + "  ");
			}
			System.out.println();
		}
	
		
	}// end main
	
}// end class
