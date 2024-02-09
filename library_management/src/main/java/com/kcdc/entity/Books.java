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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="BOOKS")
public class Books {
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

}
