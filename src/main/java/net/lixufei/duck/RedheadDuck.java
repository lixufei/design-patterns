package net.lixufei.duck;

public class RedheadDuck extends Duck {
    //继承了抽象类必须重写抽象方法或者自己本身是抽象类
    @Override
    void display() {
        System.out.printf("red");
    }
}
