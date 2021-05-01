package abst;


public class Main  {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Vehicle[] vc = new Vehicle[2]; // 抽象クラスの配列

		vc[0] = new Car(0002, 30.4);
		vc[0].setSpeed(40);

		vc[1] = new Plane(3241);
		vc[1].setSpeed(330);

		for (int i=0; i<vc.length; i++) {
			// vc[i].show();
			if(vc[i] instanceof Car) { // objectのクラスを調べる
				System.out.println((i+1) + "番目は、Carクラス");
			} else if (vc[i] instanceof Plane) {
				System.out.println((i+1) + "番目は、Planeクラス");
			}
		}

		iVehicle[] ivc = new iVehicle[1];

		ivc[0] = new Car(1231, 32.2);


	}

}
