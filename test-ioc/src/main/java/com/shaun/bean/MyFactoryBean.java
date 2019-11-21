package com.shaun.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean {

	@Override
	public Object getObject() throws Exception {

		System.out.println("测试FactoryBean的调用时机");

		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
