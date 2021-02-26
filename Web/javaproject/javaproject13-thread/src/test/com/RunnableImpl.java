package test.com;

public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("\t\t\t\t" + i);
			System.out.println();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
