package pl.jkiakumbo.dao;

import pl.jkiakumbo.model.Cart;
import pl.jkiakumbo.model.CartItem;

public interface CartItemDao {

	void addCartItem(CartItem cartItem);
	void removeCartItem(String CartItemId);
	void removeAllCartItems(Cart cart);

}
