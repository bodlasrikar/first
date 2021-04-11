package execises;

public class IsEvenNumber {
	public static void main(String[] args) {
		boolean e=isEvenNumber(609);
		System.out.println("Is The entered number is an even number? " + e);
		
		int number=40;
		int finalnumber=200;
		int count=0;
		while(number<=finalnumber) {
			number++;
			if(! isEvenNumber(number)) {
				continue;
			}
			System.out.println(number+ " is a even number");

			count++;
			if(count>=5) {
				break;
			}
		}
		
	}
	public static boolean isEvenNumber(int number) {
		if(number%2==0) {
			return true;
		}
		return false;
	}

}
