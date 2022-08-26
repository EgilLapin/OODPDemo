package com.company.StateDemo;

public class EngineStopState implements EngineState{
    @Override
    public void checkEngineState() {
        System.out.println("Engine is stopped...");
    }
}
