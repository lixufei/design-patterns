package net.lixufei.duck;

public class MiniDuckSimulator {
    public static void main (String[] args) {
        Duck duck = new MallarDuck();
        duck.performFly();
        duck.performQuack();

        Duck modelDuck = new ModelDuck();
        duck.performFly();
        duck.setFlyBahavior(new FliyRocketPower());
        duck.performFly();
    }
}
