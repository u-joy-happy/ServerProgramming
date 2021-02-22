package test.com;

import java.util.Date;

public class Test02Board {

//	##### 게시판 객체 #####
//	-> 기능 : 글 쓰기, 글 삭제, 글 수정
//	-> 필요 데이터 :

	void insert(String title, String content, String writer) {
		System.out.println("void insert(String title, String content, String writer) ----------");
		System.out.println("title : " + title);
		System.out.println("content : " + content);
		System.out.println("writer : " + writer);
	}

	void insert(int num, String title, String content, String writer) {
		System.out.println("void insert(int num, String title, String content, String writer) ----------");
		System.out.println("num : " + num);
		System.out.println("title : " + title);
		System.out.println("content : " + content);
		System.out.println("writer : " + writer);
	}

	void insert(Test02BoardVO vo) {
		System.out.println("void insert(Test02BoardVO vo) ----------");
		System.out.println("num : " + vo.num);
		System.out.println("title : " + vo.title);
		System.out.println("content : " + vo.content);
		System.out.println("writer : " + vo.writer);
		System.out.println("date : " + vo.date);
	}

	void insert(String[] bs) {
		System.out.println("void insert(String[] bs) ----------");
		System.out.println("title : " + bs[0]);
		System.out.println("content : " + bs[1]);
		System.out.println("writer : " + bs[2]);
	}

	void insert2(String... bs) {
		System.out.println("void insert2(String...str) ----------");
//		System.out.println("title : " + bs[0]);
//		System.out.println("content : " + bs[1]);
//		System.out.println("writer : " + bs[2]);
		for (String x : bs) {
			System.out.println(x);
		}
	}

	int insert(String title, String content, String writer, boolean t) {
		System.out.println("int insert(String title, String content, String writer, boolean t) ----------");
		System.out.println("title : " + title);
		System.out.println("content : " + content);
		System.out.println("writer : " + writer);
		return 1;
	}

	void insert() {
		System.out.println("void insert() ----------");
	}

	int insert2() {
		System.out.println("int insert2() ----------");
		return 1;
	}

	int[] insert3() {
		System.out.println("int[] insert3() ----------");
		return new int[5];
	}

	public Test02BoardVO select() {
		System.out.println("Test02BoardVO select() --------");
		Test02BoardVO b = new Test02BoardVO();
		b.num = 1234;
		b.title = "abc";
		b.content = "test content";
		b.writer = "author";
		b.date = new Date();
		return b;
	}

	public Test02BoardVO select(Test02BoardVO b) {
		System.out.println("Test02BoardVO select(Test02BoardVO b) --------");
		return b;
	}

	public Test02BoardVO[] selectAll() {
		System.out.println("Test02BoardVO[] selectAll() ------------");
		
		Test02BoardVO[] vos = new Test02BoardVO[3];
		String[] writers = new String[] {"김효주", "이효주", "박효주"};
		String[] contents = new String[] {"내일은 화요일 입니다.",
				"이번주는 4.5일 남았습니다.", "주말이 기다려집니다."};
		
		for (int i = 0; i < vos.length; i++) {
			Test02BoardVO b = new Test02BoardVO();
			b.num = 100 + i;
			b.title = "Test" + (i+1);
			b.content = contents[i];
			b.writer = writers[i];
			b.date = new Date();
			vos[i] = b;
		}
		return vos;
	}
	
	Test02BoardVO[] selectAll(String key, String value) {
		System.out.println("Test02BoardVO[] selectAll(String key, String value) ------------");
		Test02BoardVO[] vos = new Test02BoardVO[2];
		Test02BoardVO vo1 = new Test02BoardVO();
		vo1.num = 1234;
		vo1.title = key;
		vo1.content = value;
		vo1.writer = "kimss";
		vo1.date = new Date();
		vos[0] = vo1;
		
		vo1 = new Test02BoardVO();
		vo1.num = 3456;
		vo1.title = key;
		vo1.content = value;
		vo1.writer = "leess";
		vo1.date = new Date();
		vos[1] = vo1;
		
		return vos;
	}

}
