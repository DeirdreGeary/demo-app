package com.citibank.demo;

public class Task {
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private int duration;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		
		if (duration < 0) {
		throw new IllegalArgumentException("Duration can't be < 0 ");
		}
		else if (duration < 5) {
			throw new IllegalArgumentException("Duration can't be > 5 ");
			}
		else
		{
		this.duration = duration;
		}
	}
	

}
