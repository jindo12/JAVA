package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sample4 extends Frame {

	private Button bt;

	public Sample4 () {
		super("Sample4");

		bt = new Button("BUTTON");
		add(bt);

		addWindowListener(new SampleWindowListener());
		// no name class
		bt.addMouseListener(new MouseAdapter() {
			public void mousePressed (MouseEvent e) {
				bt.setLabel("PUSH");
			}
		});

		// Lambda
		// bt.addMouseListener(new MouseAdapter(
		// 		e -> { ... }
		//));

		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Sample4();
	}

}
