package com.org.spring;


import java.util.Scanner;
import java.io.PrintStream;

public class Inuput {
    private int output;
    private int a, b;
    private String opertor;
    private PrintStream printStream;

    private Operator operator;

    public Inuput(PrintStream printStream, Operator operator) {
        this.printStream = printStream;
        this.operator = operator;
    }

    public Inuput() {

    }

    public void calculateData() {
        try {
            if (opertor.equals("+")) {
                output = operator.add(a, b);
            } else if (opertor.equals("*")) {
                output = operator.multi(a, b);
            } else if (opertor.equals("/")) {
                output = operator.division(a, b);
            } else {
                printStream.print("Please choose right operator");
            }
        } catch (Exception ex) {
            printStream.print("=======Exception======" + ex);
        }
    }

    public void beforeInput() {
        printStream.print("Please Enter 2 Digit");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        printStream.print("Please Enter Operator");
        opertor = scanner.next();
    }

    public void afterInput() {
        printStream.print("output is:" + output);
    }

    public void test() {
        System.out.print("HELLO");
    }
}
