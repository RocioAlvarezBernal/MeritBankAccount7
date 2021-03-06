package com.assignments.assignment5.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.query.JpaCountQueryCreator;

@Entity
@Table(name = "AccountHoldersContactDetails")
public class AccountHoldersContactDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_holders_contact_details_id")
	Integer id;
	Integer phoneNumber;
	
	public AccountHoldersContactDetails() {

	}

	public Integer getId() {
		return id;
	}

	public AccountHoldersContactDetails setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public AccountHoldersContactDetails setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

}
