package Practice5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class main 
{

	public static void main(String[] args) 
	{
		
		
		Car car1 = new Car("Suzuki", 190, "SUV", "Black", 1.4, 1230.24);
		
		System.out.println(car1.toString());
		
		Car car2 = new Car("Opel", 220, "Sedan", "Blue", 2.2, 1454.62);
		System.out.println();
		System.out.println(car2.toString());
		System.out.println();
		car2.drive();
		System.out.println();
		Speed speed = new Car();
		System.out.println("Car1 speed compared to Car2: "); 
		speed.speedCompare(car1, car2);
		
		System.out.println();
		
		speed.speedBoost(car1);
		
		System.out.println();
		System.out.println("Car1 compare to car2: " + car1.compareTo(car2));
		
		System.out.println();
		System.out.println("Are the 2 cars equal ? \n" + car1.equals(car2));
		
		System.out.println();
		
		Car car3 = new Car();
		if(car3 instanceof Cloneable)
		{
			try {

				car3 = (Car) car2.clone();
				System.out.println("---------Car 3(cloning)---------\n" + car3.toString());
			} catch (CloneNotSupportedException e) {

				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("---------List of integers---------");
		List<Integer> list = new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Iterator<Integer> it;
		for(it = list.iterator(); it.hasNext();)
		{
			System.out.print(it.next() + ", ");
		}
		System.out.println("\n");
		
		
		System.out.println("---------Set of doubles---------");
		Set<Double> list2 = new TreeSet<Double>();
		list2.add(14.45);
		list2.add(84.415);
		list2.add(-154.75);
		list2.add(-4.46);
		list2.add(104.75);
		
		for(Double d : list2)
		{
			System.out.print(d + ", ");
		}
		System.out.println("\n");
		
		Car car4 = new Car("Honda", 234, "Estate", "Yellow", 2.4, 1640.845);
		Car car5 = new Car("Smart", 145, "Coupe", "Green", 1.2, 994.78);
		Car car6 = new Car("Ford", 204, "Sedan", "Silver", 2.5, 1545.45);
		Map<String, Car> map = new TreeMap<String, Car>();
		map.put("Honda Key", car4);
		map.put("Smart Key", car5);
		map.put("Ford Key", car6);
		
		System.out.println("---------Map of Cars---------");
		for(String x : map.keySet())
		{
			System.out.printf("%s", x.toString());
			System.out.println("\n" + map.get(x) + "\n");
		}
		
		Car x = new Car();
		System.out.println("---------Writing to a text file---------\n");
		car1.writeToTextFile();
		
		System.out.println("---------Reading from a text file---------");
		
		x.readFromTextFile();
		
		System.out.println("---------Writing to a binary file---------\n");
		car2.serialize();
		
		System.out.println("---------Reading from a binary file---------\n");
		car2.deserialize();
		
	}

	

	
}
