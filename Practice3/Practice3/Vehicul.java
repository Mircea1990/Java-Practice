package Practice3;

public abstract class Vehicul implements Cloneable
{
	private String nume;
	private int viteza;
	
	public Vehicul()
	{
		nume = "Necunoscut";
		viteza = 0;
	}
	
	public Vehicul(String nume, int viteza)
	{
		this.nume = nume;
		this.viteza = viteza;
	}
	
	public String getNume()
	{
		return nume;
	}
	public void setNume(String nume)
	{
		this.nume = nume;
	}
	
	public int getViteza()
	{
		return viteza;
	}
	public void setViteza(int viteza)
	{
		this.viteza = viteza;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Vehicul copie = (Vehicul)super.clone();
		copie.nume = nume;
		copie.viteza = viteza;
		return copie;
	}
	
	public abstract void move();
		
}


