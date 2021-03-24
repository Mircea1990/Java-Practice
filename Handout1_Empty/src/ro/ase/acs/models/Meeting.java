package ro.ase.acs.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meeting implements Cloneable
{
    private String name;
    private int startTime;
    private int endTime;
    private Priority priority;
    /*
     * Add an array of strings called participants as a private attribute and
     * instantiate it with null
     */
    private String participants[] = null;

    /*
     * Add two constructors to the class - a default constructor which initializes
     * the name with an empty string, the starTime with 0 and the endTime with 1 - a
     * constructor with 3 parameters: name, startTime, duration (the value of the
     * endTime will be computed based on the duration)
     */
    public Meeting()
    {
	name = "";
	startTime = 0;
	endTime = 0;
	priority = Priority.low;
    }

    public Meeting(String name, int startTime, int duration)
    {
	this.name = name;
	this.startTime = startTime;
	this.endTime = startTime + duration;
	priority = Priority.low;
    }

    public int getEndTime()
    {
	return endTime;
    }

    public void setEndTime(int endTime)
    {
	if (endTime > 0)
	{
	    this.endTime = endTime;
	}
	else
	{
	    endTime = 0;
	}
    }

    /* Create a getter and a setter for the name field (getName/setName) */
    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	if (name != "")
	{
	    this.name = name;
	}
	else
	{
	    name = "";
	}
    }

    public Priority getPriority()
    {
	return priority;
    }

    public void setPriority(Priority priority)
    {
	this.priority = priority;
    }

    /*
     * Create getters and setters for the array that are creating deep copies
     * (getParticipants/setParticipants)
     */
    public String[] getParticipants()
    {
	if (participants != null)
	{
	    String[] copy = new String[participants.length];
	    System.arraycopy(participants, 0, copy, 0, participants.length);

	    return copy;
	}
	else
	{
	    return null;
	}
    }

    public void setParticipants(String[] participants)
    {
	if (participants != null)
	{
	    this.participants = new String[participants.length];
	    for (int i = 0; i < participants.length; i++)
	    {
		this.participants[i] = participants[i];
	    }
	}
	else
	{
	    participants = null;
	}
	System.out.println();
    }

    @Override
    public String toString()
    {
	System.out.print("--------The object atributs--------");
	StringBuilder sb = new StringBuilder();
	sb.append("\nName: " + name);
	sb.append("\nStart Time: " + startTime);
	sb.append("\nEnd Time: " + endTime);
	sb.append("\nPriority: " + priority);
	sb.append("\nParticipants: ");

	if (participants != null)
	{
	    for (int i = 0; i < participants.length; i++)
	    {
		sb.append(participants[i]).append(", ");
	    }
	}

	return sb.toString();

    }

    /*
     * Override the Clone method and make it public the method will create a deep
     * copy
     */
    @Override
    public Object clone() throws CloneNotSupportedException
    {
	Meeting copy = (Meeting) super.clone();
	copy.name = name;
	copy.startTime = startTime;
	copy.endTime = endTime;
	copy.priority = priority;
	copy.participants = getParticipants();

	return copy;
    }

    /*
     * Create a public method with the following signature boolean
     * checkParticipant(String) which checks if the provided participant is in that
     * meeting or not
     */
    public boolean checkParticipant(String participant)
    {
	if (Arrays.asList(participants).contains(participant))
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }

    /*
     * Concatenate two meetings by implementing the following public method void
     * concatenate(Meeting) The method concatenates the existing meeting with the
     * new one in the following manner: - the names will be concatenated and
     * separated by a slash (eg. "Meeting1" + "Meeting2" will become
     * "Meeting1/Meeting2") - the startTime will be the minimum of the two - the
     * endTime will be the maximum of the two - the priority will be the highest one
     * - the participants will be the ones from both meetings, but they should
     * appear only once in the array
     */
    public void concatenate(Meeting m1, Meeting m2)
    {
	System.out.print("Meetings: ");
	m1.name += "/" + m2.name;
	System.out.println(m1.name);

	if (m1.startTime < m2.startTime)
	{
	    System.out.println("Minimium start time: " + m1.startTime);
	}
	else
	{
	    System.out.println("Minimium start time: " + m2.startTime);
	}

	if (m1.endTime > m2.endTime)
	{
	    System.out.println("Maximum end time: " + m1.endTime);
	}
	else
	{
	    System.out.println("Maximum end time: " + m2.endTime);
	}

	if(m1.priority == Priority.high)
	{
	    System.out.println("Highest priority");
	}
	else
	{
	    System.out.println( "Highest priority");
	}

	List<String> list = new ArrayList<>();
	for (int i = 0; i < m1.participants.length; i++)
	{
	    list.add(m1.participants[i]);
	}
	for (int i = 0; i < m2.participants.length; i++)
	{
	    list.add(m2.participants[i]);
	}
	    System.out.println("Meeting participants: " + list+ ", ");


    }
}
