package Simulator;

import DuckFactory.AbstractDuckFactory;
import DuckFactory.CountingDuckFactory;
import Goose.Goose;
import Goose.GooseAdapter;
import Pigeon.Pigeon;
import Pigeon.PigeonAdapter;
import duck.*;
import flock.Flock;
import quack.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable redHeadDuck2 = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Flock flock = new Flock();
        flock.add(redheadDuck);
        flock.add(redHeadDuck2);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseDuck);
        flock.add(mallardDuck);
        flock.add(pigeon);
        flock.add(duckCall);


        System.out.println("\nDuck simulator");
        simulate(flock);
        System.out.println("\nthe ducks quacked "+ QuackCounter.getNumberOfQuack() );
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}