package execises;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.print(perfectNumber(496));
	}
	public static boolean perfectNumber(int number) {
		if(number==0) {
			return false;
		}
		int sum=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
			sum+=i;
			}
		}
		if(sum==(number*2)) {
			return true;
		}
		else {
			return false;
		}
	}

}


//public class PerfectNumber {
//	public static void main(String[] args) {
//	System.out.print(isPerfectNumber(6));
//}
//
//    public static boolean isPerfectNumber(int number) {
//        if (number == 0) {
//            return false;
//        }
//        
//        int sum = 0;
//        
//        for (int i=1; i<number; i++) {
//            if (number % i == 0) {
//                sum += i;
//            }
//        }
//        if (sum == number) {
//            return true;
//        }
//        else {
//            return false;
//        }    
//    
//    }
//}