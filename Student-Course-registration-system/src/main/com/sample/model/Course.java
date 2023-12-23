package main.com.sample.model;

import java.util.Objects;

public class Course {

	private String courseCode;
	private String titleDescription;
	private String capacity;
	private String schedule;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getTitleDescription() {
		return titleDescription;
	}
	public void setTitleDescription(String titleDescription) {
		this.titleDescription = titleDescription;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public Course() {
		super();
	}
	
	public Course(String courseCode, String titleDescription, String capacity, String schedule) {
		super();
		this.courseCode = courseCode;
		this.titleDescription = titleDescription;
		this.capacity = capacity;
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", titleDescription=" + titleDescription + ", capacity=" + capacity
				+ ", schedule=" + schedule + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(capacity, courseCode, schedule, titleDescription);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(capacity, other.capacity) && Objects.equals(courseCode, other.courseCode)
				&& Objects.equals(schedule, other.schedule) && Objects.equals(titleDescription, other.titleDescription);
	}
	
	
}
