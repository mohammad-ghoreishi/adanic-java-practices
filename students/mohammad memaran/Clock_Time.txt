package runner;

public class Clock_Time {
	int second;
	int minute;
	int hour;
	
	public Clock_Time() {
		second=0;
		minute=0;
		hour=0;
	}
	
	public void increase() {
		second = second+1;
		checkTime();
	}
	
	public void checkTime() {
		if(second==60) {
			second = 0;
			minute = minute+1;
		}
		if(minute==60) {
			minute = 0;
			hour = hour+1;
		}
		if(hour==24) {
			hour=0;
			minute=0;
			second=0;
		}
	}
	public String showTime() {
		String stringSecond = "";
		String stringMinute = "";
		String stringHour = "";
		
		if (second <10) {
			stringSecond = "0" + second;
		}
		else {
			stringSecond = Integer.toString(second);
		}
		
		if (minute <10) {
			stringMinute = "0" + minute;
		}
		else {
			stringMinute = Integer.toString(minute);
		}
		
		if (hour <10) {
			stringHour = "0" + hour;
		}
		else {
			stringHour = Integer.toString(hour);
		}
		
		return (stringHour + ":" + stringMinute + ":" + stringSecond);
	}
	
}
