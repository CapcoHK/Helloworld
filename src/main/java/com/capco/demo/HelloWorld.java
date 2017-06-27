package com.capco.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Bhushan on 6/27/2017.
 */
public class HelloWorld {
    private final static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    public static void main(String[] args) {
        logger.info(new HelloWorld().message());
    }

    String message(){
        return "Hello world";
    }
}
