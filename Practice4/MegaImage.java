package Practice4;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Date;

public final class MegaImage extends Magazin implements Impozabil, Comparable<MegaImage>
{

	private String logo;
	private String locatii;
	private float cifraAfaceri;
	
	public MegaImage() 
	{
		super();
		logo = "Mega Image";
		locatii = "Bucuresti";
		cifraAfaceri = 164000f;
	}
	
	public MegaImage(String nume,double suprafata, int nrClienti, String logo, String locatii, float cifraAfaceri)
	{
		super(nume, suprafata, nrClienti);
		this.logo = logo;
		this.locatii = locatii;
		this.cifraAfaceri = cifraAfaceri;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLocatii() {
		return locatii;
	}

	public void setLocatii(String locatii) {
		this.locatii = locatii;
	}

	public float getCifraAfaceri() {
		return cifraAfaceri;
	}

	public void setCifraAfaceri(float cifraAfaceri) {
		this.cifraAfaceri = cifraAfaceri;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		MegaImage copie = (MegaImage)super.clone();
		copie.logo = logo;
		copie.locatii = locatii;
		copie.cifraAfaceri = cifraAfaceri;
		return copie;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		builder.append(getNume()+ "\n");
		builder.append("Suprafata: ");
		builder.append(getSuprafata()+"\n");
		builder.append("Numarul de clienti: ");
		builder.append(getNrCLienti()+"\n");
		builder.append("Logoul: ");
		builder.append(logo+"\n");
		builder.append("Locatiile: ");
		builder.append(locatii+"\n");
		builder.append("Cifra de afaceri: ");
		builder.append(cifraAfaceri+"\n");
		return builder.toString();
	}
	
	@Override
	public void deschideMagazin()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String str = sdf.format(new Date());
		System.out.println("Magazinul de deschide la ora: " + str);
	}
	
	
	@Override
	public double impozit()
	{
		return cifraAfaceri / 1.19;
	}
	
	@Override
	public int compareTo(MegaImage m)
	{
		if(getNrCLienti() < m.getNrCLienti())
		{
			return -1;
		}
		else if(getNrCLienti() == m.getNrCLienti())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof MegaImage)
		{
			MegaImage mega = (MegaImage)obj;
			return getNume().equals(mega.getNume()) && getLogo().equals(mega.logo);
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return 26 * (getNume().hashCode() + getLogo().hashCode());
	}
	
}
