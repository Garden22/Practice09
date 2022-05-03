package com.javaex.ex03;

public class Goods {

	private String name;
	private int price;
	private int count;
	public static int total = 0;
	
	public Goods() {

	}
	
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
		total += count;
	}

	public String toString() {
		return name + "(가격:" + price + "원)이 " + count + "개 입고되었습니다.";
	}

}
