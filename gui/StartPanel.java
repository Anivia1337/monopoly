package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

@SuppressWarnings("serial")
public class StartPanel extends JPanel{
	JLabel label = new JLabel();
	
	StartPanel() {
		label.setText("Start");
		add(label);
		setBackground(Color.green);
		
	}
	
}
