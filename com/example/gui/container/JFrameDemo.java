package container;

import java.awt.*;
import javax.swing.*;

final class JFrameDemo {
	public static void main(String[] args) {
		var frame = new JFrame("JFrameDemo");
		var contentPane = frame.getContentPane();
		//contentPane.setLayoutManager(new BorderLayoutManager());

		var button = new JButton("OK");
		contentPane.add(button, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
