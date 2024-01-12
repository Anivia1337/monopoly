package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WuerfelPanel extends JPanel implements ActionListener {
	private JButton wuerfeln = new JButton("Würfeln");
	private JButton beenden = new JButton("Zug beenden");
	private JLabel wuerfelZahl = new JLabel("0");
	
	WuerfelPanel() {
		add(wuerfelZahl);
		add(wuerfeln);
		add(beenden);
		wuerfeln.addActionListener(this);
		beenden.addActionListener(this);
		beenden.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == wuerfeln) {
			
		} if (e.getSource() == beenden) {
			
		}
	}
}
