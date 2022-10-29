package com.ash.lab.java;
import java.util.Calendar;

public class Welcome {
	private final String NAME = "Ashrut Sharma";
	private String timePeriod;
	private final String MORNING = "Good morning, ";
	private final String AFTERNOON = "Good afternoon, ";
	
	// methods
	public String getSetTimePeriod() {
		Calendar time = Calendar.getInstance();
		int hour = time.get(Calendar.HOUR_OF_DAY);
		if (hour >= 12) {
			timePeriod = AFTERNOON;
        } else {
        	timePeriod = MORNING;
        }
		return timePeriod;
	}
	
	// getter
	public String getNAME() {
		return NAME;
	}
	public String getTimePeriod() {
		return timePeriod;
	}
	
}
