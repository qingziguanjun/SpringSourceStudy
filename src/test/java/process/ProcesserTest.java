package process;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProcesserTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 ApplicationContext bf = new ClassPathXmlApplicationContext("beans.xml");
		 Object b = bf.getBean("testBean");
		 System.out.println(b.getClass().getName());
//		 String[] bbpNames = bf.getBeanNamesForType(BeanPostProcessor.class, true, false);
//		 System.out.println("**************");
//		 for(String name:bbpNames){
//			 System.out.println(name);
//		 }
		 
	}

}
