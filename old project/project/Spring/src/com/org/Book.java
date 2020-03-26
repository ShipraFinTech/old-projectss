package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("boo")
public class Book {
    private History history;
    private Math2 math;

//    @Autowired(required = false)
//    public Book(Math2 math, History history) {
//        System.out.print("---------ghhhhhhhhhh-----------------");
//        this.math = math;
//        this.history = history;
//    }

//    @Autowired(required = false)
    public Book(History history) {
        this.history = history;
        System.out.println("====THIS CONSTRUCTOR===");
    }

    void display() {
        System.out.print("===========DISPLAY======");
        history.hello();
//        math.hello();
    }
}
