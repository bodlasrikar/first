
public class Switchy 
{
 public static void main(String[] args)
 {
	String n="abc";
	switch(n)// we can use int,char,string for switch case
	{
	case "abc":System.out.println("one");
	break;
	case "pqr":System.out.println("two");
	break;
	case "xyz":System.out.println("three");
	break;
	case "ert":System.out.println("four");
	break;
default:System.out.println("no match");
	}
}
}
