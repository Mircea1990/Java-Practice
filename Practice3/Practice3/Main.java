package Practice3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main 
{
	public static void main(String[] args) 
	{
			
		Autoturism a = new Autoturism();
		System.out.println(a.toString());
		System.out.println();
		
		Autoturism auto = new Autoturism("Negru",1500,22000,"Sedan");		
		System.out.println(auto.toString());
		
		System.out.println();
		Taxabil tax = auto;
		double t = tax.computeTAX();
		System.out.println(t);
		
		System.out.println();
		Vehicul v = new Autoturism();
		v.move();

		System.out.println();
		if(auto instanceof Cloneable)
		{
			Autoturism auto2;
			try
			{
				auto2 = (Autoturism)auto.clone();
				auto2.setCapacitate(2000);
				System.out.println(auto2.getCapacitate());
				System.out.println(auto.getCapacitate());
			}
			catch (CloneNotSupportedException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println();
		Integer x = 25;
		int y = x;
		System.out.println(y);
		double d = x;
		System.out.println(d);
		
		System.out.println();
		List<Double> list = new ArrayList();
		list.add(45.15);
		list.add(-17.12);
		list.add(2.75);
		
		for(int i = 0; i<list.size(); i++)
		{
			System.out.print(list.get(i) + ", ");
		}
		
		System.out.println();
		list.remove(-17.12);
		list.add(1, 95.74);
		for(Double i : list)
		{
			System.out.print(i+", ");
		}
		
		System.out.println();
		list.set(2, null);
		for(Double i : list)
		{
			System.out.print(i + ", ");
		}
		
		System.out.println();
		Iterator<Double> it ;
		for(it = list.iterator(); it.hasNext();)
		{
			System.out.print(it.next()+ ", ");
		}
	}

}
