package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString


public class Product {
	@Id
	private int id;
	private String productBrand;
	private int productPrice;
	private int productSize;
	
	@OneToOne
	@JoinColumn(name="userid")
	private User user;
	
	

}
