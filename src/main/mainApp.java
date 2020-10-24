package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testbean.MySpringWriterBeanWithDependency;

public class mainApp {
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("META-INF/beans.xml");

		BeanFactory factory = context;
		MySpringWriterBeanWithDependency test = (MySpringWriterBeanWithDependency) factory
		 .getBean("MySpringWriterBeanWithDependency");
		 test.run();
	}
}
