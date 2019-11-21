package com.shaun.dao;

import org.springframework.stereotype.Component;

public abstract class DaoImpl implements Dao {

	int a = 2;

	@Override
	public void query(){
		System.out.println("query");
		test();
	}

	public abstract void test();

	private void test2(){
		System.out.println("父类private");
	}

}
