package com.cg.onlinesweetmartapplication.model;


import org.springframework.stereotype.Component;

@Component
public class CategoryDTO {

	private Integer productId;
	private String name;
	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryDTO(Integer productId, String name) {
		super();
		this.productId = productId;
		this.name = name;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CategoryDTO [productId=" + productId + ", name=" + name + "]";
	}
}
	
