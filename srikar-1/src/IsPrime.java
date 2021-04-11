package execises;

public class IsPrime {
	public static void main(String[] args) {
		
		int count=0;
		for(int i=2;i<10050;i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("Number"+ i +" is a prime");
				if(count==1000) {
					System.out.println("exiting the loop");
				}
			}
		}
	}
	public static boolean isPrime(int n) {
		if(n==1) {
        return false;		
        }
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;	
			}
		}
		return true;
	}

}
