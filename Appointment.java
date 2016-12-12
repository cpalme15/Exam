
public class Appointment {
	private int startTime;
	private int endTime;
	private String dayOfWeek;
	private int month;
	private int day;
	private int year;
	public Appointment() {
		super();
	}
	public Appointment(int startTime, int endTime, String dayOfWeek, int month, int day, int year) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.dayOfWeek = dayOfWeek;
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public void format(int startTime, int endTime, String dayOfWeek, int month, int day, int year){
		String dayModifier = " ";
		String monthType = " ";
		
		if(day%10 == 1){
			dayModifier = "st";
		}else if(day%10 == 2){
			dayModifier = "nd";
		}else if(day%10 == 3){
			dayModifier = "rd";
		}else{
			dayModifier = "th";
		}
		
		switch(month){
		case 1: monthType = "January";
		case 2: monthType = "February";
		case 3: monthType = "March";
		case 4: monthType = "April";
		case 5: monthType = "May";
		case 6: monthType = "June";
		case 7: monthType = "July";
		case 8: monthType = "August";
		case 9: monthType = "September";
		case 10: monthType = "October";
		case 11: monthType = "November";
		case 12: monthType = "December";
		}
		
		System.out.printf("%s%s%s%d%s");
	}
}
