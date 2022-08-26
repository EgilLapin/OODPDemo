package com.company.MediatorDemo;

public interface RaceTeamMediator {
    //define the contract for concrete mediators

    public void sendTeamOrders(String msg, TeamMember member);

    void addTeamMember(TeamMember member);
}
