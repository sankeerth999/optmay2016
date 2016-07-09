package com.assignment.july9;

public class Box<T> {

	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	public static void main(String[] args) {
		
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		
		integerBox.add(new Integer(10));
		stringBox.add(new String("Heyya"));
		
		System.out.println("Integer Value : " + integerBox.get());
		System.out.println("String value : " + stringBox.get());
	}

}
