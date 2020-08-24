package com.demo.service;

import java.util.List;

import com.demo.model.Cart;

public interface CartService {

	public Cart addCart(Cart cart);
	
	public Cart updateCart(Cart cart);
	
	public Cart getCartById(int id);
	
	public void deleteCartById(int id);
	
	public List<Cart> GetAllCarts();
	

}