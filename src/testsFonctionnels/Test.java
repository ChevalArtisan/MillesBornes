package testsFonctionnels;

import carte.Attaque;
import carte.Parade;
import carte.Probleme;
import carte.Probleme.Type;
import jeu.Sabot;
import carte.Borne;

public class Test {
 public static void main(String[] args) {
	Sabot sabot=new Sabot(110);
	Parade probleme = new Parade(6,Type.ACCIDENT);
	Parade probleme1 = new Parade(7,Type.ACCIDENT);
	Attaque atat=new Attaque(4654, Type.ACCIDENT);
	Borne ef1=new Borne(10,150);
	Borne ef2=new Borne(1,60);
	System.out.println(ef1.equals(ef2));
}
}
