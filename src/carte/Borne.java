package carte;

public class Borne extends Carte{
	private int km;
	public Borne(int nombre, int km) {
		super(nombre);
		this.km=km;
	}
	public int getkm() {
		return km;
	}

	@Override
	public String toString() {
		return "Avancez de "+ getkm()+"bornes";
	}
	
}
