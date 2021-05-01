package gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * show Image
 *
 */
public class Sample5 extends Frame {

	private Image im;

	public Sample5() {

		super("Sample5");

		Toolkit tk = getToolkit();
		im = tk.getImage("Image.jpg");

		addWindowListener(new SampleWindowListener());

		setSize(250, 200);
		setVisible(true);
	}

	public void paint(Graphics g) {
		g.drawImage(im, 100, 100, this);
	}

	public static void main(String[] args) {
		new Sample5();
	}

}
