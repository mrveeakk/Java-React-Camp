package nLayered.entities.concretes;

import java.time.LocalDate;

import nLayered.entities.abstracts.Entitiy;

public class Customer implements Entitiy {
	private int id;
	private String FirstName;
	private String LastName;
	private LocalDate dateOFBirth;
	private String NationalityID;
	
	public Customer() {
	
	}

	public Customer(int id, String firstName, String lastName, LocalDate dateOFBirth, String nationalityID) {
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.dateOFBirth = dateOFBirth;
		NationalityID = nationalityID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getDateOFBirth() {
		return dateOFBirth;
	}

	public void setDateOFBirth(LocalDate dateOFBirth) {
		this.dateOFBirth = dateOFBirth;
	}

	public String getNationalityID() {
		return NationalityID;
	}

	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
	}

}
