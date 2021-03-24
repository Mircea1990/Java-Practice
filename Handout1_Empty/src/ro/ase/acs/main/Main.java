package ro.ase.acs.main;

import ro.ase.acs.models.Meeting;
import ro.ase.acs.models.Priority;

public class Main
{
    public static void main(String[] args)
    {
	// Playground

	Meeting meet1 = new Meeting();
	meet1.setName("First Meeting");
	System.out.println(meet1.toString());

	Meeting meet2 = new Meeting("Second Meeting", 20, 10);
	Meeting meet3 = new Meeting("Third Meeting", 100, 150);

	System.out.println();
	System.out.println("Second Meeting end time: " + meet2.getEndTime());
	System.out.println("Third Meeting end time: " + meet3.getEndTime());

	String[] participants =	{ "Mike", "Jim", "Cristofor" };
	meet2.setParticipants(participants);
	String[] names = meet2.getParticipants();

	for (String x : names)
	{
	    System.out.print(x + ", ");
	}
	
	String[] participants2 ={ "John", "Gaga", "Angelina" };
	meet3.setParticipants(participants2);
	String[] names2 = meet3.getParticipants();

	for (String x : names2)
	{
	    System.out.print(x + ", ");
	}
	
	System.out.println("\n");
	System.out.println(meet2.toString() + "\n");
	System.out.println(meet3.toString() + "\n");

	System.out.println("Second Meeting priority: " + meet2.getPriority());
	meet1.setPriority(Priority.high);
	System.out.println("First Meeting priority: " + meet1.getPriority());
	System.out.println();

	System.out.println("-------Meetings concatenation-------");
	meet1.concatenate(meet2, meet3);
    }

}