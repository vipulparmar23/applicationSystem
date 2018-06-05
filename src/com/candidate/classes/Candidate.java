package com.candidate.classes;

import java.util.HashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Candidate {

	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;

	@Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", message = "Invalid Email")
	private String emailId;

	private String address;
	private String city;
	private String state;
	//@Pattern(regexp =  "[a-zA-Z0-9]", message = "Invalid Postal address")
	@NotNull(message = "is required")
	@Size(min = 5, message = "Should be minimum 5 letters.")
	private String postalCode;
	private String country;

	private HashMap<String, String> countryOptions;
	private HashMap<String, String> educationLevel;
	private HashMap<String, String> allStates;
	private String[] knownLanguages;

	private String education;

	public Candidate() {
		countryOptions = new HashMap<>();

		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("USA", "USA");
		countryOptions.put("India", "India");
		countryOptions.put("Canada", "Canada");
		countryOptions.put("United Kingdom", "United Kingdom");

		educationLevel = new HashMap<>();

		educationLevel.put("High School", "High School");
		educationLevel.put("Diploma", "Diploma");
		educationLevel.put("Bachelors", "Bachelors");
		educationLevel.put("Masters", "Masters");
		educationLevel.put("Doctorate", "Doctorate");
		educationLevel.put("Other", "Other");
	}

	// Getters and Setters for personal information

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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public HashMap<String, String> getAllStates() {
		return allStates;
	}

	public void setAllStates(HashMap<String, String> allStates) {
		this.allStates = allStates;
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountryOptions(HashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	// Getters and setters for skills and educational information

	public String[] getKnownLanguages() {
		return knownLanguages;
	}

	public void setKnownLanguages(String[] knownLanguages) {
		this.knownLanguages = knownLanguages;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public HashMap<String, String> getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(HashMap<String, String> educationLevel) {
		this.educationLevel = educationLevel;
	}

}
