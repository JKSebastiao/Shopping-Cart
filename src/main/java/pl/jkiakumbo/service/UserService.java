package pl.jkiakumbo.service;

import java.util.List;

import pl.jkiakumbo.model.User;

public interface UserService {

	List<User> getAllUsers();
	
	void deleteUser(String userId);
	
	void addUser(User user);
	
	User getUserById(String userId);
}
