package myPractice.myInterface;

/*
注意：不能通过接口实现类的对象来调用接口当中的静态方法。
正确用法，通过接口名称直接调用。
接口名称.静态方法名(参数);
 */
public class MyInterface3 {

    public static void main(String[] args) {
        //错误写法：
//        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
//        impl.methodStatic();
        MyInterfaceStatic.methodStatic();
    }
}
