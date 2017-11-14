package transaction;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("transaction/jdbc.xml");
		UserService userService = (UserService)context.getBean("userService");
		User user = new User();
		user.setName("haojia");
		user.setAge(1);
		user.setSex("sbsbssbsb");
		userService.save(user);
	}

}
