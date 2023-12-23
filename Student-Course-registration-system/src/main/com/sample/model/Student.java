package main.com.sample.model;

import java.util.List;
import java.util.Objects;

public class Student {

	private int studentId;
	private String name;
	private List<Course> registeredCorses;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getRegisteredCorses() {
		return registeredCorses;
	}
	public void setRegisteredCorses(List<Course> registeredCorses) {
		this.registeredCorses = registeredCorses;
	}
	
	public Student() {
		super();
	}
	
	public Student(int studentId, String name, List<Course> registeredCorses) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.registeredCorses = registeredCorses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", registeredCorses=" + registeredCorses + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, registeredCorses, studentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(registeredCorses, other.registeredCorses)
				&& studentId == other.studentId;
	}
	
	
	
}