package com.company;

import com.company.BridgeDemo.DunlopTyreMaker;
import com.company.BridgeDemo.PirelliTyreMaker;
import com.company.BridgeDemo.RacingSlickTyre;
import com.company.BridgeDemo.SuperSportTyre;
import com.company.BridgeDemo.TyreType;
import com.company.FactoryDemo.Motorcycle;
import com.company.FactoryDemo.MotorcycleFactory;
import com.company.MediatorDemo.RaceTeamMediator;
import com.company.MediatorDemo.RaceTeamMediatorImpl;
import com.company.MediatorDemo.TeamMember;
import com.company.MediatorDemo.TeamMemberImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, this is a demo of OODPs");
        System.out.println("-----------------------------------");
        // 1 creational
        System.out.println("---START OF FACTORY PATTERN---");
        Motorcycle kawa = MotorcycleFactory.getMotorcycle("Kawasaki","636cc","plastic","zx6r");
        Motorcycle yammie = MotorcycleFactory.getMotorcycle("Yamaha","1000cc","carbon","r1");
        System.out.println("Factory Kawasaki Config::"+kawa);
        System.out.println("Factory Yamaha Config::"+yammie);
        System.out.println("---END OF FACTORY PATTERN---");
        System.out.println("-----------------------------------");
        // 1 structural
        System.out.println("---START OF BRIDGE DESIGN PATTERN---");
        TyreType slicks = new RacingSlickTyre(new DunlopTyreMaker());
        slicks.addTyreMaker();
        TyreType supersport = new SuperSportTyre(new PirelliTyreMaker());
        supersport.addTyreMaker();
        System.out.println("---END OF BRIDGE DESIGN PATTERN---");
        System.out.println("-----------------------------------");
        // 1 Behavioral
        System.out.println("---START OF MEDIATOR DESIGN PATTERN---");
        RaceTeamMediator mediator = new RaceTeamMediatorImpl();
        TeamMember rossi = new TeamMemberImpl(mediator,"Valentino Rossi");
        TeamMember fabio = new TeamMemberImpl(mediator,"Fabio Quartararo");
        TeamMember marco  = new TeamMemberImpl(mediator,"Marco Bezzecchi");
        TeamMember luca = new TeamMemberImpl(mediator,"Luca Marini");
        mediator.addTeamMember(rossi);
        mediator.addTeamMember(fabio);
        mediator.addTeamMember(marco);
        mediator.addTeamMember(luca);
        rossi.send("Race Race Race!");
        System.out.println("---END OF MEDIATOR DESIGN PATTERN---");
        System.out.println("-----------------------------------");
        // non-creational #3

        // non-creational #4



    }
}
