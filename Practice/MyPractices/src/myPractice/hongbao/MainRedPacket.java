package myPractice.hongbao;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主", 5213);

        Member one = new Member("成员A", 26);
        Member two = new Member("成员B", 47);
        Member three = new Member("成员C", 227);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==============");

        //群主发20红包,分3份
        ArrayList<Integer> redList = manager.send(80,3);
        //成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
