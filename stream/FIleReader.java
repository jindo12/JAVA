package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 【ファイルから入力】
 *
 */
public class FIleReader {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		try (BufferedReader br = new BufferedReader(new FileReader("hoge.txt"))) {

			String str1 = br.readLine();
			String str2 = br.readLine();

			System.out.println("ファイルに書き込まれている2つの文字列は");
			System.out.println(str1 + "です");
			System.out.println(str2 + "です");

		} catch (IOException e) {
			System.out.println("入出力エラーです");
		}
	}

}
