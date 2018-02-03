package com.hexa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.domain.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Main method() start");

    	ApplicationContext context = new ClassPathXmlApplicationContext("com/hexa/cfgs/spring.xml");
    	ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/hexa/cfgs/spring.xml");
    	//Resource resource = new ClassPathResource("com/hexa/cfgs/spring.xml");
             //   XmlBeanFactory factory = new XmlBeanFactory(resource);
        Employee emp = context.getBean("employee",Employee.class);
        
        emp.message();
        
        System.out.println("Main method() end");
        
    }
}
