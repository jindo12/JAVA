package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Sample3 extends Frame {

	private Button bt;

//	class SampleMouseListener implements MouseListener {
//
//		@Override
//		public void mouseClicked(MouseEvent e) {}
//
//		@Override
//		public void mousePressed(MouseEvent e) {}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {}
//
//		@Override
//		public void mouseEntered(MouseEvent e) { bt.setLabel("Welcome!"); }
//
//		@Override
//		public void mouseExited(MouseEvent e) { bt.setLabel("Hi. "); }
//
//	}

	// 【A class that overrides only the methods it needs】
	class SampleMouseAdapter extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			bt.setLabel("Welcome!");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			bt.setLabel("Hi. ");
		}
	}

	public Sample3 () {
		super("Sample3");

		bt = new Button("PUSH");
		add(bt);

		addWindowListener(new SampleWindowListener());
		// bt.addMouseListener(new SampleMouseListener());
		bt.addMouseListener(new SampleMouseAdapter());

		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Sample3();
	}

}
