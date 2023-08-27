package com.tns.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderService 
{
	@Autowired
	private OrderRepository repo;
	
	//get all records from table
	public List<Order> listAll()
	{
		return repo.findAll();
	}
	
	//save values to table
	public Order save(Order order) 
	{
		return repo.save(order);
	}
	
	//retrieving the particular record with orderid
	public Order get(Integer orderid)
	{
		return repo.findById(orderid).get();
	}
	
	//deleting the record with orderid
	public Order delete(Integer orderid) 
	{
		repo.deleteById(orderid);
		return null;
	}
	
}
