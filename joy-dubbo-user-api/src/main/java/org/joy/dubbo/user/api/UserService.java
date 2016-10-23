package org.joy.dubbo.user.api;

import java.util.List;

import org.joy.dubbo.user.model.User;


public interface UserService {
	
	public User getUserById(Long userId);
	public List<User> getUsers(User user);

}
