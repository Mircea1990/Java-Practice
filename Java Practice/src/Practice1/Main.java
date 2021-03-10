package Practice1;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setGrade(10);
		System.out.println(s1.getGrade());
		
		Student s2 = new Student("Mihai", 7.4f);
		System.out.println(s2.getName());
		System.out.println(s2.getGrade());

	}

}
