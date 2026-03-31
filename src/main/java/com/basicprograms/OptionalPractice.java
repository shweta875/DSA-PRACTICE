package com.basicprograms;

import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        Optional<String> shweta = Optional.of("shweta");
        System.out.println(shweta);

        Optional<String> shweta1 = Optional.ofNullable("shweta");
        System.out.println(shweta1);
    }
}
