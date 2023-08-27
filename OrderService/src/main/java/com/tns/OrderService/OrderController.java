package com.tns.OrderService;

import java.util.*; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class OrderController 
{
	@Autowired
	private OrderService service;
	
	@GetMapping("/orderservice")
	public List<Order> list()
	{
		return service.listAll();
	}
	
	
	@PostMapping("/orderservice")
	public Order add(@RequestBody Order order) 
	{
		return service.save(order);
	}
	
	@PutMapping("/orderservice")
	public ResponseEntity<?> update(@RequestBody Order order)
	{
		service.save(order);
		return new ResponseEntity<Order>(HttpStatus.OK);
	}
	
	@GetMapping("/orderservice/{orderid}")
	public ResponseEntity<Order> get(@PathVariable Integer orderid)
	{
		try
		{
			Order order=service.get(orderid);
			return new ResponseEntity<Order>(order, HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("orderservice/{orderid}")
	public Order delete(@PathVariable Integer orderid) 
	{
		return service.delete(orderid);
	}
}