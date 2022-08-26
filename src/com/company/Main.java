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
        System.out.println("---START OF FACTORY PATTERN---");

        Motorcycle kawa = MotorcycleFactory.getMotorcycle("Kawasaki","636cc","plastic","zx6r");
        Motorcycle yammie = MotorcycleFactory.getMotorcycle("Yamaha","1000cc","carbon","r1");
        System.out.println("Factory Kawasaki Config::"+kawa);
        System.out.println("Factory Yamaha Config::"+yammie);

        System.out.println("---END OF FACTORY PATTERN---");
        System.out.println("-----------------------------------");
        //Structural 1
        System.out.println("---START OF BRIDGE DESIGN PATTERN---");

        TyreType slicks = new RacingSlickTyre(new DunlopTyreMaker());
        slicks.addTyreMaker();
        TyreType supersport = new SuperSportTyre(new PirelliTyreMaker());
        supersport.addTyreMaker();

        System.out.println("---END OF BRIDGE DESIGN PATTERN---");
        System.out.println("-----------------------------------");
        //Behavioral 2
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
        //Structural 2
        System.out.println("---START OF DECORATOR DESIGN PATTERN---");

        Sportbike upgraded = new UpgradedBike(new BasicSportbike());
        upgraded.assemble();
        System.out.println("\n");
        Sportbike upgradedWSBKBike = new WSBKSpecBike(new UpgradedBike(new BasicSportbike()));
        upgradedWSBKBike.assemble();
        System.out.println("\n---END OF DECORATOR DESIGN PATTERN---");
        System.out.println("-----------------------------------");
        //Behavioral 2
        System.out.println("---START OF STATE DESIGN PATTERN---");
        EngineContext context = new EngineContext();
        EngineState startEngine = new EngineStartState();
        EngineState stopEngine = new EngineStopState();
        context.setState(startEngine);
        context.checkEngineState();
        context.setState(stopEngine);
        context.checkEngineState();
        System.out.println("---END OF STATE DESIGN PATTERN---");
    }
}
