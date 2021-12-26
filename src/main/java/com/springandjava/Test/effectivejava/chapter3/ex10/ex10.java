package com.springandjava.Test.effectivejava.chapter3.ex10;

import java.util.Objects;

public class ex10 {

	private final String s;

	public ex10(String s){
		this.s = Objects.requireNonNull(s);
	}

}
