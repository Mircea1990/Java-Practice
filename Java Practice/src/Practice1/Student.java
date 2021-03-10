package Practice1;

public class Student {
	private String name;
	private float grade;
	
	public Student()
	{
		name ="Necunoscut";
		grade = 0;
	}
	
	public Student(String name, float grade)
	{
		this.name = name;
		this.grade = grade;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		if(name != null)
		{
			this.name = name;
		}
	}
	
	public float getGrade()
	{
		return grade;
	}
	public void setGrade(float grade)
	{
		if(grade > 0)
		{
			this.grade = grade;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Student: " + this.getName() + "\n, Nota:" + this.getGrade() ;
	}

	public Student myClone()
	{
		Student copie = new Student();
		copie.name = name;
		copie.grade = grade;
		return copie;
	}
	
	

}
