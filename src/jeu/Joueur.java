package jeu;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import carte.Bataille;
import carte.Borne;
import carte.Botte;
import carte.Carte;
import carte.Coup;
import carte.Limite;
import carte.Probleme;

public class Joueur {

	private String nom;
	private List<Limite> limites;
	private List<Bataille> bataille;
	private Collection<Borne> bornes;
	private Set<Botte> bottes;
	private Main main;
	
	public void donner(Carte carte) {
		main.prendre(carte);
	}
	
	public Carte prendreCarte(List<Carte> sabot) {
		if (sabot.isEmpty()){
			return null;
		}else {
			return sabot.get(0);
		}
	}
	
	public HashSet<Coup> coupsPossibles(List<Joueur> participants){
		HashSet<Coup> coups = new HashSet<>();
		for(Joueur j: participants) {
			for(Carte c : j.getMain()) {
				Coup coup = new Coup(c,j);
				if (coup.estValide(j)){
					coups.add(coup);
				}
			}
		}
		return coups;
	}
	
	public HashSet<Coup>coupsParDefaut(){
		HashSet<Coup> coups = new HashSet<>();
		for(Carte c : getMain()) {
			Coup coup = new Coup(c,null);
			if (coup.estValide(this)){
				coups.add(coup);
			}
		}
		return coups;
	}
	
	public int getKM() {
		int total=0;
		for (Borne borne: bornes) {
			total+=borne.getkm();
		}
		return total;
	}
	
//	public int getLimite() {
//		if (limites.isEmpty()||bottes.contains(new Botte())) {
//			return 200;
//		}
//	}

	public boolean estBloque() {
		return true;
	}

	public boolean equals(Object obj) {
		if( obj instanceof Joueur) {
			Joueur joueur=(Joueur)obj;
			return joueur.toString().equals(nom);
			}
					
		else 
			return false;
	}

	public String toString() {
		return nom;
	}
	
	public Main getMain() {
		return main;
	}

	public Set<Botte> getBottes() {
		return bottes;
	}

	public List<Bataille> getBataille() {
		return bataille;
	}

	public List<Limite> getLimites() {
		return limites;
	}

}
	
	


