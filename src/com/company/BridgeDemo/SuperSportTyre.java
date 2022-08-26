package com.company.BridgeDemo;

public class SuperSportTyre extends TyreType{

    public SuperSportTyre(TyreMaker s) {
        super(s);
    }
    @Override
    public void addTyreMaker() {
        System.out.print("Super Sport Tyre ordered to be made by: ");
        tyreMaker.addTyreMaker();
    }
}


