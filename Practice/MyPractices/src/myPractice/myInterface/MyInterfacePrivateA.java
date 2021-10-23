package myPractice.myInterface;

public interface MyInterfacePrivateA {

    public default void methodDefaultA() {
        System.out.println("默认方法1");
        //methodCommon();
    }

    public default void methodDefaultB() {
        System.out.println("默认方法2");
        //methodCommon();
    }
//JDK8以下不支持这个写法
//     private void methodCommon() {
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//  }
}
