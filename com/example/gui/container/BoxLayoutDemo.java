package container;

import java.awt.*;
import javax.swing.*;

public final class BoxLayoutDemo {

	public static void main(String[] args) {
		var boxLayoutDemo = new BoxLayoutDemo();
		boxLayoutDemo.render();
	}

	public void render() {
		var frame = new JFrame("BoxLayout Demo");
		var contentPane = frame.getContentPane();
		
		var horizontalPanel = new JPanel();
		horizontalPanel.setLayout(new BoxLayout(horizontalPanel, BoxLayout.X_AXIS));	
		var button1 = new JButton("OK");
		var button2 = new JButton("CANCEL");
		var button3 = new JButton("UNDO");
		var button4 = new JButton("NO");
		horizontalPanel.add(button1);
		horizontalPanel.add(button2);
		horizontalPanel.add(button3);
		horizontalPanel.add(button4);

		var verticalPanel = new JPanel();
		verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
		var label1 = new JLabel("A");
		var label2= new JTextArea("""
				This is a
				test.""", 2, 10);
		var label3 = new JLabel("ABC");
		verticalPanel.add(label1);
		verticalPanel.add(label2);
		verticalPanel.add(label3);

		contentPane.add(horizontalPanel, BorderLayout.SOUTH);
		contentPane.add(verticalPanel, BorderLayout.CENTER);

		frame.pack();
		frame.setVisible(true);
	}

}
