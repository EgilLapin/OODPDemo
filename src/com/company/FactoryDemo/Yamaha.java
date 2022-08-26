package com.company.FactoryDemo;

public class Yamaha extends Motorcycle{

    //Sub Class
    private String engine;
    private String fairings;
    private String chassis;

    public Yamaha(String engine, String fairings, String chassis){
        this.engine=engine;
        this.fairings=fairings;
        this.chassis=chassis;
    }
    @Override
    public String getEngine() {
        return this.engine;
    }

    @Override
    public String getFairings() {
        return this.fairings;
    }

    @Override
    public String getChassis() {
        return this.chassis;
    }
}
