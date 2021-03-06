package aopannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJTest {
	
	@Pointcut("execution ( * *.test(..))")
	public void test(){
		System.err.println("in test");
	}
	
	@Before("test()")
	public void beforeTest(){
		System.out.println("before test");
	}
	
	@After("test()")
	public void afterTest(){
		System.out.println("afterTest");
	}
	
	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p){
		System.out.println("before1");
		Object o=null;
		try{
			o=p.proceed();
		}catch(Throwable e){
			e.printStackTrace();
		}
		System.out.println("after1");
		return o;
	}
}
