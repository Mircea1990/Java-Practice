package Practice2;

public class main {

	public static void main(String[] args) {
		
		
		Automobil a1 = new Automobil("Mercedes", 12000, FuelType.Hybrid);
		
		System.out.println(a1.getProducator());
		System.out.println(a1.getFuel());
		System.out.println(a1.getNrKilometri());
		
		Automobil a2 = (Automobil)a1.clone();
		a1.setPret(22000);
		a1.setProducator("Ford");
		
		System.out.println(a1.getPret());
		System.out.println(a1.getProducator());

	}

}
