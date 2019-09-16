package duck;

import quack.Quackable;

public class QuackEcho implements Quackable {
    Quackable duck;
    static int numberOfQuack;
    public QuackEcho(Quackable duck){
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
    }
    private void echo(){
        System.out.println("Echo: ");
        duck.quack();
    }
}
