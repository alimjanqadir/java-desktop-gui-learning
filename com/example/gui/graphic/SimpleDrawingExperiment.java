package graphic;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public final class SimpleDrawingExperiment {
	public static void main(String[] args) {
		var experiment = new SimpleDrawingExperiment();
		experiment.render();
	}

	public void render() {
		var frame = new JFrame("Simple Drawing Experiment");
		var contentPane = frame.getContentPane();

		var customButton = new CustomButton("clear");
		contentPane.add(customButton, BorderLayout.SOUTH);

		frame.setVisible(true);
		frame.setSize(800, 400);
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
}

