package test.com;

import java.util.ArrayList;
import java.util.Date;

public class Test02Main{

	public static void main(String[] args) {
		
		Test02BoardDAO dao = new Test02BoardDAOimpl();
//		Test02BoardDAOimpl dao = new Test02BoardDAOimpl();
		
		Test02BoardVO vo = new Test02BoardVO();
		
		for(int i = 0; i < 5; i++) {
			vo = new Test02BoardVO();
			vo.setNum(i+1);
			vo.setTitle("Test " + (i+1));
			vo.setContent(i+1 + "번째 테스트 글입니다.");
			vo.setWriter("사용자" + i);
			vo.setDate(new Date());
			int a = dao.insert(vo);
			if(a == 1) {
				System.out.println("게시글이 등록되었습니다.");
				System.out.println();
			}
		}
		
		
		ArrayList<Test02BoardVO> arr = dao.selectAll();
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}
	}

}
