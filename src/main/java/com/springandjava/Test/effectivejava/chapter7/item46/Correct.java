package com.springandjava.Test.effectivejava.chapter7.item46;

import static java.util.stream.Collectors.*;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Correct {
	Map<String, Long> freq;
	try (Stream<String> words = new Scanner(file).tokens()) {
		freq = words
			.collect(groupingBy(String::toLowerCase, counting()));
	}
}
