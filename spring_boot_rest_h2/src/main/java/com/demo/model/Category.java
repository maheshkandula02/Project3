package com.demo.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table
public class Category {

	@Id
	
	private int Category_id;
	
	private String name;
	

	@OneToOne
	@JoinColumn(name="productid")
	private Product product;
}
	