package gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sample6 extends Frame {

	int x = 10;
	int y = 10;

	@Override
	public void paint(Graphics s) {
		s.setColor(Color.RED);
		s.fillOval(x, y, 10, 10);
	}

	class SampleMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint(); // call paint method of Frame class
		}
	}

	public Sample6 () {
		super("Sample6");

		addWindowListener(new SampleWindowListener());
		addMouseListener(new SampleMouseAdapter());

		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Sample6();
	}

}
