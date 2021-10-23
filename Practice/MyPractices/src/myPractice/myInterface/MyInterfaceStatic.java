package myPractice.myInterface;
/*
格式：
public static 返回值类型 方法名称(参数列表) {
    //...
}
提示：就是将abstract或者default换乘成static即可，带上方法体。
 */

public interface MyInterfaceStatic {

    public static void methodStatic() {
        System.out.println("这是接口当中的静态方法");
    }
}
