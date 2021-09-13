package container;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class CardLayoutDemo {
	JPanel p1, p2, p3, p4;
       	JLabel l1, l2, l3, l4;

	public static void main(String[] args) {
		var cardLayoutDemo = new CardLayoutDemo();
		cardLayoutDemo.render();
	}

	private void render() {
		var frame = new JFrame("CardLayout Demo");
		var contentPane = frame.getContentPane();
		var cardLayout = new CardLayout();

		contentPane.setLayout(cardLayout);
		contentPane.setPreferredSize(new Dimension(400, 800));
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		
		var mouseClickedListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cardLayout.next(contentPane);
			}
		};

		p1.addMouseListener(mouseClickedListener);
		p2.addMouseListener(mouseClickedListener);
		p3.addMouseListener(mouseClickedListener);
		p4.addMouseListener(mouseClickedListener);		

		l1 = new JLabel("Label 1");
		l2 = new JLabel("Label 2");
		l3 = new JLabel("Label 3");
		l4 = new JLabel("Label 4");
		
		p1.add(l1);
		p2.add(l2);
		p3.add(l3);
		p4.add(l4);

		contentPane.add(p1);
		contentPane.add(p2);
		contentPane.add(p3);
		contentPane.add(p4);
		frame.pack();
		frame.setVisible(true);
	} 

}
