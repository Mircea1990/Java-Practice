package Practice4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Main 
{
	static void add(MegaImage x, MegaImage y)
	{
		x = new MegaImage(null, x.getCifraAfaceri(), x.getNrCLienti(), null, null, 0);
		x.setCifraAfaceri(x.getCifraAfaceri()+ x.getNrCLienti());
	}

	public static void main(String[] args) {
		Impozabil i = new MegaImage("Mega Image", 124.455,10000,"Mega","Bucuresti",1450.4544f);
		System.out.println(i.impozit());
		
		Magazin m = new MegaImage();
		m.deschideMagazin();
		
		System.out.println();
		MegaImage mega = new MegaImage("Magazin Mega", 2345.45,450000, "Shop & Go","Romania", 4524.451f);
		System.out.println(mega.getCifraAfaceri());
		MegaImage mega2 = new MegaImage("Magazin Mega", 2345.45,250000, "Shop & Go","Romania", 4524.451f);
		System.out.println(mega2.compareTo(mega));
		
		MegaImage mega3 = null;
		if(mega2 instanceof Cloneable)
		{
			try
			{
				mega3 = (MegaImage)mega.clone();
				mega.setNrCLienti(150);
				System.out.println(mega3.getNrCLienti());
				System.out.println(mega.getNrCLienti());
			}
			catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		
		List<MegaImage> lista = new Vector<MegaImage>();
		lista.add(new MegaImage("Magazin Mega", 3445.45,3500, "Shop & Go","Brasov", 456.751f));
		lista.add(new MegaImage("Magazin Mega", 45.45,300, "Shop & Go","Mircurea Ciuc", 10456.751f));

		for(int i1 = 0; i1<lista.size(); i1++)
		{
			System.out.println(lista.toString());
		}
		
		System.out.println();
		Map<MegaImage, String> map = new HashMap<MegaImage, String>();
		map.put(mega2, "Magazin Universal");
		
		for(MegaImage x : map.keySet())
		{
			
			System.out.printf("%s", x.toString());
			System.out.print("Tipul magazinului: ");
			System.out.println(map.get(x));
		}
	}

}
