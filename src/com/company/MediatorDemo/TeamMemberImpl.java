package com.company.MediatorDemo;

public class TeamMemberImpl extends TeamMember{
    //create concrete TeamMember classes to be used by client system

    public TeamMemberImpl(RaceTeamMediator med, String name){
        super(med, name);
    }
    @Override
    public void send(String msg) {
        System.out.println(this.name+": Sending Team Order: "+msg);
        mediator.sendTeamOrders(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Team Order: "+msg);
    }
}
