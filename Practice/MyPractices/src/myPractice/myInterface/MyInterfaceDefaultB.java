package myPractice.myInterface;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs1() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写了默认方法");
    }
}
