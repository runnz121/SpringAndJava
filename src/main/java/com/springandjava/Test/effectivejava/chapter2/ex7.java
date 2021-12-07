package com.springandjava.Test.effectivejava.chapter2;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ex7 {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT = 16;

	private ex7(){
		elements = new Object[DEFAULT];
	}

	public void push(Object e){
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop(){
		if (size == 0){
			throw new EmptyStackException();
		}
		Object result = elements[--size];
		elements[size] = null;
		return result;
	}

	private void ensureCapacity(){
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
}
