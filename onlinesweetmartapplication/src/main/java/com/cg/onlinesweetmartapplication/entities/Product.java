package com.cg.onlinesweetmartapplication.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cg.onlinesweetmartapplication.model.CategoryDTO;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
    private int productId;
	@Column(name = "PRODUCT_NAME")
    private String name;
	@Column(name = "PRODUCT_PRICE")
    private Double price;
	@Column(name = "DESCRIPTION")
    private String description;
	@Column(name = "PRODUCT_AVAILABILITY")
    private Boolean available = true;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "categoryId")
//    private CategoryDTO category;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
//	public CategoryDTO getCategory() {
//		return category;
//	}
//	public void setCategory(CategoryDTO category) {
//		this.category = category;
	//}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", description="
				+ description + ", available=" + available + ", category=" + "]";
	}

	
}
