package swing;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.BorderFactory;


public final class JComboBoxExperiment {
	public static void main(String[] args) {
		JComboBoxExperiment experiment = new JComboBoxExperiment();
		experiment.render();
	}

	void render() {
		JFrame frame = new JFrame("ComboBox Experiment");
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new GridLayout(0, 1));	

		JPanel panel1 = new JPanel();
		Border etchedBorder = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createTitledBorder(etchedBorder, "Uneditable JComboBox");
		panel1.setBorder(border);
		String[] numbers = {"one", "two", "three", "four", "five"};
		JComboBox<String> comboBoxA = new JComboBox<>(numbers);
		panel1.add(comboBoxA);
		contentPane.add(panel1);		

		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createTitledBorder(etchedBorder, "Editable JComboBox"));
		JComboBox<String> editableComboBox = new JComboBox<>();
		editableComboBox.setEditable(true);
		editableComboBox.addItem("six");
		editableComboBox.addItem("seven");
		editableComboBox.addItem("eight");
		editableComboBox.addItem("nine");
		editableComboBox.addItem("tem");
		panel2.add(editableComboBox);
		contentPane.add(panel2);
		
		frame.pack();
		frame.setVisible(true);
	}
}
