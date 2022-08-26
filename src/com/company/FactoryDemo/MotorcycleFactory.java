package com.company.FactoryDemo;

public class MotorcycleFactory {
        //factory class
    public static Motorcycle getMotorcycle(String type, String engine, String fairings, String chassis) {
        if ("Kawasaki".equalsIgnoreCase(type)) return new Kawasaki(engine, fairings, chassis);
        else if ("Yamaha".equalsIgnoreCase(type)) return new Yamaha(engine, fairings, chassis);

        return null;
    }

}
