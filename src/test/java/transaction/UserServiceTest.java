package transaction;



import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.interceptor.TransactionInterceptor;

public class UserServiceTest {

	public static void printBeans(ApplicationContext context){
		String[] names = context.getBeanDefinitionNames();
		for(String name : names){
			System.out.print(name + "----------->");
			Object bean1 = context.getBean(name);
			System.out.println(bean1.getClass().getName());
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("transaction/jdbc.xml");
		System.out.println("所有的bean");
		printBeans(context);
		System.out.println("#########");
			
		
		UserService userService = (UserService)context.getBean("userService");
		
		User user = new User();
		user.setName("haojia5");
		user.setAge(2);
		user.setSex("sbsbssbsb");
		//userService.save(user);
		//TransactionInterceptor
		String[] bbpNames = context.getBeanNamesForType(BeanPostProcessor.class, true, false);
	    System.out.println("**************");
		for(String name:bbpNames){
			Object bean1 = context.getBean(name);
			System.out.println(bean1.getClass().getName());
			System.out.println(name);
		}
		//InfrastructureAdvisorAutoProxyCreator
	}

}
