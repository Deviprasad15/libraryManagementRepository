package com.kcdc.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Valid
@Data
@Builder

public class StaffLoginDto {
	
	@NotNull(message = "userName should not  be a null ")
	@NotBlank(message = "userName should not  be a blank ")
	@NotBlank(message = "userName should not  be a Empty ")
	private String userName;
	@NotNull(message = "password should not  be a null ")
	@NotBlank(message = "password should not  be a blank ")
	@NotBlank(message = "password should not  be a Empty ")
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
	public StaffLoginDto(
			@NotNull(message = "userName should not  be a null ") @NotBlank(message = "userName should not  be a blank ") @NotBlank(message = "userName should not  be a Empty ") String userName,
			@NotNull(message = "password should not  be a null ") @NotBlank(message = "password should not  be a blank ") @NotBlank(message = "password should not  be a Empty ") String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public StaffLoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
