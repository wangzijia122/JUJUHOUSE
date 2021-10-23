package myPractice.myInterface;
/*
接口当中可以定义"成员变量"，但是必须使用public static final三个关键字进行修饰。
从效果上看，这其实就是接口的【常量】
格式：
public static final 数据类型 常量名称 = 数据值;
 */
public interface MyInterfaceConst {

    //这其实就是一个常量，一旦赋值，不可以修改
        public static final int NUM_OF_MY_CLASS = 10;
}
