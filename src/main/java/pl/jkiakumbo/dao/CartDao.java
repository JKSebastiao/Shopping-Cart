package pl.jkiakumbo.dao;

import java.io.IOException;

import pl.jkiakumbo.model.Cart;

public interface CartDao {

	Cart getCartByCartId(String CartId);
	
	Cart validate(String cartId) throws IOException;
	
	void update(Cart cart);
}
