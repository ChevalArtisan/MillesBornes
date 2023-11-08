package carte;

import jeu.Joueur;

public class Borne extends Carte{
	private int km;
	public Borne(int nombre, int km) {
		super(nombre);
		this.km=km;
	}
	public int getkm() {
		return km;
	}

	@Override
	public String toString() {
		return "Avancez de "+ getkm()+"bornes";
	}
	public boolean equals(Object obj) {
	if(obj instanceof Borne) {
		Borne borne=(Borne)obj;
		return borne.getkm()==km && borne.getClass().equals(getClass());
		}
				
	else 
		return false;
}
	@Override
	public boolean appliquer(Joueur j) {
		if(j.estBloque()&&j.getKM()<1000) {
			j.getMain().jouer(this);
			return true;
		}
		return false;
	}
}
