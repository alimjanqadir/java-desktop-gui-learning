package swing;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

import java.util.List;

public final class JListExperiment {
	public static void main(String[] args) {
		JListExperiment experiment = new JListExperiment();
		experiment.render();
	}

	void render() {
		JFrame frame = new JFrame();
		Container contentPane = frame.getContentPane();

		JList list = new JList();
		JScrollPane scrollPane = new JScrollPane(list);
		DefaultListModel listModel = new DefaultListModel();
		listModel.addAll(List.of("one", "two", "three", "four", "five", "six"));
		list.setModel(listModel);
		contentPane.add(scrollPane, BorderLayout.NORTH);	

		JPanel panel = new JPanel();
		JTextField textField = new JTextField(20);
		textField.addActionListener((event)-> {
			listModel.addElement(textField.getText());
		});
		panel.add(textField);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		frame.setSize(800, 400);
		frame.setLocation(0, -500);
		frame.setVisible(true);
	}
}
