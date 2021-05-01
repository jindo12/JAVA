package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class SampleWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class Sample1 extends Frame {

	private Label lb;

	public Sample1() {
		super("Sample1"); // WIndow Title

		// 【LABEL】
		lb = new Label("Welcome");
		add(lb);
		lb.setForeground(Color.blue);
		lb.setFont(new Font("Serif", Font.BOLD, 24));

		addWindowListener(new SampleWindowListener());
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Sample1();
	}

}
