package com.designpatterns;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
