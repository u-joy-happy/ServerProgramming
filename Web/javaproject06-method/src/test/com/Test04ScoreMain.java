package test.com;

public class Test04ScoreMain {

	public static void main(String[] args) {
		System.out.println("score");
		System.out.println();
		
		Test04ScoreVO vo = new Test04ScoreVO();
		Test04ScoreDAO dao = new Test04ScoreDAO();
		
		int ist = dao.insert(vo);
		System.out.println("insert result value : " + ist);
		System.out.println();
				
		int udt = dao.update(vo);
		System.out.println("update result value : " + udt);
		System.out.println();
		
		int dlt = dao.delete(vo);
		System.out.println("delete result value : " + dlt);
		System.out.println();
		
		Test04ScoreVO svo = dao.select(vo);
		System.out.println("num : " + svo.getNum());
		System.out.println("kor : " + svo.getKor());
		System.out.println("eng : " + svo.getEng());
		System.out.println("total : " + svo.getTotal());
		System.out.println("avg : " + svo.getAvg());
		System.out.println();
		
		Test04ScoreVO[] sall = dao.selectAll();
		for(Test04ScoreVO vos : sall) {
			System.out.println("num : " + vos.getNum());
			System.out.println("kor : " + vos.getKor());
			System.out.println("eng : " + vos.getEng());
			System.out.println("total : " + vos.getTotal());
			System.out.println("avg : " + vos.getAvg());
			System.out.println("------------------------");
		} // end for
		System.out.println();
		
		sall = dao.searchList("name", "kim*");
		for(Test04ScoreVO vos : sall) {
			System.out.println("num : " + vos.getNum());
			System.out.println("kor : " + vos.getKor());
			System.out.println("eng : " + vos.getEng());
			System.out.println("total : " + vos.getTotal());
			System.out.println("avg : " + vos.getAvg());
			System.out.println("------------------------");
		} // end for
		System.out.println();
		
		
//		##### hashcode() and equals() override #####
//		-> 객체 주소가 아닌 데이터를 비교해서 동일 속성을 갖는다면 각은 객체를 보기 위함
		Test04ScoreVO x = new Test04ScoreVO();
		Test04ScoreVO y = new Test04ScoreVO();
		System.out.println(x == y);
		System.out.println(x.equals(y));
		
	} // end main()

} // end class
