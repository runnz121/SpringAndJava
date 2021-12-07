package com.springandjava.Test.effectivejava.chapter2;

import java.lang.ref.Cleaner;

public class ex8 implements AutoCloseable {

	private static final Cleaner cleaner = Cleaner.create();


	//State -> runnalbe 구현
	private static class State implements Runnable {
		int numJunkPiles;

		State(int numJunkPiles){
			this.numJunkPiles = numJunkPiles;
		}

		@Override
		public void run(){
			System.out.println("방 청소");
			numJunkPiles = 0;
		}
	}

	//clenable과 광유
	private final State state;

	private final Cleaner.Cleanable cleanable;

	public ex8(int numJunkPiles) {
		state = new State(numJunkPiles);
		cleanable = cleaner.register(this, state);
	}

	//안전망
	@Override
	public void close(){
		cleanable.clean();
	}

}
