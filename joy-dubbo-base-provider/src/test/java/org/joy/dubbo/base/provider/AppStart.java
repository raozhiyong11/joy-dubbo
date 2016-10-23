package org.joy.dubbo.base.provider;


/**
 * Unit test for simple App.
 */
public class AppStart 
{
	public static void main(String[] args) {
		System.setProperty("dubbo.spring.config", "classpath*:/META-INF/spring/spring-*.xml");
		System.setProperty("dubbo.application.logger", "slf4j");
		String[] parmas = new String[] { "spring", "" };

		com.alibaba.dubbo.container.Main.main(parmas);
	}
    
}
