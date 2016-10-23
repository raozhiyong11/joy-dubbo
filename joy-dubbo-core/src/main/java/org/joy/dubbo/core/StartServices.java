package org.joy.dubbo.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartServices {
	
	public static void main(String[] args) throws Exception{
		StartServices luncher = new StartServices();
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
		
	}

}
