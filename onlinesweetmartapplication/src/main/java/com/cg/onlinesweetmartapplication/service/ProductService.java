package com.cg.onlinesweetmartapplication.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.onlinesweetmartapplication.entities.Product;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;

public interface ProductService{

	public Product addProduct(Product product);
	public ProductDTO updateProduct(ProductDTO product) throws ProductNotFoundException;
	public ProductDTO cancelProduct(int productId) throws ProductNotFoundException;
	public List<ProductDTO> showAllProducts(int productId);
	public List<ProductDTO> showAllProducts();
	
}
