package com.test.threaddemo;

/**
 * @author 宁超
 * @date 2019/5/25 - 10:03
 */
public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类创建");
            }
        }).start();
    }
}
