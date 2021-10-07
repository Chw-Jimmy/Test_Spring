
//package报错，“项目报错-无法解析类型 XXXX.xx 从必需的 .class 文件间接引用了它” 这个一般是spring包和jdk版本不符合造成的；
package com.jimmy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jimmy.bean.Mycellection;
import com.jimmy.bean.User;

public class TestSpring_injection {
	@Test
	public void test2(){

		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContex_injection.xml");

		//scope="singleton" 这是单例，只创建一个对象，打印值为true，一般项目中使用默认值singleton单例；
		User u1=(User) ac.getBean("user3");  //这里的getBean中的“user”和配置文件中的name属性相对应
		//User u1 = ac.getBean(User.class);
	
		System.out.println(u1);
	}

	//@Test
	public void test3(){

		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContex_injection.xml");

		//scope="singleton" 这是单例，只创建一个对象，打印值为true，一般项目中使用默认值singleton单例；
		Mycellection mc = (Mycellection) ac.getBean("collection");
		
		System.out.println(mc);
	}
	
	//@Test
	public void test4(){

		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContex_injection.xml");

		//scope="singleton" 这是单例，只创建一个对象，打印值为true，一般项目中使用默认值singleton单例；
		Mycellection mc = (Mycellection) ac.getBean("collection");
		
		System.out.println(mc.getProperties());
	}
}
