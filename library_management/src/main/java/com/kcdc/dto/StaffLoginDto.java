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
@NoArgsConstructor
@AllArgsConstructor
public class StaffLoginDto {
	
	@NotNull(message = "userName should not  be a null ")
	@NotBlank(message = "userName should not  be a blank ")
	@NotBlank(message = "userName should not  be a Empty ")
	private String userName;
	@NotNull(message = "password should not  be a null ")
	@NotBlank(message = "password should not  be a blank ")
	@NotBlank(message = "password should not  be a Empty ")
	private String password;

}
