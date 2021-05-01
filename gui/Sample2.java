package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Sample2 extends Frame {

	private Button bt;

	class SampleActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			bt.setLabel("こんちは");
		}
	}

	public Sample2() {

		super("Sample2");

		bt = new Button("push");
		add(bt);

		addWindowListener(new SampleWindowListener());
		bt.addActionListener(new SampleActionListener());

		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Sample2();
	}

}
