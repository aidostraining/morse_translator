package com.company;

public class Alphabet {
    private static final char[] ENGLISH = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w','x', 'y', 'z',
            ' ', '\n'};

    private static final String[] MORSE = {
            ".−", "−...", "−.−.", "−..", ".", "..−.", "−−.", "....", "..", ".−−−", "−.−",
                ".−..", "−−", "−.", "−−−", ".−−.", "−−.−", ".−.", "...", "−", "..−", "...−", ".−−", "−..−",
                "−.−−", "−−..", " ", "\n"};

    public static char[] getEnglish() {
        return ENGLISH;
    }
    public static String[] getMorse() {
        return MORSE;
    }
}


