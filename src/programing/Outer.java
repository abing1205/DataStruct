package programing;

public class Outer {
    int a = 10;
    String name;
    static String hobby = "唱跳rap";
    public void prefer(){
        inter1 in = new inter1(){
            public void prefer(){
                System.out.println("我是匿名内部类");
            }
        };
        in.prefer();
    }
    public void show(){
        Inner in = new Inner();
        System.out.println(in.name);
    }
    public class Inner{
        int a = 20;
        String name = "Inner";
        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }
    }
    public static class StaticInner{
        public void show(){
            System.out.println(Outer.hobby);
        }
    }
}
class Test2{
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.prefer();

        Outer.Inner in = new Outer().new Inner();
        System.out.println(in.name);
        in.show();

        Outer.StaticInner staIn = new Outer.StaticInner();
        staIn.show();
    }
}
