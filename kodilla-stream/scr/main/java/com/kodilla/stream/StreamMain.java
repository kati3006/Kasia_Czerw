package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("text", t -> t + "ABC"));
        System.out.println(poemBeautifier.beautify("text", t -> t.toUpperCase()));
        System.out.println(poemBeautifier.beautify("text", t -> "```" + t + "```"));
        System.out.println(poemBeautifier.beautify("text", t -> t.replaceFirst("t", "T")));
    }
}
