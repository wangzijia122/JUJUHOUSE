package myPractice.myInterface;

/*
格式：
public default 返回值类型 方法名称() {
        //...
}
备注：
1.接口中的默认方法，可以解决接口升级导致接口调用不兼容的问题。
2.默认方法可以被实现类覆盖重写。
 */

public interface MyInterfaceDefault {

    public abstract void methodAbs1();

//    public abstract void methodAbs2();

    public default void methodDefault () {
        System.out.println("这是新添加的默认方法");
    }
}
