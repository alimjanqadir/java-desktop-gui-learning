package graphic;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public final class SimpleDrawingExperiment {
	private int tag = 0;

	public static void main(String[] args) {
		var experiment = new SimpleDrawingExperiment();
		experiment.render();
	}

	public void render() {
		var frame = new JFrame("Simple Drawing Experiment");
		var contentPane = frame.getContentPane();

		var panel = new CustomPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		var customButton = new CustomButton("clear");
		customButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (tag == 0) {
					tag = 1;
					customButton.setText("draw");
				}else {
					tag = 0;
					customButton.setText("clear");
				}
				panel.repaint();
			}
		});
		contentPane.add(customButton, BorderLayout.SOUTH);	

		frame.setVisible(true);
		frame.setSize(800, 400);
		frame.setLocation(200, 400);
	}

	private final class CustomButton extends JButton {
		
		public CustomButton(String text) {
			super(text);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			var width = getWidth();
			var height = getHeight();
			g.drawOval(4, 4, width - 8, height - 8);
		}
	}

	private final class CustomPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int xPoints[] = {280, 300, 320, 290, 260};
			int yPoints[] = {120, 120, 130, 150, 130};
			
			if (tag == 0) {
				g.setColor(Color.blue);
				g.drawLine(0, 0, 300, 50);
				g.setColor(Color.green);
				g.drawRect(100, 200, 200, 200);
				g.setColor(Color.red);
				g.drawRoundRect(400, 200, 100, 100, 10, 0);
				g.setColor(Color.yellow);
				g.fillOval(10, 10, 50, 50);
				g.setColor(Color.pink);
				g.fillArc(300, 100, 120, 80, 0, 30);
				g.setColor(Color.magenta);
				g.fillPolygon(xPoints, yPoints, 5);
				g.setColor(Color.red);
				g.fillRect(10, 110, 80, 30);
				g.setColor(Color.green);
				g.fillRect(50, 120, 80, 30);
				g.setXORMode(Color.blue);
				g.fillOval(80, 130, 80, 30);
			}	
		}
	}
}

