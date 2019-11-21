package com.shaun;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class XmlApplication {

	public static void main(String[] args) {

//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring.xml"));

		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("spring.xml");

//		bf.getBean("");
	}
}
