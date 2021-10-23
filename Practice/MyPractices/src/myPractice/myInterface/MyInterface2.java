package myPractice.myInterface;

public class MyInterface2 {

    public static void main(String[] args) {

        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs1();

        //调用默认方法，如果实现类中没有，会向上找接口
        a.methodDefault();
        System.out.println("==========");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs1();
        b.methodDefault();
    }
}
