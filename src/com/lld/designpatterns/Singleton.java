package com.lld.designpatterns;

public class Singleton {
    private static int objectCount = 0;
    public static Singleton getInstance() {
        return new Singleton();
    }

    private Singleton() {
        objectCount++;
        System.out.println(objectCount + " Singleton object(s) created");
    }
}
