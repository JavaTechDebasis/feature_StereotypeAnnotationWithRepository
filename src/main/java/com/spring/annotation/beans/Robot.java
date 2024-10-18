package com.spring.annotation.beans;

import org.springframework.stereotype.Repository;

@Repository("ios")
public class Robot {
    public void walk(int feet, String direction) {
        System.out.println("Walking "+feet+ " feet in "+direction+" direction");
    }
}
