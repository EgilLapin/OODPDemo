package com.company.FactoryDemo;

public abstract class Motorcycle {
    //superclass
    public abstract String getEngine();
    public abstract String getFairings();
    public abstract String getChassis();

    @Override
    public String toString(){
        return "Engine = "+this.getEngine()+", Fairings = "+this.getFairings()+", Chassis = "+this.getChassis();
    }
}
