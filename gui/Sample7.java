package gui;

import java.awt.Frame;
import java.awt.Graphics;

/**
 *  Animation
 *
 */
public class Sample7 extends Frame implements Runnable {

	int num;

	public Sample7() {
		super("Sample7");

		addWindowListener(new SampleWindowListener());

		Thread th = new Thread(this);
		th.start();

		setSize(250, 200);
		setVisible(true);
	}

	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				num = i;
				repaint();
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {

		}
	}

	public void paint (Graphics g) {
		String str = num + "num";
		g.drawString(str, 100, 100);
	}

	public static void main(String[] args) {
		new Sample7();
	}



}
