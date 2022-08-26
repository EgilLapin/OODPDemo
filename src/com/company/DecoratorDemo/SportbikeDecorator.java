package com.company.DecoratorDemo;

public class SportbikeDecorator implements Sportbike{
    //implements the component interface
    protected Sportbike sportbike;

    public SportbikeDecorator(Sportbike s){
        this.sportbike=s;
    }

    @Override
    public void assemble() {
        this.sportbike.assemble();
    }
}
