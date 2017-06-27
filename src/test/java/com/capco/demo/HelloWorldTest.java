package com.capco.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertSame;

/**
 * Created by Bhushan on 6/27/2017.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HelloWorldTest {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);
    private static HelloWorld testInstance = new HelloWorld();

    public void setup(){
        logger.info("Running Setup");
    }

    @Test
    public void test(){
        assertSame(testInstance.message(), "Hello world");
    }

}
