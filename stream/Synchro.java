package stream;

class Company {
	private int sum = 0;
	public synchronized void add (int a) {
		int tmp = sum;
		System.out.println("sum = " + tmp + " yen");
		System.out.println("Earned " + a + " yen");
		tmp = tmp + a;
		System.out.println("sum = " + tmp + "yen");
		sum = tmp;
	}
}

class Driver extends Thread {
	private Company cmp;
	public Driver (Company c) {
		cmp = c;
	}
	public void run () {
		for (int i=0; i<3; i++) {
			cmp.add(50);
		}
	}
}

public class Synchro {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Company cmp = new Company();

		Driver drv1 = new Driver(cmp);
		drv1.start();

		Driver drv2 = new Driver(cmp);
		drv2.start();


	}

}
