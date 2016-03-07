package com.yahoo.ec.parsec;

import java.lang.instrument.Instrumentation;

/**
 * Created by guang001 on 3/7/16.
 */
public class TestAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Test Java Agent");
    }
}
