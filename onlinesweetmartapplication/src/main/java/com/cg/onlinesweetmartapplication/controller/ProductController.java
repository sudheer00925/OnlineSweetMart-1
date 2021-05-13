package com.cg.onlinesweetmartapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinesweetmartapplication.entities.Product;
import com.cg.onlinesweetmartapplication.model.ProductDTO;
import com.cg.onlinesweetmartapplication.service.ProductService;

@RestController
@RequestMapping("/api/osm")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
//		ProductDTO productdto = null;
//		ResponseEntity<Object> productResponse = null;
//		productdto = productService.addProduct(product);
//		productResponse = new ResponseEntity<>(productDTO, HttpStatus.ACCEPTED);
		return productService.addProduct(product);
	}
}
