package stream;

class Car1 implements Runnable {
	private String name;

	public Car1 (String name) {
		this.name = name;
	}

	public void run () {
		for (int i=0; i<5; i++) {
			System.out.println(name + "の処理をしています");
		}
	}
}

public class Runn_able {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Car1 car1 = new Car1("Thread");

		Thread th1 = new Thread(car1);
		th1.start();

		for (int i=0; i<5; i++) {
			System.out.println("main関数の処理中");
		}
	}

}
