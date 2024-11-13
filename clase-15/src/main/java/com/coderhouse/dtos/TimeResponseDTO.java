package com.coderhouse.dtos;

import lombok.Data;

@Data
public class TimeResponseDTO {

	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	private int milliSeconds;
	private String dateTime;
	private String date;
	private String time;
	private String timeZone;
	private String dayOfWeek;
	private boolean dstActive;
	
}
