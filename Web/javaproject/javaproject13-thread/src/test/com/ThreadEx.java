package test.com;

public class ThreadEx extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			System.out.println();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
