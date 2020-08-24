package com.demo.controller;




import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.demo.model.Purchase;
import com.demo.service.PurchaseService;

@RestController
public class PurchaseController{

	@Autowired
	private PurchaseService service;
	

	
	@PostMapping("/purchase")
	public Purchase addPurchase(@RequestBody Purchase purchase) {
		
		return service.addPurchase(purchase);
	}

	@PutMapping("/purchase")
	public Purchase updatePurchase(@RequestBody Purchase purchase) {
	
		return service.updatePurchase(purchase);
	}

	 @GetMapping("/purchase/{id}")
	public Purchase getPurchaseById(@PathVariable int id) {
		 return service.getPurchaseById(id);
		
	}

	 @GetMapping("/purchase/date/{date}")
	public List<Purchase> getPurchaseByDateOfPurchase(@PathVariable Date date) {
		
		return service.getPurchaseByDateOfPurchase(date);
	}

	@GetMapping("/purchases")
	public List<Purchase> getAllPurchases() {
		
		return service.getAllPurchases();
	}

	@DeleteMapping("/purchase/{id}")
	public void deletePurchaseById(@PathVariable int id) {
		service.deletePurchaseById(id);
		
	}

}
