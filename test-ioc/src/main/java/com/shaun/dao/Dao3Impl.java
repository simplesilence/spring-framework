package com.shaun.dao;

public class Dao3Impl extends Dao2Impl {

	public void test2(){
		System.out.println("dao3");
	}

	public static void main(String[] args) {
		Dao2Impl dao2 = new Dao3Impl();
	}
}
