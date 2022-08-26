package com.company.StateDemo;

public class EngineContext implements EngineState{

    private EngineState state;

    public void setState(EngineState state) {
        this.state=state;
    }

    public EngineState getState() {
        return this.state;
    }

    @Override
    public void checkEngineState() {
        this.state.checkEngineState();
    }
}
