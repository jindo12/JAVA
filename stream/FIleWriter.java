package stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FIleWriter {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("hoge.txt")))) {
			pw.println("Hello");
			pw.println("World!");
			System.out.println("ファイルに書き込み完了");
		} catch (IOException e) {
			System.out.println("入出力エラー");
		}
	}

}
