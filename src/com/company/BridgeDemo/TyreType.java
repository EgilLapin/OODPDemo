package com.company.BridgeDemo;

public abstract class TyreType {
    //implementor
    protected TyreMaker tyreMaker;

    //constructor with implementor as input argument
    public TyreType(TyreMaker t) {
        this.tyreMaker=t;
    }

    abstract public void addTyreMaker();
}
