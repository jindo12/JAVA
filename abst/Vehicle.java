package abst;

interface iVehicle {
	void sample();
}

public abstract class Vehicle {
	protected int speed;
	public void setSpeed(int s) {
		speed = s;
	}
	abstract void show();
}

class Car extends Vehicle implements iVehicle {
	private int num;
	private double gas;

	public Car (int n, double g) {
		num = n;
		gas = g;
	}
	public void show () {
		System.out.println("number : " + num);
		System.out.println("gasolene : " + gas);
		System.out.println("speed : " + speed);
	}
	public void sample() {
		System.out.println("インターフェースを実装しました");
	}
}

class Plane extends Vehicle {
	private int flight;
	public Plane(int f) {
		flight = f;
	}
	public void show() {
		System.out.println("flight : " + flight);
		System.out.println("speed + " + speed);
	}
}

