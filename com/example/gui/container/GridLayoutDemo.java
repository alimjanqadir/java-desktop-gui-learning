package container;

import java.awt.*;
import javax.swing.*;

public final class GridLayoutDemo {
	JButton b1, b2, b3, b4, b5, b6;

	public static void main(String[] args) {
		var gridLayoutDemo = new GridLayoutDemo();
		gridLayoutDemo.render();
	}

	private void render() {
		var frame = new JFrame("GridLayout Demo");
		var contentPane = frame.getContentPane();

		contentPane.setLayout(new GridLayout(2, 3));
		contentPane.setPreferredSize(new Dimension(400, 800));

		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		b5 = new JButton("Button 5");
		b6 = new JButton("Button 5");

		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		contentPane.add(b5);
		contentPane.add(b6);
		frame.pack();
		frame.setVisible(true);
	} 

}
