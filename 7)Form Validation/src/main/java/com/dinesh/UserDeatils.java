package com.dinesh;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.*;

public class UserDeatils {
	@NotEmpty
	@Size(min = 8, max = 20)
	public String username;
	@NotBlank
	public String password;
	@Email
	public String email;
	@NotEmpty
	@Size(min = 10, max = 10)
	public long contactno;
	@NotEmpty
	public String city;
	@NotEmpty
	@Size(min = 4, max = 6)
	public int zip;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
}
