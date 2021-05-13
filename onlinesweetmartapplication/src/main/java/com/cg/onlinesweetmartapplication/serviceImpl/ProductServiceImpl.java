package com.cg.onlinesweetmartapplication.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinesweetmartapplication.entities.Product;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;
import com.cg.onlinesweetmartapplication.repository.iProductRepository;
import com.cg.onlinesweetmartapplication.service.ProductService;
import com.cg.onlinesweetmartapplication.utils.ProductUtils;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private iProductRepository productRepo;
	
	@Override
	public Product addProduct(Product product) {
//		Product productEntity;
//		if(product == null)
//		{
//			productEntity = null;
//		}
//		else
//		{
//			productEntity = productRepo.save(product);
//		}
//		return ProductUtils.convertToProductDto(productEntity);
		return productRepo.save(product);
	}

	@Override
	public ProductDTO updateProduct(ProductDTO product) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO cancelProduct(int productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> showAllProducts(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> showAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
