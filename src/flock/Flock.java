package flock;

import quack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    private ArrayList<Quackable> quackers = new ArrayList();
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        for(int i=0;i<quackers.size();i++){
            Quackable quacker = quackers.get(i);
            if(i==0){
                quacker.quack();
                quacker.quack();
                quacker.quack();
            }else{
                quacker.quack();
            }
        }
    }
}
