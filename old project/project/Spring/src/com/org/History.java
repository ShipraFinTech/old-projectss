package com.org;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
public class History {

    void hello() {
        System.out.print("<------------Hello com.org.History----------->");
    }
}
