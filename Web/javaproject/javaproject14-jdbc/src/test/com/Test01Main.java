package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("JDBC");
		System.out.println();

//		##### JDBC 세팅 #####
//		-> 1. jdbc 다운로드 (db마다 다름)
//			-> 수업은 oracle database로 SQL배움 (oracle연동)
//		-> 2. 프로젝트에 jdbc라이브러리 경로 설정 
//		-> 3. 드라이버 객체 찾기 (db마다 사용하는 클래스 이름이 다름)
//			-> oracle.jdbc.OracleDriver
//			-> class 객체를 찾는 메서드 : Class.forName();

//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			System.out.println("찾기 성공");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		-> DAO의 생성자에서 구현		

//		-> DAO 객체 생성
		Test01DAO dao = new Test01DAOimpl();
		System.out.println();

//		-> 4. DB Connection : url, userId, userPw
		Test01VO vo = new Test01VO();
		int res;
		
		vo.setNum(6);
		vo.setName("kim6");
		vo.setAge(35);
		res = dao.insert(vo);
		printResult(res);
//		System.out.println("insert result : " + res);
		System.out.println();
		
		
		vo = new Test01VO();
		vo.setNum(3);
		vo.setName("yangssem");
		vo.setAge(20);
		res = dao.update(vo);
		printResult(res);
//		System.out.println("update result : " + res);
		System.out.println();

		vo = new Test01VO();
		vo.setNum(4);
		vo.setName("kim");
		vo.setAge(55);
//		res = dao.delete(vo);
//		printResult(res);
//		System.out.println("delete result : " + res);
		System.out.println();

		vo = new Test01VO();
		vo.setNum(3);
		Test01VO resVo = dao.selectOne(vo);
		System.out.println("selectOne result : ");
		System.out.println(resVo);
		System.out.println();

		List<Test01VO> list = dao.selectAll();
		System.out.println("selectAll result : ");
		for (Test01VO v : list) {
			System.out.println(v);
		}
		System.out.println();

		list = dao.searchList("name", "y");
//		list = dao.searchList("age", "2");
		System.out.println("searchList result : ");
		for (Test01VO v : list) {
			System.out.println(v);
		}
		System.out.println();
		
		
//		Connection conn = null;
//		try {
//			conn = DriverManager.getConnection("","","");
//			System.out.println("success connect");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//		if(conn != null) {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

//		-> 5. SQL문 전달 : insert, update, delete, select

//		-> 6. SQL문 처리 결과 조회

	}
	
	static void printResult(int res) {
		if(res == 1) {
			System.out.println("result : SUCCESS !!!");
		} else if(res == 0){
			System.out.println("!!!! SYNTAX ERROR !!!!");
		} else {
			System.out.println("!!!!! ERROR !!!!!");
		}
	}

}
