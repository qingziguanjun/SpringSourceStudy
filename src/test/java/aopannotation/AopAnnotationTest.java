package aopannotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopAnnotationTest {

	/**
	 * �ο��£�
	 * http://www.cnblogs.com/liaojie970/p/7883687.html
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop-annotation.xml");

		String[] names = ac.getBeanDefinitionNames();
		for(String name : names){
			System.out.println(name);
		}
			
		
		TestBean bean = (TestBean)ac.getBean("test");
		bean.test();
		
		/** BP��ѧϰ����
		//�鿴������ЩBP
		//����ֻ������AOP��ʹ����
		  org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator
		  org.springframework.aop.config.internalAutoProxyCreator
		**/
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
