package com.company.DecoratorDemo;

public class WSBKSpecBike extends SportbikeDecorator{

    public WSBKSpecBike(Sportbike s) {
        super(s);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Upgrading features to a WSBK spec race bike");
    }
}
