package com.springandjava.Test.effectivejava.chapter7.item45;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AnagramStream {
	public static void main(String[] args) throws IOException {
		Path dictionary = Paths.get(args[0]);
		int minGroupSize = Integer.parseInt(args[1]);

		try (Stream<String>words = Files.lines(dictionary)){
			words.collect(groupingBy(word -> alphabetize(word)))
				.values().stream()
				.filter(group -> group.size() >= minGroupSize)
				.forEach(g -> System.out.println(g.size() + ": " + g));

		}
	}
}
