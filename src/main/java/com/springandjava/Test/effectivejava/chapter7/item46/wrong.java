package com.springandjava.Test.effectivejava.chapter7.item46;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.security.sasl.SaslClient;

public class wrong {
	Map<String, Long> freq = new HashMap<>();
	try (Stream<String> words = new Scanner(file).tokens()) {
		words.forEach(word -> {
			freq.merge(word.toLowerCase(), 1L, Long::sum);
		});
	}
}
