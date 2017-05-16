package forms;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.SafeHtml.WhiteListType;
import org.springframework.format.annotation.DateTimeFormat;


import utilities.validators.PasswordMatches;
import utilities.validators.PasswordMatchesCommercial;

@PasswordMatchesCommercial
public class CommercialForm {



	// Constructors -----------------------------------------------------------
	public CommercialForm() {
		super();

	}


	// Attributes -------------------------------------------------------------



	private String	username;
	private String	password;
	private String	passwordCheck;
	
	private boolean	termsOfUse;
	private String	name;
	private String	surName;
	private String	email;
	private String	phone;

	private String	companyName;
	private String	vatNumber;



	@NotBlank
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	@NotBlank
	@Pattern(regexp = "^ES[ABCDEFGHJNPQRSUVW]{1}[1-9]{8}$")
	public String getVatNumber() {
		return this.vatNumber;
	}

	public void setVatNumber(final String vatNumber) {
		this.vatNumber = vatNumber;
	}


	@NotNull
	@Size(min = 5, max = 32)
	@Column(unique = true)
	public String getUsername() {
		return username;

	}
	public void setUsername(String username) {
		this.username = username;
	}



	@NotNull
	@Size(min = 5, max = 32)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotNull
	@Size(min = 5, max = 32)
	public String getPasswordCheck() {
		return passwordCheck;

	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	@AssertTrue
	public boolean getTermsOfUse() {
		return termsOfUse;

	}

	public void setTermsOfUse(boolean termsOfUse) {
		this.termsOfUse = termsOfUse;

	}

	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	@NotBlank
	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;

	}

	
	@NotBlank
	@Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@NotBlank
	@Pattern(regexp = "^\\+?\\d{1,3}?[- .]?\\d+$")
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}





}
	
