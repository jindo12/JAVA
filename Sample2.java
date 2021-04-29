package classLib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("英数字を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String stru = str.toUpperCase();
		String strl = str.toLowerCase();

		System.out.println(stru);
		System.out.println(strl);
	}

}
