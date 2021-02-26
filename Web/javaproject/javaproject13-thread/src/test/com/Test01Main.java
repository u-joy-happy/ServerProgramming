package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("thread");
		System.out.println();

		
//		##### Thread 사용법 #####
//		방법 1 : Thread class 상속하는 객체 활용
//		-> 1. Thread class 상속
//		-> 2. run() 재정의
//		-> 3. start() 하여 Thread 객체 실행
		
		ThreadEx t = new ThreadEx();
		t.start();
		
		
//		방법 2 : Thread 익명 내부클래스 사용
//		-> 1. Thread 객체를 생성 (선택)
//		-> 2. 익명 내부 클래스로 run() 재정의
//		-> 3. start() 하여 Thread 객체 실행

		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.print("\t\t" + i);
					System.out.println();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
		
		
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.print("\t\t\t" + i);
					System.out.println();
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
//		방법 3 : Runnable interface 구현하는 객체 활용
//		-> 1. Runnable interface 구현 (run() overriding)
//		-> 2. Runnable 객체를 포함하는 Thread 객체 생성
//		-> 3. 생성된 Thread 객체 start()
		
		RunnableImpl ri = new RunnableImpl();
		Thread t3 = new Thread(ri);
		t3.start();
		
		

//		방법 4 : Runnable 익명 내부클래스 사용
//		-> 1. Runnable 객체를 생성 (선택)
//		-> 2. Runnable 객체를 포함한 Thread 객체를 생성 (선택)
//		-> 3. 익명 내부 클래스로 run() 재정의
//		-> 4. start() 하여 Thread 객체 실행
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.print("\t\t\t\t\t" + i);
					System.out.println();
					try {
						Thread.sleep(550);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
		}).start();
		
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.print("\t\t\t\t\t\t" + i);
					System.out.println();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
			
		};
		new Thread(r).start();
		
		
		
//		System.out.println("EndMainThread");
	} // end main

} // end class
