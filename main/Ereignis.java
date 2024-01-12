package main;

public class Ereignis extends Feld{
	int ertrag;
	
	public Ereignis(int position, int ertrag) {
		super(position);
		this.ertrag = ertrag;
	}

	public int getEtrag() {
		return this.ertrag;
	}

	@Override
	public String getBesitzer() {
		return null;
	}

	@Override
	public int getPreis() {
		return 0;
	}
}
