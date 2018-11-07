package aopannotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopAnnotationTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop-annotation.xml");
		TestBean bean = (TestBean)ac.getBean("test");
		bean.test();
		 String[] bbpNames = ac.getBeanNamesForType(BeanPostProcessor.class, true, false);
		 System.out.println("**************");
		 for(String name:bbpNames){
			 Object bean1 = ac.getBean(name);
			 System.out.println(bean1.getClass().getName());
			 System.out.println(name);
		 }
		 //BeanDefinition
		
	}

}
