package com.springandjava.Test.effectivejava.chapter2;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test {
	public void Test() {
		List.of(4, 3, 2, 5)
			.stream()
			.map(value -> {
				return value > 2 ? Optional.of(value) : Optional.empty();
			})
			.peek(v -> {
				// 넘어오는 값을 출력하기 위함
				System.out.println("peek: " + v);
			})
			.flatMap(new Function<Optional<? extends Object>, Stream<?>>() { //function = 인터페이스이고, new Function(T,R)이면)
				//R = 리턴타입 T는 인자값 -> R apply(T t)를 구현해서 함수 인터페이스를 구현해야 한다.
				@Override
				public Stream<?> apply(Optional<?> o) {
					System.out.println("flatMap: " + o);
					return o.stream();
				}
			})
			.forEach(v -> {
				System.out.println("forEach: " + v);
			});
	}
}

// peek: Optional[4]
// 	flatMap: Optional[4]
// 	forEach: 4
// 	peek: Optional[3]
// 	flatMap: Optional[3]
// 	forEach: 3
// 	peek: Optional.empty
// 	flatMap: Optional.empty
// 	peek: Optional[5]
// 	flatMap: Optional[5]
// 	forEach: 5