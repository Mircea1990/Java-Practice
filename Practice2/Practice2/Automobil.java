package Practice2;

public class Automobil {

	private String producator;
	private float pret;
	private FuelType tipCombustibil;
	private int[] nrKm;
	
	public Automobil()
	{
		producator = "Necunoscut";
		pret = 0.0f;
		tipCombustibil = FuelType.Benzina;
		
	}
	
	public Automobil(String producator, float pret, FuelType tipCombustibil)
	{
		this.producator = producator;
		this.pret = pret;
		this.tipCombustibil = tipCombustibil;
		
	}
	
	public String getProducator()
	{
		return producator;
	}
	public void setProducator(String producator)
	{
		this.producator = producator;
	}
	
	public float getPret()
	{
		return pret;
	}
	public void setPret(float pret)
	{
		this.pret = pret;
	}
	
	public FuelType getFuel()
	{
		return tipCombustibil;
	}
	public void setFuel(FuelType tipCombustibil)
	{
		this.tipCombustibil = tipCombustibil;
	}
	
	public int[] getNrKilometri()
	{
		if(nrKm != null)
		{
			int[] copie = new int[nrKm.length];
			System.arraycopy(nrKm, 0, copie, 0, nrKm.length);
			return copie;
		}
		else
		{
			return null;
		}
	}
	
	public void setKm(int[] nrKm)
	{
		if(nrKm != null)
		{
			this.nrKm = new int[nrKm.length];
			for(int i = 0; i <nrKm.length; i++)
			{
				this.nrKm[i] = nrKm[i];
			}
		}
	}

	@Override
	protected Object clone()  {
		Automobil copie = new Automobil();
		copie.producator = producator;
		copie.pret = pret;
		copie.tipCombustibil = tipCombustibil;
		return copie;
	}
	
	
}
