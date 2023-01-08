package Assignments;

class Thread1 implements Runnable {

	Thread t;

	public Thread1() {
		t = new Thread(this, "My Thread");
//		t.setDaemon(true);
		System.out.println("Child Thread : " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread " + i);
				t.sleep(1000);
			}
		} catch (InterruptedException ie) {
		}
		System.out.println("Exiting Child Thread ......");
	}

	public static void main(String args[]) {
		Thread1 i = new Thread1();
		try {
			for (int j = 5; j > 0; j--) {
				System.out.println("Main Thread " + j);
				Thread.sleep(500);
			}
		} catch (InterruptedException ie1) {
		}
		System.out.println("Exiting Main Thread ......");
	}
}
