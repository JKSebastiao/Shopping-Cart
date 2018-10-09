package pl.jkiakumbo.dao;

import java.util.List;

import pl.jkiakumbo.model.Product;

public interface ProductDao {

	List<Product> getAllProducts();

	Product getProductById(String productId);

	void deleteProduct(String productId);

	void addProduct(Product product);
	
	void editProduct(Product product);
	
}
