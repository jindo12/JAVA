package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputBigData {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		try(BufferedReader br = new BufferedReader(new FileReader("hoge.txt"))){

			int[] test = new int[5];
			String str;

			for(int i=0; i<test.length; i++) {
				str = br.readLine();
				test[i] = Integer.parseInt(str);
			}

			int max = test[0];
			int min = test[0];
			for (int i=0; i<test.length; i++) {
				if (max < test[i])
					max = test[i];
				if (min > test[i])
					min = test[i];
				System.out.println(test[i]);
			}

			System.out.println("max :" + max);
			System.out.println("min :" + min);


		} catch (IOException e) {
			System.out.println("入出力エラー");
		}
	}

}
