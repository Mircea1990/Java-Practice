package Practice4;

public abstract class Magazin implements Cloneable
{
	private String nume;
	private double suprafata;
	private int nrCLienti;
	
	public Magazin()
	{
		nume = "Necunoscut";
		suprafata = 0.0;
		nrCLienti = 0;
	}
	public Magazin(String nume, double suprafata, int nrClienti) 
	{
		this.nume = nume;
		this.suprafata = suprafata;
		this.nrCLienti = nrClienti;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public double getSuprafata() {
		return suprafata;
	}
	public void setSuprafata(double suprafata) {
		this.suprafata = suprafata;
	}
	public int getNrCLienti() {
		return nrCLienti;
	}
	public void setNrCLienti(int nrCLienti) {
		this.nrCLienti = nrCLienti;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Magazin copie = (Magazin)super.clone();
		copie.nume = nume;
		copie.suprafata = suprafata;
		copie.nrCLienti = nrCLienti;
		return copie;
	}
	
	public abstract void deschideMagazin();

}
