package programing;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Father son = new Son("行必果");
        inter in = new Son("dfd");
        inter.sayHello();
        in.sayGood();
        System.out.println(((Son)in).name);
        int a = 1;
        switch (a){
            case 1 -> System.out.println("锤子");
            case 2 -> System.out.println("镰刀");
        }
    }
}
class Son extends Father implements inter{
    String name = "jack";
    public Son(String name){
        super(name);
        System.out.println("我是儿子");
    }

    @Override
    public void sayGood() {
        System.out.println("重写后的good");
    }

    @Override
    public void prefer() {

    }
}
