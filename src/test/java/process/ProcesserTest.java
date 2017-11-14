package process;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProcesserTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 ApplicationContext bf = new ClassPathXmlApplicationContext("beans.xml");
		 bf.getBean("testBean");
	}

}
