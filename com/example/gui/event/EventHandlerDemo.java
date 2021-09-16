package event;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public final class EventHandlerDemo {
	public static void main(String args[]) {
		var eventHandlerDemo = new EventHandlerDemo();
		eventHandlerDemo.render();
	}

	public void render() {
		var frame = new JFrame("Event Handler Demo");
		var contentPane = frame.getContentPane();
		var label = new JLabel("Empty");
		contentPane.add(label, BorderLayout.NORTH);
		frame.setSize(800, 400);
		frame.setVisible(true);
		
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent event) {
			}	

			@Override
			public void mouseDragged(MouseEvent event) {
				label.setText(String.format("Location X: %d Y: %d", event.getLocationOnScreen().x, event.getLocationOnScreen().y));
			}
		});

		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent event) {
				label.setText("MouseEntered");
			}

			@Override
			public void mouseExited(MouseEvent event) {
				label.setText("MouseExit");
			}
		});

	}
}
