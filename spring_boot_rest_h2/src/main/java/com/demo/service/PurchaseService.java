package com.demo.service;


import java.util.Date;
import java.util.List;


import com.demo.model.Purchase;

public interface PurchaseService {
public Purchase addPurchase(Purchase purchase);
public Purchase updatePurchase(Purchase purchase);
public Purchase getPurchaseById(int id);
public List<Purchase> getPurchaseByDateOfPurchase(Date date);
public List<Purchase> getAllPurchases();
public void deletePurchaseById(int id);
}
