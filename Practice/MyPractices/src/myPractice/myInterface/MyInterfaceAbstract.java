package myPractice.myInterface;

/*1.接口当中的抽象方法,修饰符必须是两个固定的关键字：public abstract
这两个关键字可以省略
2.接口不能直接使用,必须有一个"实现类"来"实现"该接口。
格式：
public class 实现类名称 implements 接口名称 {
       //...
}
接口实现类必须覆盖重写接口中的所有抽象方法。
实现：去掉abstract挂件自,加上方法体大括号。
创建实现类的对象，进行使用。
*/
public interface MyInterfaceAbstract {

    public abstract void methodAbs1();

    abstract void methodAbs2();

    public void methodAbs3();

    void methodAbs4();

}
