package carte;
import jeu.Joueur;

public class Coup {

	
	private Carte carte;
	private Joueur joueurCible;
	
	public Coup(Carte carte, Joueur joueurCible) {
		super();
		this.carte = carte;
		this.joueurCible = joueurCible;
	}
	
	public boolean estValide(Joueur j) {
		if (joueurCible==j && (carte instanceof Attaque || carte instanceof Limite)) {
			return false;
		}else return true;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof Coup) {
			Coup coup=(Coup)obj;
			return coup.getCarte().equals(carte)&&coup.getJoueurCible().equals(joueurCible) && coup.getClass().equals(getClass());
			}
					
		else 
			return false;
	}
	
	public int hashCode() {
		return 31*carte.hashCode()*joueurCible.hashCode();
	}
	
	public Carte getCarte() {
		return carte;
	}
	
	public Joueur getJoueurCible() {
		return joueurCible;
	}
	
}
