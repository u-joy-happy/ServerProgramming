package test.com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("collection");
		System.out.println();
	
//		##### 자료구조 #####
//		-> 가변 배열, 객체타입의 데이터들만 가짐
		
		
//		##### List<객체 타입> #####
//		-> 순서가 있고, 중복 데이터를 허용

		
		List<String> list = new ArrayList<>();
		
		System.out.println("list.size() : " + list.size());
		list.add("1 가나다");
		list.add("2 ABC");
		list.add("3 가나다");
		list.add("4 ABC");
		list.add("5 가나다");
		list.add("6 ABC");
		list.add("7 가나다");
		list.add("8 ABC");
		System.out.println("list.size() : " + list.size());
		System.out.println();
		

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println();
		
		list.set(3, "4 lee");
		list.remove(5);
		System.out.println("list.size() : " + list.size());
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println();

		list.clear();
		System.out.println("list.size() : " + list.size());
		System.out.println();
		
		
		List<Test02BoardVO> list2 = new ArrayList<>();
		System.out.println("list2.size() : " + list2.size());
		System.out.println();
		
		Test02BoardVO vo;
		for(int i = 0; i < 10; i++) {
			vo = new Test02BoardVO();
			vo.setNum(i);
			vo.setTitle("Test " + (i));
			vo.setContent(i + "번째 테스트 글입니다.");
			vo.setWriter("사용자" + i);
			vo.setDate(new Date());
			list2.add(vo);
		}
		
		System.out.println("list2.size() : " + list2.size());
		System.out.println();
		
		list2.remove(0);
		list2.remove(2);
		list2.remove(4);
		
		list2.set(0, new Test02BoardVO());
		
		System.out.println("list2.size() : " + list2.size());
		System.out.println();
		
		if(list2.get(1).getNum() == 2) {
			list2.get(1).setTitle("aaaaa");
		}
		
		for (Test02BoardVO v : list2) {
			System.out.println(v);
		}
		System.out.println();
		
		List list3 = new ArrayList();
		list3.add(1000);
		list3.add("String");
		list3.add(1000);
		list3.add(true);
		list3.add(new int[4]);
		
		for(Object i : list3) {
			System.out.println(i);
		}
		
		List<Integer> list4 = List.of(1000, 1000, 2000); // return List<E>
		
//		-> UnsupportedOperationException
//		-> List.of()로 생성된 배열의 데이터는 수정 불가
//		list4.set(0, 4444);
//		list4.remove(0);
		
		for(Integer i : list4) {
			System.out.println(i);
		}
		System.out.println();
				
		
	}
	
}
