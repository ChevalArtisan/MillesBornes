package carte;

import jeu.Joueur;

public class Botte extends Probleme{

	@Override
	public String toString() {
		String retour="";
		switch (getType()) {
		case FEU: {
			retour="Le vehicule prioritaire immunise contre les feux rouges";
			break;
		}
		case ESSENCE: {
			retour="La Citerne d'essence immunise contre les pannes d'essence";
			break;
		}
		case ACCIDENT: {
			retour="L'As du volant immunise contre les accidents";
			break;
		}
		case CREVAISON: {
			retour="Increvable immunise contre les crevaisons";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
			
		}
		return retour;
	}
	
	
	public Botte(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean appliquer(Joueur j) {
		for(Botte b:j.getBottes()) {
			if (this.getType()==b.getType()) {
				return false;
			}
		}
		for(Bataille b :j.getBataille()) {
			if (this.getType()==b.getType()) {
				j.getBataille().remove(this);
		}}
		
		if(this.getType()==Type.FEU) {
			j.getLimites().clear();
		}
		j.getMain().jouer(this);
		return true;
	}


}
