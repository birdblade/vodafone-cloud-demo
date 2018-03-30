package com.vodafone.edu.demo.orderservice.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.edu.demo.orderservice.dto.OrderDTO;
import com.vodafone.edu.demo.orderservice.dto.OrderResult;
import com.vodafone.edu.demo.orderservice.dto.ProductDTO;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public OrderResult createOrder(@RequestBody OrderDTO order) {
		
		OrderResult or = new OrderResult();
		
		
		
		return or;
	}

}
