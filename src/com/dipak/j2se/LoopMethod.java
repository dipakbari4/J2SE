package com.dipak.j2se;

public class LoopMethod {
    public static void main(String[] args) {
        System.out.println(firstMethod("Hello"));
    }

    static String firstMethod(String param) {
        return secondMethod(param);
    }

    static String secondMethod(String param) {
        return firstMethod(param);
    }
}
