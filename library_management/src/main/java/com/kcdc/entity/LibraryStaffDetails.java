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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="LIBRARY_STAFF_DETAILS")
public class LibraryStaffDetails {
	
	@Id
	@Column(name="USER_NAME")
	private String userName ;
	@Column(name="PASSWORD")
	private String password;
	

}
