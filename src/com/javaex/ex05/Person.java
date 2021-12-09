package com.javaex.ex05;

public class Person {
	protected String name;
	private String hp;
	private String company;
	
	
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	public void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("핸드폰 : "+hp);
		System.out.println("회사 : "+company);
		System.out.println("");
	}
	
	public String contact(String name, String hp, String company) {
		String contact= name+","+hp+","+company;
		return contact;
	}
}