package com.company.DecoratorDemo;

public class BasicSportbike implements Sportbike{
    //implementation of the component interface
    @Override
    public void assemble() {
        System.out.print("Getting a Basic Sportbike...");
    }
}
