package execises;

public class AllFactors {
	public static void main(String[] args) {
	allFactors(5559);
	}
	public static int allFactors(int number) {
		if(number<0) {
			return -1;
		}
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.print(i+ " ");
			}
		}
		return -1;
	}
}
