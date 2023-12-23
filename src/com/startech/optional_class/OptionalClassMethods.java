package com.startech.optional_class;

import java.util.Optional;

public class OptionalClassMethods {

	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		// java.lang.NullPointerException
		// System.out.println("ofNullable on Non-Empty Optional: " +Optional.of(ans2));
		System.out.println("gender.isPresent() :" + gender.isPresent());

		// 1 . isPresent() : returns an Optional with the specified present non-null
		// value.
		Optional<String> opt = Optional.of("Ramesh");
		System.out.println("isPresent() :" + opt.isPresent());

		// 2 . empty():returns an empty Optional instance. No value is present for this
		// Optional.
		Optional<String> empty = Optional.empty();
		System.out.println("empty.isPresent() :" + empty.isPresent());
		// Optional object with the static of API:
		String name = "Sachin";
		Optional.of(name);

		// 3 . ifPresent() If a value is present, invoke the specified consumer with the
		// value, otherwise, do nothing.
		String newName = "Sachin Salunke";
		if (newName != null) {
			System.out.println("Name length :" + newName.length());
		}
		Optional<String> opt1 = Optional.of(newName);
		opt1.ifPresent(str -> System.out.println(str.length()));

		// 4 . orElse(): return the value if present otherwise returns another.
		String nullName = null;
		String orElse = Optional.ofNullable(nullName).orElse("Sachin");
		System.out.println("OrElse :" + orElse);

		// 5 . orElseGet() : Return the value if present, otherwise invoke other and
		// return the result of that invocation.
		String orElseGet = Optional.ofNullable(nullName).orElseGet(() -> "Sachin Salunke");
		System.out.println("orElseGet :" + orElseGet);

		// 6 . orElseThrow():Return the contained value, if present, otherwise throw an
		// exception to be created by the provided supplier.
		// String orElseThrow =
		// Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
		// System.out.println("orElseThrow :"+orElseThrow);

		// 7 . get() :If a value is present in this Optional, returns the value,
		// otherwise throws NoSuchElementException.
		Optional<String> get = Optional.of("Ramesh");
		System.out.println("get() :" + get.get());
	}

}
