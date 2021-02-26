package test.com;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
	
	public static void main(String[] args) {
		System.out.println("member");
		System.out.println();
		
		
//		##### 회원가입 프로그램 #####
//		MemberVO
//		-> 필요 데이터(private) : 번호, 아이디, 비밀번호, 이름, 전화번호 
//		MemberDAO (interface)
//		-> insert, update, delete, selectOne, selectAll, searchList
//		MemberDAOimpl
//		-> DAO 상속 클래스
//		-> 생성자 : 드라이버연결(JDBC 라이브러리 추가)
//		-> 각 오버라이딩 된 메서드에서 DBconnectiong 및 예외처리
//			-> insert
//			-> update
//			-> delete
//			-> selectOne
//			-> selectAll
//			-> searchList
//		-> 각 오버라이딩 된 메서드에서 쿼리를 실행 로직작성 및 반환처리
//			-> insert
//			-> update
//			-> delete
//			-> selectOne
//			-> selectAll
//			-> searchList
//		-> (쿼리 실행을 위한 테이블 및 시퀀스 미리 생성)
//			-> table : member
//			-> column : VO variable
//			-> sequence : seq_TABLENAME
//		MemberMain
//		-> 입력, 수정, 삭제, 단일 검색, 전체 검색, 조건 검색 기능 테스팅 및 출력
		
		
		
		MemberDAO dao = new MemberDAOimpl();
		MemberVO vo = new MemberVO();
		List<MemberVO> list = new ArrayList<MemberVO>();
		int res = 0;
		
		
//		-> insert
//		vo.setNum(1);
		vo.setId("byebye");
		vo.setPw("pw1");
		vo.setName("김치찌개");
		vo.setTel("010-6542-8825");
		
//		res = dao.insert(vo);
//		System.out.println("result : " + res);
		System.out.println();
		System.out.println();
		
//		-> update
		vo.setNum(17);
		vo.setId("hyoju");
		vo.setPw("pw6");
		vo.setName("김효주");
		vo.setTel("010-7653-7632");
		
		res = dao.update(vo);
		System.out.println("result : " + res);
		System.out.println();
		System.out.println();
		
//		-> delete
		vo.setNum(29);
//		vo.setId("id2");
//		vo.setPw("pw2");
//		vo.setName("user2");
//		vo.setTel("010-2222-2222");
		res = dao.delete(vo);
		System.out.println("result : " + res);
		System.out.println();
		System.out.println();
		
//		-> selectOne
		vo.setNum(10);
		vo = dao.selectOne(vo);
		System.out.println(vo);
		System.out.println();
		System.out.println();
		
//		-> selectAll
		list = dao.selectAll();
		for(MemberVO v : list) {
			System.out.print(v.getNum() + "\t");
			System.out.print(v.getId() + "\t");
			System.out.print(v.getPw() + "\t");
			System.out.print(v.getName() + "\t");
			System.out.println(v.getTel());
		}
		System.out.println();
		System.out.println(list.size() + "개의 데이터가 조회되었습니다.");
		System.out.println();
		
//		-> searchList
		list = dao.searchList("id", "ss");
		for(MemberVO v : list) {
			System.out.print(v.getNum() + "\t");
			System.out.print(v.getId() + "\t");
			System.out.print(v.getPw() + "\t");
			System.out.print(v.getName() + "\t");
			System.out.println(v.getTel());
		}
		System.out.println();
		System.out.println(list.size() + "개의 데이터가 조회되었습니다.");
		System.out.println();
		
		
		
	}
	
}
