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
	private String country;

	private HashMap<String, String> countryOptions;
	private String[] knownLanguages;

	public Candidate() {
		countryOptions = new HashMap<>();

		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("USA", "USA");
		countryOptions.put("India", "India");
		countryOptions.put("Canada", "Canada");
		countryOptions.put("United Kingdom", "United Kingdom");
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

	public String[] getKnownLanguages() {
		return knownLanguages;
	}

	public void setKnownLanguages(String[] knownLanguages) {
		this.knownLanguages = knownLanguages;
	}

}
