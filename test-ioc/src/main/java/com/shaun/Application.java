package com.shaun;

import com.shaun.config.AppConfig;
import com.shaun.dao.Dao;
import com.shaun.dao.DaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(AppConfig.class);

//		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext();
//		anno.register(DaoImpl.class);
//		anno.refresh();


		Object bean = anno.getBean("myFactoryBean");
//		bean.query();
//		System.out.println(bean);
	}
}
