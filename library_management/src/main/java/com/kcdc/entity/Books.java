package com.kcdc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder

@Entity
@Table(name="BOOKS")
public class Books {
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	@Column(length = 20)
	private String bookName;
	@Column(length = 20)
	private String authorName;
	@Column(length = 20)
	private String bookLanguage;
	@Column(length = 20)
	private String bookStatus;
	@Column(length = 20)
	private String section;
	@Column(length = 20)
	private long rowNo;
	public Books(long bookId, String bookName, String authorName, String bookLanguage, String bookStatus,
			String section, long rowNo) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookLanguage = bookLanguage;
		this.bookStatus = bookStatus;
		this.section = section;
		this.rowNo = rowNo;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
