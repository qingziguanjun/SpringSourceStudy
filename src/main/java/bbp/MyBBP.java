package bbp;

import java.beans.PropertyDescriptor;

import javassist.expr.NewArray;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MyBBP implements InstantiationAwareBeanPostProcessor{

	public Object postProcessAfterInitialization(Object paramObject,
			String paramString) throws BeansException {
		// TODO Auto-generated method stub
		return new Object();
	}

	public Object postProcessBeforeInitialization(Object paramObject,
			String paramString) throws BeansException {
		System.out.println("============");
		return new Object();
	}

	public boolean postProcessAfterInstantiation(Object paramObject,
			String paramString) throws BeansException {
		// TODO Auto-generated method stub
		return false;
	}

	public Object postProcessBeforeInstantiation(Class<?> paramClass,
			String paramString) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public PropertyValues postProcessPropertyValues(
			PropertyValues paramPropertyValues,
			PropertyDescriptor[] paramArrayOfPropertyDescriptor,
			Object paramObject, String paramString) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

}
