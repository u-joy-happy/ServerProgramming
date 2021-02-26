package test.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Test04Map {

	public static void main(String[] args) {
		System.out.println("map");
		System.out.println();
		
//		##### Map<키 타입, 값 타입> #####
//		-> 키와 값으로 구성되어있음. 키는 중복 불허(유니크), 값은 중복 허용
		
		Map<String, String>	map = new HashMap<String, String>();
		
		map.put("age", "33");
		map.put("age", "44");
		map.put("name", "kim");
		map.put("name", "yangssem");
		map.put("email", "aaa@aaa.com");
		
		System.out.println("map.size() : " + map.size());
		System.out.println();
		
		System.out.println("age : " + map.get("age"));
		System.out.println("name : " + map.get("name"));
		System.out.println("email : " + map.get("email"));
		System.out.println();
		
		System.out.println("map.keySet() : " + map.keySet());
		System.out.println();
		
		for (String key : map.keySet()) {
			System.out.print("map value : ");
			System.out.println(map.get(key));
		}
		System.out.println();
		
		
//		##### 객체를 담는 Map #####
		Map<String, Test02BoardVO>	map2 = new HashMap<String, Test02BoardVO>();
		
		map2.put("vo1", new Test02BoardVO());
		map2.put("vo2", new Test02BoardVO());
		map2.put("vo3", new Test02BoardVO());
		
		System.out.println("map2.keySet() : " + map2.keySet());
		System.out.println();
		
		for (String key : map2.keySet()) {
			System.out.print("map2 value : ");
			System.out.println(map2.get(key));
		}
		System.out.println();

		
//		##### 객체의 배열을 담는 Map #####
		Map<String, List<Test02BoardVO>> map3 = new Hashtable<>();
		List<Test02BoardVO> list = new ArrayList<Test02BoardVO>();
		
		list.add(new Test02BoardVO());
		list.add(new Test02BoardVO());
		list.add(new Test02BoardVO());
		
		map3.put("list", list);
		for(Test02BoardVO v : map3.get("list")) {
			System.out.print("map3 value : ");
			System.out.println(v);
		}
		

	}
	
}
