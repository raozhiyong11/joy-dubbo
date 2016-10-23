package org.joy.dubbo.user.controller;

import org.joy.dubbo.integral.api.IntegralService;
import org.joy.dubbo.integral.model.Integral;
import org.joy.dubbo.user.api.UserService;
import org.joy.dubbo.user.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LuncherConsumer {
	
	public static void main(String[] args) throws Exception{
		LuncherConsumer luncher = new LuncherConsumer(); 
		luncher.start();
		System.in.read();
	}

	public void start() {
		String config = "classpath*:/META-INF/spring/spring-*.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		String[] names = context.getBeanDefinitionNames();
		System.out.println("Beans:");
		for (String string : names) {
			System.out.print(string+",");  
			
		}
		System.out.println();
		
		UserService ds = (UserService)context.getBean("userService");
		User user = ds.getUserById(11L);
		System.out.println(user.getName());
		System.out.println(ds.getUsers(user));
		/*IntegralService integralService = (IntegralService)context.getBean("integralService");
		Integral integral = new Integral();
		integral.setPoint(10);
		integral.setUserId(555L);
		integralService.addIntegral(integral);*/
	}

	
}
