package test.com;

public class Test04ScoreMain {

	public static void main(String[] args) {
		Test04ScoreVO vo = new Test04ScoreVO();
		Test04ScoreDAO dao = new Test04ScoreDAO();
		
		int ist = dao.insert(vo);
		System.out.println("insert : " + ist);
		System.out.println();
		
		int udt = dao.update(vo);
		System.out.println("update : " + udt);
		System.out.println();
		
		int dlt = dao.delete(vo);
		System.out.println("delete : " + dlt);
		System.out.println();
		
		Test04ScoreVO slt = dao.select(vo);
		System.out.println("num : " + slt.num);
		System.out.println("kor : " + slt.kor);
		System.out.println("eng : " + slt.eng);
		System.out.println("total : " + slt.total);
		System.out.println("avg : " + slt.avg);
		System.out.println();
		
		Test04ScoreVO[] sall = dao.selectAll();
		for(Test04ScoreVO vos : sall) {
			System.out.println("num : " + vos.num);
			System.out.println("kor : " + vos.kor);
			System.out.println("eng : " + vos.eng);
			System.out.println("total : " + vos.total);
			System.out.println("avg : " + vos.avg);
			System.out.println("------------------------");
		}
		System.out.println();
		
		sall = dao.searchList("hello", "java");
		for(Test04ScoreVO vos : sall) {
			System.out.println("num : " + vos.num);
			System.out.println("kor : " + vos.kor);
			System.out.println("eng : " + vos.eng);
			System.out.println("total : " + vos.total);
			System.out.println("avg : " + vos.avg);
			System.out.println("------------------------");
		}
		System.out.println();
		
	}

}
