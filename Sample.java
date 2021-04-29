package classLib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数を入力");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println(num + "が入力されました");
	}

}
