package com.company.BridgeDemo;

public class RacingSlickTyre extends TyreType{

    public RacingSlickTyre(TyreMaker s) {
        super(s);
    }
    @Override
    public void addTyreMaker() {
        System.out.print("Racing Slick Tyre ordered to be made by: ");
        tyreMaker.addTyreMaker();
    }
}
