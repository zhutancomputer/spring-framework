package cn.zhutan.myspringtest;

import cn.zhutan.myspringtest.controller.UserController;
import cn.zhutan.myspringtest.filter.MyTypeFilter;
import cn.zhutan.myspringtest.model.Employee;
import cn.zhutan.myspringtest.model.User;
import cn.zhutan.myspringtest.service.impl.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/*@ComponentScan(basePackages = "cn.zhutan.myspringtest",
		excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {UserService.class}),
				@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
				@ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)},
		useDefaultFilters = false)*/

@Configuration
@ComponentScan(basePackages = {"cn.zhutan.myspringtest"},
		includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)},
		useDefaultFilters = false)
public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringTest.class);
		System.out.println(context.getBean(User.class));
		System.out.println(context.getBean(UserController.class));
		System.out.println(context.getBean(UserService.class));
		System.out.println(context.getBean(Employee.class));
	}
}
