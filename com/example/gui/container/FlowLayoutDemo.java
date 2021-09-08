package container;

import java.awt.*;
import javax.swing.*;

public final class FlowLayoutDemo {
	public static void main(String[] args) {
		var flowlayout = new FlowLayoutDemo();
		flowlayout.render();
	}

	public void render() {
		var frame = new JFrame("FlowLayout Demo");
		var contentPane = frame.getContentPane();
		contentPane.setLayout(new FlowLayout());

		// Buttons
		var button1 = new JButton("Button A");
		var button2 = new JButton("Button B");
		var button3 = new JButton("Button C");
		var button4 = new JButton("Button D");
		var button5 = new JButton("Button F");
		var button6 = new JButton("Button G");
		
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(button4);
		contentPane.add(button5);
		contentPane.add(button6);

		frame.setSize(200, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
