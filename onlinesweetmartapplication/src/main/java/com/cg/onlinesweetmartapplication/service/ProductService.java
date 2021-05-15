package com.cg.onlinesweetmartapplication.service;

import java.time.LocalDate;
import java.util.List;

<<<<<<< HEAD
import com.cg.onlinesweetmartapplication.entity.Product;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;

public interface ProductService{

	public Product addProduct(Product product);
	public Product updateProduct(Product product) throws ProductNotFoundException;
	public Product cancelProduct(int productId) throws ProductNotFoundException;
	public List<Product> showAllProducts(int productId);
	public List<Product> showAllProducts();
=======
import com.cg.onlinesweetmartapplication.entities.Product;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;

public interface ProductService{

	public ProductDTO addProduct(Product product);
	public ProductDTO updateProduct(Product product);// throws ProductNotFoundException;
	public ProductDTO deleteProduct(int productId); //throws ProductNotFoundException;
	public ProductDTO showProductById(int productId);
	public List<ProductDTO> showAllProducts();
>>>>>>> branch 'master' of https://github.com/sudheer00925/OnlineSweetMart-1.git
	
}
