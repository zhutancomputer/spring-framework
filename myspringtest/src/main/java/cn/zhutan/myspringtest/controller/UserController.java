package cn.zhutan.myspringtest.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	/*public UserController(UserService userService) {
		System.out.println(userService);
		System.out.println("=====================");
	}*/
	public void printHashCode() {
		System.out.println(this.hashCode());
	}
}
