package Practice3;

public class Autoturism extends Vehicul implements Taxabil{

	private String culoare;
	private int capCilindrica;
	private int pret;
	private String caroserie;
	
	public Autoturism()
	{
		super();
		culoare = "Null";
		capCilindrica = 0;
		pret = 0;
		caroserie = "Null";
	}
	
	public Autoturism(String culoare, int capCilindrica, int pret, String caroserie)
	{
		this.culoare = culoare;
		this.capCilindrica = capCilindrica;
		this.pret = pret;
		this.caroserie = caroserie;
	}
	
	public String getCuloare()
	{
		System.out.println("Culoarea: ");
		return culoare;
	}
	public void setCuloare(String culoare)
	{
		this.culoare = culoare;
	}
	
	public int getCapacitate()
	{
		System.out.println("Capacitatea: ");
		return capCilindrica;
	}
	public void setCapacitate(int capacitate)
	{
		this.capCilindrica = capacitate;
	}
	
	public int getPret()
	{
		System.out.println("Pretul: ");
		return pret;
	}
	public void setPret(int pret)
	{
		this.pret = pret;
	}
	
	public String getCaroserie()
	{
		System.out.println("Caroseria: ");
		return caroserie;
	}
	public void setCaroserie(String caroserie)
	{
		this.caroserie = caroserie;
	}
	
	@Override
	public double computeTAX()
	{
		int taxa = 0;
		switch (capCilindrica) 
		{
		case 1200: 
		{
			System.out.println("Taxa este de: ");
			taxa = 100;
			break;
		}
		case 1500:
		{
			System.out.println("Taxa este de: ");
			taxa = 150;
			break;
		}
		case 1800:
		{
			System.out.println("Taxa este de: ");
			taxa = 200;
			break;
		}
		case 2000:
		{
			System.out.println("Taxa este de: ");
			taxa = 250;
			break;
		}
		default:
			System.out.println("Taxa este de: ");
			taxa = 340;
			break;
		}
		return taxa;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Autoturism copie = (Autoturism)super.clone();
		copie.culoare = culoare;
		copie.capCilindrica = capCilindrica;
		copie.pret = pret;
		copie.caroserie = caroserie;
		return copie;
	}
	
	public final void move()
	{
		System.out.println("Autoturismul se deplaseaza! ");
	}
	
	@Override
	public String toString()
	{
		return "Automobil\n " + "\nCuloare: " + culoare + "\nCapacitate Cilindrica: " + capCilindrica+" cm cubi" + "\nPret: " + pret +" Euro"+ "\nCaroserie: " + caroserie;
	}
}
