package com.test.recursion;

/**
 * @author 宁超
 * @date 2019/5/7 - 14:32
 */
public class HaniuTower {

    /**
     * 移动盘子
     * topN;移动的盘子数
     * from:起始塔座
     * inter:中间塔座
     * to:目标塔座
     */
    public static void doTower(int topN,char from,char inter,char to)
    {
        if(topN == 1)
        {
            System.out.println("盘子1，从" + from +"塔座到" + to + "塔座");
        }else{
            doTower(topN - 1,from,to,inter);
            System.out.println("盘子" + topN + "从" + from +"塔座到" + to + "塔座");
            doTower(topN - 1,inter ,from,to);
        }
    }
}
