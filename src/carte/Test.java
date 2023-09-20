package carte;

import carte.Probleme.Type;

public class Test {
	public static void main(String[] args) {
		Botte botte = new Botte(4,Type.FEU);
		System.out.println(botte.toString());
		Attaque	attaque = new Attaque(115,Type.ACCIDENT);
		System.out.println(attaque.toString());
		
	}

}
