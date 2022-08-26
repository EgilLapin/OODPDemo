package com.company.MediatorDemo;

public abstract  class TeamMember {

    protected RaceTeamMediator mediator;
    protected String name;

    public TeamMember(RaceTeamMediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
