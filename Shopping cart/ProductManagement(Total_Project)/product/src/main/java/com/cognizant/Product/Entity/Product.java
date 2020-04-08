package com.cognizant.Product.Entity;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	@Column(name="product_name")
	@NotEmpty(message="product should have a name!")
	@Size(min =3, max=35 ,message="ProductName should contain 3 letters or more !")
	private String productName;
	
	
	@Column(name="category")
	@NotEmpty(message="category should have a name!")
	@Size(min =3, max=35 ,message="Category should contain 3 letters or more !")
	private String category;
	
	@Column(name="price")	
	private double price;
	
	  @Column(name="dateOfManufacture")
	  @NotNull
	  private Date dom;
		 
	@Column(name="dateOfExpiry")
    @NotNull 
	private Date doe;
	
	public Product() {
	}
	public Product( String productName, String category, double price, Date dom, Date doe) {
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.dom=dom;
		this.doe = doe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	 public Date getDom() { return dom; } public void setDom(Date dom) 
	 { this.dom=dom; }
	 
	public Date getDoe() {
		return doe;
	}
	public void setDoe(Date doe) {
		this.doe = doe;
	}
	
	
	
	

}


