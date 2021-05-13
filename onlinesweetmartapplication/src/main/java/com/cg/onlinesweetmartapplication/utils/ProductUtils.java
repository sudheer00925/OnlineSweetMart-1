package com.cg.onlinesweetmartapplication.utils;

import com.cg.onlinesweetmartapplication.entities.Product;
import com.cg.onlinesweetmartapplication.model.ProductDTO;

public class ProductUtils {
	
	private ProductUtils()
	{
		
	}
	
	public static ProductDTO convertToProductDto(Product product)
	{
		ProductDTO dto = new ProductDTO();
		dto.setProductId(product.getProductId());
		dto.setName(product.getName());
		dto.setPrice(product.getPrice());
		dto.setDescription(product.getDescription());
		dto.setAvailable(product.getAvailable());
		//dto.setCategory(product.getCategory());
		return dto;
	}

}
