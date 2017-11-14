package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
		 Dao dao = (Dao)ac.getBean("daoImpl");
		
		 dao.select();
		 
		 String name = ac.getBean("addAllMethod").getClass().getName();
		 System.out.println(name);
	}

}
