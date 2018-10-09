package pl.jkiakumbo.service;

import pl.jkiakumbo.model.Cart;
import pl.jkiakumbo.model.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem);
	void removeCartItem(String CartItemId);
	void removeAllCartItems(Cart cart);
}
