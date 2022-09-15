package programing;

public interface inter extends inter1, inter2 {
    public static void sayHello() {
        System.out.println("你好呀世界");
    }

    public default void sayGood() {
        sayGoodBye();
        System.out.println("Good");
    }

    public static final String USERNAME = "你好呀";
    private void sayGoodBye(){
        System.out.println("我是私有方法");
    }
}
