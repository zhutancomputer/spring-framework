package cn.zhutan.myspringtest;

import cn.zhutan.myspringtest.controller.HelloController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringMVC.xml");
		System.out.println(context.getBean(HelloController.class));
	}
}
