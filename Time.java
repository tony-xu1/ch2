public class Time {
	
	public static void main (String[] args){
	//variables 
	int hour = 14;
	int minute = 47;
	int second = 36;
	int secSinceMidnight;
	int secTillMidnight;
	int percentOfDay;
	int hourD = 14;
	int minuteD = 59;
	int secondD = 20;
	int secSinceStart;
	
	secSinceMidnight = hour * 3600 + minute * 60 + second;
	secTillMidnight = (24 * 3600) - secSinceMidnight;
	percentOfDay = (secSinceMidnight * 100)/(24*3600);
	secSinceStart =(hourD * 3600 + minuteD * 60 + secondD) - secSinceMidnight;
	
	System.out.println("Seconds since midnight: " + secSinceMidnight);
	System.out.println("Seconds till midnight: " + secTillMidnight);
	System.out.println("Percent of day that has passed: " + percentOfDay);
	System.out.println("Time since starting: " + secSinceStart);
	}
}
