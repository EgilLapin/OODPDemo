package com.company.MediatorDemo;

import java.util.ArrayList;
import java.util.List;

public class RaceTeamMediatorImpl implements RaceTeamMediator {

    //concrete mediator class
    private List<TeamMember> teamMembers;

    public RaceTeamMediatorImpl() {
        this.teamMembers = new ArrayList<>();
    }

    @Override
    public void sendTeamOrders(String msg, TeamMember member) {
        for (TeamMember u : this.teamMembers) {
            if (u != member) {
                u.receive(msg);
            }
        }
    }


    @Override
    public void addTeamMember(TeamMember member) {
        this.teamMembers.add(member);
    }
}

