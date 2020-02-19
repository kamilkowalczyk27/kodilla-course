package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beautifulText1 = poemBeautifier.beautify("Jan Kowalski", (text -> text.toUpperCase()));
        System.out.println(beautifulText1);
        String beautifulText2 = poemBeautifier.beautify("JAN KOWALSKI", (text -> text.toLowerCase()));
        System.out.println(beautifulText2);
        String beautifulText3 = poemBeautifier.beautify("Jan Kowalski", (text -> "ABC" + text + "ABC"));
        System.out.println(beautifulText3);
        String beautifulText4 = poemBeautifier.beautify("JAN KOWALSKI", (text -> "*" + text + "*"));
        System.out.println(beautifulText4);
        String beautifulText5 = poemBeautifier.beautify("JAN KOWALSKI", (text -> text.length() + " " + text + " " +text.length()));
        System.out.println(beautifulText5);
        String beautifulText6 = poemBeautifier.beautify("jan kowalski", (text -> text.replace("jan","JAN")));
        System.out.println(beautifulText6);
    }
}
