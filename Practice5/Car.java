package Practice5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public final class Car extends Vehicle implements Speed, Comparable<Car>
{
	private String color;
	private double engine;
	private double weigth;
	
	public Car()
	{
		super();
		color = "NULL";
		engine = 0.0;
		weigth = 0.0;
	}
	
	public Car(String name, int speed, String type, String color, double engine, double weigth)
	{
		super(name,  speed,  type);
		this.color = color;
		this.engine = engine;
		this.weigth = weigth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	

	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Name: ");
		builder.append(getName());
		builder.append("\nSpeed: ");
		builder.append(getSpeed() + " km/h");
		builder.append("\nType of the car: ");
		builder.append(getType());
		builder.append("\nColor: ");
		builder.append(color);
		builder.append("\nEngine: ");
		builder.append(engine + " L");
		builder.append("\nWeigth: ");
		builder.append(weigth + " kg");
		return builder.toString();
		
	}

	@Override
	public void drive() 
	{
		System.out.println("The car is driving at speed of " + getSpeed() + " hm/h");
		
	}

//	Car createCar()
//	{
//		Car x = new Car();
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		System.out.println("Enter the name of your car: ");
//		if(scanner.hasNext())
//		{
//			x.setName(scanner.next());
//		}
//		
//		
//		System.out.println("Enter the speed of your car: ");
//		if(scanner.hasNextInt())
//		{
//			x.setSpeed(scanner.nextInt());
//		}
//		
//		
//		System.out.println("Enter the type of your car: ");
//		if(scanner.hasNext())
//		{
//			x.setType(scanner.next());
//		}
//		
//		
//		System.out.println("Enter the color of your car: ");
//		if(scanner.hasNext()) 
//		{
//			x.setColor(scanner.next());
//		}
//		
//		
//		System.out.println("Enter the engine size of your car: ");
//		if(scanner.hasNextDouble())
//		{
//			x.setEngine(scanner.nextDouble());
//
//		}
//		
//		System.out.println("Enter the weigth of your car: ");
//		if(scanner.hasNextDouble())
//		{
//			x.setWeigth(scanner.nextDouble());
//		}
//		scanner.close();
//		
//		return x;
//	}
	
	@Override
	public void speedCompare(Car x, Car y) 
	{
		if(x.getSpeed()>y.getSpeed())
		{
			System.out.println("First car si faster");
		}
		else
		{
			System.out.println("Second car si faster");
		}
		
	}

	@Override
	public int speedBoost(Car x) {
		System.out.println("How much boost speed you whant ? ");
		int boost =0;
		Scanner scaner = new Scanner(System.in);
		boost = scaner.nextInt();
		boost += x.getSpeed();
		scaner.close();
		System.out.println("Your " + x.getName()+ " can now reach a speed of " +boost + " km/h");
		return 0;
	}

	@Override
	public int compareTo(Car o) 
	{
		if(getWeigth() < o.getWeigth())
		{
			return -1;
		}
		else if(getWeigth() == o.getWeigth())
		{
			return 0;
		}
		else
		{
			return 1;
		}
			
	}

	@Override
	public int hashCode() 
	{
		
		return 31 * (color.hashCode() * getName().hashCode() * getType().hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car)
		{
			Car c = (Car)obj;
			return getName().equals(obj) && getSpeed() == c.getSpeed() &&
					getType() == c.getType() && color.equals(c) &&
					engine == c.engine && weigth == c.engine;
			
		}
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Car copy = (Car)super.clone();
		copy.color = color;
		copy.engine = engine;
		copy.weigth = weigth;
		return copy;
	}

	public void writeToTextFile()
	{
		try {
			FileOutputStream fos = new FileOutputStream("CarFile.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(getName());
			bw.write(System.lineSeparator());
			Integer speed = getSpeed();
			bw.write(speed.toString());
			bw.write(System.lineSeparator());
			bw.write(getType());
			bw.write(System.lineSeparator());
			bw.write(color);
			bw.write(System.lineSeparator());
			Double eng = (double)engine;
			bw.write(eng.toString());
			bw.write(System.lineSeparator());
			Double wei = (double)weigth;
			bw.write(wei.toString());
			bw.write(System.lineSeparator());
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void readFromTextFile()
	{
		try {
			FileInputStream fis = new FileInputStream("CarFile.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String name = br.readLine();
			int speed = Integer.parseInt(br.readLine());
			String type = br.readLine();
			String color = br.readLine();
			Double engine = Double.parseDouble(br.readLine());
			Double weigth = Double.parseDouble(br.readLine());
			br.close();
			Car x = new Car(name,speed,type,color,engine,weigth);
			System.out.println(x);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void serialize()
	{
		try {
			FileOutputStream fos = new FileOutputStream("CarBinFile.bin");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF(getName());
			dos.writeInt(getSpeed());
			dos.writeUTF(getType());
			dos.writeUTF(color);
			dos.writeDouble(engine);
			dos.writeDouble(weigth);
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void deserialize()
	{
		try {
			FileInputStream fis = new FileInputStream("CarBinFile.bin");
			DataInputStream dis = new DataInputStream(fis);
			String name = dis.readUTF();
			int speed = dis.readInt();
			String type = dis.readUTF();
			String color = dis.readUTF();
			Double engine = dis.readDouble();
			Double weigth = dis.readDouble();
			Car x = new Car(name,speed,type,color,engine,weigth);
			System.out.println(x);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
