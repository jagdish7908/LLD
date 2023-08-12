package com.lld.designpatterns;

public class Client {
    public static void main(String[] args) {
        for (var i = 0; i < 10; i++) {
            var singletonObj = Singleton.getInstance();
        }
    }
}
