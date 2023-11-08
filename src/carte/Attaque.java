package carte;

import jeu.Joueur;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);

	}
	@Override
	public String toString() {
		String retour="";
		switch (getType()) {
		case FEU: {
			retour="Le feu rouge vous arrete jusqu'à ce que vous posiez une carte feu vert";
			break;
		}
		case ESSENCE: {
			retour="La panne d'essence vous arrete jusqu'à ce que vous posiez une carte essence";
			break;
		}
		case ACCIDENT: {
			retour="L'accident vous arrete jusqu'à ce que vous posiez une carte reparations";
			break;
		}
		case CREVAISON: {
			retour="La crevaison vous arrete jusqu'à ce que vous posiez une carte roue de secours";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
			
		}
		return retour;
	}
	@Override
	public boolean appliquer(Joueur j) {
		
		return false;
	}

}
