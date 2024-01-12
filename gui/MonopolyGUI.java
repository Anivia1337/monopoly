package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Spielfeld;

import java.awt.GridLayout;

@SuppressWarnings("serial")
public class MonopolyGUI extends JFrame{
	// Panels erstellen
	StartPanel start = new StartPanel();
	
	EreignisPanel ereignis1 = new EreignisPanel();
	EreignisPanel ereignis2 = new EreignisPanel();
	EreignisPanel ereignis3 = new EreignisPanel();
	EreignisPanel ereignis4 = new EreignisPanel();
	EreignisPanel ereignis5 = new EreignisPanel();
	EreignisPanel ereignis6 = new EreignisPanel();
	EreignisPanel ereignis7 = new EreignisPanel();
	
	GrundstueckPanel grundstueck1 = new GrundstueckPanel();
	GrundstueckPanel grundstueck2 = new GrundstueckPanel();
	GrundstueckPanel grundstueck3 = new GrundstueckPanel();
	GrundstueckPanel grundstueck4 = new GrundstueckPanel();
	GrundstueckPanel grundstueck5 = new GrundstueckPanel();
	GrundstueckPanel grundstueck6 = new GrundstueckPanel();
	GrundstueckPanel grundstueck7 = new GrundstueckPanel();
	GrundstueckPanel grundstueck8 = new GrundstueckPanel();
	
	SpielerPanel spieler1 = new SpielerPanel();
	SpielerPanel spieler2 = new SpielerPanel();
	
	WuerfelPanel wuerfel = new WuerfelPanel();
	
	JPanel placeholder1 = new JPanel();
	JPanel placeholder2 = new JPanel();
	JPanel placeholder3 = new JPanel();
	JPanel placeholder4 = new JPanel();
	JPanel placeholder5 = new JPanel();
	JPanel placeholder6 = new JPanel();
	JPanel placeholder7 = new JPanel();
	
	public MonopolyGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setLayout(new GridLayout(0,5));
        setResizable(false);
        // Panels hinzufügen ins GUI
        add(ereignis4);
        add(grundstueck5);
        add(ereignis5);
        add(grundstueck6);
        add(ereignis6);
        add(grundstueck4);
        add(spieler1);
        add(placeholder1);
        add(spieler2);
        add(grundstueck7);
        add(ereignis3);
        add(placeholder2);
        add(wuerfel);
        add(placeholder3);
        add(ereignis7);
        add(grundstueck3);
        add(placeholder4);
        add(placeholder5);
        add(placeholder6);
        add(grundstueck8);
        add(ereignis2);
        add(grundstueck2);
        add(ereignis1);
        add(grundstueck1);
        add(start);
        
        setVisible(true);
	}
	// Daten von Panels updaten
	public void updateGUI(Spielfeld spielfeld) {
		this.grundstueck1.setPreis(spielfeld.getFeld(1).getPreis());
		this.ereignis1.setErtrag(spielfeld.getFeld(2).getEtrag());
		this.grundstueck2.setPreis(spielfeld.getFeld(3).getPreis());
		this.ereignis2.setErtrag(spielfeld.getFeld(4).getEtrag());
		this.grundstueck3.setPreis(spielfeld.getFeld(5).getPreis());
		this.ereignis3.setErtrag(spielfeld.getFeld(6).getEtrag());
		this.grundstueck4.setPreis(spielfeld.getFeld(7).getPreis());
		this.ereignis4.setErtrag(spielfeld.getFeld(8).getEtrag());
		this.grundstueck5.setPreis(spielfeld.getFeld(9).getPreis());
		this.ereignis5.setErtrag(spielfeld.getFeld(10).getEtrag());
		this.grundstueck6.setPreis(spielfeld.getFeld(11).getPreis());
		this.ereignis6.setErtrag(spielfeld.getFeld(12).getEtrag());
		this.grundstueck7.setPreis(spielfeld.getFeld(13).getPreis());
		this.ereignis7.setErtrag(spielfeld.getFeld(14).getEtrag());
		this.grundstueck8.setPreis(spielfeld.getFeld(15).getPreis());
	}
}
