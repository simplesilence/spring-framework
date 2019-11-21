package com.shaun.dao;

public class Dao2Impl extends DaoImpl implements Dao {

	int a = 4;

	public Dao2Impl(){
		this.test();
	}

	@Override
	public void test() {
		test2();
	}

	public void test2(){
		System.out.println("dao2");
	}

	public void test3(){
		System.out.println("dao2---test3");
	}

	public static void main(String[] args) {
		Dao2Impl dao2 = new Dao2Impl();

		System.out.println(dao2.a);

		dao2.query();
	}
}
