package org.joy.dubbo.user.api;

import java.util.List;

import org.joy.dubbo.user.model.User;
/**
 * 
 * @author raozy
 *
 */
public interface UserService {
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public User getUserById(Long userId);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public List<User> getUsers(User user);

}
