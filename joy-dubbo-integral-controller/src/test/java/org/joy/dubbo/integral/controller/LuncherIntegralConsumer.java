package org.joy.dubbo.integral.controller;

import org.joy.dubbo.integral.api.IntegralService;
import org.joy.dubbo.integral.model.Integral;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LuncherIntegralConsumer {
	
	public static void main(String[] args) throws Exception{
		LuncherIntegralConsumer luncher = new LuncherIntegralConsumer();
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
		
		IntegralService ds = (IntegralService)context.getBean("integralService");
		Integral integral = new Integral();
		integral.setPoint(10);
		integral.setUserId(20L);
		ds.addIntegral(integral);
	
	}
	
}
