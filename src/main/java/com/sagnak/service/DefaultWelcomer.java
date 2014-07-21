package com.sagnak.service;

public class DefaultWelcomer implements Welcomer {

    @Override
    public String sayHello(String name) {
        return "hello "+ name + " from DefaultWelcomer";
    }

}
