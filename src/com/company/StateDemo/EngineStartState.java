package com.company.StateDemo;

public class EngineStartState implements EngineState{

    @Override
    public void checkEngineState() {
        System.out.println("Engine is started...");
    }
}
