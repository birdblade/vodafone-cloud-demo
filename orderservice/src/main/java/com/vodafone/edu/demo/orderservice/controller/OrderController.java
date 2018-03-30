package com.vodafone.edu.demo.orderservice.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.edu.demo.orderservice.dto.OrderDTO;
import com.vodafone.edu.demo.orderservice.dto.OrderResult;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public OrderResult createOrder(@RequestBody OrderDTO order) {
		
		OrderResult or = new OrderResult();
		
		or.setMessage("Dear customer "+order.getCustomer() +" your order is send to your address: "+order.getAddress());
		double unitPrice = 50;
		or.setTotalAmount(unitPrice*order.getCount());
		
		return or;
	}

}
