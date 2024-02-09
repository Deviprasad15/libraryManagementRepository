package com.kcdc.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Valid
public class NewBookDetailsDto {
	
	@NotBlank(message="bookName should not be a blank ")
	@NotNull(message="bookName should not be a null ")
	@NotEmpty(message="bookName should not be a empty ")
	@Size(min = 2,max = 20,message = "Book name must be a below 21 characters")
	private String bookName;

	@NotBlank(message="author Name should not be a blank ")
	@NotNull(message="author Name should not be a null ")
	@NotEmpty(message="author Name should not be a empty ")
	@Size(min = 2,max = 20,message = "author Name  must be a above 2 character , below 21 characters")
	private String authorName;


	@NotBlank(message="book Language Name should not be a blank ")
	@NotNull(message="book Language Name should not be a null ")
	@NotEmpty(message="book Language Name should not be a empty ")
	@Size(min = 2,max = 20,message = "book Language  must be a above 2 character , below 21 characters")
	private String bookLanguage;
	
	@NotBlank(message="book Status Language Name should not be a blank ")
	@NotNull(message="book Status Name should not be a null ")
	@NotEmpty(message="book Status Name should not be a empty ")
	@Size(min = 2,max = 20,message = "book Status  must be a above 2 character , below 21 characters")
	private String bookStatus;
	

	@NotBlank(message="section Language Name should not be a blank ")
	@NotNull(message="section should not be a null ")
	@NotEmpty(message="section  Name should not be a empty ")
	@Size(min = 2,max = 20,message = "section   must be a above 2 character , below 21 characters")
	private String section;
	
	private long rowNo;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookLanguage() {
		return bookLanguage;
	}

	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public long getRowNo() {
		return rowNo;
	}

	public void setRowNo(long rowNo) {
		this.rowNo = rowNo;
	}

	public NewBookDetailsDto(
			@NotBlank(message = "bookName should not be a blank ") @NotNull(message = "bookName should not be a null ") @NotEmpty(message = "bookName should not be a empty ") @Size(min = 2, max = 20, message = "Book name must be a below 21 characters") String bookName,
			@NotBlank(message = "author Name should not be a blank ") @NotNull(message = "author Name should not be a null ") @NotEmpty(message = "author Name should not be a empty ") @Size(min = 2, max = 20, message = "author Name  must be a above 2 character , below 21 characters") String authorName,
			@NotBlank(message = "book Language Name should not be a blank ") @NotNull(message = "book Language Name should not be a null ") @NotEmpty(message = "book Language Name should not be a empty ") @Size(min = 2, max = 20, message = "book Language  must be a above 2 character , below 21 characters") String bookLanguage,
			@NotBlank(message = "book Status Language Name should not be a blank ") @NotNull(message = "book Status Name should not be a null ") @NotEmpty(message = "book Status Name should not be a empty ") @Size(min = 2, max = 20, message = "book Status  must be a above 2 character , below 21 characters") String bookStatus,
			@NotBlank(message = "section Language Name should not be a blank ") @NotNull(message = "section should not be a null ") @NotEmpty(message = "section  Name should not be a empty ") @Size(min = 2, max = 20, message = "section   must be a above 2 character , below 21 characters") String section,
			long rowNo) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookLanguage = bookLanguage;
		this.bookStatus = bookStatus;
		this.section = section;
		this.rowNo = rowNo;
	}

	public NewBookDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
