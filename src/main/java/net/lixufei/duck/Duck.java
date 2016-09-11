package net.lixufei.duck;

// 抽象方法的类必须是抽象类
abstract class Duck {
    FlyBahavior flyBahavior;
    QuackBahavior quackBahavior;

    public void setFlyBahavior(FlyBahavior flyBahavior) {
        this.flyBahavior = flyBahavior;
    }

    public void setQuackBahavior(QuackBahavior quackBahavior) {
        this.quackBahavior = quackBahavior;
    }

    public void performFly () {
        flyBahavior.fly();
    }

    public void performQuack () {
        quackBahavior.quack();
    }

    public void swim() {

    };

    //抽象方法没有方法体
    abstract void display();


}
