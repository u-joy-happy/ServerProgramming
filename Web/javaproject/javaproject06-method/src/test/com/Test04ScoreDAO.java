package test.com;

public class Test04ScoreDAO {

	public Test04ScoreDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public int insert(Test04ScoreVO vo) {
		System.out.println("int insert(Test04ScoreVO vo) ------------");
		return 1;
	}
	
	public int update(Test04ScoreVO vo) {
		System.out.println("int update(Test04ScoreVO vo) ------------");
		return 1;
	}
	
	public int delete(Test04ScoreVO vo) {
		System.out.println("int delete(Test04ScoreVO vo) ------------");
		return 1;
	}
	
	public Test04ScoreVO select(Test04ScoreVO vo) {
		System.out.println("Test04ScoreVO select(Test04ScoreVO vo) ------------");
		Test04ScoreVO v = vo;
		return v;
	}
	
	public Test04ScoreVO[] selectAll() {
		System.out.println("Test04ScoreVO[] selectAll() ------------");
		Test04ScoreVO[] vos = new Test04ScoreVO[3];
		Test04ScoreVO vo1 = new Test04ScoreVO(111, 99, 77);
		vos[0] = vo1;
		vo1 = new Test04ScoreVO(222, 88, 66);
		vos[1] = vo1;
		vo1 = new Test04ScoreVO(333, 66, 99);
		vos[2] = vo1;
		
		return vos;
	}
	
	public Test04ScoreVO[] searchList(String key, String value) {
		System.out.println("Test04ScoreVO[] searchList(String key, String value ------------");
		System.out.println("Key : " + key + "   Value : " + value);
		System.out.println();
		
		Test04ScoreVO[] vos = new Test04ScoreVO[3];
		Test04ScoreVO vo1 = new Test04ScoreVO(444, 55, 88);
		vos[0] = vo1;
		vo1 = new Test04ScoreVO(555, 77, 66);
		vos[1] = vo1;
		vo1 = new Test04ScoreVO(666, 88, 99);
		vos[2] = vo1;
		
		return vos;
	}
	
	
	
}
