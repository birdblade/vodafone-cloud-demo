package com.vodafone.edu.demo.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.edu.demo.orderservice.client.ProductServiceClient;
import com.vodafone.edu.demo.orderservice.dto.OrderDTO;
import com.vodafone.edu.demo.orderservice.dto.OrderResult;
import com.vodafone.edu.demo.orderservice.dto.ProductDTO;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	
	@Autowired
	private ProductServiceClient productServiceClient; 
	
	
	@RequestMapping(method = RequestMethod.POST)
	public OrderResult createOrder(@RequestBody OrderDTO order) {
		
		OrderResult or = new OrderResult();
		
		or.setMessage("Dear customer "+order.getCustomer() +" your order is send to your address: "+order.getAddress());
		ProductDTO productDTO = productServiceClient.readProduct(order.getProductId());
		double unitPrice = productDTO.getPrice();
		or.setTotalAmount(unitPrice*order.getCount());
		
		return or;
	}

}
