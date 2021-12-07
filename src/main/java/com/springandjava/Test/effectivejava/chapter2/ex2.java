package com.springandjava.Test.effectivejava.chapter2;

public class ex2 {
	private final int size;
	private final int servings;
	private final int fat;
	private final int sodium;
	private final int cal;

	public static class Builder {
		private final int size;
		private final int servings;
		private int fat = 0;
		private int sodium = 0;
		private int cal = 0;

		public Builder(int size, int servings){
			this.size = size;
			this.servings = servings;
		}

		public Builder calories(int val){
			cal = val;
			return this;
		}
		public Builder fat(int val){
			fat = val;
			return this;
		}
		public Builder sodium(int val){
			sodium = val;
			return this;
		}

		public ex2 build() {
			return new ex2(this);
		}
	}

	private ex2(Builder builder) {
		servings = builder.servings;
		size = builder.size;
		fat = builder.fat;
		cal = builder.cal;
		sodium = builder.sodium;
	}
}
