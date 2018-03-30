package com.vodafone.edu.demo.orderservice.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vodafone.edu.demo.orderservice.dto.ProductDTO;

@FeignClient("productservice")
public interface ProductServiceClient {
	
	
	@RequestMapping("/products/{id}")
	public ProductDTO readProduct(@PathVariable("id") long productId);
}
