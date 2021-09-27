package swing;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;

public final class JMenuExperiment {
	public static void main(String[] args) {
		JMenuExperiment experiment = new JMenuExperiment();
		experiment.render();
	}

	JLabel label = new JLabel();

	void render() {
		JFrame frame = new JFrame("JMenu Experiment");
		Container contentPane = frame.getContentPane();
		contentPane.add(label, BorderLayout.SOUTH);

		MenuActionListener menuActionListener = new MenuActionListener();
		MenuItemListener menuItemListener = new MenuItemListener();

		JMenuBar menuBar = new JMenuBar();
		// File menu start
		JMenu fileMenu  = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
		
		// Open
		JMenuItem menuItemOpen = new JMenuItem("open");
		menuItemOpen.setMnemonic(KeyEvent.VK_O);
		menuItemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItemOpen.addActionListener(menuActionListener);
		fileMenu.add(menuItemOpen);

		// Save
		JMenuItem saveMenuItem = new JMenuItem("save", KeyEvent.VK_S);
		saveMenuItem.addActionListener(menuActionListener);
		saveMenuItem.setEnabled(false);
		fileMenu.add(saveMenuItem);
		
		// Close
		JMenuItem closeMenuItem = new JMenuItem("close", KeyEvent.VK_C);
		closeMenuItem.addActionListener(menuActionListener);
		fileMenu.add(closeMenuItem);
		fileMenu.addSeparator();

		// Exit
		JMenuItem exitMenuItem = new JMenuItem("exit", KeyEvent.VK_E);
		exitMenuItem.addActionListener(menuActionListener);
		fileMenu.add(exitMenuItem);
		// File menu end
		
		// Option menu start
		JMenu optionMenu = new JMenu("Option");
		menuBar.add(optionMenu);
		// Font
		optionMenu.add("font...");
		// Color sub menu
		JMenu colorSubMenu = new JMenu("Color...");
		optionMenu.add(colorSubMenu);
		// Forground
		JMenuItem forgroundSubMenuItem = new JMenuItem("forground");
		forgroundSubMenuItem.addActionListener(menuActionListener);
		forgroundSubMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		colorSubMenu.add(forgroundSubMenuItem);
		// Background
		JMenuItem backgroundSubMenuItem = new JMenuItem("background");
		backgroundSubMenuItem.addActionListener(menuActionListener);
		backgroundSubMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		colorSubMenu.add(backgroundSubMenuItem);
		optionMenu.addSeparator();

		// Check me
		JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("check me");
		checkBoxMenuItem.addItemListener(menuItemListener);
		optionMenu.add(checkBoxMenuItem);
		optionMenu.addSeparator();
		
		JRadioButtonMenuItem smallRadioButtonMenuItem  = new JRadioButtonMenuItem("small", true);
		smallRadioButtonMenuItem.addItemListener(menuItemListener);
		optionMenu.add(smallRadioButtonMenuItem);

		JRadioButtonMenuItem largeRadioButtonMenuItem = new JRadioButtonMenuItem("large");
		largeRadioButtonMenuItem.addItemListener(menuItemListener);
		optionMenu.add(largeRadioButtonMenuItem);

		ButtonGroup buttonGroupMenuItem = new ButtonGroup();
		buttonGroupMenuItem.add(smallRadioButtonMenuItem);
		buttonGroupMenuItem.add(largeRadioButtonMenuItem);
		// Option menu end

		frame.setJMenuBar(menuBar);
		frame.setSize(800, 400);
		frame.setVisible(true);
		frame.setLocation(0, -500);
	}

	private final class MenuActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			label.setText(event.getActionCommand());	
		}
	}
	
	private final class MenuItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent event) {
		
		}
	}
}
