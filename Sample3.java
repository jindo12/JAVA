package classLib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 神藤
 *
 * 【文字列を追加】
 */
public class Sample3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字列を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		System.out.println("追加する文字列を入力してください");
		String str2 = br.readLine();
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		System.out.println(str1 + "に" + str2 + "を追加すると" + sb + "です");
	}

}
