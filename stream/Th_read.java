package stream;

class Car extends Thread {
	private String name;

	public Car (String name) {
		this.name = name;
	}

	@Override
	public void run () {
		for (int i=0; i<5; i++) {
			try {
				sleep(1000);
				System.out.println(name);
			} catch (InterruptedException e) {}

		}
	}
}

public class Th_read {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		Car car1 = new Car("Thread1");
		car1.start();

		Car car2 = new Car("Thread2");
		car2.start();

		for (int i=0; i<5; i++) {
			Thread.sleep(1000);
			System.out.println("main関数の処理中");
		}

		// wait until end this thread
		car2.join();

		System.out.println("END");


	}

}
