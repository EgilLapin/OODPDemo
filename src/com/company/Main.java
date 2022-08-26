package com.company;

import com.company.FactoryDemo.Motorcycle;
import com.company.FactoryDemo.MotorcycleFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, this is a demo of OODPs");
        System.out.println("---START OF FACTORY PATTERN---");
        Motorcycle kawa = MotorcycleFactory.getMotorcycle("Kawasaki","636cc","plastic","zx6r");
        Motorcycle yammie = MotorcycleFactory.getMotorcycle("Yamaha","1000cc","carbon","r1");
        System.out.println("Factory Kawasaki Config::"+kawa);
        System.out.println("Factory Yamaha Config::"+yammie);
        System.out.println("---END OF FACTORY PATTERN---");
        // 1 behavioral
        // 1 structural
        // 4 non-creational in total



    }
}
