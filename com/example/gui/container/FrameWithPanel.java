package container;

import java.awt.*;
import javax.swing.*;

final class FrameWithPanel {
	public static void main(String[] args) {
		var frame = new JFrame("Frame With Panel");
		var contentPane = frame.getContentPane();
		contentPane.setBackground(Color.YELLOW);
		var panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setLayout(new BorderLayout());
		
		var button = new Button("OK");
		panel.add(button, BorderLayout.SOUTH);

		contentPane.add(panel);

		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
