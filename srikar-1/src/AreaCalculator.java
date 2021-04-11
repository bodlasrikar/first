package execises;

public class AreaCalculator {
	private static final double PI = 3.14;
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static void main(String[] args) {
		
		System.out.println(area(5));
		
		System.out.println(area(20,9));
		
		System.out.println(area(-6));
			
	}
	public static String area(double radius) {
		if(radius<0)
		{
			return INVALID_VALUE_MESSAGE;
		}
		return "AREA OF CIRCLE = " + (radius*radius*PI) ;
	}
	public static String area(double length,double breadth) {
		if(length<0||breadth<0) {
			return INVALID_VALUE_MESSAGE;
		}
		return "Area of Rectangle = " + length*breadth;
		
	}


}
