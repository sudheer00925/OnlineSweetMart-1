package com.cg.onlinesweetmartapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name =   "Category") 
public class Category {
	
	@Id
	private Integer categoryId;
	@Column(unique=true)
	@NotEmpty (message="category name be not empty")
	private String name;

	public Category() {
		super();
	}

	public Category(Integer categoryId, @NotNull(message = "category name be not empty") String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}

	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + "]";
	}

}