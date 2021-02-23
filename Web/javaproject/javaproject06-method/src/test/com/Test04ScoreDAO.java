package test.com;

public class Test04ScoreDAO {

	public Test04ScoreDAO() {

	}

	public int insert(Test04ScoreVO vo) {
		System.out.println("int insert(Test04ScoreVO vo) ------------");
		return 1;
	} // end insert()

	public int update(Test04ScoreVO vo) {
		System.out.println("int update(Test04ScoreVO vo) ------------");
		return 10;
	} // end update()

	public int delete(Test04ScoreVO vo) {
		System.out.println("int delete(Test04ScoreVO vo) ------------");
		return 100;
	} // end delete()

	public Test04ScoreVO select(Test04ScoreVO vo) {
		System.out.println("Test04ScoreVO select(Test04ScoreVO vo) ------------");
		Test04ScoreVO voo = new Test04ScoreVO();
		return voo;
	} // end select()

	public Test04ScoreVO[] selectAll() {
		System.out.println("Test04ScoreVO[] selectAll() ------------");
		Test04ScoreVO[] vos = new Test04ScoreVO[10];
		for (int i = 0; i < vos.length; i++) {
			Test04ScoreVO vo = new Test04ScoreVO();
//			vo.num = i + 1;
			vo.setNum(i + 1);
//			vo.kor = i * 10;
			vo.setKor(i * 10);
//			vo.eng = 90 - i;
			vo.setEng(90 - i);
//			vo.total = vo.kor + vo.eng;
			vo.setTotal(vo.getKor() + vo.getEng());
//			vo.avg = vo.total/2.0;
			vo.setAvg(vo.getTotal() / 2.0);
			vos[i] = vo;
		}
		return vos;
	} // end selectAll()

	public Test04ScoreVO[] searchList(String SearchKey, String SearchWord) {
		System.out.println("Test04ScoreVO[] searchList(String key, String value ------------");
		System.out.println("Key : " + SearchKey + "   Value : " + SearchWord);
		System.out.println();

		Test04ScoreVO[] vos = new Test04ScoreVO[10];
		for (int i = 0; i < vos.length; i++) {
			Test04ScoreVO vo = new Test04ScoreVO();
//			vo.num = i + 1;
			vo.setNum(i + 1);
//			vo.kor = (i * 4) + 60;
			vo.setKor(i * 10);
//			vo.eng = 80 - (i * 7);
			vo.setEng(90 - i);
//			vo.total = vo.kor + vo.eng;
			vo.setTotal(vo.getKor() + vo.getEng());
//			vo.avg = vo.total/2.0;
			vo.setAvg(vo.getTotal() / 2.0);
			vos[i] = vo;
		}

		return vos;
	} // end searchList()

} // end class
