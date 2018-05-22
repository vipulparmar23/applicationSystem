package com.candidate.classes;

import java.util.HashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Candidate {

	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;
	private String emailId;
	private String country;
	
	private HashMap<String, String> countryOptions;
	private String[] knownLanguages;
	
	
	public Candidate() {
		countryOptions = new HashMap<>();
		
		countryOptions.put("BR","Brazil");
		countryOptions.put("USA","USA");
		countryOptions.put("IND","India");
		countryOptions.put("CAN","Canada");
		countryOptions.put("UK","United Kingdon");
	}
	
	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getKnownLanguages() {
		return knownLanguages;
	}

	public void setKnownLanguages(String[] knownLanguages) {
		this.knownLanguages = knownLanguages;
	}
	
	
	
	
	
	
}
