package jeu;

import java.util.Iterator;
import java.util.NoSuchElementException;

import carte.Carte;

public class Sabot implements Iterator<Carte>{
	private Carte[] cartes;
	private int nbCartes=0;
	private int indiceIterateur=0;
	private boolean nextFait=false;

	public Sabot(int tailleSabot) {
		super();
		this.cartes =new Carte[tailleSabot];
	}
	
	public boolean estVide() {
		if (nbCartes==0) {
			return true;
		}else {
			return false;
		}
	}
	
	private void ajouterCarte(Carte carte) {
		if (nbCartes< cartes.length) {
			cartes[nbCartes++]=carte;
		}
		else {throw new IndexOutOfBoundsException("Sabot plein");
	}
	}
	
	public void ajouterFamilleCarte(Carte carte) {
		for (int i = 0; i < carte.getNombre(); i++) {
			ajouterCarte(carte);
		}
	}
	public void ajouterFamilleCartes(Carte... carte) {
		for (int i = 0; i < carte.length; i++) {
			//TODO
		}
	}

	@Override
	public boolean hasNext() {
		return indiceIterateur<nbCartes;
	}

	@Override
	public Carte next() {
		if (hasNext()) {
			Carte carte=cartes[indiceIterateur++];
			nextFait=true;
			return carte;
			
		}else {
			throw new NoSuchElementException();
		}
		
	}
	
	@Override
	public void remove() {
		if(nbCartes<1 || !nextFait) {
			throw new IllegalStateException();
		}
		else {
			for(int i = indiceIterateur-1;i<nbCartes;i++) {
				cartes[i]=cartes[i+1];
			}
		nextFait=false;
		indiceIterateur--;
		nbCartes--;
		}
	}
	
	public Carte pioche() {
		indiceIterateur=0;
		Carte carte=next();
		remove();
		System.out.println("Je pioche"+carte.toString());
		return carte;
	}
	
}
