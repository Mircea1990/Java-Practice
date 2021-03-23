package Practice5;

public abstract class Vehicle implements Cloneable
{
	private String name;
	private int speed;
	private String type;
	
	public Vehicle()
	{
		name = "Unknown";
		speed = 0;
		type = "Unknown";
	}
	
	public Vehicle(String name, int speed, String type)
	{
		this.name = name;
		this.speed =speed;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void drive();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Vehicle copy = (Vehicle)super.clone();
		copy.name = name;
		copy.speed = speed;
		copy.type = type;
		return copy;
	}
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Car name: " + name);
		builder.append("Car speed: " + speed);
		builder.append("Car type: " + type);
		return builder.toString();	
	}
}
