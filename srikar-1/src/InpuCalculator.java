package execises;

import java.util.Scanner;

public class InpuCalculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int sum=0;
		int counter=0;
		
		while(true) {
			System.out.println("enter number: ");
			boolean input=scanner.hasNextInt();
			if(input) {
				int inputInt=scanner.nextInt();
				sum+=inputInt;
				counter++;
			}
			else {
				double average=(double)sum/counter;
				System.out.println("SUM= " +sum + " AVG= "+Math.round(average));
				break;
			}
			scanner.nextLine();
		}
		scanner.close();
	}
}
