package pl.jkiakumbo.dao;

import java.util.List;

import pl.jkiakumbo.model.User;

public interface UserDao {

	List<User> getAllUsers();

	void deleteUser(String userId);
	
	void addUser(User user);
	
	User getUserById(String userId);
}
