package com.github.archarithms;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateObject {
	
	private int year;
	private String month;
	private int day;
	
	/*The md says to throw an exception if null or wrong type and provide today's date if "no timestamp is given"
	 * Since the function takes in a long, it can't take a "wrong type" and if it's null it throws an exception
	 * So I'm not really sure how this would be called, but I added a default constructor that returns today's date if no parameter is passed in
	 */
	public DateObject() {
		this.year = Calendar.getInstance().get(Calendar.YEAR);
		this.month = Month.of(Calendar.getInstance().get(Calendar.MONTH)).getDisplayName(TextStyle.FULL_STANDALONE, null);
		this.day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	}
	
	public DateObject(int year, String month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public DateObject(Date date) {
		this.year = date.getYear() + 1900;
		this.month = Month.of(date.getMonth()+1).getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);
		this.day = date.getDate();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateObject other = (DateObject) obj;
		if (day != other.day)
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
