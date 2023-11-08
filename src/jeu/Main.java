package jeu;
import carte.Carte;


public interface Main extends Iterable<Carte>{
	
	public void prendre(Carte carte);
	
	public void jouer(Carte carte) ;
	

}
