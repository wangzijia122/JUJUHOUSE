package hongbao;

import java.util.ArrayList;

public class Manager extends User{
//群主的类
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getMoney(); //群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;//返回空集合
        }

        //扣钱,其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发等额红包，总金额拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        //剩下除不开的零头，包在最后一个红包中
        //下面把红包放到集合中
        for (int i = 0; i < count -1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
