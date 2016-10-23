package org.joy.dubbo.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.joy.dubbo.integral.api.IntegralService;
import org.joy.dubbo.integral.model.Integral;
import org.joy.dubbo.user.api.UserService;
import org.joy.dubbo.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private IntegralService integralService;

	@Override
	public User getUserById(Long userId) {
		User user = new User();
		user.setUserId(new Long(Math.round(6)));
		user.setAge(20);
		user.setName("aaa");
		user.setSex("F");
		
		Integral integral = new Integral();
		integral.setPoint(100);
		integral.setUserId(111L);
		integralService.addIntegral(integral);
		return user;
	}

	@Override
	public List<User> getUsers(User user) {
		List<User> users = new ArrayList<User>();
		for (Long i = 0L; i < 8; i++) {
			users.add(this.getUserById(i));
		}
		Integral integral = new Integral();
		integral.setPoint(200);
		integral.setUserId(222L);
		integralService.addIntegral(integral);
		return users;
	}

}
