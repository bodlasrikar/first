package execises;

public class FeetAndInchToCentimeters {
	
	public static void main(String[] args) {
		calcFeetAndInchToCentimeters(5,3.4);
		calcFeetAndInchToCentimeters(155);

	}
		public static double calcFeetAndInchToCentimeters(double f,double i) {
		double c;
		if(f<0 || (i<0 || i>12)) {
			return -1;
				}
			double i1=f*12;
			c=(i+i1)*2.54;
			System.out.println(f+ " feet " + i +" inches is equal to " + c + " centimeters.");
			return c;
	}
		public static double calcFeetAndInchToCentimeters(double i) {
		if(i<0) {
			return -1;
				}
		double f=(int) i/12;
		double ri=(int) i%12;
		System.out.println(i + " inches is equal to " + f + " feet " + ri + " inches.");
		return calcFeetAndInchToCentimeters(f,ri);
}
}
