package com.kcdc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder

@Entity
@Table(name="LIBRARY_STAFF_DETAILS")
public class LibraryStaffDetails {
	
	@Id
	@Column(name="USER_NAME")
	private String userName ;
	@Column(name="PASSWORD")
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName; 
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LibraryStaffDetails(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public LibraryStaffDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
