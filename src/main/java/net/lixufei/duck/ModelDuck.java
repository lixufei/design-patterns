package net.lixufei.duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBahavior = new FliyNoWay();
        quackBahavior = new Quack();
    }

    @Override
    void display() {
        System.out.printf("model..duck");
    }
}
