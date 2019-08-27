package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {

	
	Order gerOrder(String orderId);
	void addOrder(Order order);
}
