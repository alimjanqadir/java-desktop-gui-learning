package swing;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public final class JTextAreaExperiment {
	public static void main(String[] args) {
		JTextAreaExperiment experiment = new JTextAreaExperiment();
		experiment.render();
	}

	void render() {
		JFrame frame = new JFrame("TextArea Experiment");	
		Container contentPane = frame.getContentPane();

		JPanel panelA = new JPanel();

		JTextArea textAreaA = new JTextArea("Insertion",10, 30);
		panelA.add(textAreaA);
		contentPane.add(panelA, BorderLayout.NORTH);
		

		JTextArea textAreaB = new JTextArea(10, 30);
		panelA.add(textAreaB);

		JButton copyButton = new JButton("copy");
		copyButton.addActionListener((event) -> {
			if(textAreaA.getSelectedText() != null){
				textAreaB.append(String.format("%s\n", textAreaA.getSelectedText()));
			}else {
				textAreaB.append(String.format("%s\n",textAreaA.getText()));
			}
		});
		JButton clearButton = new JButton("clear");
		clearButton.addActionListener((event) -> {
			textAreaA.setText("");
			textAreaB.setText("");
		});
		JPanel panelB = new JPanel();
		panelB.add(copyButton);
		panelB.add(clearButton);
		contentPane.add(panelB, BorderLayout.CENTER);

		frame.setVisible(true);
		frame.setSize(800, 400);
		frame.setLocation(0, -500);
	}
}
