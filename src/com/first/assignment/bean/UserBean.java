package com.first.assignment.bean;

import java.util.List;

public class UserBean {

	private String firstName;
	private String lastName;
	private String sex;
	private String dateBirth;
	private String email;
	private String section;
	private String country;
	private Boolean firstAttempt;
	private List<String> subjects;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Boolean getFirstAttempt() {
		return firstAttempt;
	}
	public void setFirstAttempt(Boolean firstAttempt) {
		this.firstAttempt = firstAttempt;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		return "UserBean [firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex + ", dateBirth="
				+ dateBirth + ", email=" + email + ", section=" + section + ", country=" + country + ", firstAttempt="
				+ firstAttempt + ", subjects=" + subjects + "]";
	}
	
}
