package execises;

public class SwitchCase {
	public static void main(String[] args){
		int value=2;
		switch(value) {
		case 1:System.out.println("value is 1");break;
		case 2:System.out.println("value is 2");break;
		case 3:System.out.println("value is 3");break;
		
		default:System.out.println("invalid");break;
		}
		
		char letter='d';
		switch(letter) {
		case 'a':System.out.println("letter is a");break;
		case 'b':System.out.println("letter is b");break;
		case 'c':case 'd':case 'e':System.out.println("letter is "+letter);break;
		default:System.out.println("none");
		}
		
		String month="January";
		
		switch(month.toLowerCase()) {
		case "january":System.out.println("its jan");break;
		case "february":System.out.println("its feb");break;
		
		default:System.out.println("not under my limit");
		}
	}

}
