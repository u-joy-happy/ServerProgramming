package test.com;

import java.util.ArrayList;
import java.util.Date;

public class Test02BoardDAOimpl implements Test02BoardDAO {

	@Override
	public int insert(Test02BoardVO vo) {
		System.out.println("insert() ------");
		System.out.println(vo);
		return 1;
	}

	@Override
	public ArrayList<Test02BoardVO> selectAll() {
		System.out.println("selectAll() ------");
		ArrayList<Test02BoardVO> arr = new ArrayList<>();
		Test02BoardVO vo;
		for(int i = 0; i < 5; i++) {
			vo = new Test02BoardVO();
			vo.setNum(i+1);
			vo.setTitle("Test " + (i+1));
			vo.setContent(i+1 + "번째 테스트 글입니다.");
			vo.setWriter("사용자" + i);
			vo.setDate(new Date());
			arr.add(vo);
		}
		return arr;
	}

}
