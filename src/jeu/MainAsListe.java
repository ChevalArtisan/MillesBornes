package jeu;

import java.util.Iterator;
import java.util.List;

import carte.Carte;

public class MainAsListe implements Main{
	private List<Carte> cartes;
	@Override
	public Iterator<Carte> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prendre(Carte carte) {
		cartes.add(carte);
		
	}

	@Override
	public void jouer(Carte carte) {
		assert cartes.equals(carte);
		int i= cartes.indexOf(carte);
		cartes.remove(i);
		
	}
	
}
