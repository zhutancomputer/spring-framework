package cn.zhutan.myspringtest;

import cn.zhutan.myspringtest.controller.UserController;
import cn.zhutan.myspringtest.model.Employee;
import cn.zhutan.myspringtest.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@ComponentScan(basePackages = "cn.zhutan.myspringtest",
		excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {UserService.class}),
				@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
				@ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)},
		useDefaultFilters = false)*/

@Configuration
@ComponentScan
public class SpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringTest.class);
		System.out.println(UserController.class);
//		System.out.println(context.getBean(Employee.class));
	}

	@Bean
	public Employee employee() {
		System.out.println("Create employee");
		user();
		user();
		return new Employee();
	}

	@Bean
	public User user() {
		System.out.println("Create user");
		return new User();
	}

}
