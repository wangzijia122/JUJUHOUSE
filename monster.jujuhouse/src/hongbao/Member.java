package hongbao;

import java.util.ArrayList;
import java.util.Random;

//普通成员类
public class Member extends User{

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //从多个红包中随机抽一个，给自己
        //随机抽取集合中的一个索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合中删除，并且得到被删除的红包给自己
        int delta = list.remove(index);
        //当前成员自己本来有多少钱
        int money = super.getMoney();
        super.setMoney(money + delta);
    }
}
