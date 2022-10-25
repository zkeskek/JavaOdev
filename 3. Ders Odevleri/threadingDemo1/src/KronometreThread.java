
public class KronometreThread implements Runnable {
	private Thread thread;
	private String threadName;

	public KronometreThread(String threadName) {
		this.threadName = threadName;
		System.out.println("oluşturuluyor: " + threadName);

	}

	@Override
	public void run() {
		System.out.println("Çalıştırılıyor : " + threadName);

		for (int i = 1; i <= 10; i++) {
			System.out.println(threadName + " : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException expantion) {
				System.out.println("Kesildi : " + threadName);
				expantion.printStackTrace();
			}

		}
		System.out.println("Thread bitti : " + threadName);
	}

	public void start() {
		System.out.println("Thread nesnesi oluşturuluyor ");
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();

		}
	}
}
