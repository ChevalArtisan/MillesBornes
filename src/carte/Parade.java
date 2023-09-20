package carte;

public class Parade extends Bataille {

	public Parade(int nombre, Type type) {
		super(nombre, type);
	}
	@Override
	public String toString() {
		String retour;
		switch (getType()) {
		case FEU: {
			retour="Le feu vert annule feu rouge";
			break;
		}
		case ESSENCE: {
			retour="La carte essence annule la panne d'essence";
			break;
		}
		case ACCIDENT: {
			retour="La carte reparations annule l'accident";
			break;
		}
		case CREVAISON: {
			retour="La roue de secours annule la crevaison";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
			
		}
		return retour;
	}
}
