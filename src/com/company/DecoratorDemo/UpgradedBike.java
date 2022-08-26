package com.company.DecoratorDemo;

public class UpgradedBike extends SportbikeDecorator{

    public UpgradedBike(Sportbike s) {
        super(s);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Upgrading features of a race spec bike.");
    }

}
