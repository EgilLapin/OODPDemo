package com.company;

import com.company.BridgeDemo.DunlopTyreMaker;
import com.company.BridgeDemo.PirelliTyreMaker;
import com.company.BridgeDemo.RacingSlickTyre;
import com.company.BridgeDemo.SuperSportTyre;
import com.company.BridgeDemo.TyreType;
import com.company.DecoratorDemo.BasicSportbike;
import com.company.DecoratorDemo.Sportbike;
import com.company.DecoratorDemo.UpgradedBike;
import com.company.DecoratorDemo.WSBKSpecBike;
import com.company.FactoryDemo.Motorcycle;
import com.company.FactoryDemo.MotorcycleFactory;
import com.company.MediatorDemo.RaceTeamMediator;
import com.company.MediatorDemo.RaceTeamMediatorImpl;
import com.company.MediatorDemo.TeamMember;
import com.company.MediatorDemo.TeamMemberImpl;
import com.company.StateDemo.EngineContext;
import com.company.StateDemo.EngineStartState;
import com.company.StateDemo.EngineState;
import com.company.StateDemo.EngineStopState;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, this is a demo of OODPs");
        System.out.println("-----------------------------------");
        //Creational 1
        System.out.println("Creating Base Motorcycles with FACTORY PATTERN");
        Motorcycle kawa = MotorcycleFactory.getMotorcycle("Kawasaki","636cc","plastic","zx11rr");
        Motorcycle yammie = MotorcycleFactory.getMotorcycle("Yamaha","1000cc","carbon","r1");
        System.out.println("Factory Kawasaki Config::"+kawa);
        System.out.println("Factory Yamaha Config::"+yammie);
        System.out.println("-----------------------------------");

        //Structural 1
        System.out.println("Adding Tyres to Motorcycles using BRIDGE DESIGN PATTERN ");
        TyreType slicks = new RacingSlickTyre(new DunlopTyreMaker());
        slicks.addTyreMaker();
        TyreType supersport = new SuperSportTyre(new PirelliTyreMaker());
        supersport.addTyreMaker();
        System.out.println("-----------------------------------");

        //Structural 2
        System.out.println("Upgrading  Motorcycles using DECORATOR DESIGN PATTERN ");
        Sportbike upgraded = new UpgradedBike(new BasicSportbike());
        upgraded.assemble();
        System.out.println("\n");
        Sportbike upgradedWSBKBike = new WSBKSpecBike(new UpgradedBike(new BasicSportbike()));
        upgradedWSBKBike.assemble();
        System.out.println("-----------------------------------");

        //Behavioral
        System.out.println("Checking Engine state before race using  using STATE DESIGN PATTERN");
        EngineContext context = new EngineContext();
        EngineState startEngine = new EngineStartState();
        EngineState stopEngine = new EngineStopState();
        context.setState(stopEngine);
        context.checkEngineState();
        context.setState(stopEngine);
        context.checkEngineState();
        System.out.println("-----------------------------------");

        //Behavioral
        System.out.println("Giving the race start using MEDIATOR DESIGN PATTERN");
        RaceTeamMediator mediator = new RaceTeamMediatorImpl();
        TeamMember johnny = new TeamMemberImpl(mediator,"JONATHAN REA");
        TeamMember toprak = new TeamMemberImpl(mediator,"TOPRAK RAZGATLIOGLU");
        TeamMember alex  = new TeamMemberImpl(mediator,"ALEX LOWES");
        TeamMember roberto = new TeamMemberImpl(mediator,"ROBERTO TAMBURINI");
        mediator.addTeamMember(johnny);
        mediator.addTeamMember(toprak);
        mediator.addTeamMember(alex);
        mediator.addTeamMember(roberto);
        johnny.send("Race Race Race!");
        System.out.println("-----------------------------------");
        System.out.println("---Jonathan Rea Wins the race!---");
        System.out.println("-----------------------------------");


    }
}
