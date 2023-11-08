package carte;

import carte.Probleme.Type;
import jeu.Joueur;

public class FinLimite extends Limite {

	public FinLimite(int nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean appliquer(Joueur j) {
		for (Botte b : j.getBottes()) {
			if(b.getType()==Type.FEU) {
				return false;
			}
		}
		if(!j.getLimites().isEmpty()) {
			return false;
		}
		j.getMain().jouer(this);
		return true;
		
	}

}
