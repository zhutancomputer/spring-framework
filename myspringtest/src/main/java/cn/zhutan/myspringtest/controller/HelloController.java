package cn.zhutan.myspringtest.controller;

import cn.zhutan.myspringtest.model.Employee;
import cn.zhutan.myspringtest.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public void hello(@ModelAttribute("user")User user, @ModelAttribute("employee") Employee employee) {
		System.out.println(user);
		System.out.println(employee);
	}

	@InitBinder("user")
	public void initUser(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("u.");
	}

	@InitBinder("employee")
	public void initEmployee(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("e.");
	}

	//	@InitBinder
//	public void init(WebDataBinder binder) {
//		System.out.println("aaa");
//	}

//	@ModelAttribute()
//	public User modelUser() {
//		User user = new User();
//		user.setUsername("modelUser");
//		return user;
//	}

}
