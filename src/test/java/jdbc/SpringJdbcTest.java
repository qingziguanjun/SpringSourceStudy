package jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		UserService userService = (UserService)context.getBean("userService");
		
		User user = new User();
		user.setName("haojia");
		user.setAge(1);
		user.setSex("sbsbssbsb");
		userService.save(user);
		List<User> person =userService.getUsers();
		System.out.println("user");
		for(User u: person){
			System.out.println(u.getId() + "   " + u.getName()+ "   "
					+ u.getAge()+ "   " + u.getSex());
		}
        

	}

}
