package com.casestudy.cart.model;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Cart")
public class Cart {
	@Id
	private String cartId;
	private BigDecimal totalPrice;
	private List<Items> items;
	
	public Cart() {
		super();
	}
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public BigDecimal getTotalPrice() {
		
		for(int i=0; i<(items.size()); i++)
		{
			totalPrice=totalPrice.add(((Items) items).getPrice());
		}
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public Cart(String cartId, BigDecimal totalPrice, List<Items> items) {
		super();
		this.cartId = cartId;
		this.totalPrice = totalPrice;
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", totalPrice=" + totalPrice + ", items=" + items + "]";
	}
	
	
	
	
	
	
	
	

}
