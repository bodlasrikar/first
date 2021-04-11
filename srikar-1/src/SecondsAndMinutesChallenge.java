package execises;

public class SecondsAndMinutesChallenge {
	public static void main(String[] args) {
		System.out.println(getDurationString(190,40));
		System.out.println(getDurationString(602));
	}
	public static String getDurationString(int minutes,int seconds) {
			if(minutes<0 || (seconds<0 || seconds>59)) {
			return "Invalid data";
		}
		int hours=minutes/60;
		int remainingminutes=minutes%60;
		
		String hours1=hours+"h ";
		if(hours<10) {
			hours1="0"+hours1;
		}
		
		String minutes1=remainingminutes+"m ";
		if(remainingminutes<10) {
			minutes1="0"+minutes1;
		}
		
		String seconds1=seconds+"s ";
		if(seconds<10) {
			seconds1="0"+seconds1;
		}


		
		return hours1+minutes1+seconds1;
	}
	public static String getDurationString(int seconds) {
		if(seconds<0) {
			return "invalid value";
		}
		int minutes=seconds/60;
		int remainingseconds=seconds%60;
		return getDurationString(minutes,remainingseconds);
	}

}
