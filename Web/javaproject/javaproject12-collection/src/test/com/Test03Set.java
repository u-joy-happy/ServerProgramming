package test.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test03Set {
	public static void main(String[] args) {
		System.out.println("set");
		System.out.println();

		
//		##### Set<객체 타입> ##### 
//		-> 순서가 없고, 중복 데이터를 불허
		
		Set<String> s = new HashSet<String>();
		System.out.println("s.size() : " + s.size());

		s.add("kim");
		s.add("kim");
		s.add("kim");
		s.add("kim1");
		s.add("kim2");
		System.out.println("s.size() : " + s.size());

		s.remove("kim2");
		System.out.println("s.size() : " + s.size());

		s.clear();
		System.out.println("s.size() : " + s.size());
		System.out.println();

		
		
//		-> 1~45사이의 랜덤 정수 6개 뽑기
		
		Set<Integer> lotto = new HashSet<Integer>();
//		Random ran = new Random();
		int i;
		System.out.println("1~45사이의 랜덤 정수 6개 뽑기 ------");
		while (lotto.size() < 7) {
			i = (int) (Math.random() * 45) + 1;
//			i = ran.nextInt(45)+1;
//			System.out.println(i);
			lotto.add(i);

		}
		for (Integer val : lotto) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println();
		
		
		
//		##### Set 정렬 #####
//		-> 배열로 변환 해야함
		
		System.out.println("랜덤 정수 6개 정렬 ------");
		Object[] objs = lotto.toArray();
		Arrays.sort(objs);
		for(Object o : objs) {
			System.out.print(o + " ");
		}
		System.out.println();
		System.out.println();
		
		
//		##### 객체를 담는 Set #####
//		-> 기본적으로 객체를 비교할 때는 주소 값을 비교하기 때문
//		-> 객체 안의 hashCode() equals()를 overriding 해주지 않으면
//		-> 동일한 타입의 객체를 추가하여도 Set은 다른 데이터로 인식한다. (길이가 길어짐)
//		-> hashCode() equals()를 overriding 해주면 같은 데이터로 인식한다. 
		
		Set<Test02BoardVO> s2 = new HashSet<Test02BoardVO>();
		s2.add(new Test02BoardVO());
		s2.add(new Test02BoardVO());
		s2.add(new Test02BoardVO());
		s2.add(new Test02BoardVO());
		
		System.out.println("s2.size() : " + s2.size());
		
		
		

	}
}
