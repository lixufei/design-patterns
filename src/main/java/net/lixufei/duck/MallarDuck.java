package net.lixufei.duck;

public class MallarDuck extends Duck {

    public MallarDuck() {
        flyBahavior = new FliyWithWings();
        quackBahavior = new Quack();
    }

    @Override
    void display() {
        System.out.printf("green");
    }
}
