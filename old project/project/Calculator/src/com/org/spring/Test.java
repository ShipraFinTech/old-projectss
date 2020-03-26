package com.org.spring;


import java.io.PrintStream;

public class Test {
    private PrintStream printStream;
    private Operator operator;

    Test(PrintStream printStream, Operator operator) {

        this.printStream = printStream;
        this.operator = operator;
    }

    public void test() {
        printStream.print("HELLO");
    }
}
